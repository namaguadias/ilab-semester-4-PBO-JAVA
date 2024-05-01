public class Essay extends AktivitasBernilai {

 

    private double grammar;

    private double pengejaan;

    private double panjangEssay;

    private double konten;

 

    public Essay(double grammar, double pengejaan, double panjangEssay, double konten) {

        setGrammar(grammar);

        setPengejaan(pengejaan);

        setPanjangEssay(panjangEssay);

        setKonten(konten);

 

        // Hitung skor berdasarkan nilai-nilai yang telah ditentukan

        setSkor(Math.min(grammar, 30) + Math.min(pengejaan, 20) + Math.min(panjangEssay, 20) + Math.min(konten, 30));

    }

 

    public void setGrammar(double grammar) {

        this.grammar = grammar;

    }

 

    public void setPengejaan(double pengejaan) {

        this.pengejaan = pengejaan;

    }

 

    public void setPanjangEssay(double panjangEssay) {

        this.panjangEssay = panjangEssay;

    }

 

    public void setKonten(double konten) {

        this.konten = konten;

    }

 

    public double getGrammar() {

        return grammar;

    }

 

    public double getPengejaan() {

        return pengejaan;

    }

 

    public double getPanjangEssay() {

        return panjangEssay;

    }

 

    public double getKonten() {

        return konten;

    }

 

}

