package Tuan6;

import java.util.*;


public class test {
    public static char getCharAfterLastWhiteSpace(String str) {
        str = str.trim();
        int lastSpaceIndex = str.lastIndexOf(' ');
        if (lastSpaceIndex != -1 && lastSpaceIndex < str.length() - 1 && lastSpaceIndex < str.length() - 1) {
            return str.charAt(lastSpaceIndex + 1);
        } else {
            // Nếu không tìm thấy khoản trắng cuối cùng hoặc kí tự đằng sau khoản trắng cuối cùng là kí tự cuối cùng của chuỗi
            // Trả về kí tự rỗng
            return '\0';
        }
    }
    
    public static boolean isInteger(String inputString) {
        try {
            Integer.parseInt(inputString);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isString(String inputString) {
        for (int i = 0; i < inputString.length(); i++) {
            if (!Character.isLetter(inputString.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int i ;
        // i = sc.nextInt();
        
        String st=sc.nextLine();
        sc.nextLine();
       int a=Integer.parseInt(st);
System.out.println(a);

    }

}
