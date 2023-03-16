package Tuan_5;
import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Vidu1 {

            public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int r = input();
            System.out.println("Gia tri chu vi cua hinh tron la: " + chuvi(r));
            System.out.println("Gia tri dien tich cua hinh tron la: " + dientich(r));
            }

            public static float chuvi(int r) {
                float v;
                v = r*2*(float)3.14;
                return v;
            }

            public static float dientich(int r) {
                float s;
                s = r*r*(float)3.14;
                return s;
            
            }

            public static int input() {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter gia tri cho r: ");
                int r = sc.nextInt();
                return r;
            }
    
}
