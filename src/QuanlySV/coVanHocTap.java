package QuanlySV;

public class coVanHocTap extends person {
    private String LopCoVan;

    public coVanHocTap () {

    }

    public coVanHocTap (String maSo, String name, String namSinh,
    String diachi, String gioiTinh, String lopCoVan) {
        super(maSo, name, namSinh, diachi, gioiTinh);
        this.LopCoVan = lopCoVan;
    }

    public String getLopCoVan () {
        return this.LopCoVan;
    }

    public String setLopCoVan (String lopCoVan) {
        return this.LopCoVan = lopCoVan;
    }

    public void NhapTT () {
        super.nhapTT();
        System.out.print("Nhap Lop Co Van Cua Giang Vien: ");
        setLopCoVan(sc.nextLine());
    }

    public String showData () {
        return super.showData() + String.format("%-20s", LopCoVan) ;

    }



}
