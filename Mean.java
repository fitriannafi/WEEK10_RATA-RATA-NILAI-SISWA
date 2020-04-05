
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Mean {
    public static void main(String[] args) {
        
        int array[], i, n;
        array = new int[30];
        float mean, total=0;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan banyaknya siswa: ");
        n = scan.nextInt();
        
        for (i = 1; i <= n; i++) {
            System.out.print("Nilai Siswa Ke-"+ i+" : ");
            array[i] = scan.nextInt();
            total = total + array[i];    
        }
        
        mean = total/n;
        System.out.println("Total nilai siswa adalah : " + total);
        System.out.println("Rata-rata nilai siswa adalah : " + mean);
 
     
        int threshold = 77;
        int Mean;
        Mean = (int) (total/n);
        if (mean > (threshold+1)) {
            System.out.print(String.format("Mean : %d lebih dari: %d maka nilai-nilai siswa dalam kelas tersebut bagus", Mean, threshold));
        } else if (Mean == 77){
            System.out.print(String.format("Mean : %d lebih dari: %d maka nilai-nilai siswa dalam kelas tersebut biasa", Mean, threshold));
        } else {
            System.out.print(String.format("Mean : %d lebih dari: %d maka nilai-nilai siswa dalam kelas tersebut jelek", Mean, threshold));
        }
    }        
}
