package com.aasthajain.hakim;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    RecyclerView recyclerView1,recyclerView2,recyclerView3;
    List<Chat> chatList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //first recyler view
        recyclerView1 = findViewById(R.id.myrecycler);
        recyclerView1.setHasFixedSize(true);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true));

        chatList = new ArrayList<>();

        chatList.add(new Chat("aastha image url","Aastha Jain"));
        chatList.add(new Chat("aastha image url","Aastha Jain"));
        chatList.add(new Chat("aastha image url","Aastha Jain"));
        chatList.add(new Chat("aastha image url","Aastha Jain"));
        chatList.add(new Chat("aastha image url","Aastha Jain"));
        chatList.add(new Chat("aastha image url","Aastha Jain"));
        chatList.add(new Chat("aastha image url","Aastha Jain"));

        ChatAdapter chatAdapter = new ChatAdapter(chatList);
        recyclerView1.setAdapter(chatAdapter);

        //end of first

        //second recycler view
        recyclerView2 = findViewById(R.id.myrecycler1);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true));

        chatList = new ArrayList<>();

        chatList.add(new Chat("aastha image url","Aastha Jain"));
        chatList.add(new Chat("aastha image url","Aastha Jain"));
        chatList.add(new Chat("aastha image url","Aastha Jain"));
        chatList.add(new Chat("aastha image url","Aastha Jain"));
        chatList.add(new Chat("aastha image url","Aastha Jain"));
        chatList.add(new Chat("aastha image url","Aastha Jain"));
        chatList.add(new Chat("aastha image url","Aastha Jain"));

         //ChatAdapter chatAdapter = new ChatAdapter(chatList);
        recyclerView2.setAdapter(chatAdapter);

        //end of second
        //starting of 3
        recyclerView3 = findViewById(R.id.myrecycler2);
        recyclerView3.setHasFixedSize(true);
        recyclerView3.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true));

        chatList = new ArrayList<>();

        chatList.add(new Chat("aastha image url","Aastha Jain"));
        chatList.add(new Chat("aastha image url","Aastha Jain"));
        chatList.add(new Chat("aastha image url","Aastha Jain"));
        chatList.add(new Chat("aastha image url","Aastha Jain"));
        chatList.add(new Chat("aastha image url","Aastha Jain"));
        chatList.add(new Chat("aastha image url","Aastha Jain"));
        chatList.add(new Chat("aastha image url","Aastha Jain"));

        //ChatAdapter chatAdapter = new ChatAdapter(chatList);
        recyclerView3.setAdapter(chatAdapter);
        //end of third

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.appointments) {
            // Handle the camera action
        } else if (id == R.id.Orders) {

        } else if (id == R.id.Consultations) {

        } else if (id == R.id.MyDoctors) {

        } else if (id == R.id.Medical) {

        }
        else if (id == R.id.reminders) {

        }else if (id == R.id.Payment) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
