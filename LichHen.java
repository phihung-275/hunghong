/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom.pkg12_21ct112.phihung;
/**
 *
 * @author Phi Hung
 */
public class LichHen {
    public static void main(String[] args) {
    LichHen lichHen = new LichHen("Nguyen Van A", 123456789, "01/01/2022", 100000);
    System.out.println(lichHen.toString());
    
}
    private String tenKhachHang;
    private int soDienThoai;
    private String ngayHen;
    private double giaTien;

    public LichHen(String tenKhachHang, int soDienThoai, String ngayHen, double giaTien) {
        this.tenKhachHang = tenKhachHang;
        this.soDienThoai = soDienThoai;
        this.ngayHen = ngayHen;
        this.giaTien = giaTien;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getNgayHen() {
        return ngayHen;
    }

    public void setNgayHen(String ngayHen) {
        this.ngayHen = ngayHen;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    @Override
    public String toString() {
        return "Khách hàng: " + tenKhachHang + ", Số điện thoại: " + soDienThoai + ", Ngày hẹn: " + ngayHen + ", Giá tiền: " + giaTien;
    }
}