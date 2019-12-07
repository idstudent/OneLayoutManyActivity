package com.mobitant.onelayoutmanyactivityprac.ui;

import androidx.annotation.LayoutRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import android.widget.Toolbar;

import com.mobitant.onelayoutmanyactivityprac.R;
import com.mobitant.onelayoutmanyactivityprac.listener.BottomListener;
import com.mobitant.onelayoutmanyactivityprac.listener.ToolbarListener;
import com.mobitant.onelayoutmanyactivityprac.ui.component.BottomMenu;
import com.mobitant.onelayoutmanyactivityprac.ui.component.ToolBar;

public class BaseActivity extends AppCompatActivity implements ToolbarListener, BottomListener {
    private CoordinatorLayout layout;
    private FrameLayout layoutContainer;
    private ToolBar toolBar;
    private BottomMenu bottomMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public void setContentView(@LayoutRes int layoutResID) {

        layout = (CoordinatorLayout) LayoutInflater.from(this).inflate(R.layout.activity_base, null);
        layoutContainer = (FrameLayout) layout.findViewById(R.id.layoutContainer);
        toolBar = layout.findViewById(R.id.toolbar);
        bottomMenu = layout.findViewById(R.id.navigation_bottom);

        LayoutInflater.from(this).inflate(layoutResID, layoutContainer, true);
        toolBar.setToolbar(this);
        bottomMenu.bottomClick(this);
        super.setContentView(layout);
    }
    public void setToolbarVisibility(int visibility){
        toolBar.setVisibility(visibility);
    }
    @Override
    public void BottomClick(int pos) {
        switch (pos){
            case 0:
                Toast.makeText(this, "첫번째", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(this, "두번째", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this, "세번째", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(this, "네번째", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void backClick() {
        finish();
    }
}
