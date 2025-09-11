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

public class MainActivity extends AppCompatActivity {

    private Button btnFrente_t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("ciclo de vida", "Tela 1 - onCreate");

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // vincular o botão com a view
        btnFrente_t1 = findViewById(R.id.btnFrente_t1);

        //
        btnFrente_t1.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        });
    }

    @Override
    protected void onStart(){
       super.onStart();
       Log.i("ciclo de vida", "Tela 1 - onStart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("ciclo de vida", "Tela 1 - onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("ciclo de vida", "Tela 1 - onPause");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("ciclo de vida", "Tela 1 - onDestroy");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("ciclo de vida", "Tela 1 - onStop");
    }
}