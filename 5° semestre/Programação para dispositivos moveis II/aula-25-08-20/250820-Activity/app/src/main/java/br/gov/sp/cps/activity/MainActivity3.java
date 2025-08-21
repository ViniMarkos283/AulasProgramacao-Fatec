package br.gov.sp.cps.activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    private Button btnVolta_t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("ciclo de vida", "Tela 3 - onCreate");

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        btnVolta_t3 = findViewById(R.id.btnVolta_t3);

        btnVolta_t3.setOnClickListener(view -> {
            finish();
        });
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i("ciclo de vida", "Tela 3 - onStart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("ciclo de vida", "Tela 3 - onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("ciclo de vida", "Tela 3 - onPause");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("ciclo de vida", "Tela 3 - onDestroy");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("ciclo de vida", "Tela 3 - onStop");
    }
}