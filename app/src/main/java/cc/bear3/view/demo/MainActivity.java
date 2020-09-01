package cc.bear3.view.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import cc.bear3.view.shadowlayout.layout.ShadowLinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ShadowLinearLayout layout = findViewById(cc.bear3.view.shadowlayout.R.id.layout);

//        layout.setRadiusAndShadow(0, IQMUILayout.HIDE_RADIUS_SIDE_LEFT, 50, 0xFFFF0000, 1);
    }
}