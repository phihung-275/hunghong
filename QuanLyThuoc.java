
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

///**
// *
// * @author Phi Hung
// */

package nhom.pkg12_21ct112.phihung;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyThuoc {
    public class Main {
    public static void main(String[] args) {
        QuanLyThuoc.quanLyThuoc();
    }
}
   public static void main(String[] args) {
    quanLyThuoc();
} 
    public static void quanLyThuoc() {
        List<Thuoc> danhSachThuoc = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===== Quản lý thuốc =====");
            System.out.println("1. Thêm thuốc");
            System.out.println("2. Sửa thông tin thuốc");
            System.out.println("3. Xóa thuốc");
            System.out.println("4. Tìm kiếm thuốc");
            System.out.println("5. Hiển thị danh sách thuốc");
            System.out.println("0. Thoát chương trình");
            System.out.print("Nhập lựa chọn của bạn: ");

            int luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    // Thêm thuốc
                    System.out.print("Nhập mã số thuốc: ");
                    String maSoThuoc = scanner.next();
                    System.out.print("Nhập tên thuốc: ");
                    String tenThuoc = scanner.next();
                    System.out.print("Nhập đơn vị tính: ");
                    String donViTinh = scanner.next();
                    System.out.print("Nhập số lượng tồn kho: ");
                    int soLuongTonKho = scanner.nextInt();
                    System.out.print("Nhập giá bán: ");
                    double giaBan = scanner.nextDouble();

                    Thuoc thuocMoi = new Thuoc(maSoThuoc, tenThuoc, donViTinh, soLuongTonKho, giaBan);
                    danhSachThuoc.add(thuocMoi);

                    System.out.println("Thêm thuốc thành công!");
                    break;
                case 2:
                    // Sửa thông tin thuốc
                    System.out.print("Nhập mã số thuốc cần sửa: ");
                    String maSoThuocCanSua = scanner.next();

                    boolean timThayThuocCanSua = false;
                    for (Thuoc thuoc : danhSachThuoc) {
                        if (thuoc.getMaSoThuoc().equals(maSoThuocCanSua)) {
                            System.out.print("Nhập tên thuốc mới: ");
                            String tenThuocMoi = scanner.next();
                            System.out.print("Nhập đơn vị tính mới: ");
                            String donViTinhMoi = scanner.next();
                            System.out.print("Nhập số lượng tồn kho mới: ");
                            int soLuongTonKhoMoi = scanner.nextInt();
                            System.out.print("Nhập giá bán mới: ");
                            double giaBanMoi = scanner.nextDouble();

                            thuoc.suaThongTin(tenThuocMoi, donViTinhMoi, soLuongTonKhoMoi, giaBanMoi);

                            System.out.println("Sửa thông tin thuốc thành công!");
                            timThayThuocCanSua = true;
                            break;
                        }
                    }

                    if (!timThayThuocCanSua) {
                        System.out.println("Không tìm thấy thuốc cần sửa!");
                    }

                    break;
                case 3:
                    // Xóa thuốc
                    System.out.print("Nhập mã số thuốc cần xóa: ");
                    String maSoThuocCanXoa = scanner.next();

                    boolean timThayThuocCanXoa = false;
                    for (Thuoc thuoc : danhSachThuoc) {
                        if (thuoc.getMaSoThuoc().equals(maSoThuocCanXoa)) {
                            danhSachThuoc.remove(thuoc);
                            System.out.println("Xóa thuốc thành công!");
                            timThayThuocCanXoa = true;
                            break;
                        }
                    }

                    if (!timThayThuocCanXoa) {
                        System.out.println("Không tìm thấy thuốc cần xóa!");
                    }

                    break;
                case 4:
                // Tìm kiếm thuốc
                System.out.print("Nhập từ khóa tìm kiếm: ");
                String tuKhoa = scanner.next();

                List<Thuoc> ketQuaTimKiem = new ArrayList<>();
                for (Thuoc thuoc : danhSachThuoc) {
                    if (thuoc.getMaSoThuoc().contains(tuKhoa) || thuoc.getTenThuoc().contains(tuKhoa)) {
                        ketQuaTimKiem.add(thuoc);
                    }
                }

                if (!ketQuaTimKiem.isEmpty()) {
                    System.out.println("Kết quả tìm kiếm:");
                    for (Thuoc thuoc : ketQuaTimKiem) {
                        System.out.println(thuoc.getMaSoThuoc() + " - " + thuoc.getTenThuoc());
                    }
                } else {
                    System.out.println("Không tìm thấy kết quả nào!");
                }

                break;
            case 5:
                // Hiển thị danh sách thuốc
                System.out.println("Danh sách thuốc:");
                for (Thuoc thuoc : danhSachThuoc) {
                    System.out.println(thuoc.getMaSoThuoc() + " - " + thuoc.getTenThuoc() + " - " + thuoc.getDonViTinh() + " - " + thuoc.getSoLuongTonKho() + " - " + thuoc.getGiaBan());
                }

                break;
            case 0:
                // Thoát chương trình
                System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                return;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                break;
        }
    }
}
}
