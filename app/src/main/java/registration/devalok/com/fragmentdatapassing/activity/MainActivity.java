package registration.devalok.com.fragmentdatapassing.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import registration.devalok.com.fragmentdatapassing.R;
import registration.devalok.com.fragmentdatapassing.fragments.FirstFragment;
import registration.devalok.com.fragmentdatapassing.fragments.SecondFragment;

public class MainActivity extends AppCompatActivity {
private Button button;
private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.id_flayout, new FirstFragment());

            //fragmentTransaction.add(R.id.fLayout2, new SecondFragment());
            fragmentTransaction.commit();
        }catch (Exception e){
            Log.i(TAG,e.getMessage());
        }
    }
}
