package com.iremsudedemir.javalearning;

public class Loops {

    public static void main(String[] args){
        //for loop
        //Genelde diziyle kullanılır
        int[] myNumbers={12,15,18,21,24};

        for(int i=0;i<myNumbers.length;i++) {
            int x=myNumbers[i]/3*5;
            //System.out.print(x+" ");
        }

        for(int number:myNumbers){
            System.out.print(number/3*5+" ");
        }

        //while

        int j=0;

        while(j<10){
            System.out.println("test");
            j++;
        }




        }
    }

