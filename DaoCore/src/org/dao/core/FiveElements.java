package org.dao.core;

public enum FiveElements {
	METAL(1),
	WOOD(2);
	
    private int order;

    FiveElements(int order) {
        this.order = order;
    }

    public int elementOrder() {
        return order;
    }
}
