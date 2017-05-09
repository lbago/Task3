package androidlab.epam.com.task3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TEXT_VIEW_KEY = "two" ;
    private Button btnTo2;
    private TextView textView;
    private EditText editText;
    private static final String TAG = "States";
    private String mGameState;

    private static AppCompatActivity actity;

    public static AppCompatActivity getInstance(){
        return actity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        actity = this;
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            mGameState = savedInstanceState.getString(TEXT_VIEW_KEY);
        }

        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.edit_text);
        btnTo2 = (Button) findViewById(R.id.btnTo2);
        btnTo2.setOnClickListener(this);

        Log.d(TAG, "MainActivity: onCreate()");
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        textView.setText(savedInstanceState.getString(TEXT_VIEW_KEY));
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, "MainActivity: onRestart()");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "MainActivity: onStart()");
    }

    @Override
    protected void onResume(){
        super.onResume();

        Log.d(TAG, "MainActivity: onResume()");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "MainActivity: onPause()");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString(TEXT_VIEW_KEY, editText.getText().toString());
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "MainActivity: onStop()");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "MainActivity: onDestroy()");
    }
}
