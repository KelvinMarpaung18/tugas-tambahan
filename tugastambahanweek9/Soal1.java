package tugastambahanweek9;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 0) System.out.println("Positif");
        else if(n < 0) System.out.println("Negatif");
        else System.out.println("Nol");
    }
}