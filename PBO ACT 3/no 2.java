public class Karyawan {

    private String nama;

    private int nomorId;

    private String departemen;

    private String posisi;

   

    public Karyawan() {

        nama = "";

        nomorId = 0;

        departemen = "";

        posisi = "";

    }

   

    public Karyawan(String nama, int nomorId) {

        this.nama = nama;

        this.nomorId = nomorId;

        departemen = "";

        posisi = "";

    }

   

    public Karyawan(String nama, int nomorId, String departemen, String posisi) {

        this.nama = nama;

        this.nomorId = nomorId;

        this.departemen = departemen;

        this.posisi = posisi;

    }

   

    public void setNama(String nama) {

        this.nama = nama;

    }

   

    public void setNomorId(int nomorId) {

        this.nomorId = nomorId;

    }

   

    public void setDepartemen(String departemen) {

        this.departemen = departemen;

    }

   

    public void setPosisi(String posisi) {

        this.posisi = posisi;

    }

   

    public String getNama() {

        return nama;

    }

   

    public int getNomorId() {

        return nomorId;

    }

   

    public String getDepartemen() {

        return departemen;

    }

   

    public String getPosisi() {

        return posisi;

    }

}

/* 
    
JOKI BY RINCEMBER 
IG : rincemberr 

:D

 */