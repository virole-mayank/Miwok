package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        getSupportActionBar().setSubtitle("Developed by Mayank Virole");
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("lutti", "one"));
        words.add(new Word("'otiko","two"));
        words.add(new Word("tolokushu","three"));
        words.add(new Word("'oyisa","four"));
        words.add(new Word("mashoka","five"));
        words.add(new Word("temoka","six"));
        words.add(new Word("kenekaku","seven"));
        words.add(new Word("kawinta","eight"));
        words.add(new Word("woe","nine"));
        words.add(new Word("na'acha","ten"));
        WordAdapter adapter = new WordAdapter(this,words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}