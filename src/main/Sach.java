package main;

public class Sach extends TaiLieu {
	protected String tacGia;
	protected String nhaXB;
	protected int namXB;

	public Sach(String maTL, String tenTL, String viTri, String tacGia, String nhaXB, int namXB) {
		super(maTL, tenTL, viTri);
		this.tacGia = tacGia;
		this.nhaXB = nhaXB;
		this.namXB = namXB;
	}

	public String getTacGia() {
		return tacGia;
	}

	public String getNhaXB() {
		return nhaXB;
	}

	public int getNamXB() {
		return namXB;
	}

	@Override
	public void hienThi() {
		System.out.println("Tên tác giả: " + this.tacGia + " - Nhà xuất bản: " + this.nhaXB + " - Năm xuất bản: "
				+ this.namXB + "\n");
	}

}
