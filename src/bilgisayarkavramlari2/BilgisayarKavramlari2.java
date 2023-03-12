/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bilgisayarkavramlari2;

/**
 *
 * @author maytemur java19- Döngüler - //100'den 1'e kadar olan tek sayılar 0
 * ile 100 arasında hem 3'e hem 7 ye bölünebilen sayılar, 2 4 6 8 16 32 ve 2'nin
 * üsleri, 1 den 5 e kadar 5'e tam bölünen sayıları bastırınız
 */
public class BilgisayarKavramlari2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        for (int i = 0; i < 50; i++) {
//            System.out.println(""+(100-(2*i+1)));            
//        }
//        for (int i = 0; i < 100; i++) {
//
//            if (i % 3 == 0 && i % 7 == 0) {
//                System.out.println("" + i);
//            }
//        for (int i = 1; i < 100; i *= 2) {
//            System.out.println("" + i);
//        }
//        for (int i = 0; i < 7; i++) {
//            System.out.println("" + (int)Math.pow(2, i));
//            
//        }
        for (int i = 1; i <= 5; i++) //for altındaki kod tek satırsa süslüye gerek yok
        
            if (i % 5 == 0) //if altı satırsa süslü paranteze(curly bracket) gerek yok
            
                System.out.println(i);           
        
    }
}
