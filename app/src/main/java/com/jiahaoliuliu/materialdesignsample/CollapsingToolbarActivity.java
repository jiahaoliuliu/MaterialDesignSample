package com.jiahaoliuliu.materialdesignsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

public class CollapsingToolbarActivity extends AppCompatActivity {

    private RecyclerView mSimpleRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private String[] mRecyclerViewValues =
            new String[]{"Apple Pie", "Banana Bread", "Cupcake", "Donut", "Eclair", "Froyo",
                    "Gingerbread", "Honeycomb", "Ice Cream Sandwich", "Jelly Bean", "KitKat",
                    "Lollipop", "M preview"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toolbar);

        // Actionbar
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Link the views
        mSimpleRecyclerView = (RecyclerView) findViewById(R.id.simpleRecyclerView);

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mSimpleRecyclerView.setHasFixedSize(true);

        // Use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mSimpleRecyclerView.setLayoutManager(mLayoutManager);

        SimpleRecyclerViewAdapter mSimpleRecyclerViewAdapter = new SimpleRecyclerViewAdapter(mRecyclerViewValues);
        mSimpleRecyclerView.setAdapter(mSimpleRecyclerViewAdapter);
    }

        @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
