package registration.devalok.com.fragmentdatapassing.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import registration.devalok.com.fragmentdatapassing.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment implements View.OnClickListener {
   private Button id_btn_sendData, id_btn_sendData1;
   private OnSendDataListener callBack;
   private static final String TAG = "FirstFragment";
private String name;
    public FirstFragment(String s,SecondFragment secondFragment) {
        this.callBack = (OnSendDataListener)secondFragment;
    }

    public FirstFragment(String s) {
      this.name = s;
    }

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        id_btn_sendData = view.findViewById(R.id.id_btn_sendData);
        id_btn_sendData1 = view.findViewById(R.id.id_btn_sendData1);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.id_btn_sendData :
                try {

                    callBack.OnChecked("Alok");
                     FragmentManager fragmentManager = getFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.id_flayout,new SecondFragment("Alok",this));//replace(R.id.idContainer,new BlankFragment(data_string,Intent_demo2.this)).
                }catch (Exception e){
                    Log.e(TAG,e.getMessage());
                }
            break;
            case R.id.id_btn_sendData1 :
                try {
                    callBack.onUnchecked("Alok","Kumar");
                }catch (Exception e){
                    Log.e(TAG,e.getMessage());
                }
            break;
        }
    }

    public interface OnSendDataListener {
        void OnChecked(String s);

        void onUnchecked(String s, String s1);
    }
}
