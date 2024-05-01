public class RekeningMinMax extends RekeningBank {

    private double saldoMax;
    
    private double saldoMin;
    
     
    
    public RekeningMinMax(String nomorRekening, double saldoAwal) {
    
        super(nomorRekening, saldoAwal);
    
        saldoMax = saldoAwal;
    
        saldoMin = saldoAwal;
    
    }
    
     
    
    public double getSaldoMax() {
    
        return saldoMax;
    
    }
    
     
    
    public double getSaldoMin() {
    
        return saldoMin;
    
    }
    
     
    
    @Override
    
    public void deposit(double jumlah) {
    
        super.deposit(jumlah);
    
        if (getSaldo() > saldoMax) {
    
            saldoMax = getSaldo();
    
        }
    
    }
    
     
    
    @Override
    
    public void withdraw(double jumlah) {
    
        super.withdraw(jumlah);
    
        if (getSaldo() < saldoMin) {
    
            saldoMin = getSaldo();
    
        }
    
    }
    
    }