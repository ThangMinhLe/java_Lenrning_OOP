    package Tuan6;

    import java.util.Scanner;
    
   
    
    
    public class Sinhvien {
        
        private String Name;
        private long fee;
        private static long total;

        public Sinhvien () {

        }

        public Sinhvien( String name, long fee) {
            this.Name = name; 
            this.fee = fee;
        }

        public void createData () { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Ten Sinh Vien: ");
        Name = sc.nextLine();
        System.out.print("Nhap Hoc Phi Cua Sinh Vien: ");
        fee = sc.nextLong();
        System.out.println("");
        
        }

        public void showData () { 
            System.out.printf("| %-20s ", this.Name );
            System.out.printf("| %-20d |\n", this.fee);
            System.out.println("-----------------------------------------------");

        }

        public void totalFee () {
            total += this.fee;
        }


        public static void main(String[] args) {
            Sinhvien sv1 = new Sinhvien();
            Sinhvien sv2 = new Sinhvien();
            Sinhvien sv3 = new Sinhvien();

            // Nhap data cho sinh vien: 

            sv1.createData();
            sv2.createData();
            sv3.createData();

            //Show Data Sinh Vien.
            System.out.printf("| %-20s | %-20s |\n", "Ten", "Hoc phi");
            System.out.println("===============================================");

            sv1.showData();
            sv2.showData();
            sv3.showData();

            sv1.totalFee();
            sv2.totalFee();
            sv3.totalFee();

            //In ra tong hoc phi.

            System.out.println("Tong hoc phi cua sinh vien la: " + total);

        }


    }
