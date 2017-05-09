package androidlab.epam.com.task3;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity implements View.OnClickListener{
    Button  btnTo3;
    final String TAG = "States";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        btnTo3 = (Button) findViewById(R.id.btnTo3);
        btnTo3.setOnClickListener(this);

        Log.d(TAG, "Activity2: onCreate()");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, "Activity2: onRestart()");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "Activity2: onStart()");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "Activity2: onResume()");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "Activity2: onPause()");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "Activity2: onStop()");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "Activity2: onDestroy()");
    }

    @Override
    public void onClick(View v) {
       // AppCompatActivity mainActivity = MainActivity.getInstance();
       // mainActivity.finish();
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }

}