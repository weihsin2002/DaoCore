package org.dao.core;

public enum Palaces {
	KAN (1, FiveElements.WATER, "Kan", EarthlyBranches.ZI, EarthlyBranches.CHOU),
	GEN (8, FiveElements.EARTH, "Gen", EarthlyBranches.YIN, null),
	ZHEN (3, FiveElements.WOOD, "Zhen", EarthlyBranches.MOU, EarthlyBranches.CHEN),
	XUN (4, FiveElements.WOOD, "Xun", EarthlyBranches.SI, null),
	LI (9, FiveElements.FIRE, "Li", EarthlyBranches.WU, EarthlyBranches.WEI),
	KUN (2, FiveElements.EARTH, "Kun", EarthlyBranches.SHENG, null),
	DUI (7, FiveElements.METAL, "Dui", EarthlyBranches.YOU, EarthlyBranches.XU),
	QIAN (6, FiveElements.METAL, "Qian", EarthlyBranches.HAI, null),
	ZHONG (5, FiveElements.EARTH, "Zhong", null, null);
	
	int order;
	FiveElements fiveElements;
	String gong;
	EarthlyBranches earthlyBranch1;
	EarthlyBranches earthlyBranch2;
	
	Palaces (int order, FiveElements fiveElements, String gong, EarthlyBranches earthlyBranch1, EarthlyBranches earthlyBranch2) {
		this.order = order;
		this.fiveElements = fiveElements;
		this.gong = gong;
		this.earthlyBranch1 = earthlyBranch1;
		this.earthlyBranch2 = earthlyBranch2;
	}

	public int order() {
		return order;
	}

	public FiveElements fiveElements() {
		return fiveElements;
	}

	public String gong() {
		return gong;
	}
	
	public static Palaces fromOrder (int order) {
		for (Palaces p : Palaces.values()) {
			if (order == p.order()) {
				return p;
			}
		}
		return null;
	}
}
