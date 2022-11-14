package bai10;

public class GiamDoc extends diemChung {
private float heSoChucVu;
public GiamDoc() {}
public GiamDoc(String hoTen,int ngaySinh,int thangSinh,float heSoLuong,float heSoChucVu) {
	super(hoTen,ngaySinh,thangSinh,heSoLuong);
	this.heSoChucVu=heSoChucVu;
}



public float getHeSoChucVu() {
	return heSoChucVu;
}
public void setHeSoChucVu(float heSoChucVu) {
	this.heSoChucVu = heSoChucVu;
}
public void display() {
	System.out.println("Tên: "+super.getHoten()+", Ngày sinh: "+super.getNgaySinh()+", tháng sinh: "+super.getThangSinh()+", Hệ Số lương: "+super.getHeSoLuong()+", Hệ số chức vụ: "+getHeSoChucVu());
}
}
