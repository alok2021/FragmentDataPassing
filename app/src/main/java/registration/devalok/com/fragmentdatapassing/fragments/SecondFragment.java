package registration.devalok.com.fragmentdatapassing.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import registration.devalok.com.fragmentdatapassing.R;
import registration.devalok.com.fragmentdatapassing.activity.MainActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment implements FirstFragment.OnSendDataListener {
private TextView id_tv_receivedData;
    OnSendDataListener callBack;
private static final String TAG = "SecondFragment";
    public SecondFragment() {
        // Required empty public constructor
    }
    public SecondFragment(String data_string, MainActivity mainActivity) {
// Required empty public constructor

        this.callBack = (onclickListner) mainActivity;
    }

    public BlankFragment(String name) {
        this.name = name;

    }   // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        id_tv_receivedData = view.findViewById(R.id.id_tv_receivedData);
    return view;
    }




    @Override
    public void OnChecked(String s) {
        try {
            Log.i(TAG, s.toString());
            id_tv_receivedData.setText(s);
        }catch (Exception e){
            Log.e(TAG,e.getMessage());
        }
    }

    @Override
    public void onUnchecked(String s, String s1) {
        try {
            Log.i(TAG,s.toString()+"  "+s1.toString());
            id_tv_receivedData.setText(s+" "+s1);
        }catch (Exception e){
            Log.e(TAG,e.getMessage());
        }
    }
}
