package com.iremsudedemir.javalearning;

public class Statements {

    public static void main(String[] args){
         int x=5;
        System.out.println(x);
        x=x+1;
        System.out.println(x);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);
        x=x*5;
        System.out.println(x);

        int y=4;
        System.out.println(x>y);
        System.out.println(y>x);

        y=30;
        System.out.println(x>=y);
        System.out.println(x==y);
        System.out.println(x!=y);

        //and &&
        //or ||

        x=3;
        y=4;
        int z=5;
        System.out.println(x<y);
        System.out.println(x<y && y<z);
        System.out.println(x<y || y>z);

        //if statements
        if(x<y){
            System.out.println("y is bigger");
        } else if (y<x) {
            System.out.println("x is bigger");
        }
        else{
            System.out.println("x==y");
        }


        //switch

        int day=7;

        String dayString="";

        switch (day) {
            case 1:
                dayString="Monday";
                break;
            case 2:
                dayString="Tuesday";
                break;
            case 3:
                dayString="Wednesday";
                break;
            case 4:
                dayString="Thursday";
                break;
            case 5:
                dayString="Friday";
                break;
            case 6:
                dayString="Saturday";
                break;
            case 7:
                dayString="Sunday";
                break;

            default:
                dayString="the days are over";
                break;
        }

        System.out.println(dayString);

        }


    }


