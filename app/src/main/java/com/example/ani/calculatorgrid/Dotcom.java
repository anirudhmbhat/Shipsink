package com.example.ani.calculatorgrid;

import android.util.Log;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ani on 17/1/16.
 */
    public class Dotcom {
/*        public ArrayList<Integer> locationCells; */
/*    public ArrayList<Integer> allowedloc = new ArrayList<>(); */
        public String name,test;
    public int[] allowedloc={3,4,8,9,13,14,18,19,23,24};
    public int[] notallowedrows={15,16,17,18,19,20,21,22,23,24};
    public int[] locationCells={-1,-1,-1};
    int numhits=0;
    public boolean flag=false;
    int r,index=0,indexcheck;

/*    public void setAllowedLocations(){
        for(int i:allowedloc1) {
            allowedloc.add(i);
/*            Log.e("Allowed Locations are "," "+i+" and its index is "+allowedloc.indexOf(i));
        }
    }

    public int setLocationCells(){
        Random random=new Random();
        index=0;
        locationCells = new ArrayList<>();
            Log.e("Ani","allowedloc.contains(r) is "+test+" and r is "+r);
        do {
            r = random.nextInt(24);
        } while ((allowedloc.indexOf(r)==-1));
        locationCells.add(r);
        locationCells.add((r+1));
        locationCells.add((r+2));
        Log.e("Location cells are ","r="+r+" r+1="+(r+1)+" r+2="+(r+2));
        return r;

    }

    public String checkYourself (int userInput){

        String result = "miss";

        if((locationCells.indexOf(userInput)!=-1)){
            result = "hit";
            numhits++;
            locationCells.remove(locationCells.indexOf(userInput));
            if(numhits==3)
                result="Kill";
        }
        return result;
    }
    */

    public boolean arraycontains(int b){

        boolean isIn = false;
        for (int item: allowedloc) {
            if (b==item) {
                isIn = true;
                 break;
             }
         }
         return isIn;
     }

    public boolean notallowedarraycontains(int b){

        boolean isIn = false;
        for (int item: notallowedrows) {
            if (b==item) {
                isIn = true;
                break;
            }
        }
        return isIn;
    }
 
     public boolean locationCellscontains(int b){
 
         boolean isIn = false;
         for (int item: locationCells) {
             if (b==item) {
                 isIn = true;
                 break;
             }
         }
         return isIn;
     }
 
     public int locationCellsindex(int b){
 
         boolean isIn = false;
         indexcheck=0;
         for (int item: locationCells) {
             if (b==item) {
                 isIn = true;
                 break;
             }
             indexcheck++;
         }
         return indexcheck;
     }

         public int setLocationCells () {
             Random random=new Random();
             index=0;
         //     Log.e("Ani","allowedloc.contains(r) is "+test+" and r is "+r);
             if(flag==false) {
             do {
                 r = random.nextInt(24);
             } while (arraycontains(r));
     //         Log.e("Ani","allowedloc.contains(r) is  AFTER WHILE"+test+" and r is "+r);
      //        Log.e("object:", "Value of r  " + r);
                 locationCells[index++] = r;
                 locationCells[index++] = r + 1;
                 locationCells[index++] = r + 2;
             }
             else{
                 do {
                     r = random.nextInt(24);
                 } while (notallowedarraycontains(r));
     //            Log.e("Ani","allowedloc.contains(r) is  AFTER WHILE"+test+" and r is "+r); */
                 locationCells[index++] = r;
                 locationCells[index++] = r + 5;
                 locationCells[index++] = r + 10;
             }
       //       Log.e("setLocationcells","value of locations are "+locationCells[index-3]+" "+locationCells[index-2]+" "+locationCells[index-1]);
             return r;
         }

        public void setName (String n) {
            name = n;
        }

        public String returnName(){
            return name;
        }

         public String checkYourself (int userInput) {
             String result = "miss";
             if(locationCellscontains(userInput)) {
                 result = "hit";
                 numhits++;
                 locationCells[locationCellsindex(userInput)]=-1;
                 if(numhits==3)
                     result="Kill";
             }
             return result;
         }
}
