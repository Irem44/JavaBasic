package com.iremsudedemir.javalearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {

    public static void main(String[] args) {
        //Array

        //Dizi oluşturma 1.yol
        String[] myArray=new String[3];

        myArray[0]="Zeynep";
        myArray[1]="Kaan";
        myArray[2]="Çınar";

        System.out.println(myArray[0]);

        int[] myAgeArray=new int[3];

        myAgeArray[0]=20;
        myAgeArray[1]=22;
        myAgeArray[2]=25;

        System.out.println(myAgeArray[0]);


        //Dizi oluşturma 2.yol

        int[] myNumberArray={1,2,2,4,8};
        System.out.println(myNumberArray[1]);


        //Lists
        ArrayList<String> myMusicians=new ArrayList<String>();
        myMusicians.add("Tom");
        myMusicians.add("Lars");
        myMusicians.add(1,"Kirk");
        myMusicians.add("Rob");
        System.out.println(myMusicians.get(0));
        System.out.println(myMusicians.get(1));
        System.out.println(myMusicians.get(2));
        System.out.println(myMusicians.get(3));

        //Set
        //!Burada bir eleman set içinde bir defa bulunabilir

        HashSet<String> mySet=new HashSet<String>();
        mySet.add("Tom");
        mySet.add("Tom");
        System.out.println(mySet.size());

        //HashMap

        HashMap<String,String> myHashMap=new HashMap<String,String>();

        myHashMap.put("name","Tom");
        myHashMap.put("job","Engineering");

        System.out.println(myHashMap.get("name"));
        System.out.println(myHashMap.get("job"));

        //Burada direk int yazamayız  çünkü primitive veridir bunun yerine sınıfını yazarız!

        HashMap<String,Integer> mySecondExample=new HashMap<>();

        mySecondExample.put("Yas",20);
        mySecondExample.put("Numara",145);

        System.out.println("Yaş:"+ mySecondExample.get("Yas"));
        System.out.println("Numara:" +mySecondExample.get("Numara"));




    }
}
