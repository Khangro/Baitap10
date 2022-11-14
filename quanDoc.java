package bai10;

public class quanDoc extends diemChung {
private float soLuongNhanVienQuanLy;
public quanDoc() {}
public quanDoc(String hoTen,int ngaySinh,int thangSinh,float heSoLuong,float soLuongNhanVienQuanLy) {
	super(hoTen,ngaySinh,thangSinh,heSoLuong);
	this.soLuongNhanVienQuanLy=soLuongNhanVienQuanLy;
}
public void setSoluongNhanVienQuanLy(float soLuongNhanVienQuanLy) {
	this.soLuongNhanVienQuanLy=soLuongNhanVienQuanLy;
}
public float getSoLuongNhanVienQuanLy() {
	return soLuongNhanVienQuanLy;
}
public void dislay() {
System.out.println("Tên: "+super.getHoten()+", Ngày sinh: "+super.getNgaySinh()+", Hệ Số lương: "+super.getHeSoLuong()+", số lương nhân viên quản lý: "+getSoLuongNhanVienQuanLy());
}
}
