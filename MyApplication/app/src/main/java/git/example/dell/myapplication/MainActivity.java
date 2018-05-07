package git.example.dell.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private String TAG="AAAA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "AAAA----onCreate: ");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "AAAA----onStart: ");

    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "AAAA----onResume: ");
        
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "AAAA----onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "AAAA----onStop: ");
        
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "AAAA----onDestroy: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, "AAAA----onRestart: ");
        
    }

    public void skip(View view){


        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);
        //finish();

    }
}
