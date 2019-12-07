package com.mobitant.onelayoutmanyactivityprac.ui.component;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.mobitant.onelayoutmanyactivityprac.R;
import com.mobitant.onelayoutmanyactivityprac.listener.ToolbarListener;

public class ToolBar extends LinearLayout {
    private ToolbarListener listener;
    private ImageView btnBack;
    public ToolBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    private void init() {
        // infalte에서 false로 처리하면 안나옴 (커스텀
        LayoutInflater.from(getContext()).inflate(R.layout.toolbar, this, true);
        layoutFindViewById();
        btnBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.backClick();
            }
        });
    }
    private void layoutFindViewById() {
        btnBack = findViewById(R.id.btnBack);
    }
    public void setToolbar(ToolbarListener listener){
        this.listener = listener;
    }
}
