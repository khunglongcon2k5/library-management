package main;

public abstract class TaiLieu {
	protected String maTL;
	protected String tenTL;
	protected String viTri;

	public TaiLieu() {
		
	}
	public TaiLieu(String maTL, String tenTL, String viTri) {
		this.maTL = maTL;
		this.tenTL = tenTL;
		this.viTri = viTri;
	}

	public String getMaTL() {
		return maTL;
	}

	public String getTenTL() {
		return tenTL;
	}

	public String getViTri() {
		return viTri;
	}

	public abstract void hienThi();
}
