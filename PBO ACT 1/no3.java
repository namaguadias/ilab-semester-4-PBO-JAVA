public class PersamaanKuadrat
{
    public static void main(String[] args)
    {
        int a = 2, b = 4, c = -18;
        
        // [1] Deklarasikan dua variabel untuk menyimpan akar persamaan kuadrat
         double x1, x2;
        
        // [2] Hitung dua akar persamaan kuadrat
        x1 = (-b + Math.sqrt(b * b - 4 * c * a)) / (2 * a);
        x2 = (-b - Math.sqrt(b * b - 4 * c * a)) / (2 * a);

        
        // [3] Tampilkan akar persamaan kuadrat
        System.out.printf("x1 = %.16f", x1);
        System.out.println();
        System.out.printf("x2 = %.14f", x2);


    }
}