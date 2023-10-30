import java.util.Scanner;
public class ArrayNilai06 {
    public static void main(String[] Args){
        try (Scanner input06 = new Scanner (System.in)){
            int [] nilaiAkhir = new int [10];

            for(int i = 0; i< 10; i++){
                System.out.print("Masukkan nilai akhir ke-" +i+": ");
                nilaiAkhir[i] = input06.nextInt();
            }
            for(int i = 0; i< 10; i++){
                System.out.println("Nilai akhir ke-" +i+ "adalah "+nilaiAkhir[i]);
            }
    }
}
}
