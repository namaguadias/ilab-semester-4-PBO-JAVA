public static double readDouble(String prompt) {
    // Tuliskan kode method readDouble di bawah comment ini.
    System.out.print(prompt + " ");

        Scanner scanner = new Scanner(System.in);

        try {

            return scanner.nextDouble();

        } catch (Exception e) {

            System.out.println("Input yang Anda masukkan tidak valid.");

            return readDouble(prompt); 
        }
}

/* 
    
JOKI BY RINCEMBER 
IG : rincemberr 

:D

 */