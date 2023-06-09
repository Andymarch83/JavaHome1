import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int i = new Random().nextInt(2000);
        System.out.println("Cлучайное целое число в диапазоне от 0 до 2000 = "+i);

        int b = Integer.highestOneBit(i);
        int n = Integer.toBinaryString(i).length()-1;
        System.out.println("Старший бит выпавшего числа = "+b);
        System.out.println("Номер старшего значения бита = "+n);

        short cnt = 0;
        for (int j = i; j < Short.MAX_VALUE; j++){
            if ( j % n == 0) {
                cnt++;
            }
        }
        System.out.println("массив m1 = "+ cnt);
        int[] m1 = new int [cnt];
        cnt = 0;

        for (int j = i; j < Short.MAX_VALUE; j++){
            if (j % n == 0) {
                m1[cnt++] = j;
            }
        }


        int count = 0;
        for (int j = Short.MIN_VALUE; j < i; j++){
            if ( j % n != 0) {
                count++;
            }
        }
        System.out.println("массив m2 = "+ count);
        int[] m2 = new int [count];
        count = 0;

        for (int j = Short.MIN_VALUE; j < i; j++){
            if (j % n != 0) {
                m2[count++] = j;
            }
        }



    }
}