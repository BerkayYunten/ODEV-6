import java.util.Random; //matrisleri rastgele doldurmak için

public class JAVAÖDEVİ6 {
    public static void main(String[] args) {
        int[][] dizi1 = new int[2][3]; 
        int[][] dizi2 = new int[3][3];

        // Rastgele değerlerle matrisleri dolduran voidi kullan
        MatrisDoldur(dizi1);
        MatrisDoldur(dizi2);

        // Matrisleri yazdıran void 
        System.out.println("Dizi1:");
        matrisiYazdir(dizi1);
        System.out.println("\nDizi2:");
        matrisiYazdir(dizi2);
        
        // Matris çarpımını hesaplayan voidi kullan ve yazdır
        int[][] carpim = matrisCarp(dizi1, dizi2);
        System.out.println("\nÇarpım:");
        matrisiYazdir(carpim);

        // Matris toplamını hesaplayan ve yazdıran voidi kullan
        int[][] toplam = matrisTopla(dizi1, dizi2);
        System.out.println("\nToplam:");
        matrisiYazdir(toplam);
    }

    // Matrisi rastgele değerlerle dolduran void
    public static void MatrisDoldur(int[][] matris) {
        Random random = new Random();
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                matris[i][j] = random.nextInt(10); // [0, 9] arası rakamlar alıp dolduruyor. değiştirilebilir.
            }
        }
    }

    // Matrisi ekrana yazdıran void
    public static void matrisiYazdir(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Matris çarpımını hesapla 
    public static int[][] matrisCarp(int[][] matris1, int[][] matris2) {
        int m = matris1.length;
        int n = matris1[0].length;
        int p = matris2[0].length;
        int[][] carpim = new int[m][p];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    carpim[i][j] += matris1[i][k] * matris2[k][j];
                }
            }
        }
        return carpim;
    }

    // Matris toplamını hesapla
    public static int[][] matrisTopla(int[][] matris1, int[][] matris2) {
        int[][] toplam = new int[matris1.length][matris1[0].length];
        for (int i = 0; i < matris1.length; i++) {
            for (int j = 0; j < matris1[i].length; j++) {
                toplam[i][j] = matris1[i][j] + matris2[i][j];
            }
        }
        return toplam;
    }
}
