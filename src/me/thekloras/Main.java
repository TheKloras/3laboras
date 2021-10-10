package me.thekloras;

import java.util.Random;

public class Main {

    static int[] masyvas = new int[20];

    public static void main(String[] args) {
        random();
        isvestiMasyva();
        apkeisti();
        isvestiMasyva();
        System.out.println("Vidurkis: " + vidurkis());
        System.out.println("Kiekis: " + kiekis());
        System.out.println("Minimalus: " + min());
        //System.out.println(minIndex());
        System.out.println("Maksimalus: " + max());
        //System.out.println(maxIndex());
        System.out.println("Suma: " + suma());
    }

    public static void random() {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            masyvas[i] = rand.nextInt(500);
        }
        for (int i = 10; i < 20; i++) {
            masyvas[i] = rand.nextInt(500) - 500;
        }
    }

    public static void isvestiMasyva() {
        for (int i = 0; i < 20; i++) {
            System.out.print(masyvas[i] + " ");
        }
        System.out.println();
    }

    public static double vidurkis() {
        double vidurkis = 0;
        for (int i = 0;i<20;i++){
            vidurkis = vidurkis+masyvas[i];
        }
        vidurkis = vidurkis/20;
        return vidurkis;
    }
    public static double suma(){
        double suma = 0;
        for (int i = 0;i<20;i++){
            suma = suma+masyvas[i];
        }
        return suma;
    }
    public static int kiekis(){
        return masyvas.length;
    }
    public static void apkeisti(){
        int x = min();
        masyvas[minIndex()] = max();
        masyvas[maxIndex()] = x;
    }
    public static int min(){
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<20;i++){
            if (masyvas[i]<min){
                min = masyvas[i];
            }
        }
        return min;
    }
    public static int minIndex(){
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for(int i = 0;i<20;i++){
            if (masyvas[i]<min){
                min = masyvas[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static int max(){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<20;i++){
            if (masyvas[i]>max){
                max = masyvas[i];
            }
        }
        return max;
    }
    public static int maxIndex(){
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for(int i = 0;i<20;i++){
            if (masyvas[i]>max){
                max = masyvas[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}