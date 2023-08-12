package com.mustafa.diary.ui.home;

/*
 * NIM : 10120093
 *Nama : Mustafa Nurkamal
 *Kelas : IF-3
 *Email : mustafa.10120093@mahasiswa.unikom.ac.id
 * */
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.mustafa.diary.R;

public class FragmentHome extends Fragment{

    Button logout;
    GoogleSignInClient gClient;
    GoogleSignInOptions gOptions;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_home, container, false);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }
}
