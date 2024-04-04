package trpgPlayer.EveryData;

public class Entity implements trpgPlayer.EveryInterface.CalcDice{
	
	private String name;
	private int str;
	private int inte;
	private int dex;
	private int pow;
	private int con;
	private int app;
	private int size;
	private int edu;
	
	private int hp;
	private int san;
	private int luck;
	private int idea;
	private int knowlage;
	private int mp;
	private int damageBonus;
	
	private String[] attackSkill = new String[9];
	

	public void setStatus(String name, int str, int inte, int dex, int pow, int con, int app, int size, int edu) {
		
		this.name = name;
		this.str = str;
		this.setInte(inte);
		this.dex = dex;
		this.pow = pow;
		this.con = con;
		this.app = app;
		this.size = size;
		this.setEdu(edu);
		setAutoStatus();
		
	}
	
	public void setRandomStatus() {
		
		this.name = "ゲスト";
		this.str = randomDiceTreeDSix();
		this.dex = randomDiceTreeDSix();
		this.pow = randomDiceTreeDSix();
		this.setInte(randomDiceTreeDSixPuls(6));
		this.con = randomDiceTreeDSix();
		this.app = randomDiceTreeDSix();
		this.size = fallDice(2, 6, 6);
		this.setEdu(randomDiceTreeDSix());
		setAutoStatus();
	}
	
	protected void setAutoStatus() {
		
		this.setHp(this.str * 5);
		this.setSan(this.pow * 5);
		this.luck = this.pow * 5;
		this.idea = this.getInte() * 5;
		this.knowlage = this.getEdu() * 5;
		this.mp = this.pow;
	}
	
	
	public int defaultSanheckValue() {
		return 0;
	}
	
	public int sanheckValue() {
		return 0;
	}

	
	public void setAttackSkills(String... skill) {
		int i = 0;
		for(String a : skill) {
			attackSkill[i] = a;
			i++;
		}
	}
	
	public String[] getAttackSkills() {
		return attackSkill;
	}
	
	public String getName() {
		// TODO 自動生成されたメソッド・スタブ
		return name;
	}
	
	public int getInte() {
		return inte;
	}

	public void setInte(int inte) {
		this.inte = inte;
	}

	public int getEdu() {
		return edu;
	}

	public void setEdu(int edu) {
		this.edu = edu;
	}
	
	public int getSan() {
		return san;
	}

	public void setSan(int san) {
		this.san = san;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {

		this.hp = hp;
	}
	
	public void printData() {
		System.out.print("名前: " + this.name + " \nHP: " + this.getHp() + "  STR: " + this.str + "  DEX: " + this.dex + "  POW: " + this.pow + "  INT: " + this.getInte() );
		System.out.print("\nCON: " + this.con + "  APP: " + this.app + "  Size: " + this.size + "  SAN値: " + this.getSan() + "\nEDU: " + this.getEdu() + "  幸運: " + this.luck);
		System.out.print("  アイデア: " + this.idea + "  知識: " + this.knowlage + "  MP: " + this.mp + "  ダメージボーナス: " + this.damageBonus);
	
	}
}

