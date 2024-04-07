import java.util.Scanner;

public class PenjualanTiket {

    public static void main(String[] args) {

        int sisaTiket = 10;

        int tiketTerjual = 0;

        int jumlahTiket = 10;

        int pembeli = 0;

 

        Scanner keyboard = new Scanner(System.in);

 

        while (tiketTerjual < jumlahTiket && sisaTiket > 0) {

            System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");

            int jumlahBeli = keyboard.nextInt();

            if (jumlahBeli > 4) {

                System.out.println("Anda tidak bisa membeli lebih dari 4 tiket.");

            } else if (sisaTiket < jumlahBeli) {

                System.out.println("Maaf, sisa tiket yang tersisa adalah " + sisaTiket + " tiket.");

            } else {

                tiketTerjual += jumlahBeli;

                sisaTiket -= jumlahBeli;

                pembeli++;

                System.out.println("Anda membeli sebanyak " + jumlahBeli + " tiket.");

                if (sisaTiket > 0) {

                  System.out.println("Sisa tiket yang tersedia: " + sisaTiket);

                }

            }

        }

 

        if (sisaTiket == 0) {

            System.out.println("Semua tiket telah terjual kepada " + pembeli + " pembeli.");

        }

 

    }

}

/* 
    
JOKI BY RINCEMBER 
IG : rincemberr 

:D

 */