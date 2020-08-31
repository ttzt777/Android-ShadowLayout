package cc.bear3.view.shadowlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import cc.bear3.view.shadowlayout.layout.IQMUILayout;
import cc.bear3.view.shadowlayout.layout.QMUILinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        QMUILinearLayout layout = findViewById(R.id.layout);

        layout.setRadiusAndShadow(20, IQMUILayout.HIDE_RADIUS_SIDE_NONE, 50, 0xFFFF0000, 1);
    }
}