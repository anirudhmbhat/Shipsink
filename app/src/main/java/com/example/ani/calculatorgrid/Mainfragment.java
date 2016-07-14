package com.example.ani.calculatorgrid;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ani on 28/1/16.
 */
public class Mainfragment extends android.app.Fragment {
    Button zero,one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,thirteen,fourteen,fifteen,sixteen,seventeen,eighteen,nineteen,twenty,twentyone,twentytwo,twentythree,twentyfour;
    TextView textview;
    String result="miss";
    private android.support.v7.widget.Toolbar toolbar;
    private ArrayList<Dotcom> DotcomsList = new ArrayList<Dotcom>();
    int[] alloc={-1,-1,-1,-1,-1,-1,-1,-1,-1};
    // private ArrayList<Integer> alloc = new ArrayList<Integer>();
    int r1,index=0;
    int numkills=0,flag=0;
    public static boolean finished=false;
    public static int numguesses=0,finalguess=0;
    String test;
    View v;

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        if(savedInstanceState==null)
        v=inflater.inflate(R.layout.mainfragment,container,false);

        zero= (Button) v.findViewById(R.id.zero);
        one= (Button) v.findViewById(R.id.one);
        two= (Button) v.findViewById(R.id.two);
        three= (Button) v.findViewById(R.id.three);
        four= (Button) v.findViewById(R.id.four);
        five= (Button) v.findViewById(R.id.five);
        six= (Button) v.findViewById(R.id.six);
        seven= (Button) v.findViewById(R.id.seven);
        eight= (Button) v.findViewById(R.id.eight);
        nine= (Button) v.findViewById(R.id.nine);
        ten= (Button) v.findViewById(R.id.ten);
        eleven= (Button) v.findViewById(R.id.eleven);
        twelve= (Button) v.findViewById(R.id.twelve);
        thirteen= (Button) v.findViewById(R.id.thirteen);
        fourteen= (Button) v.findViewById(R.id.fourteen);
        fifteen= (Button) v.findViewById(R.id.fifteen);
        sixteen= (Button) v.findViewById(R.id.sixteen);
        seventeen= (Button) v.findViewById(R.id.seventeen);
        eighteen= (Button) v.findViewById(R.id.eighteen);
        nineteen= (Button) v.findViewById(R.id.nineteen);
        twenty= (Button) v.findViewById(R.id.twenty);
        twentyone= (Button) v.findViewById(R.id.twentyone);
        twentytwo= (Button) v.findViewById(R.id.twentytwo);
        twentythree= (Button) v.findViewById(R.id.twentythree);
        twentyfour= (Button) v.findViewById(R.id.twentyfour);
        textview= (TextView) v.findViewById(R.id.textview);
        setUpGame();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                condition(zero, checkgamedcb(0));
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                condition( one,checkgamedcb(1));
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                condition( two,checkgamedcb(2));
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                condition( three,checkgamedcb(3));
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                condition( four,checkgamedcb(4));
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                condition( five,checkgamedcb(5));
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                condition( six,checkgamedcb(6));
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                condition( seven,checkgamedcb(7));
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                condition( eight,checkgamedcb(8));
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                condition( nine,checkgamedcb(9));
            }
        });
        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                condition( ten,checkgamedcb(10));
            }
        });
        eleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                condition( eleven,checkgamedcb(11));
            }
        });
        twelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                condition( twelve,checkgamedcb(12));
            }
        });
        thirteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                condition( thirteen,checkgamedcb(13));
            }
        });
        fourteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                condition( fourteen,checkgamedcb(14));
            }
        });
        fifteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                condition( fifteen,checkgamedcb(15));
            }
        });
        sixteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                condition( sixteen,checkgamedcb(16));
            }
        });
        seventeen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                condition( seventeen,checkgamedcb(17));
            }
        });
        eighteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                condition( eighteen,checkgamedcb(18));
            }
        });
        nineteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                condition( nineteen,checkgamedcb(19));
            }
        });
        twenty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                condition( twenty,checkgamedcb(20));
            }
        });
        twentyone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                condition( twentyone,checkgamedcb(21));
            }
        });
        twentytwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                condition( twentytwo,checkgamedcb(22));
            }
        });
        twentythree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                condition( twentythree,checkgamedcb(23));
            }
        });
        twentyfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                condition( twentyfour,checkgamedcb(24));
            }
        });

        return v;
    }


    public boolean allloccontains(int b){

        boolean isIn = false;
        for (int item: alloc) {
            if (b==item) {
                isIn = true;
                break;
            }
        }
        return isIn;
    }

    public String checkgamedcb(int userInput){
        numguesses++;
        String result="miss";
        for (Dotcom DotcomToCheck : DotcomsList)
        {
            test=DotcomToCheck.checkYourself(userInput);
            //           Log.e("Test is ", "for user input " + userInput + " test is " + test);
            if(test.equals("Kill")) {
                numkills++;
                result="You killed "+DotcomToCheck.returnName();
                if(numkills==3)
                {
                    result="Finished game";
                }
                return result;
            }
            if(test.equals("hit")) {
                result = "hit";
                return result;
            }
        }
        if(test.equals("miss"))
            result="miss";
        return result;
    }

    public void setUpGame() {
        Dotcom one = new Dotcom();
        one.setName("Pets.com");
        Dotcom two = new Dotcom();
        two.setName("eToys.com");
        two.flag=true;
        Dotcom three = new Dotcom();
        three.setName("Go2.com");
        DotcomsList.add(one);
        DotcomsList.add(two);
        DotcomsList.add(three);

        for (Dotcom DotcomToSet : DotcomsList)
        {
            if(DotcomToSet.flag==false) {
                do {
                    r1 = DotcomToSet.setLocationCells();
                }while (allloccontains(r1)||allloccontains(r1+1)||allloccontains(r1+2));
                alloc[index++] = r1;
                alloc[index++] = r1 + 1;
                alloc[index++] = r1 + 2;
            }
            else
            {
                do {
                    r1 = DotcomToSet.setLocationCells();
                }while (allloccontains(r1)||allloccontains(r1+5)||allloccontains(r1+10));
                alloc[index++] = r1;
                alloc[index++] = r1 + 5;
                alloc[index++] = r1 + 10;
            }
            //        Log.e("Dotcoms: ", DotcomToSet.returnName() + "Location "+alloc[index-3]+" "+alloc[index-2]+" "+alloc[index-1]);
        }
    }


    public void condition(Button button,String result){
        button.setEnabled(false);
        if(!finished)
             textview.setText(result);
        else
             textview.setText("You took "+finalguess+" guesses");
        if (result.equals("miss")) {
            button.setBackgroundColor(Color.parseColor("#f1290e"));
        } else if (result.equals("Finished game")) {
            button.setBackgroundColor(Color.parseColor("#b5ffda"));
            finishgame();
        } else
            button.setBackgroundColor(Color.parseColor("#b5ffda"));
    }

    public void finishgame(){
        Mainfragment.finalguess=Mainfragment.numguesses;
        new AlertDialog.Builder(getActivity())
                .setTitle("Booyah! ")
                .setMessage("You Finished and took "+Mainfragment.finalguess+" guesses!")
                .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        android.os.Process.killProcess(android.os.Process.myPid());
                    }
                })
                .show();
        //       textview.setText("You took "+finalguess+" guesses");
        Mainfragment.finished=true;
        //      Toast.makeText(getBaseContext(),"You finished the game with "+numguesses+" guesses",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        getFragmentManager().putFragment(outState,"InsideMF",this);
    }

/*    @Override
    public void onViewStateRestored(Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);

        getFragmentManager().getFragment(savedInstanceState, "InsideMF");
        Log.e("Ani inside frag restore","ID is "+getFragmentManager().getFragment(savedInstanceState, "InsideMF").toString());
    }           */
}
