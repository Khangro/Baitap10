package bai10;

public class nhanVien extends diemChung {
	private String donVi;
	public nhanVien() {}
	public nhanVien(String hoTen,int ngaySinh,int thangSinh,float heSoLuong,String donVi) {
		super(hoTen,ngaySinh,thangSinh,heSoLuong);
		this.donVi=donVi;
	}
	public void setDonVi(String donVi) {
		this.donVi=donVi;
	}
	public String getDonVi() {
		return donVi;
	}
	public void display() {
		System.out.println("Tên: "+super.getHoten()+", Ngày sinh: "+super.getNgaySinh()+", tháng sinh: "+super.getThangSinh()+", Hệ Số lương: "+super.getHeSoLuong()+", Đơn vị: "+getDonVi());
		
	}
	}
