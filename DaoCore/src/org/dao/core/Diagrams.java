package org.dao.core;

public enum Diagrams {
	KAN (6, "Kan", 1, FiveElements.WATER),
	GEN (7, "Gen", 8, FiveElements.EARTH),
	ZHEN (4, "Zhen", 3, FiveElements.WOOD),
	XUN (5, "Xun", 4, FiveElements.WOOD),
	LI (3, "Li", 9, FiveElements.FIRE),
	KUN (8, "Dui", 2, FiveElements.EARTH),
	DUI (2, "Ze", 7, FiveElements.METAL),
	QIAN (1, "Qian", 6, FiveElements.METAL);
	
	int order;
	String gua;
	int manifestedNumber;
	FiveElements fiveElements;
	
	Diagrams (int order, String gua, int manifestedNumber, FiveElements fiveElements) {
		this.order = order;
		this.gua = gua;
		this.manifestedNumber = manifestedNumber;
		this.fiveElements = fiveElements;
	}

	public int order() {
		return order;
	}

	public String gua() {
		return gua;
	}

	public int manifestedNumber() {
		return manifestedNumber;
	}

	public FiveElements fiveElements() {
		return fiveElements;
	}
}
