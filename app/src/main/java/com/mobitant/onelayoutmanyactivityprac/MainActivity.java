package com.mobitant.onelayoutmanyactivityprac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.mobitant.onelayoutmanyactivityprac.ui.BaseActivity;

public class MainActivity extends BaseActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   //     setToolbarVisibility(View.GONE); //  하면 툴바 gone 처리
    }
}
