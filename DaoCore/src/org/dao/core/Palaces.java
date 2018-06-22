package org.dao.core;

public enum Palaces {
	KAN (1, FiveElements.WATER, "Kan"),
	GEN (8, FiveElements.EARTH, "Gen"),
	ZHEN (3, FiveElements.WOOD, "Zhen"),
	XUN (4, FiveElements.WOOD, "Xun"),
	LI (9, FiveElements.FIRE, "Li"),
	KUN (2, FiveElements.EARTH, "Kun"),
	DUI (7, FiveElements.METAL, "Dui"),
	QIAN (6, FiveElements.METAL, "Qian"),
	ZHONG (5, FiveElements.EARTH, "Zhong");
	
	int order;
	FiveElements fiveElements;
	String gong;
	
	Palaces (int order, FiveElements fiveElements, String gong) {
		this.order = order;
		this.fiveElements = fiveElements;
		this.gong = gong;
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
}
