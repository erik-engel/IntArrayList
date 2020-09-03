package com.dat19c;

public class Main {

    public static void main(String[] args) {

        //instantier
        IntArrayList il = new IntArrayList();

        //Tilføj nogle tal
        il.add(1);
        il.add(17);
        il.add(42);

        System.out.println(il.get(2));
        //udskriv
        print(il);

        //fjern et element
        il.remove(2);

        //udskriv
        print(il);

    }

    private static void print(IntArrayList list){
        //udskrift som ArrayList - kan laves som toString i IntOnlyArrayList
        String s;
        //er listen tom skrives kun kantede parenteser
        if (list.size()==0){
            s = "[]";
        }
        else {
            //sæt først begyndelsesparentes og første tal (stakitproblemet)
            s = "[ " + list.get(0);
            for (int i=1; i<list.size(); i++){
                //sæt komma og næste tal, så længe der er flere tal
                s += ", " + list.get(i);
            }
            //afslut med at sætte højre parentes
            s += " ]";
        }
        //udskriv - kunne blive til return s i toString
        System.out.println(s);
    }
}