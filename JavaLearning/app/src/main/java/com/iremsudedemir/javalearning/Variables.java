package com.iremsudedemir.javalearning;

public class Variables {

    public static void main(String[] args){
        //Variables
        //Integer-Long

        int age=20;
        System.out.println(10*age);

        int x=10;
        int y=21;
        System.out.println(y/x);

        //Double-Float

        double z=10.0;
        double a=21.0;
        System.out.println(a/z);

        //Dairenin çevresini hesapla

        double pi=3.14;
        int yaricap=5;
        System.out.println("Dairenin çevresi:"+(2*pi*yaricap));

        //String

        String name="Tom";
        String surname="Couper";

        /*BUrada name="James" yapabiliriz yani başka bir stringle değiştirebiliriz ancak
         name=40 yapamayız çünkü name'i ilk oluşturduğumuzda türünü belirledik bu yüzden
        türünü değiştiremeyiz*/

        System.out.println(name+" "+surname);


        //Boolean

        boolean isAlive=true;
        isAlive=false;
        System.out.println(isAlive);

        //Final ile tanımlanan değişkenin değerini değiştiremeyiz!





    }


}
