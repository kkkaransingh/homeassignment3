/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trace;

/**
 *
 * @author manjodh
 */
import java.util.Scanner;
import java.util.Random;

public class Trace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  int lines, i;
        int j ;
        int obj;
        Random rndm = new Random();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("how many lines ?   ");
        lines = keyboard.nextInt();
        for (i = 0; i < lines; i++) {
            System.out.println(" ");
            obj = rndm.nextInt(10);
            for (j = 0; j <= 10; j++) {
                if (obj == j) {
                    System.out.print("*");                    
                } else {
                    System.out.print("-");
                }
                 
            }
            
        }
        System.out.println("");
       System.out.println(" end of your program ");
    }
}