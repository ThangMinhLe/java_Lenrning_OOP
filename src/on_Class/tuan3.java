package on_Class;
import java.util.Arrays;
import java.util.Scanner;

import javax.xml.transform.Source;
public class tuan3 {
    public static void main(String[] args) {

        // static void xuatmang() {
        //     for (int x : arr ) {
        //         System.out.println(x);
        //     }
        // }


        Scanner sc = new Scanner(System.in);
        // System.out.print("Hay nhap so phan tu cua mang: ");
        // int n = sc.nextInt();
        int arr [] = new int[] {2,3,4,5,6,7,8,9,10};
        // int m = arr.length;
        // nhap(arr, n);
       
    // System.out.println("Nhap value");
    //   int value = sc.nextInt();
    //     System.out.println("Nhap index");
    //   int index =sc.nextInt() ;
    

    // deleteFinally (arr);
    delete(arr);
    // Finally (arr);
    // add(arr, value, index);
    // findX(arr);
    // maxFind(arr);
}

    public static void delete(int a []) {
        int ar [] = new int[a.length];
        ar = Arrays.copyOf(a, a.length );
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vi tri muon xoa: ");
        int index = sc.nextInt();
        for (int i = index; i < ar.length -1; i++) {
               ar[i] = ar[i + 1]; 
        }



       for(int i = 0; i < ar.length - 1; i++) {
        System.out.print(ar[i] + "  ");
        }
        System.out.println("");
    }

    public static void deleteFinally(int a []) {
        int ar [] = new int[a.length];
        ar = Arrays.copyOf(a, a.length - 1 );
        
        for (int i : ar) {
            System.out.print(i + "  ");
        }

        System.out.println("");
    }

    public static void Finally (int arr[]) {
        Scanner sc = new Scanner(System.in);
        int ar [] = new int[arr.length +1];
        ar = Arrays.copyOf(arr,arr.length + 1);
        System.out.print("Nhap value: ");
        int value = sc.nextInt();
        ar[ar.length -1 ] = value;
        System.out.println("Day sau khi add " +  value + " la:");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println("");
    
}

public static void nhap(int[] arr, int n) {
    Scanner sc = new Scanner(System.in);
    System.out.println("");
    System.out.println("Nhap gia tri cho mang!");
    System.out.println("");
    for(int i = 0 ; i < n ; i++) {
        System.out.print("Nhap gia tri cho phan tu " + i + " : ");
        arr[i] = sc.nextInt();

}

}

public static void add(int[] arr, int element, int index) {
    int[] newArray = new int[1];
     // Khởi tạo mảng mới với kích thước tăng lên 1 đơn vị
    // for (int i = 0, j = 0; i < newArray.length; i++) {
    //     if (i == index) {
    //         newArray[i] = element; // Gán phần tử mới vào vị trí index
    //     } else {
    //         newArray[i] = arr[j]; // Copy các phần tử của mảng cũ sang mảng mới
    //         j++;
    //     }
    // }

    newArray = Arrays.copyOf(arr,arr.length + 1);
        System.out.println(newArray.length);
    for(int i =newArray.length -1 ; i>index ; i--)//dich chuyen mang de tao o trong truoc khi them
        {
            newArray[i] = newArray[i-1];        
        }
        newArray[index] = element;


    for (int i = 0; i < newArray.length; i++) {
        System.out.print(newArray[i] + "  ");
    } 
}
//

public static void findX(int arr []) 

{
    Scanner sc = new Scanner(System.in);
    int x; 
    System.out.print("Gia tri phan tu x ? ");
    x = sc.nextInt();
    
    boolean check = false;
    // System.out.println("Duyet mang!");
    for(int i = 0 ; i < arr.length ; i++) {
        if (arr[i] == x){
            System.out.println("Trong mang co phan tu bang " + x + " tai vi tri " + i);
            check = true;
        }

    }

   

    if (!check) {
        System.out.println("Mang khong co phan tu bang " + x );
    }

}





public static void maxFind(int arr []) {
    int max = arr[0];
    
    for(int i = 0 ; i < arr.length ; i++) {
        if (max < arr[i] )
    {
        max = arr[i];
        
    }
    }
    System.out.println("Cac gia tri " + max + " lon nhat tai!");

    for (int i = 0 ; i < arr.length ; i++)
          {
            if (arr[i] == max ) {
                System.out.println(i +" ");
            }
          }
    
    
}

// how to write a function to input array
// public static void inputArray(int[] arr) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Nhap gia tri: ");
//     int value = sc.nextInt();
//     for (int i = 0; i < arr.length; i++) {
//         if (arr[i] == value) {
//             System.out.println(i + " ");
//         }
//     }

}
