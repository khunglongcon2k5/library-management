package main;

import java.util.ArrayList;
import java.util.List;

public class SV {
	protected String MSV;
	protected String hoTen;
	protected String lopSinhHoat;
	private List<TaiLieu> dsMuon = new ArrayList<>();

	public SV() {

	}

	public SV(String mSV, String hoTen, String lopSinhHoat) {
		this.MSV = mSV;
		this.hoTen = hoTen;
		this.lopSinhHoat = lopSinhHoat;
	}

	public String getMSV() {
		return MSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public String getLopSinhHoat() {
		return lopSinhHoat;
	}

	public List<TaiLieu> getDsMuon() {
		return dsMuon;
	}

	public void hienThi() {
		System.out.println("MSV: " + this.MSV);
		System.out.println("Họ tên: " + this.hoTen);
		System.out.println("Lớp sinh hoạt: " + this.lopSinhHoat);
	}

	public void muonTL(TaiLieu tl) {
		dsMuon.add(tl);
	}

	public void traTL(TaiLieu tl) {
		dsMuon.remove(tl);
	}

	@Override
	public String toString() {
		return this.hoTen;
	}

}
