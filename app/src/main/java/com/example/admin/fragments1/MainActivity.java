package com.example.admin.fragments1;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        BlankFragment bf = new BlankFragment();

        setContentView(R.layout.activity_main);
        android.app.FragmentManager fm = getFragmentManager();
        android.app.FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.mFrame, bf);
        ft.commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
