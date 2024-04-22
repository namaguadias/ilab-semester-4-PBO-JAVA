public class Buku implements BarangRitel {

    private String judul;

    private String pengarang;

    private double harga;

 

    public Buku(String judul, String pengarang, double harga) {

        this.judul = judul;

        this.pengarang = pengarang;

        this.harga = harga;

    }

 

    public String getJudul() {

        return judul;

    }

 

    public String getPengarang() {

        return pengarang;

    }

 

    @Override

    public double getHargaRitel() {

        return harga;

    }

}

/* 
    
JOKI BY RINCEMBER 
IG : rincemberr 

:D

 */