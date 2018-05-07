package git.example.dell.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    private String TAG="BBBB";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Log.d(TAG, "BBBB----onCreate: ");
    }


    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "BBBB----onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "BBBB----onResume: ");
    }


    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "BBBB----onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "BBBB----onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "BBBB----onDestroy: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "BBBB----onRestart: ");
    }

    public void back(View view){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

}
