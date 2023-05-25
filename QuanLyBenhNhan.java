/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom.pkg12_21ct112.phihung;

//import java.util.Scanner;
/**
 *
 * @author Phi Hung
 */
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyBenhNhan {
    static ArrayList<BenhNhan> danhSachBenhNhan = new ArrayList<BenhNhan>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int luaChon;
        do {
            System.out.println("===== Quản lý thông tin bệnh nhân =====");
            System.out.println("1. Thêm mới bệnh nhân");
            System.out.println("2. Sửa thông tin bệnh nhân");
            System.out.println("3. Xóa bệnh nhân");
            System.out.println("4. Tìm kiếm bệnh nhân theo tên hoặc mã số bệnh nhân");
            System.out.println("5. Hiển thị danh sách bệnh nhân");
            System.out.println("0. Thoát chương trình");
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ ký tự '\n' sau khi nhập số

            switch (luaChon) {
                case 1:
                    themMoiBenhNhan();
                    break;
                case 2:
                    suaThongTinBenhNhan();
                    break;
                case 3:
                    xoaBenhNhan();
                    break;
                case 4:
                    timKiemBenhNhan();
                    break;
                case 5:
                    hienThiDanhSachBenhNhan();
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình.");
//                    QuanLyThuoc.menuQuanLyThuoc(); // Chuyển sang chương trình quản lý thuốc
                break;
                   
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                    break;
            }
        } while (luaChon != 0);
    }

    public static void themMoiBenhNhan() {
        System.out.println("===== Thêm mới bệnh nhân =====");
        System.out.print("Nhập mã số bệnh nhân: ");
        String maSo = scanner.nextLine();
        System.out.print("Nhập tên bệnh nhân: ");
        String ten = scanner.nextLine();
        System.out.print("Nhập tuổi bệnh nhân: ");
        int tuoi = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ ký tự '\n' sau khi nhập số
        System.out.print("Nhập giới tính bệnh nhân: ");
        String gioiTinh = scanner.nextLine();
        System.out.print("Nhập địa chỉ bệnh nhân: ");
        String diaChi = scanner.nextLine();

        BenhNhan benhNhan = new BenhNhan(maSo, ten, tuoi, gioiTinh, diaChi);
        danhSachBenhNhan.add(benhNhan);
        System.out.println("Thêm mới bệnh nhân thành công.");
    }
    public static void suaThongTinBenhNhan() {
    System.out.println("===== Sửa thông tin bệnh nhân =====");
    System.out.print("Nhập mã số bệnh nhân cần sửa: ");
    String maSo = scanner.nextLine();

    // Tìm bệnh nhân theo mã số
    BenhNhan benhNhanCanSua = null;
    for (BenhNhan benhNhan : danhSachBenhNhan) {
        if (benhNhan.getMaSo().equals(maSo)) {
            benhNhanCanSua = benhNhan;
            break;
        }
    }

    if (benhNhanCanSua == null) {
        System.out.println("Không tìm thấy bệnh nhân có mã số " + maSo);
    } else {
        System.out.println("Thông tin bệnh nhân cần sửa:");
              
        System.out.println("Mã số: " + benhNhanCanSua.getMaSo() + "; Tên: " + benhNhanCanSua.getTen() + "; Tuổi: " + benhNhanCanSua.getTuoi() + "; Giới tính: " + benhNhanCanSua.getGioiTinh() + "; Địa chỉ: " + benhNhanCanSua.getDiaChi());
        System.out.print("Nhập tên mới: ");
        String tenMoi = scanner.nextLine();
        System.out.print("Nhập tuổi mới: ");
        int tuoiMoi = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ ký tự '\n' sau khi nhập số
        System.out.print("Nhập giới tính mới: ");
        String gioiTinhMoi = scanner.nextLine();
        System.out.print("Nhập địa chỉ mới: ");
        String diaChiMoi = scanner.nextLine();

        benhNhanCanSua.setTen(tenMoi);
        benhNhanCanSua.setTuoi(tuoiMoi);
        benhNhanCanSua.setGioiTinh(gioiTinhMoi);
        benhNhanCanSua.setDiaChi(diaChiMoi);

        System.out.println("Sửa thông tin bệnh nhân thành công.");
    }
}
    public static void xoaBenhNhan() {
    System.out.println("===== Xóa bệnh nhân =====");
    System.out.print("Nhập mã số bệnh nhân cần xóa: ");
    String maSo = scanner.nextLine();

    // Tìm bệnh nhân theo mã số
    BenhNhan benhNhanCanXoa = null;
    for (BenhNhan benhNhan : danhSachBenhNhan) {
        if (benhNhan.getMaSo().equals(maSo)) {
            benhNhanCanXoa = benhNhan;
            break;
        }
    }

    if (benhNhanCanXoa == null) {
        System.out.println("Không tìm thấy bệnh nhân có mã số " + maSo);
    } else {
        danhSachBenhNhan.remove(benhNhanCanXoa);
        System.out.println("Xóa bệnh nhân thành công.");
    }
}
    public static void timKiemBenhNhan() {
    System.out.println("===== Tìm kiếm bệnh nhân =====");
    System.out.print("Nhập từ khóa tìm kiếm: ");
    String tuKhoa = scanner.nextLine();

    ArrayList<BenhNhan> danhSachKetQua = new ArrayList<BenhNhan>();
    for (BenhNhan benhNhan : danhSachBenhNhan) {
        if (benhNhan.getMaSo().contains(tuKhoa) || benhNhan.getTen().contains(tuKhoa)) {
            danhSachKetQua.add(benhNhan);
        }
    }

    if (danhSachKetQua.isEmpty()) {
        System.out.println("Không tìm thấy kết quả nào.");
    } else {
        System.out.println("Kết quả tìm kiếm:");
        for (BenhNhan benhNhan : danhSachKetQua) {
             System.out.println("Mã số: " + benhNhan.getMaSo() + "; Tên: " + benhNhan.getTen() + "; Tuổi: " + benhNhan.getTuoi() + "; Giới tính: " + benhNhan.getGioiTinh() + "; Địa chỉ: " + benhNhan.getDiaChi());
        }
    }
}
public static void hienThiDanhSachBenhNhan() {
    System.out.println("===== Danh sách bệnh nhân =====");
    for (BenhNhan benhNhan : danhSachBenhNhan) {
        System.out.println("Mã số: " + benhNhan.getMaSo() + "; Tên: " + benhNhan.getTen() + "; Tuổi: " + benhNhan.getTuoi() + "; Giới tính: " + benhNhan.getGioiTinh() + "; Địa chỉ: " + benhNhan.getDiaChi());
    }
}
}

class BenhNhan {

    static void menuQuanLyBenhNhan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String maSo;
    private String ten;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;

    public BenhNhan(String maSo, String ten, int tuoi, String gioiTinh, String diaChi) {
        this.maSo = maSo;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
   
}
