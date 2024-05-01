public class PegawaiHonorer extends Pegawai {

    private double honorPerJam, jamKerja;

 

    public PegawaiHonorer(String nama, double honorPerJam, double jamKerja){

        super(nama, honorPerJam);

 

        this.honorPerJam = honorPerJam;

        this.jamKerja = jamKerja;

    }

 

    @Override

    public double getGaji(){

        return honorPerJam * jamKerja;

    }

}