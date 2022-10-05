package com.example.experiences;


import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.app.Fragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNav;
    private ImageView profileImv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findIds();
        fragmentInitialization();
        bottomNavInitialization();
        profileInitialization();
    }

    protected void findIds(){
        bottomNav = findViewById(R.id.bottom_navigation);
        profileImv = findViewById(R.id.imv_profile);
    }

    protected void replaceFragment(Fragment frag){
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment_layout, frag);
        ft.commit();
    }

    protected void fragmentInitialization(){
        Fragment fragment = new HomeFragment();
        replaceFragment(fragment);
    }

    protected void bottomNavInitialization(){
        bottomNav.setOnItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        Fragment thisFragment = null;
                        switch (menuItem.getItemId()) {
                            case R.id.navigation_home:
                                thisFragment = new HomeFragment();
                                break;
                            case R.id.navigation_calendar:
                                thisFragment = new CalendarFragment();
                                break;
                            case R.id.navigation_notifications:
                                thisFragment = new NotificationsFragment();
                                break;
                            case R.id.navigation_more:
                                thisFragment = new MoreFragment();
                                break;
                        }

                        replaceFragment(thisFragment);
                        return true;
                    }
                });
    }

    protected void profileInitialization(){
        profileImv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Profile.class);
                startActivity(intent);
            }
        });
    }
}