package androidlab.epam.com.task3;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ButtonFragment extends Fragment{

        @Override
        public void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            this.setRetainInstance(true);
            Log.e("LOG","onCreate");
        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            this.setRetainInstance(true);
            return inflater.inflate(R.layout.button_layout, container, true);
        }
}
