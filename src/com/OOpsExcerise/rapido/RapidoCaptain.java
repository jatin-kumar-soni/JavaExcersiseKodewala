package com.OOpsExcerise.rapido;

public class RapidoCaptain extends Driver {
	private int performanceBonus;

	public RapidoCaptain(String name, int baseEarnings, int performanceBonus) {
		super(name, baseEarnings);
		this.performanceBonus = performanceBonus;
	}
	@Override
	void calculateEarnings() {
		System.out.println("Total Earnings: "+(this.baseEarnings + this.performanceBonus));
	}

}
