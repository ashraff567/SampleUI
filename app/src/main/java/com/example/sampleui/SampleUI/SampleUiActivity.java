package com.example.sampleui.SampleUI;

import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sampleui.R;

import java.util.ArrayList;

public class SampleUiActivity extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView recyclerView;
    TextView toolbarSubtitle;
    SampleUiAdapter sampleUiAdapter;
    private ArrayList<SampleUiModel> sampleUiModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_list);

        toolbar = findViewById(R.id.toolbar);
        recyclerView = findViewById(R.id.recyclerView);
        toolbarSubtitle = findViewById(R.id.toolbar_subtitle);
        setUpToolbar();
        setUpRecyclerView();
    }


    private void setUpRecyclerView() {
        sampleUiModel = new ArrayList<>();
        sampleUiModel.add(new SampleUiModel(this, R.drawable.chirs_hemsworth, "Chris Hemsworth"));
        sampleUiModel.add(new SampleUiModel(this, R.drawable.evans, "Chris Evans"));
        sampleUiModel.add(new SampleUiModel(this, R.drawable.chirs_hemsworth, "Chris Hemsworth"));
        sampleUiModel.add(new SampleUiModel(this, R.drawable.evans, "Smith"));
        sampleUiModel.add(new SampleUiModel(this, R.drawable.chirs_hemsworth, "Chris Hemsworth"));
        sampleUiModel.add(new SampleUiModel(this, R.drawable.evans, "John"));
        sampleUiModel.add(new SampleUiModel(this, R.drawable.chirs_hemsworth, "Chris Hemsworth"));
        sampleUiModel.add(new SampleUiModel(this, R.drawable.evans, "Peter"));
        sampleUiModel.add(new SampleUiModel(this, R.drawable.chirs_hemsworth, "Chris Hemsworth"));
        sampleUiModel.add(new SampleUiModel(this, R.drawable.evans, "Thomas"));
        sampleUiModel.add(new SampleUiModel(this, R.drawable.chirs_hemsworth, "Chris Hemsworth"));
        sampleUiModel.add(new SampleUiModel(this, R.drawable.evans, "Sam"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        sampleUiAdapter = new SampleUiAdapter(this, sampleUiModel);
        recyclerView.setAdapter(sampleUiAdapter);
    }

    private void setUpToolbar() {
        setSupportActionBar(toolbar);
        toolbar.setTitle(Html.fromHtml("Task " + "<b>" + "Members" + "</b>"));
        String name = getColoredSpanned("Science Fair 2020/", "#BFBFBF");
        String surName = getColoredSpanned("Team Alpha", "#000000");
        getColoredSpanned(name, surName);
        toolbarSubtitle.setText(Html.fromHtml(name + " " + surName));
    }

    private String getColoredSpanned(String text, String color) {
        String input = "<font color=" + color + ">" + text + "</font>";
        return input;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
