package com.estsoft.myapp.ui;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

import com.estsoft.myapp.R;

public class MainActivity extends AppCompatActivity {
    private MainTabsAdapter mainTabadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_main );

        mainTabadapter = new MainTabsAdapter(
                this, (TabHost)findViewById( android.R.id.tabhost ), (ViewPager)findViewById( R.id.pager ));

        mainTabadapter.selectTab( 0 );
    }
}
