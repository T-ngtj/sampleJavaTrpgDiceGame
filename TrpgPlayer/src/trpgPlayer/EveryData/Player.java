package trpgPlayer.EveryData;

import java.util.ArrayList;

public class Player extends Entity{
	
	private ArrayList<String> items;
	private int annualIncome;
	
	private int property;
	private int occupationSkillPoint;
	private int hobbySkillPoint;
	
	
	public void setStatus(String name, int str, int inte, int dex, int pow, int con, int app, int size, int edu, int annualIncome) {
		super.setStatus(name, str, inte, dex, pow, con, app, size,  edu);
		this.annualIncome = annualIncome;
		this.setAutoStatus();
	}
	
	public void setRandomStatus() {
		super.setRandomStatus();
		annualIncome = randomDiceTreeDSix() * 50;
		this.setAutoStatus();
	}
	
	protected void setAutoStatus() {
		super.setAutoStatus();
		occupationSkillPoint = this.getEdu() * 20;
		hobbySkillPoint = this.getInte() * 10;
		property = this.annualIncome * 5;		
	}
	
	public void decrementSan(int rs) {
		setSan(getSan() - rs);
	}
	
	public void setItems(ArrayList<String> items) {
		this.items = items;
	}
	
	public ArrayList<String> getItems() {
		return items;
	}
	
	public void printData() {
		super.printData();
		System.out.println( "\n職業技能ポイント: " + this.occupationSkillPoint + "  趣味技能ポイント: " + this.hobbySkillPoint+ "  年収: " + this.annualIncome + "  資産: " + this.property);
		System.out.println("持ち物: " + this.items);
	}
	
}
