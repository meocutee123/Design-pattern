public class NhanVien {
    String Name;
    int Age;
    String Address;
    double Salary;
    int workHours;

    public NhanVien() {
        Name = "Nghia";
        Age = 20;
        Address = "664/2 2/4 street";
        Salary = 1000d;
        workHours = 40;
    }
    public String getThongTin(){
        return Name + " " + Age + " " + Address + " " + Salary + " " + workHours;
    }
    public double tinhThuong() {
        if (workHours >= 200) return Salary * 0.2;
        else if (workHours >= 100 && workHours < 200) return Salary * 0.1;
        else return 0;
    }
    public static void main(String[] args) {
        NhanVien Infor = new NhanVien();
        System.out.println(Infor.getThongTin());
        System.out.println(Infor.tinhThuong());
    }
}