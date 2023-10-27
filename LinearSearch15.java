import java.util.Scanner;
public class LinearSearch15 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Elemen Array : ");
        int jmlElmnt = input15.nextInt();
        int[] arrayInt = new int[jmlElmnt];
        int hasil = 0;
        for (int i = 0; i < arrayInt.length; i++){
            System.out.print("Masukkan Elemen Array ke-"+i+" : ");
            arrayInt[i] = input15.nextInt();
        }
        Boolean keyS = false;
        System.out.print("Masukkan Key Yang Ingin Di Cari : ");
        int key = input15.nextInt();

        for (int i = 0; i < arrayInt.length; i++){
            if (arrayInt[i] == key){
                hasil = i;
                keyS = true;
                break;
            }
        }
        if (keyS)
        System.out.println("Key Ada Di Dalam Array Pada Posisi Indeks Ke-"+hasil);
        else
        System.out.println("Key Tidak Di Temukan");
        input15.close(); 
    }  
}
