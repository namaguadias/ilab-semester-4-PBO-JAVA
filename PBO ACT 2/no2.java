import java.util.Scanner;

public class FaktorPrima {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan asli: ");

        int n = input.nextInt();

        if (n <= 1) {

            System.out.println("Input tidak valid. Bilangan harus lebih besar dari 1.");

            return;

        }

        for (int i = 2; i <= n; i++) {

            while (n % i == 0) {

                System.out.println(i);

                n /= i;

            }

        }

    }

}

/* 
    
JOKI BY RINCEMBER 
IG : rincemberr 

:D

 */