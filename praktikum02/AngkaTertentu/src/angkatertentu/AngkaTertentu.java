/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package angkatertentu;
import java.util.Scanner;
/**
 *
 * @author dian
 */
public class AngkaTertentu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int angka;
        Scanner in = new Scanner(System.in);
        do
        {
        System.out.print("Masukkan angka : ");
        angka = in.nextInt();
        }
        while(angka != 0);
        System.out.println("\nAnda telah memasukkan angka 0");
    }
    
}
