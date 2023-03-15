/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package on_Class;
import java.util.StringTokenizer;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Hello_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        // TODO code application logic here
       String text = new String();
       System.out.print("Nhap gia tri cho chuoi ki tu: ");
       text = sc.nextLine();
        System.out.println(text + "");
        // demLenght(text);
       int dem = 0;
       
      
    //    while (text.charAt(dem) != null){
    //     dem++;
    //    }
    //    System.out.println("Do dai cua mang la: "   + dem);
    xoaKhoangTrang(text);

        
        
    }

    public static void demLenght(String a) {
        int dem = 0;
        for (char c : a.toCharArray()) {
            dem++;
        }
        System.out.println("Do dai cua mang la: "   + dem);
    }

    public static void xoaKhoangTrang(String a) { 
       int dem = 0;
        for(int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if( c == ' ' ) {
              a = a.replace(' ', '');
            dem += 1;
            }
        }
        System.out.println(dem + "");

    }

    
    
    

}
