package com.inthemoon.tryresearchbuttonunpress;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableBoolean;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.inthemoon.tryresearchbuttonunpress.databinding.ActivityTryResearchButtonUnpressBinding;

public class TryResearchButtonUnpress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_try_research_button_unpress);
        ActivityTryResearchButtonUnpressBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_try_research_button_unpress);
        DataModel model = new DataModel();

        binding.setModel(model);
    }


}
