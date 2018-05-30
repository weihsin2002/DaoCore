package org.dao.core;

public enum FiveElements {
	METAL(1, "Jin"),
	WOOD(2, "Mu"),
	Water(3, "Shui"),
	Fire(4, "Huo"),
	Earth(5, "Tu");
	
    private int order;
    private String wuXing;

    FiveElements(int order, String wuXing) {
        this.order = order;
        this.wuXing = wuXing;
    }

    public int order() {
        return order;
    }
    
    public String wuXing() {
        return wuXing;
    }
}
