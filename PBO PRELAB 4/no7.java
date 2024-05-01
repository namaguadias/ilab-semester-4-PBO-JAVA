public class MobilListrik extends Mobil {

 

    private int lamaRecharge;

 

    public MobilListrik(String pabrikan, String model, String warna, int kecepatanMax, int lamaRecharge) {

        super.setPabrikan(pabrikan);

        super.setModel(model);

        super.setWarna(warna);

        super.setKecepatanMax(kecepatanMax);

        this.lamaRecharge = lamaRecharge;

    }

 

    public MobilListrik() {

        super();

    }

 

    public int getLamaRecharge() {

        return lamaRecharge;

    }

 

    public void setLamaRecharge(int lamaRecharge) {

        this.lamaRecharge = lamaRecharge;

    }

 

}