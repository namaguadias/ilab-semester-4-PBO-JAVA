public static Mahasiswa buatMahasiswa() {

    Scanner input = new Scanner(System.in);

 

    System.out.print("Masukkan nama: ");

    String nama = input.nextLine();

 

    System.out.print("Masukkan email: ");

    String email = input.nextLine();

 

    return new Mahasiswa(nama, email);

}

