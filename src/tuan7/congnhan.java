package tuan7;

public class congnhan extends canbo {
    private String bac;
    @Override
    public void creatData () {
        super.creatData();
        System.out.print("Hay nhap bac cho cong nhan: ");
        bac = sc.nextLine();
        
    }

    public void showData () { 
        System.out.printf("%-20s %-10s %-10d %-20s %-20s\n" , this.name, this.gioiTinh, this.namsinh, this.diachi, this.bac );
        

    }


            public static void main(String[] args) {
                
            }


}
