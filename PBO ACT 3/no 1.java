public class Mahasiswa {

    private String nama;

    private int totalSkor;

    private int banyakKuis;

   

    public Mahasiswa(String nama) {

        this.nama = nama;

        this.totalSkor = 0;

        this.banyakKuis = 0;

    }

   

    public void addSkor(int skor) {

        this.totalSkor += skor;

        this.banyakKuis++;

    }

   

    public String getNama() {

        return this.nama;

    }

   

    public int getTotalSkor() {

        return this.totalSkor;

    }

   

    public double getAverageSkor() {

        if (this.banyakKuis == 0) {

            return 0;

        }

        return (double) this.totalSkor / this.banyakKuis;

    }

}

/* 
    
JOKI BY RINCEMBER 
IG : rincemberr 

:D

 */