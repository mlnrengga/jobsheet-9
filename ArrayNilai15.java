import java.util.Scanner;

public class ArrayNilai15 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan Nilai Akhir Ke-"+i+" : ");
            nilaiAkhir[i] = input15.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (nilaiAkhir[i] > 70){
            System.out.println("Mahasiswa Ke-"+i+" Lulus! ");
            }else if (nilaiAkhir[i] <= 70){
            System.out.println("Mahasiswa Ke-"+i+" Tidak Lulus! ");    
            }

        } 
        input15.close();
    }
    
}
