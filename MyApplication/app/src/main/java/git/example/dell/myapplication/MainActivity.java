package git.example.dell.myapplication;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/*从 Android 3.2 (API级别 13)开始
1、不设置Activity的android:configChanges，或设置Activity的android:configChanges="orientation"，
或设置Activity的android:configChanges="orientation|keyboardHidden"，切屏会重新调用各个生命周期，切横屏时会执行一次，切竖屏时会执行一次。
2、配置 android:configChanges="orientation|keyboardHidden|screenSize"，才不会销毁 activity，且只调用 onConfigurationChanged方法。

作者：yoosir
链接：https://www.jianshu.com/p/dbc7e81aead2
來源：简书
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。*/

public class MainActivity extends AppCompatActivity {

    private String TAG="AAAA";
    EditText et;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "AAAA----onCreate: ");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.d(TAG," -- onConfigurationChanged");
        if(newConfig.orientation == ActivityInfo.SCREEN_ORIENTATION_PORTRAIT){
            //切换到竖屏
            //修改布局文件
            setContentView(R.layout.activity_main);
            //findViewById ....
            //TODO something
            Log.d(TAG," -- onConfigurationChanged  可以在竖屏方向 to do something");
        }else{
            //切换到横屏
            //修改布局文件
            setContentView(R.layout.activity_main);
            //findViewById ....
            //TODO something
            Log.d(TAG," -- onConfigurationChanged  可以在横屏方向 to do something");
        }
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
