package br.gov.sp.cps.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private Button btnFrente_t2;
    private Button btnVolta_t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("ciclo de vida", "Tela 2 - onCreate");

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        // vincular o botão com a view
        btnFrente_t2 = findViewById(R.id.btnFrente_t2);
        btnVolta_t2 = findViewById(R.id.btnVolta_t2);

        //
        btnFrente_t2.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity3.class);
            startActivity(intent);
        });

        btnVolta_t2.setOnClickListener(view -> {
            finish();
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("ciclo de vida", "Tela 2 - onStart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("ciclo de vida", "Tela 2 - onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("ciclo de vida", "Tela 2 - onPause");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("ciclo de vida", "Tela 2 - onDestroy");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("ciclo de vida", "Tela 2 - onStop");
    }
}