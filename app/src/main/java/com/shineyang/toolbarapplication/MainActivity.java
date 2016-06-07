package com.shineyang.toolbarapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TextView toolBar_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolBar();
    }

    public void initToolBar() {
        toolbar = (Toolbar) findViewById(R.id.toolBar);
        toolbar.setTitle("");
        toolBar_title = (TextView) findViewById(R.id.center_title);

        setSupportActionBar(toolbar);

        toolBar_title.setText("这是标题");
        toolbar.setNavigationIcon(getResources().getDrawable(R.mipmap.ic_list_white_48pt_2x));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "点击了导航栏图标！", Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        //toolbar图标初始化
        MenuItem person = menu.findItem(R.id.add);

        person.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(getApplicationContext(), "点击了工具栏图标！", Toast.LENGTH_LONG).show();
                return false;
            }
        });

        return true;
    }
}
