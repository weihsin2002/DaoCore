package org.dao.core;

public enum HeavenlyStems {
	JIA (1, "Jia"),
	YI (2, "Yi"),
	BING (3, "Bing"),
	DING (4, "Ding"),
	WU (5, "Wu"),
	JI (6, "Ji"),
	GENG (7, "Geng"),
	XIN (8, "Xin"),
	REN (9, "Ren"),
	GUI (10, "Gui");
	
	
	private int order;
	private String tianGan;
	
	HeavenlyStems (int order, String tianGan) {
		this.order = order;
		this.tianGan = tianGan;
	}

	public int order() {
		return order;
	}

	public String tianGan() {
		return tianGan;
	}
	
	public static String fromOrder(int order) {
		for (HeavenlyStems h : HeavenlyStems.values()) {
			if (order == h.order()) {
				return h.tianGan();
			}
		}
		return null;
	}
	
	public static int fromTianGan(String tianGan) {
		for (HeavenlyStems h : HeavenlyStems.values()) {
			if (tianGan.equalsIgnoreCase(h.tianGan())) {
				return h.order();
			}
		}
		return -1;
	}
}