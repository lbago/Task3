package androidlab.epam.com.task3;

import android.graphics.drawable.ColorDrawable;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class Activity3 extends FragmentActivity implements View.OnClickListener{
    final String TAG = "States";
    private static final String BUTTON_ONE_COLOR_KEY = "one" ;
    private static final String BUTTON_TWO_COLOR_KEY = "two" ;
    private static final String BUTTON_THREE_COLOR_KEY = "three" ;
    private Button buttonOne,buttonTwo,buttonThree;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        buttonOne=(Button) findViewById(R.id.btn1);
        buttonTwo=(Button) findViewById(R.id.btn2);
        buttonThree=(Button) findViewById(R.id.btn3);

        buttonOne.setOnClickListener(this);
        buttonTwo.setOnClickListener(this);
        buttonThree.setOnClickListener(this);


        Log.d(TAG, "Activity3: onCreate()");
    }

    protected void onSaveInstanceState(Bundle outState) {
        ColorDrawable color = (ColorDrawable) buttonOne.getBackground();
        outState.putInt(BUTTON_ONE_COLOR_KEY, color.getColor());
        color= (ColorDrawable) buttonTwo.getBackground();
        outState.putInt(BUTTON_TWO_COLOR_KEY, color.getColor());
        color= (ColorDrawable) buttonThree.getBackground();
        outState.putInt(BUTTON_THREE_COLOR_KEY, color.getColor());
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState");
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        buttonOne=(Button) findViewById(R.id.btn1);
        buttonTwo=(Button) findViewById(R.id.btn2);
        buttonThree=(Button) findViewById(R.id.btn3);
        buttonOne.setBackgroundColor(savedInstanceState.getInt(BUTTON_ONE_COLOR_KEY));
        buttonTwo.setBackgroundColor(savedInstanceState.getInt(BUTTON_TWO_COLOR_KEY));
        buttonThree.setBackgroundColor(savedInstanceState.getInt(BUTTON_THREE_COLOR_KEY));
        Log.d(TAG, "onRestoreInstanceState");
    }

    public void setRandomColor(Button btn){
        Random random = new Random();
        int[] rainbow = getResources().getIntArray(R.array.rainbow);
        int k = random.nextInt(10);
        btn.setBackgroundColor(rainbow[k]);
    }

    @Override
    public void onClick(View v) {
        Button clickButton = (Button) v;
        setRandomColor(clickButton);
        }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, "Activity3: onRestart()");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "Activity3: onStart()");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "Activity3: onResume()");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "Activity3: onPause()");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "Activity3: onStop()");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "Activity3: onDestroy()");
    }
}

