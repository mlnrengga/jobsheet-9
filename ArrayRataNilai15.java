import java.util.Scanner;

public class ArrayRataNilai15 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jmlMhs = input15.nextInt();
        int[] nilaiMhs = new int[jmlMhs];
        double rata2Lulus = 0, rata2Tidak = 0;
        int jmlLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan Nilai Mahasiswa Ke-"+(i+1)+" : ");
            nilaiMhs[i] = input15.nextInt();
            if (nilaiMhs[i] > 70) {
                rata2Lulus += nilaiMhs[i];
                jmlLulus += 1;
            }else 
                rata2Tidak += nilaiMhs[i];
        }
        rata2Lulus = rata2Lulus/jmlLulus;
        rata2Tidak = rata2Tidak/(nilaiMhs.length-jmlLulus);
        System.out.println("Rata-Rata Nilai Lulus = "+rata2Lulus);
        System.out.println("Rata-Rata Nilai Tidak Lulus = "+rata2Tidak);

        input15.close();
    }
    
}
