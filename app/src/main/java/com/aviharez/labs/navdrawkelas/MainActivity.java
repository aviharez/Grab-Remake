package com.aviharez.labs.navdrawkelas;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
//            Window w = getWindow();
//            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
//        }


        toolbar.bringToFront();

        navigationView = (NavigationView) findViewById(R.id.navigation_view);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                //drawerLayout.closeDrawers();
                switch (menuItem.getItemId()) {
                    case R.id.navi_payment:
                        Intent i1 = new Intent(MainActivity.this, PaymentActivity.class);
                        startActivity(i1);
                        return true;
                    case R.id.navi_cards:
                        Intent i2 = new Intent(MainActivity.this, CardsActivity.class);
                        startActivity(i2);
                        return true;
                    case R.id.navi_grab_rewards:
                        Intent i3 = new Intent(MainActivity.this, GrabRewardsActivity.class);
                        startActivity(i3);
                        return true;
                    case R.id.navi_grab_club:
                        Intent i4 = new Intent(MainActivity.this, GrabClubActivity.class);
                        startActivity(i4);
                        return true;
                    case R.id.navi_groceries:
                        Intent i5 = new Intent(MainActivity.this, GroceriesActivity.class);
                        startActivity(i5);
                        return true;
                    case R.id.navi_history:
                        Intent i6 = new Intent(MainActivity.this, HistoryActivity.class);
                        startActivity(i6);
                        return true;
                    case R.id.navi_scheduled:
                        Intent i7 = new Intent(MainActivity.this, ScheduledActivity.class);
                        startActivity(i7);
                        return true;
                    case R.id.navi_notification:
                        Intent i8 = new Intent(MainActivity.this, NotifActivity.class);
                        startActivity(i8);
                        return true;
                    case R.id.navi_help:
                        Intent i9 = new Intent(MainActivity.this, HelpActivity.class);
                        startActivity(i9);
                        return true;
                    case R.id.navi_emergency:
                        Intent i10 = new Intent(MainActivity.this, EmergencyActivity.class);
                        startActivity(i10);
                        return true;
                    case R.id.navi_drive:
                        String link = "https://www.grab.com/id/driver/car/?utm_source=android&utm_medium=paxapp&utm_campaign=none";
                        Intent i11 = new Intent(Intent.ACTION_VIEW);
                        i11.setData(Uri.parse(link));
                        startActivity(i11);
                        return true;
                    case R.id.navi_setting:
                        Intent i12 = new Intent(MainActivity.this, SettingActivity.class);
                        startActivity(i12);
                        return true;
                    default:
                        Toast.makeText(getApplicationContext(), "Ada kesalahan", Toast.LENGTH_LONG).show();
                        return true;
                }
            }
        });

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close) {
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }
        };

        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        actionBarDrawerToggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.greenGrab));

        actionBarDrawerToggle.setHomeAsUpIndicator(R.drawable.ic_sort_black_24dp);

    }



}
