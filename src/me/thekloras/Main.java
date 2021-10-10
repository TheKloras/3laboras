package me.thekloras;

import java.util.Collections;
import java.util.Random;

import static java.util.Collections.swap;

public class Main {

    static int[] masyvas = new int[20];

    public static void main(String[] args) {
        random();
        isvestiMasyva();
        apkeisti();
        isvestiMasyva();
        System.out.println(vidurkis());
        System.out.println(kiekis());
        System.out.println(min());
        System.out.println(max());
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
    public static int kiekis(){
        int kiekis=0;
        kiekis = masyvas.length;
        return kiekis;
    }
    public static void apkeisti(){
        int x;
        x = min();
        masyvas[minIndex()] = masyvas[maxIndex()];
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
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}