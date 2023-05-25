/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom.pkg12_21ct112.phihung;

/**
 *
 * @author Phi Hung
 */
class Thuoc {
    public static void main(String[] args) {
    Thuoc thuoc = new Thuoc("TS001", "Paracetamol", "Viên", 100, 5000);
    System.out.println("Thông tin thuốc:");
    System.out.println("Mã số thuốc: " + thuoc.getMaSoThuoc());
    System.out.println("Tên thuốc: " + thuoc.getTenThuoc());
    System.out.println("Đơn vị tính: " + thuoc.getDonViTinh());
    System.out.println("Số lượng tồn kho: " + thuoc.getSoLuongTonKho());
    System.out.println("Giá bán: " + thuoc.getGiaBan());

    thuoc.suaThongTin("Paracetamol 500mg", "Viên", 200, 10000);
    System.out.println("Thông tin thuốc sau khi sửa:");
    System.out.println("Mã số thuốc: " + thuoc.getMaSoThuoc());
    System.out.println("Tên thuốc: " + thuoc.getTenThuoc());
    System.out.println("Đơn vị tính: " + thuoc.getDonViTinh());
    System.out.println("Số lượng tồn kho: " + thuoc.getSoLuongTonKho());
    System.out.println("Giá bán: " + thuoc.getGiaBan());
}
    private String maSoThuoc;
    private String tenThuoc;
    private String donViTinh;
    private int soLuongTonKho;
    private double giaBan;

    public Thuoc(String maSoThuoc, String tenThuoc, String donViTinh, int soLuongTonKho, double giaBan) {
        this.maSoThuoc = maSoThuoc;
        this.tenThuoc = tenThuoc;
        this.donViTinh = donViTinh;
        this.soLuongTonKho = soLuongTonKho;
        this.giaBan = giaBan;
    }

    public String getMaSoThuoc() {
        return maSoThuoc;
    }

    public String getTenThuoc() {
        return tenThuoc;
    }

    public void suaThongTin(String tenThuocMoi, String donViTinhMoi, int soLuongTonKhoMoi, double giaBanMoi) {
        this.tenThuoc = tenThuocMoi;
        this.donViTinh = donViTinhMoi;
        this.soLuongTonKho = soLuongTonKhoMoi;
        this.giaBan = giaBanMoi;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public int getSoLuongTonKho() {
        return soLuongTonKho;
    }    
}
