package on_Class;
import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;;
public class cau1_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap so phan tu cua mang a[] : ");
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri cho phan tu cua mang a[" + i + "] : ");
            a[i] = sc.nextInt();
        }
        xuat(a);
        maxSecond(a);

    }

    // public static int nhap() {
        
    // }

    public static void xuat(int arr[]) {
        System.out.println("Cac Phan Tu Cua mang a[] : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    
    public static void seccond_Max(int arr[]) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                {
                    max = arr[i];
                }
            }
        int second = arr[0];
            for (int i = 1; i < arr.length; i++) {
                    if (second < arr[i] && arr[i] < max) {
                        second = arr[i];
                    } 
            }
            System.out.println("Gia tri lon thu hai cua mang la: " + second);
}

public static void maxSecond(int a[]) {
        int vtrMax = 0;
        int max  = a[0]; 
        int max2 = a[0];
        int vtrMax2;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                vtrMax = i;
                max2 = max;
                vtrMax2 = vtrMax;
            }
                else if (a[i] > max2) {
                    max2 = a[i];
                    vtrMax2 = i;
                }
             System.out.println(" " + vtrMax2);
            }}

}



