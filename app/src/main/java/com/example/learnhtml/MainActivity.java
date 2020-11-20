package com.example.learnhtml;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.learnhtml.contentactivity.ContentActivity;
import com.example.learnhtml.contentactivity.ContentActivity1;
import com.example.learnhtml.contentactivity.ContentActivity2;
import com.example.learnhtml.contentactivity.ContentActivity3;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawer;
    private Toolbar toolbar;
    private ActionBarDrawerToggle drawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_menu_24);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        // Tie DrawerLayout events to the ActionBarToggle.
        drawerToggle = setupDrawerToggle();
        mDrawer.addDrawerListener(drawerToggle);

        // Attach listener to drawer menuitems and handle user selections.
        NavigationView nvDrawer = (NavigationView) findViewById(R.id.nvView);
        //View drawerHeader = nvDrawer.inflateHeaderView(R.layout.drawer_header);
        setupDrawerContent(nvDrawer);
    }

    private void setupDrawerContent(NavigationView nvDrawer) {
        nvDrawer.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                selectDrawerItem(item);
                return false;
            }
        });
    }

    private void selectDrawerItem(MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_home:
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();
                break;
            case R.id.nav_editor:
                startActivity(new Intent(getApplicationContext(),EditorActivity.class));
                finish();
                break;
            case R.id.nav_quiz:
                startActivity(new Intent(getApplicationContext(),ProgressActivity.class));
                finish();
                break;
            case R.id.nav_Introduction:
                startActivity(new Intent(getApplicationContext(), ContentActivity.class));
                finish();
                break;
            case R.id.nav_Editors:
                startActivity(new Intent(getApplicationContext(), ContentActivity1.class));
                finish();
                break;
            case R.id.nav_Elements:
                startActivity(new Intent(getApplicationContext(), ContentActivity2.class));
                finish();
                break;
            case R.id.nav_Attributes:
                startActivity(new Intent(getApplicationContext(), ContentActivity3.class));
                finish();
                break;
            case R.id.nav_Comments:
                startActivity(new Intent(getApplicationContext(),ContentActivity4.class));
                finish();
                break;
            case R.id.nav_Styles:
                startActivity(new Intent(getApplicationContext(),ContentActivity5.class));
                finish();
                break;
            case R.id.nav_Colors:
                startActivity(new Intent(getApplicationContext(),ContentActivity6.class));
                finish();
                break;
            case R.id.nav_Responsive:
                startActivity(new Intent(getApplicationContext(),ContentActivity7.class));
                finish();
                break;
            case R.id.nav_centered:
                startActivity(new Intent(getApplicationContext(),ContentActivity8.class));
                finish();
                break;
            case R.id.nav_BasicExample:
                startActivity(new Intent(getApplicationContext(),ContentActivity9.class));
                finish();
                break;
            case R.id.nav_Headings:
                startActivity(new Intent(getApplicationContext(),ContentActivity10.class));
                finish();
                break;
            case R.id.nav_Paragraphs:
                startActivity(new Intent(getApplicationContext(),ContentActivity11.class));
                finish();
                break;
            case R.id.nav_Links:
                startActivity(new Intent(getApplicationContext(),ContentActivity12.class));
                finish();
                break;
            case R.id.nav_LineBreak:
                startActivity(new Intent(getApplicationContext(),ContentActivity13.class));
                finish();
                break;
            case R.id.nav_HorizontalRule:
                startActivity(new Intent(getApplicationContext(),ContentActivity14.class));
                finish();
                break;
            case R.id.nav_TextFormatting:
                startActivity(new Intent(getApplicationContext(),ContentActivity15.class));
                finish();
                break;
            case R.id.nav_BlockLevel:
                startActivity(new Intent(getApplicationContext(),ContentActivity16.class));
                finish();
                break;
            case R.id.nav_Sections:
                startActivity(new Intent(getApplicationContext(),ContentActivity17.class));
                finish();
                break;
            case R.id.nav_Images:
                startActivity(new Intent(getApplicationContext(),ContentActivity18.class));
                finish();
                break;
            case R.id.nav_Tables:
                startActivity(new Intent(getApplicationContext(),ContentActivity19.class));
                finish();
                break;
            case R.id.nav_Lists:
                startActivity(new Intent(getApplicationContext(),ContentActivity20.class));
                finish();
                break;
            case R.id.nav_DescriptionLists:
                startActivity(new Intent(getApplicationContext(),ContentActivity21.class));
                finish();
                break;
            case R.id.nav_Javascript:
                startActivity(new Intent(getApplicationContext(),ContentActivity22.class));
                finish();
                break;
            case R.id.nav_Forms:
                startActivity(new Intent(getApplicationContext(),ContentActivity23.class));
                finish();
                break;
            case R.id.nav_FormLabels:
                startActivity(new Intent(getApplicationContext(),ContentActivity24.class));
                finish();
                break;
            case R.id.nav_InputTypes:
                startActivity(new Intent(getApplicationContext(),ContentActivity25.class));
                finish();
                break;
            case R.id.nav_TextArea:
                startActivity(new Intent(getApplicationContext(),ContentActivity26.class));
                finish();
                break;
            default:
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (drawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private ActionBarDrawerToggle setupDrawerToggle() {
        return new ActionBarDrawerToggle(this, mDrawer, toolbar, R.string.drawer_open, R.string.drawer_close);

    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        drawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}