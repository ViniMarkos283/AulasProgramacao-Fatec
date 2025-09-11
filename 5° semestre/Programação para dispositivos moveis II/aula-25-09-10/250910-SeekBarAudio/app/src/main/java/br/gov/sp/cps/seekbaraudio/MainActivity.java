package br.gov.sp.cps.seekbaraudio;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBarVolume;
    private TextView textVolume;
    private ImageView imgPlay, imgPause;
    private MediaPlayer mediaPlayer;
    private AudioManager audioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        seekBarVolume = findViewById(R.id.seekBarVolume);
        textVolume = findViewById(R.id.textVolume);
        imgPause = findViewById(R.id.imagePause);
        imgPlay = findViewById(R.id.imagePlay);

        // configurar o MediaPlayer para reproduzir o audio:
        mediaPlayer = MediaPlayer.create(this, R.raw.audio); // exportando o arqv audio dentro do mediaPlayer
        mediaPlayer.setLooping(false); // se quiser q a musica toque continuamente, deixa em false, o true toca 1 vez só
        mediaPlayer.start();

        // listener para o btnPlay
        imgPlay.setOnClickListener(v -> {
            if(mediaPlayer.isPlaying()){
                mediaPlayer.start();
            }
        });

        // listener para o btnPause
        imgPause.setOnClickListener(v ->{
            if(mediaPlayer.isPlaying()){
                mediaPlayer.pause();
            }
        });

        // configurar o audioManager para controlar o volume
        audioManager = (AudioManager) getSystemService(AUDIO_SERVICE); // puxa o hardware do audio do proprio sistema
        final int maxVolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        final int atualVolume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);


        // definir o volume inicial da musica no MediaPlayer
        seekBarVolume.setMax(maxVolume);
        seekBarVolume.setProgress(atualVolume);

        // atualizar o valor do volume:
        textVolume.setText(String.valueOf(atualVolume));

        // Listener para controlar o volume pelo seekbar:
        seekBarVolume.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                // ajusta o volume da musica com o ovalor do Seekbar:
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, i, 0);
                textVolume.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // ao clicar pausa
                mediaPlayer.pause();

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // ao soltar toca denovo
                mediaPlayer.start();
            }
        });
    }
}