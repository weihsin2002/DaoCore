package org.dao.core;

public enum FiveElements {
	METAL(1, "Metal", "Jin"),
	WOOD(2, "Wood", "Mu"),
	WATER(3, "Water", "Shui"),
	FIRE(4, "Fire", "Huo"),
	EARTH(5, "Earth", "Tu");
	
    private int order;
    private String element;
    private String wuXing;

    FiveElements(int order, String element, String wuXing) {
        this.order = order;
        this.element = element;
        this.wuXing = wuXing;
    }

    public int order() {
        return order;
    }
    
    public String elment() {
        return element;
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