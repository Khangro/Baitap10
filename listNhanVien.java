package bai10;
import java.util.*;
public class listNhanVien {
	private ArrayList<nhanVien> arr;
	public listNhanVien() {
		arr=new ArrayList<>();
	}
	public void nhap() {
		Scanner in=new Scanner(System.in);
		int n;
	System.out.println("nhập số sinh viên cần nhập: ");
	n=in.nextInt();
	String temp=in.nextLine();
	for(int i=1;i<=n;i++)
	{
		System.out.println("nhập họ tên nhân viên thứ "+i+":");
		String hoten=in.nextLine();
		System.out.println("Nhập ngày sinh nhân viên thứ "+i+" : ");
		int ns=in.nextInt();
		System.out.println("tháng sinh: ");
		int ts=in.nextInt();
		System.out.println("hệ số lương nhân viên thứ "+i+": ");
		float hsl=in.nextFloat();
		temp=in.nextLine();
		System.out.println("Nhập Tên đơn vị của nhân viên thứ: "+i+": ");
		String donvi=in.nextLine();
		arr.add(new nhanVien(hoten,ns,ts,hsl,donvi));
	}
	System.out.println("-------------------------------------------------------------------");
	}
	
	public void hienthi() {
		for (int k=0;k<arr.size();k++)
		{
			System.out.println("Họ tên sinh viên thứ "+(k+1)+" là:"+arr.	get(k).getHoten());
			System.out.println("Ngày Sinh của sinh viên thứ : "+(k+1)+" là: "+arr.get(k).getNgaySinh());
			System.out.println("tháng sinh: "+arr.get(k).getThangSinh());
			System.out.println("Hệ số Lương của sinh viên thứ "+(k+1)+" là: "+arr.get(k).getHeSoLuong());
			System.out.println("Đơn vị: "+arr.get(k).getDonVi());
			System.out.println("-----------------------");
		}
	}
	public void thang12() {
		for(int i=0;i<arr.size();i++)
		{
			if(arr.get(i).getThangSinh()==12) 
				System.out.println( arr.get(i).getHoten());
		}
	}
	public void timdonvi() {
		for(int i=0;i<arr.size();i++)
		{
			if(arr.get(i).getDonVi()=="kế toán" || arr.get(i).getDonVi()=="kế Toán")
				System.out.println(arr.get(i).getHoten());
		}
	}
	public void timHo() {
		for(int i=0;i<arr.size();i++)
			if(arr.get(i).getHoten().startsWith("Huynh"))
				System.out.println(arr.get(i).getHoten());
	}
	
}
