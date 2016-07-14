package com.example.ani.calculatorgrid;

import android.app.AlertDialog;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.PersistableBundle;
import android.support.v4.graphics.ColorUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    String result="miss";
      private android.support.v7.widget.Toolbar toolbar;
    private ArrayList<Dotcom> DotcomsList = new ArrayList<Dotcom>();
    int[] alloc={-1,-1,-1,-1,-1,-1,-1,-1,-1};
   // private ArrayList<Integer> alloc = new ArrayList<Integer>();
    int r1,index=0;
    int numkills=0,flag=0;
    boolean finished=false;
    int numguesses=0,finalguess=0;
    String test;
    Mainfragment mainfragment5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar= (Toolbar) findViewById(R.id.app_bar);

        setSupportActionBar(toolbar);

        if(savedInstanceState==null) {
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            mainfragment5 = new Mainfragment();
            transaction.add(R.id.fragmainlinearlayout, mainfragment5);
            transaction.commit();
        }
        else{
            mainfragment5= (Mainfragment) getFragmentManager().getFragment(savedInstanceState,"MyMainFragment");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.app_menu, menu);
        optionsMenuCheck(menu, flag);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        super.onOptionsItemSelected(item);

        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(getBaseContext(), "Work in progress for Settings :P", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                FragmentTransaction ft=getFragmentManager().beginTransaction();
                frag frag=new frag();
                flag=1;
                    ft.addToBackStack(null);
                ft.add(R.id.mainlinearlayout, frag);
                ft.commit();
                invalidateOptionsMenu();
                break;
        }
        return true;
    }

    @Override
    public void onBackPressed() {

        if(getFragmentManager().getBackStackEntryCount() == 0)
            endapp();
        else {
            getFragmentManager().popBackStack();
                flag=0;
            invalidateOptionsMenu();
        }
    }


    public void optionsMenuCheck(Menu menu,int flag){
        if (flag==1)
            menu.findItem(R.id.item2).setVisible(false);
        else
            menu.findItem(R.id.item2).setVisible(true);
    }

    public void endapp(){

        new AlertDialog.Builder(this)
                .setTitle("Quit")
                .setMessage("Are you sure you want to quit?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("No",null)
                .show();

    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);

        getFragmentManager().putFragment(outState, "MyMainFragment", mainfragment5);
    }
}
