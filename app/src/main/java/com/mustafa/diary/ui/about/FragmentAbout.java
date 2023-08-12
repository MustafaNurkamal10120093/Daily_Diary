package com.mustafa.diary.ui.about;

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
import android.widget.ImageView;
import android.widget.TextView;

import com.mustafa.diary.DialogAbout;
import com.mustafa.diary.R;

import androidx.fragment.app.Fragment;

public class FragmentAbout extends Fragment {
    ImageView Instagram, Whatsapp, Telegram, Gmail, Github, Linkedin, Maps;
    TextView Abouts;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_about, container, false);


        Abouts = root.findViewById(R.id.about);



        Abouts.setOnClickListener(view -> {
            DialogAbout DialogAbout = new DialogAbout();
            DialogAbout.show(requireFragmentManager(),"Reza Surya Nugraha");
        });

        return root;
    }
}

