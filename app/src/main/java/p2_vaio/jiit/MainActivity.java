package p2_vaio.jiit;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Animation fade_in , fade_out ;
    ViewFlipper vf ;
    ViewPager vp;
    Toolbar tb;
    TabLayout tl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tb=(Toolbar)findViewById(R.id.bar);

        setSupportActionBar(tb);
        tl=(TabLayout)findViewById(R.id.tl);


        vp=(ViewPager)findViewById(R.id.viewpager) ;
        swipeadapter sa = new swipeadapter(getSupportFragmentManager());
        sa.addFragments(new BlankFragment(),"Events");
        sa.addFragments(new BlankFragment2(),"FB Page");
        //sa.addFragments(new BlankFragment4(),"Register");
        //sa.addFragments(new BlankFragment3(),"About Us");
        vp.setAdapter(sa);
        tl.setupWithViewPager(vp);

       // vf  = (ViewFlipper)findViewById(R.id.vflip);

       // fade_in = AnimationUtils.loadAnimation(this , android.R.anim.fade_in);
       // fade_out = AnimationUtils.loadAnimation(this , android.R.anim.fade_out);

       // vf.setInAnimation(fade_in);
       // vf.setOutAnimation(fade_out);

       // vf.setAutoStart(true);

      //  vf.setFlipInterval(2500);

       // vf.startFlipping();



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Set Reminder", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                /*Intent i= new Intent();
                ComponentName cn =new ComponentName("com.android.calender","com.android.calender.LaunchActivity");
                i.setComponent(cn);
                startActivity(i);*/

            }
        });

        /*DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, tb, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);*/
    }

    @Override
    public void onBackPressed() {
        /*DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }*/
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

        if (id == R.id.uCR) {
            // Handle the camera action
        }

        /*DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);*/
        return true;
    }
}
