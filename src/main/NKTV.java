package main;

import java.util.ArrayList;
import java.util.List;

public class NKTV {
	private List<SV> dsSV = new ArrayList<>();

	public void choMuonTL(SV sv, TaiLieu tl) {
		if (!dsSV.contains(sv)) {
			dsSV.add(sv);
		}
		sv.muonTL(tl);
	}

	public void traTL(SV sv, TaiLieu tl) {
		sv.traTL(tl);
		if (sv.getDsMuon().isEmpty()) {
			dsSV.remove(sv);
		}
	}

	public void xemDanhSachSVMuon() {
		for (SV sv : dsSV) {
			System.out.println(sv.getHoTen() + " (MSSV: " + sv.getMSV() + ")");
			for (TaiLieu tl : sv.getDsMuon()) {
				System.out.println("  - " + tl.getTenTL());
			}
		}
	}

	public void xemDanhSachTaiLieuDangMuon() {
		for (SV sv : dsSV) {
			for (TaiLieu tl : sv.getDsMuon()) {
				System.out.println(tl.getTenTL());
			}
		}
	}

	public void xemDanhSachTaiLieuSVMuon(SV sv) {
		for (TaiLieu tl : sv.getDsMuon()) {
			System.out.println("- " + tl.getTenTL());
		}
	}
}