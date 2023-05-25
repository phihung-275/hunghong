/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom.pkg12_21ct112.phihung;
/**
 *
 * @author Phi Hung
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyLichHen {
    private static List<LichHen> danhSachLichHen = new ArrayList<>();

    public static void main(String[] args) {
        menuChinh();
    }

    public static void menuChinh() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("===== Menu chính =====");
            System.out.println("1. Quản lý lịch hẹn");
            System.out.println("2. Thống kê");
            System.out.println("0. Thoát chương trình");
            System.out.print("Nhập lựa chọn của bạn: ");
            int luaChon = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng trống
            switch (luaChon) {
                case 1:
                    menuQuanLyLichHen();
                    break;
                case 2:
                    menuThongKe();
                    break;
                case 0:
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        }
    }

    public static void menuQuanLyLichHen() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("===== Quản lý lịch hẹn =====");
            System.out.println("1. Hiển thị danh sách lịch hẹn");
            System.out.println("2. Thêm lịch hẹn");
            System.out.println("3. Sửa lịch hẹn");
            System.out.println("4. Xóa lịch hẹn");
            System.out.println("0. Quay lại menu chính");
            System.out.print("Nhập lựa chọn của bạn: ");
            int luaChon = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng trống
            switch (luaChon) {
                case 1:
                    hienThiDanhSachLichHen();
                    break;
                case 2:
                    themLichHen();
                    break;
                case 3:
                    suaLichHen();
                    break;
                case 4:
                    xoaLichHen();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        }
    }

    public static void hienThiDanhSachLichHen() {
        System.out.println("===== Danh sách lịch hẹn =====");
        if (danhSachLichHen.isEmpty()) {
            System.out.println("Không có lịch hẹn nào.");
        } else {
            for (LichHen lichHen : danhSachLichHen) {
                System.out.println(lichHen);
            }
        }
    }

public static void themLichHen() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("===== Thêm lịch hẹn =====");
    System.out.print("Nhập tên khách hàng: ");
    String tenKhachHang = scanner.nextLine();
    System.out.print("Nhập số điện thoại: ");
    String soDienThoaiStr = scanner.nextLine();
    int soDienThoai = Integer.parseInt(soDienThoaiStr);
    System.out.print("Nhập ngày hẹn (dd/MM/yyyy): ");
    String ngayHen = scanner.nextLine();
    LichHen lichHen = new LichHen(tenKhachHang, soDienThoai, ngayHen, 300000);
    danhSachLichHen.add(lichHen);
    System.out.println("Thêm lịch hẹn thành công.");
}

   public static void suaLichHen() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("===== Sửa lịch hẹn =====");
    System.out.print("Nhập số điện thoại khách hàng cần sửa: ");
    int soDienThoai = scanner.nextInt();
    scanner.nextLine(); // Đọc bỏ dòng trống
    LichHen lichHenCanSua = null;
    for (LichHen lichHen : danhSachLichHen) {
        if (lichHen.getSoDienThoai() == soDienThoai) {
            lichHenCanSua = lichHen;
            break;
        }
    }
    if (lichHenCanSua == null) {
        System.out.println("Không tìm thấy lịch hẹn.");
        return;
    }
    System.out.println("Thông tin lịch hẹn cần sửa: ");
    System.out.println(lichHenCanSua);
    System.out.println("Nhập thông tin mới: ");
    System.out.print("Tên khách hàng: ");
    String tenKhachHang = scanner.nextLine();
    System.out.print("Số điện thoại: ");
    soDienThoai = scanner.nextInt();
    scanner.nextLine(); // Đọc bỏ dòng trống
    System.out.print("Ngày hẹn (dd/MM/yyyy): ");
    String ngayHen = scanner.nextLine();
    System.out.print("Giá tiền: ");
    double giaTien = scanner.nextDouble();
    scanner.nextLine(); // Đọc bỏ dòng trống
    lichHenCanSua.setTenKhachHang(tenKhachHang);
    lichHenCanSua.setSoDienThoai(soDienThoai);
    lichHenCanSua.setNgayHen(ngayHen);
    lichHenCanSua.setGiaTien(giaTien);
    System.out.println("Sửa lịch hẹn thành công.");
}

public static void xoaLichHen() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("===== Xóa lịch hẹn =====");
    System.out.print("Nhập số điện thoại khách hàng cần xóa: ");
    int soDienThoai = scanner.nextInt();
    scanner.nextLine(); // Đọc bỏ dòng trống
    LichHen lichHenCanXoa = null;
    for (LichHen lichHen : danhSachLichHen) {
        if (lichHen.getSoDienThoai() == soDienThoai) {
            lichHenCanXoa = lichHen;
            break;
        }
    }
    if (lichHenCanXoa == null) {
        System.out.println("Không tìm thấy lịch hẹn.");
        return;
    }
    danhSachLichHen.remove(lichHenCanXoa);
    System.out.println("Xóa lịch hẹn thành công.");
}

    public static void menuThongKe() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("===== Thống kê =====");
            System.out.println("1. Thống kê doanh thu theo ngày");
            System.out.println("2. Thống kê doanh thu theo tháng");
            System.out.println("0. Quay lại menu chính");
            System.out.print("Nhập lựa chọn của bạn: ");
            int luaChon = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng trống
            switch (luaChon) {
                case 1:
                    System.out.print("Nhập ngày cần thống kê (dd/MM/yyyy): ");
                    String ngay = scanner.nextLine();
                    double doanhThuNgay = tinhDoanhThuTheoNgay(ngay);
                    System.out.printf("Doanh thu ngày %s là: %.0f\n", ngay, doanhThuNgay);
                    break;
                case 2:
                    System.out.print("Nhập tháng cần thống kê (MM/yyyy): ");
                    String thang = scanner.nextLine();
                    double doanhThuThang = tinhDoanhThuTheoThang(thang);
                    System.out.printf("Doanh thu tháng %s là: %.0f\n", thang, doanhThuThang);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        }
    }

    public static double tinhDoanhThuTheoNgay(String ngay) {
        double doanhThu = 0;
        for (LichHen lichHen : danhSachLichHen) {
            if (lichHen.getNgayHen().equals(ngay)) {
                doanhThu += lichHen.getGiaTien();
            }
        }
        return doanhThu;
    }

    public static double tinhDoanhThuTheoThang(String thang) {
        double doanhThu = 0;
        for (LichHen lichHen : danhSachLichHen) {
            if (lichHen.getNgayHen().startsWith(thang)) {
                doanhThu += lichHen.getGiaTien();
            }
        }
        return doanhThu;
    }
}