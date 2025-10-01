package br.gov.sp.cps.seekbarvideo;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.widget.VideoView;
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {

    // Objetos utilizados no projeto:
    private VideoView videoView;
    private SeekBar videoSeekBar;
    private TextView textTempo;
    private ImageView imgPlay, imgPause, imgStop;
    private Handler handler = new Handler();
    private int[] videos = {R.raw.video1, R.raw.video2, R.raw.video3};
    private Button btnVideo1, btnVideo2, btnVideo3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Vincula os objetos com os respectivos ID (Arquivo R):
        videoSeekBar = findViewById(R.id.videoSeekBar);
        videoView = findViewById(R.id.videoView);
        textTempo = findViewById(R.id.textTempo);
        imgPlay = findViewById(R.id.imgPlay);
        imgPause = findViewById(R.id.imgPause);

        btnVideo1 = findViewById(R.id.btnVideo1);
        btnVideo2 = findViewById(R.id.btnVideo2);
        btnVideo3 = findViewById(R.id.btnVideo3);

        btnVideo1.setOnClickListener(v -> {
            setVideo(0);
        });
        btnVideo2.setOnClickListener(v -> {
            setVideo(1);
        });
        btnVideo3.setOnClickListener(v -> {
            setVideo(2);
        });

        // Listener para saber quando o video esta preparado para reproduzir:
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                videoSeekBar.setMax(videoView.getDuration());

                // Inicia uma Thread para atualizar o Seekbar conforme o video executa
                handler.post(atualizaSeekBar);

                // Inicia o video Automaticamente
                videoView.start();
            }
        });

        // Listener para controle do Seekbar
        videoSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if(b){
                    videoView.seekTo(i);
                }
                atualizaTextTempo();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                videoView.pause();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                videoView.start();
            }
        });
    }

    // Metodo para Atualizar o tempo do video e a posição da Seekbar:
    private Runnable atualizaSeekBar = new Runnable() {
        @Override
        public void run() {
            if(videoView.isPlaying()){
                videoSeekBar.setProgress(videoView.getCurrentPosition());
                atualizaTextTempo();
            }
            handler.postDelayed(this, 1000);
        }
    };

    // Metodo para Formatar o tempo em mm:ss
    private String formataTempo(int tempo){
        int min = (tempo / 1000) / 60;
        int seg = (tempo / 1000) % 60;
        return String.format("%02d:%02d", min, seg);
    }

    // Metodo para Formatar o tempo e atualizar o rotulo do tempo de video:
    private void atualizaTextTempo(){
        int tempoAtual = videoView.getCurrentPosition();
        int tempoTotal = videoView.getDuration();

        String tempoFormato = formataTempo(tempoAtual) + " / " + formataTempo(tempoTotal);
        textTempo.setText(tempoFormato);
    }

    // Metodo para btnPlay:
    public void videoPlay(View view){
        videoView.start();
    }

    // Metodo para btnPause:
    public void videoPause(View view){
        videoView.pause();
    }

    public void videoStop(View view){
        videoView.pause();                // pausa a reprodução
        videoView.seekTo(0);        // volta ao inicio
        videoSeekBar.setProgress(0);      // zera a barra
        atualizaTextTempo();              // atualiza o rotulo do tempo
        // videoView.start();             // Opcional com o play
    }

    public void setVideo(int v){
        Uri videoUri = Uri.parse("android.resource://" +
                getPackageName() + "/" +
                videos[v]);
        videoView.setVideoURI(videoUri);

    }
}