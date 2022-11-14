import java.util.Scanner;

public class DanhsachNhanvien {
    public class connguoi {
        private String HoTen, DiaChi, SĐT;

        public connguoi(String HoTen, String DiaChi, String SĐT) {
            super();
            this.HoTen = HoTen;
            this.DiaChi = DiaChi;
            this.SĐT = SĐT;
        }

        public connguoi(String hoTen, String diaChi) {
        }

        public String getHoTen() {
            return HoTen;
        }

        public void setHoTen(String HoTen) {
            this.HoTen = HoTen;
        }

        public String getSĐT() {
            return SĐT;
        }

        public void setSĐT(String SĐT) {
            SĐT = this.SĐT;
        }

        public String getDiaChi() {
            return DiaChi;
        }

        public void setDiaChi(String DiaChi) {
            this.DiaChi = DiaChi;
        }

        class nhanvienbanhang extends connguoi {
            private String MaNhanVien;
            private String ngaykyhopdong;

            public nhanvienbanhang(String MaNhanVien, String ngaykyhopdong) {
                super(MaNhanVien, ngaykyhopdong);
                this.MaNhanVien = MaNhanVien;
                this.ngaykyhopdong = ngaykyhopdong;
            }

            public String getngaykyhopdong() {
                return ngaykyhopdong;
            }

            public void setNgaykyhopdong(String ngaykyhopdong) {
                this.ngaykyhopdong = ngaykyhopdong;
            }

            public String getMaNhanVien() {
                return MaNhanVien;
            }

            public void setMaNhanVien(String MaNhanVien) {
                this.MaNhanVien = MaNhanVien;
            }
        }

        public void input() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Họ và tên: ");
            setHoTen(scanner.next());
            System.out.println("Địa chỉ: ");
            System.out.println(scanner.next());
            System.out.println("Số điện thoại: ");
            setSĐT(scanner.next());
            System.out.println("Mã Nhân Viên: ");
            System.out.println("Ngày ký hợp đồng: ");
        }

        public void output() {

            System.out.println(getHoTen() + "-" + getDiaChi() + "-" + getSĐT() + "-");
        }
    }

}
