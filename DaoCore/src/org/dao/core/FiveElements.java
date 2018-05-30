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
    
	public static String fromOrder(int order) {
		for (FiveElements f : FiveElements.values()) {
			if (order == f.order()) {
				return f.wuXing();
			}
		}
		return null;
	}
	
	public static int fromWuXing(String wuXing) {
		for (FiveElements f : FiveElements.values()) {
			if (wuXing.equalsIgnoreCase(f.wuXing())) {
				return f.order();
			}
		}
		return -1;
	}
}