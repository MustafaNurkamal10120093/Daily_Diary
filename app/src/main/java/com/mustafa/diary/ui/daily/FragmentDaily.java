package com.mustafa.diary.ui.daily;

/*
 * NIM : 10120093
 *Nama : Mustafa Nurkamal
 *Kelas : IF-3
 *Email : mustafa.10120093@mahasiswa.unikom.ac.id
 * */


import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.mustafa.diary.db.SQLite;
import com.mustafa.diary.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class FragmentDaily extends Fragment {
    private FloatingActionButton addButton;
    private ListView listView;
    private ListViewAdapter listViewAdapter;
    private ArrayList<ModelDiary> listTask = new ArrayList<>();
    private SQLite helper;

    @Nullable
    @Override
    /*Fungsi membuat view dan menampilkan data*/
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_daily, container, false);

        addButton = root.findViewById(R.id.addButton);
        listView = root.findViewById(R.id.view_daily);

        helper = new SQLite(this.getActivity());

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), CreateDiaryActivity.class));
            }
        });

        showData();

        return root;
    }

    /*Fungsi menampilkan data*/
    public void showData() {
        listTask.clear();
        Cursor res = helper.getAllData();
        while (res.moveToNext()) {
            String id = res.getString(0);
            String judul = res.getString(1);
            String isi = res.getString(2);
            String date = res.getString(3);
            String month = res.getString(4);
            String year = res.getString(5);

            listTask.add(new ModelDiary(id, judul, isi, date, month, year));
        }

        listViewAdapter = new ListViewAdapter(listTask, getActivity());
        listView.setAdapter(listViewAdapter);
        listViewAdapter.notifyDataSetChanged();
    }
}

