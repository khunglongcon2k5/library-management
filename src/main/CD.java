package main;

public class CD extends TaiLieu {
	protected int STT;
	protected String noiDung;

	public CD(String maTL, String tenTL, String viTri, int sTT, String noiDung) {
		super(maTL, tenTL, viTri);
		STT = sTT;
		this.noiDung = noiDung;
	}

	public int getSTT() {
		return STT;
	}

	public String getNoiDung() {
		return noiDung;
	}

	@Override
	public void hienThi() {
		System.out.println("STT: " + this.STT + " - Nội dung: " + this.noiDung);
	}

}
