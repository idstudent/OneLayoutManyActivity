package com.mobitant.onelayoutmanyactivityprac.ui.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mobitant.onelayoutmanyactivityprac.R;
import com.mobitant.onelayoutmanyactivityprac.listener.BottomListener;

import org.w3c.dom.Text;

public class BottomMenu  extends LinearLayout {
    private BottomListener listener;
    private TextView btnList;
    private TextView btnTrace;
    private TextView btnPerformance;
    private TextView btnQuit;

    public BottomMenu(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.layout_bottom_view, this, true);
        layoutFindViewById();
        btnList.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.BottomClick(0);
            }
        });
        btnTrace.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.BottomClick(1);
            }
        });
        btnPerformance.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.BottomClick(2);
            }
        });
        btnQuit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.BottomClick(3);
            }
        });
    }
    private void layoutFindViewById() {
        btnList = findViewById(R.id.btnList);
        btnTrace = findViewById(R.id.btnTrace);
        btnPerformance = findViewById(R.id.btnPerformance);
        btnQuit = findViewById(R.id.btnQuit);
    }
    public void bottomClick(BottomListener listener) {
        this.listener = listener;
    }
}
