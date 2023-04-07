package polyphorm;

import java.awt.font.TextHitInfo;
import java.util.Arrays;
import java.util.Scanner;

public class QLCB2 {

    static CanBo ds[] = new CanBo[0];

    public void menu() {
        System.out.println("1.Ky su");
        System.out.println("2. Cong nhan");
        System.out.println("3.Nhan vien");
    }

    public void taoDS() {
        int spt;
        int choose;
        System.out.println("Moi nhap so phan tu cua danh sach:");
        spt = Integer.parseInt(new Scanner(System.in).nextLine());
        for (int i = 0; i < spt; i++) {
            ds = Arrays.copyOf(ds, ds.length + 1);
            menu();
            System.out.println("Nhap lua chon loai can bo:");
            choose = Integer.parseInt(new Scanner(System.in).nextLine());
            switch (choose) {
                case 1:
                    ds[ds.length - 1] = new KySu();
                    break;
                case 2:
                    ds[ds.length - 1] = new CongNhan();
                    break;
                case 3:
                    ds[ds.length - 1] = new NhanVienPV();
                    break;
            }
            ds[ds.length - 1].nhapTT();

        }
    }

    public void xuatDS() {
        System.out.printf("%-30s%-10s%-20s%-10s%-10s%-20s%-15s\n", "hoTen", "gioiTinh", "diaChi", "namSinh", "bac", "nghanhhoc", "Congviec");
        for (CanBo x : ds) { //foreach
            x.xuatTT();
        }

    }

    public boolean timKiem(String st) {
        for (CanBo x : ds) {
            if (st.equals(x.getHoTen())) {
                return true;
            }
        }
        return false;
    }
}


