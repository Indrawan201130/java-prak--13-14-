/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg27.pkgwhile.loop;

/**
 * 
 * @author ASUS A43S
 */
public class WhileLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 0;
        boolean kondisi = true;

        System.out.println("awal program");

        while (kondisi) {
            System.out.println("while loop ke-" + a);

            if (a == 10){
                kondisi = false;
            }

            a++;
        }

        System.out.println("akhir program");
    }
}
