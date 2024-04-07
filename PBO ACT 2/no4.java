import java.util.Scanner;

public class NilaiUjian 
{
    // Tuliskan definisi-definisi method yang diperlukan di bawah comment ini.
     public static double hitungRatarata(double n1, double n2, double n3, double n4, double n5) {

        double ratarata = (n1 + n2 + n3 + n4 + n5) / 5.0;

        return ratarata;

    }

   

    public static String tentukanGrade(double nilai) {

        if (nilai >= 90) {

            return "A";

        } else if (nilai >= 80) {

            return "B";

        } else if (nilai >= 70) {

            return "C";

        } else if (nilai >= 60) {

            return "D";

        } else {

            return "E";

        }

    }




    
    /****************************************
     *  !!! JANGAN UBAH KODE DI BAWAH !!!   *
     ****************************************/
    public static void main(String[] args)
    {
        double nilai1;
        double nilai2;
        double nilai3;
        double nilai4;
        double nilai5;
        double ratarata;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian ke-1: ");
        nilai1 = keyboard.nextDouble();
        
        System.out.print("Masukkan nilai ujian ke-2: ");
        nilai2 = keyboard.nextDouble();

        System.out.print("Masukkan nilai ujian ke-3: ");
        nilai3 = keyboard.nextDouble();

        System.out.print("Masukkan nilai ujian ke-4: ");
        nilai4 = keyboard.nextDouble();

        System.out.print("Masukkan nilai ujian ke-5: ");
        nilai5 = keyboard.nextDouble();

        ratarata = hitungRatarata(nilai1, nilai2, nilai3, nilai4, nilai5);

        System.out.println("Rata-rata nilai ujian = " + ratarata);
        System.out.println("Grade Anda = " + tentukanGrade(ratarata));

    }
}

/* 
    
JOKI BY RINCEMBER 
IG : rincemberr 

:D

 */