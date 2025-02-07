package main;

public class TapChi extends TaiLieu {
	protected String chuyenNganh;
	protected int so;
	protected int nam;

	public TapChi(String maTL, String tenTL, String viTri, String chuyenNganh, int so, int nam) {
		super(maTL, tenTL, viTri);
		this.chuyenNganh = chuyenNganh;
		this.so = so;
		this.nam = nam;
	}

	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public int getSo() {
		return so;
	}

	public int getNam() {
		return nam;
	}

	@Override
	public void hienThi() {
		System.out.println("Chuyên ngành: " + this.chuyenNganh + " - Số: " + this.so + " - Năm: " + this.nam + "\n");
	}

}
