package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DSTL {
	private List<TaiLieu> danhSach = new ArrayList<>();

	public void themTL(TaiLieu tl) {
		danhSach.add(tl);
	}

	public void lietKe() {
		Iterator<TaiLieu> iterator = danhSach.iterator();
		while (iterator.hasNext()) {
			TaiLieu tl = iterator.next();
			tl.hienThi();
			System.out.println();
		}
	}

	public void lietKe(String loai) {
		for (TaiLieu tl : danhSach) {
			if ((tl instanceof Sach && loai.equalsIgnoreCase("Sách"))
					|| (tl instanceof TapChi && loai.equalsIgnoreCase("Tạp Chí"))
					|| (tl instanceof CD && loai.equalsIgnoreCase("CD"))) {
				tl.hienThi();
			}
		}
	}

	public TaiLieu xem(String maTL) {
		for (TaiLieu tl : danhSach) {
			if (tl.getMaTL().equals(maTL)) {
				return tl;
			}
		}
		return null;
	}

	public List<TaiLieu> tim(String ten, String tacGia, String nhaXB, int namXB, String chuyenNganh, int so, int nam,
			int STT, String noiDung) {
		List<TaiLieu> ketQua = new ArrayList<>();

		for (TaiLieu tl : danhSach) {
			if (tl instanceof Sach) {
				Sach sach = (Sach) tl;
				if (sach.getTenTL().contains(ten) && sach.getTacGia().contains(tacGia)
						&& sach.getNhaXB().contains(nhaXB) && sach.getNamXB() == nam) {
					ketQua.add(sach);
				}
			} else if (tl instanceof TapChi) {
				TapChi tapChi = (TapChi) tl;
				if (tapChi.getTenTL().contains(ten) && tapChi.getChuyenNganh().contains(chuyenNganh)
						&& tapChi.getSo() == so && tapChi.getNam() == nam) {
					ketQua.add(tapChi);
				}
			} else if (tl instanceof CD) {
				CD cd = (CD) tl;
				if (cd.getTenTL().contains(ten) && cd.getSTT() == STT && cd.getNoiDung().contains(noiDung)) {
					ketQua.add(cd);
				}
			}
		}
		return ketQua;
	}

}
