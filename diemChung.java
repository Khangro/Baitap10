package bai10;

public class diemChung {
private String hoTen;
private int ngaySinh;
private float heSoLuong;
private int thangSinh;
public diemChung() {}
public diemChung(String hoTen,int ngaySinh,int thangSinh,float heSoLuong){
      this.hoTen=hoTen;
      this.ngaySinh=ngaySinh;
      this.heSoLuong=heSoLuong;
      this.thangSinh=thangSinh;
}
public int getThangSinh() {
	return thangSinh;
}
public void setThangSinh(int thangSinh) {
	this.thangSinh = thangSinh;
}
public void setHoTen(String hoTen) {
	this.hoTen=hoTen;
}
public  String getHoten() {
	return hoTen;
}
public void setNgaySinh(int ngaySinh) {
	this.ngaySinh=ngaySinh;
}
public int getNgaySinh() {
	return ngaySinh;
}
public void setHeSoLuong(float heSoLuong) {
	this.heSoLuong=heSoLuong;
}
public float getHeSoLuong() {
    return heSoLuong;
}

}
