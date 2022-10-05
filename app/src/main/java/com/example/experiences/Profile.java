package com.example.experiences;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Profile extends AppCompatActivity {

    BottomNavigationView bottomNav;
    TextView firstName, lastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        findIds();
        bottomNavInitialization();
        setProfileText();
    }

    protected void findIds(){
        bottomNav = findViewById(R.id.bottom_navigation);
        firstName = findViewById(R.id.tv_first_name);
        lastName = findViewById(R.id.tv_last_name);
    }

    protected void replaceFragment(Fragment frag){
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment_layout, frag);
        ft.commit();
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

    protected void setProfileText(){
        firstName.setText(getString(R.string.first_name_text) + " " + "Jake");
        lastName.setText(getString(R.string.last_name_text) + " " + "Heyser");
    }
}