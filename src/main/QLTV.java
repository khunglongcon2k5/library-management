package main;

public class QLTV {
	public static void main(String[] args) {
		SV s1 = new SV("4651000900", "Lê Bảo Ngân", "GDTH46A");
		SV s2 = new SV("4651000901", "Bui Ng Kieu Oanh", "Ngôn ngữ Anh 46B");
		SV s3 = new SV("4651000902", "Lý Thiên Di", "CNTT 46C");

		TaiLieu t1 = new Sach("S001", "Lập trình Java", "YZ-A1", "John Doe", "NXB ABC", 2020);
		TaiLieu t2 = new TapChi("TC001", "Khoa học máy tính", "YZ-A2", "CNTT", 5, 2023);
		TaiLieu t3 = new CD("CD001", "Luyện thi TOEIC", "YZ-B3", 1, "Speaking");
		TaiLieu t4 = new Sach("S002", "Harry Potter", "YZ-C9", "J.K.Rowling", "Bloomsbury Publishing", 1997);
		TaiLieu t5 = new TapChi("TC002", "Kiểm thử và đảm bảo chất lượng phần mềm", "KE-B3", "CNTT", 3, 2026);

		NKTV nktv = new NKTV();

		nktv.choMuonTL(s1, t2);
		nktv.choMuonTL(s2, t4);
		nktv.choMuonTL(s3, t1);
		nktv.choMuonTL(s2, t3);
		nktv.choMuonTL(s1, t5);
		nktv.traTL(s2, t4);
		nktv.choMuonTL(s3, t4);

		System.out.println("Danh sách sinh viên mượn tài liệu & sách:");
		nktv.xemDanhSachSVMuon();
		System.out.println();

		System.out.println("************************************");
		System.out.println("\nDanh sách tài liệu đang được mượn:");
		nktv.xemDanhSachTaiLieuDangMuon();
		System.out.println();

		System.out.print("************************************");
		System.out.println("\nDanh sách tài liệu sinh viên " + s1 + " đang mượn:");
		nktv.xemDanhSachTaiLieuSVMuon(s1);
	}
}
