package com.example.barchart;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class FragmentOne extends Fragment {

    BarChart barChart;
    BarData bData;
    BarDataSet barDataSet;
    ArrayList barEntries;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        barChart=view.findViewById(R.id.barChart);
        getEntries();

        barDataSet=new BarDataSet(barEntries,"Data Set");

        bData=new BarData(barDataSet);
        barChart.setData(bData);
        barDataSet.setColors(ColorTemplate.JOYFUL_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(16f);

        return view;
    }

    private void getEntries()
    {
        barEntries=new ArrayList<>();
        barEntries.add(new BarEntry(1f,2));
        barEntries.add(new BarEntry(2f,4));
        barEntries.add(new BarEntry(3f,1));
        barEntries.add(new BarEntry(4f,8));
    }


}