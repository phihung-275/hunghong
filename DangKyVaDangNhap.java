/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom.pkg12_21ct112.phihung;
import java.util.Scanner;
/**
 *
 * @author Phi Hung
 */
public class DangKyVaDangNhap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tenDangNhap, matKhau;
        boolean dangNhapThanhCong = false;

        // Form đăng ký
        System.out.println("Đăng ký tài khoản");
        System.out.print("Nhập tên đăng nhập: ");
        tenDangNhap = scanner.nextLine();
        System.out.print("Nhập mật khẩu: ");
        matKhau = scanner.nextLine();

        // Form đăng nhập
        System.out.println("Đăng nhập");
        do {
            System.out.print("Nhập tên đăng nhập: ");
            String tenDangNhapNhapVao = scanner.nextLine();
            System.out.print("Nhập mật khẩu: ");
            String matKhauNhapVao = scanner.nextLine();

            if (tenDangNhapNhapVao.equals(tenDangNhap) && matKhauNhapVao.equals(matKhau)) {
                dangNhapThanhCong = true;
                System.out.println("Đăng nhập thành công!");
            } else {
                System.out.println("Tên đăng nhập hoặc mật khẩu không đúng. Vui lòng thử lại.");
            }
        } while (!dangNhapThanhCong);

        // Chuyển đến class Hung.java và hàm main của nó
//        QuanLyBenhNhan.main(args);
    }
}
