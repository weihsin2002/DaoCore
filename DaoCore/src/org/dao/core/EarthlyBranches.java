package org.dao.core;

public enum EarthlyBranches {
	ZI (1, "Zi"),
	CHOU (2, "Chou"),
	YIN (3, "Yin"),
	MOU (4, "Mou"),
	CHEN (5, "Chen"),
	SI (6, "Si"),
	WU (7, "Wu"),
	WEI (8, "Wei"),
	SHENG (9, "Shen"),
	YOU (10, "You"),
	XU (11, "Xu"),
	HAI (12, "Hai");
	
	
	private int order;
	private String diZhi;
	
	EarthlyBranches (int order, String diZhi) {
		this.order = order;
		this.diZhi = diZhi;
	}

	public int order() {
		return order;
	}

	public String diZhi() {
		return diZhi;
	}
	
	public static String fromOrder(int order) {
		for (EarthlyBranches e : EarthlyBranches.values()) {
			if (order == e.order()) {
				return e.diZhi();
			}
		}
		return null;
	}
	
	public static int fromDiZhi(String diZhi) {
		for (EarthlyBranches e : EarthlyBranches.values()) {
			if (diZhi.equalsIgnoreCase(e.diZhi())) {
				return e.order();
			}
		}
		return -1;
	}

}
