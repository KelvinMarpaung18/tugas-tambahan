package tugastambahanweek9;

import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean prima = n > 1;
        for(int i=2; i<=Math.sqrt(n) && prima; i++) {
            if(n % i == 0) prima = false;
        }
        System.out.println(prima ? "Prima" : "Bukan Prima");
    }
}
