package bai10;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner vk=new Scanner(System.in);
		GiamDoc gd= new GiamDoc();
		quanDoc qd1=new quanDoc();
		quanDoc qd2=new quanDoc();
        System.out.println("Nhập tên Giám Đốc: ");
        String t=vk.nextLine();
        gd.setHoTen(t);
        System.out.println("nhập ngày sinh: ");
        int tuoi=vk.nextInt();
        gd.setNgaySinh(tuoi);
        System.out.println("nhập tháng sinh: ");
        int thang=vk.nextInt();
        gd.setThangSinh(thang);
        System.out.println(" Nhập Hệ số lương của giám đốc: ");
        float hsl=vk.nextFloat();
        gd.setHeSoLuong(hsl);
        System.out.println(" Nhập Hệ số chức vụ của giám đốc: ");
        float hscv=vk.nextFloat();
        gd.setHeSoChucVu(hscv);
        String temp=vk.nextLine();
        for(int i=1;i<=2;i++)
        {
        	System.out.println("Nhập tên quản Đốc"+i+": ");
            String h=vk.nextLine();
            gd.setHoTen(h);
            System.out.println("nhập ngày sinh: ");
            int old=vk.nextInt();
            gd.setNgaySinh(old);
            System.out.println("nhập tháng sinh: ");
            int mo=vk.nextInt();
            gd.setThangSinh(mo);
            System.out.println(" Nhập Hệ số lương của quản đốc: ");
            float p=vk.nextFloat();
            gd.setHeSoLuong(p);
            System.out.println(" Nhập số lương nhân viên quản lý: ");
            float y=vk.nextFloat();
            gd.setHeSoChucVu(y);
            temp=vk.nextLine();
            System.out.println("-------------------------------------------");
        }
        listNhanVien nv=new listNhanVien();
        nv.nhap();
        nv.hienthi();
        System.out.println("nhân sự có lương cao nhất là: ");
        gd.display();
        System.out.println("-------------------------------");
        System.out.println("Nhân sự sinh nhật trong tháng 12 là:");
         if(gd.getThangSinh()==12) System.out.println(gd.getHoten());
         if(qd1.getThangSinh()==12) System.out.println(qd1.getHoten());
         if(qd2.getThangSinh()==12) System.out.println(qd2.getHoten());;
         nv.thang12();
         System.out.println("-----------------------------------------");
         System.out.println("nhân viên làm trong phòng kế toán là: ");
         nv.timdonvi();
         System.out.println("Nhân viên có họ là Huynh là: ");
         nv.timHo();
         
	}
     
}
