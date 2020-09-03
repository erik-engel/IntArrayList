package com.dat19c;

import java.util.Arrays;

public class IntArrayList {
    //ArrayList erstattes med et int-array
    private int[] ia;
    //tilføje field til at holde styr på størrelsen, eg. int str;
    private int str= 1;

    public IntArrayList() {
        ia = new int[str];

    }

    public void add(int x){
        int n = ia.length;
        int i;
        ia = Arrays.copyOf(ia,n + 1);
        ia[n-1]=x;
    }

    public int get(int i) throws ArrayIndexOutOfBoundsException{
        int get = ia[i];
        return get;
    }

    public void remove(int x){
        for(int i =x; i<ia.length-1; i++){
            ia[i] = ia[i+1];
        }
        ia = Arrays.copyOf(ia, ia.length-1);
    }

    public int size(){
        int x = ia.length-1;
        //skal erstattes med kode, der bruger str
        return x;
    }


    @Override
    public String toString() {
        return "IntArrayList{" +
                "ia=" + Arrays.toString(ia) +
                ", str=" + str +
                '}';
    }
}