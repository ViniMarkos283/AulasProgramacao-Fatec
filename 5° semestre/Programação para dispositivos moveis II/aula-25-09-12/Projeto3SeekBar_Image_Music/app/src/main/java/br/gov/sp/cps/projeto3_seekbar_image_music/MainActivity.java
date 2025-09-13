package br.gov.sp.cps.projeto3_seekbar_image_music;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btn1,btn2,btn3;
    private ImageView imgCape, imgPlay, imgPause;
    private SeekBar seekBarVolume;
    private TextView textMscName, textVolume;
    private MediaPlayer mediaPlayer;
    private AudioManager audioManager;
    int[] sounds = {R.raw.audio1, R.raw.audio2, R.raw.audio3};
    int[] capes = {R.drawable.img1,R.drawable.img2, R.drawable.img3};
    String[] textNames = {"Bombardino Crocodilo","Tung Tung Tung Tung Sahur","Brr Brr Patapim"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        seekBarVolume = findViewById(R.id.seekBarVolume);
        textMscName = findViewById(R.id.textMscName);
        textVolume = findViewById(R.id.textVolume);
        imgPause = findViewById(R.id.imgPause);
        imgPlay = findViewById(R.id.imgPlay);
        imgCape = findViewById(R.id.imgCape);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

        btn1.setOnClickListener(view -> {
            songSeletor(0);
        });
        btn2.setOnClickListener(view -> {
            songSeletor(1);
        });
        btn3.setOnClickListener(view -> {
            songSeletor(2);
        });

        mediaPlayer = MediaPlayer.create(this, R.raw.audio1); // exportando o arqv audio dentro do mediaPlayer
        mediaPlayer.setLooping(false); // se quiser q a musica toque continuamente, deixa em false, o true toca 1 vez só

        // listener para o btnPlay
        imgPlay.setOnClickListener(v -> {
            if(!mediaPlayer.isPlaying()){
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
                textVolume.setText("Volume " + String.valueOf(i)+ "%");
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
    public void songSeletor(int v) {
            mediaPlayer.stop();
            imgCape.setImageResource(capes[v]);
            textMscName.setText(textNames[v]);
            mediaPlayer = MediaPlayer.create(this, sounds[v]);
            mediaPlayer.start();
    }
}