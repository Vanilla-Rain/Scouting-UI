package com.team2706.scouting.exampleui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case com.team2706.scouting.exampleui.R.id.schedule:
                    mTextMessage.setText(com.team2706.scouting.exampleui.R.string.title_schedule_comment);
                    return true;
                case com.team2706.scouting.exampleui.R.id.comment:
                    mTextMessage.setText(com.team2706.scouting.exampleui.R.string.title_addComment_comment);
                    return true;
                case com.team2706.scouting.exampleui.R.id.scout:
                    mTextMessage.setText(com.team2706.scouting.exampleui.R.string.title_scout_comment);
                    return true;
                case com.team2706.scouting.exampleui.R.id.photo:
                    mTextMessage.setText(com.team2706.scouting.exampleui.R.string.title_takePhoto_comment);
                    return true;
                case com.team2706.scouting.exampleui.R.id.team_lookup:
                    mTextMessage.setText(com.team2706.scouting.exampleui.R.string.title_lookup_comment);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.team2706.scouting.exampleui.R.layout.activity_home_page);

        mTextMessage = (TextView) findViewById(com.team2706.scouting.exampleui.R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(com.team2706.scouting.exampleui.R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.scout);
    }

}
