package Tuan6;




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
    
    public static void main(String[] args) {
        
        System.out.println(getCharAfterLastWhiteSpace("        Hello Man!           "));

    }

}
