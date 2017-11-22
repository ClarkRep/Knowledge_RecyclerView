package com.example.clark.recyclerviewdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    FrameLayout flContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flContainer = (FrameLayout) findViewById(R.id.fl_container);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_recyclerview, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_test_clip:
                addFragmentToContainer(ClipToPaddingFragment.newInstance());
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void addFragmentToContainer(Fragment targetFragment) {
        if (targetFragment == null) {
            return;
        }
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();

        transaction.setCustomAnimations(
                R.anim.fragment_slide_top_in, 0);
        transaction.setCustomAnimations(0, R.anim.fragment_slide_top_out);
        transaction.replace(R.id.fl_container, targetFragment, String.valueOf(targetFragment.hashCode())).commitAllowingStateLoss();
        transaction.addToBackStack(null);
    }

}
