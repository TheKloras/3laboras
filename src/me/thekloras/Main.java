package me.thekloras;

import java.util.Random;

public class Main {

    //masyvas
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
        System.out.println("Minimalus neigiamas lyginis skaičius: " + minNeigiamas());
    }

    /**
     * Funkcija sukurianti random skaičius masyvui
     */
    public static void random() {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            masyvas[i] = rand.nextInt(100);
        }
        for (int i = 10; i < 20; i++) {
            masyvas[i] = rand.nextInt(100) - 100;
        }
    }

    /**
     * Funkcija išvedanti masyva į ekraną
     */
    public static void isvestiMasyva() {
        System.out.print("Masyvas: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(masyvas[i] + " ");
        }
        System.out.println();
    }

    /**
     * Funkcija suskaičiuojanti masyvo vidurkį
     *
     * @return gražinamas vidurkis
     */
    public static double vidurkis() {
        double vidurkis = 0;
        for (int i = 0; i < 20; i++) {
            if (masyvas[i] % 2 == 0)
                vidurkis = vidurkis + masyvas[i];
        }
        vidurkis = vidurkis / kiekis();
        return vidurkis;
    }

    /**
     * Funkcija suskaičioujanti masyvo suma
     *
     * @return gražinama suma
     */
    public static double suma() {
        double suma = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] % 2 == 0) {
                suma = suma + masyvas[i];
            }
        }
        return suma;
    }

    /**
     * Funkcija suskaičioujanti masyvo kiekį,ilgį
     *
     * @return gražinamas kiekis,ilgis
     */
    public static int kiekis() {
        int kiekis = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] % 2 == 0) {
                kiekis++;
            }
        }
        return kiekis;
    }

    /**
     * Funkcija apkeičianti mažiausia ir didžiausia masyvo reikšme
     */
    public static void apkeisti() {
        int x = min();//laikinas kintamasis naudojamas apkeitimui
        masyvas[minIndex()] = max();
        masyvas[maxIndex()] = x;
    }

    /**
     * Funkcija apskaičiuojanti mažiausia masyvo reikšme
     *
     * @return gražinama mažiausia masyvo reikšmė
     */
    public static int min() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 20; i++) {
            if (masyvas[i] < min) {
                min = masyvas[i];
            }
        }
        return min;
    }

    /**
     * Funkcija suskaičiuojanti mažiausios reikšmės indeksa masyve
     *
     * @return gražinamas mažiausios reikšmės indeksas masyve
     */
    public static int minIndex() {
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < 20; i++) {
            if (masyvas[i] < min) {
                min = masyvas[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    /**
     * Funkcija apskaičiuojanti didžiausia masyvo reikšme
     *
     * @return gražinama didžiausia masyvo reikšmė
     */
    public static int max() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 20; i++) {
            if (masyvas[i] > max) {
                max = masyvas[i];
            }
        }
        return max;
    }

    /**
     * Funkcija suskaičiuojanti didžiausios reikšmės indeksa masyve
     *
     * @return gražinamas didžiausios reikšmės indeksas masyve
     */
    public static int maxIndex() {
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < 20; i++) {
            if (masyvas[i] > max) {
                max = masyvas[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static int minNeigiamas(){
        int minNeigiamas = Integer.MAX_VALUE;
        for (int i = 0;i< masyvas.length;i++){
            if (masyvas[i]%2==0){
                if (masyvas[i]<minNeigiamas){
                    minNeigiamas=masyvas[i];
                }
            }
        }
        return minNeigiamas;
    }
}