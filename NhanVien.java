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
        Salary = 1000;
        workHours = 40;
    }
    public String getThongTin(){
        return Name + Age + Address + Salary + workHours;
    }
    public static void main(String[] args) {
        NhanVien Infor = new NhanVien();
       System.out.println(Infor.getThongTin());
        
    }
}