package tuan7;

public class kysu extends canbo {
    public String nganhHoc;

    @Override
    public void creatData() {
        super.creatData();
        System.out.print("Nhap nghanh hoc cua can bo: ");
        nganhHoc = sc.nextLine();

    }

    public void showData() {
        System.out.printf("%-20s %-10s %-10d %-20s %20s\n" , this.name, this.gioiTinh, this.namsinh, this.diachi, this.nganhHoc );
    }
}
