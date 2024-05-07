  public static void main(String[] args)
  {
    BarangRitel[] produk = new BarangRitel[4];
    produk[0] = new CompactDisc("07 Des", "Sheila on 7", 50000);
    produk[1] = new CompactDisc("Let It Be", "Beatles", 75000);
    produk[2] = new DVD("Avengers: Endgame", 181, 200000);
    produk[3] = new DVD("The Raid", 101, 185000);

    // Loop untuk mencetak informasi setiap object
    for (
BarangRitel p : produk
)
    {
       // Cetak Nama Produk
       System.out.print(
"Nama: " + p.getNamaProduk()
);
       // Cetak Harga Ritel
       System.out.printf(
", Harga: Rp%,.2f\n", p.getHargaRitel()
);
    }    
}