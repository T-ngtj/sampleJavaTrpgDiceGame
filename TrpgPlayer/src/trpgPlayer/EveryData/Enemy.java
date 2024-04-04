package trpgPlayer.EveryData;

public abstract class Enemy extends Entity{
	
	private int[] pruneSANValue = new int[6];
	private int callPruneSanValueType = -1;
	private int defaultSanheckValueType = -1;
	private int sanheckValueType = -1;
	
	public void setStatus(String name, int str, int inte, int dex, int pow, int con, int app, int size, int edu, int pSV1, int pSV2, int pSV3, int pSV4) {
		super.setStatus(name, str, inte, dex, pow, con, app, size,  edu);
		pruneSANValue[0] = pSV1;
		pruneSANValue[1] = pSV2;
		pruneSANValue[2] = pSV3;
		pruneSANValue[3] = pSV4;
		System.out.print("psv" + pruneSANValue[0] + " " + pruneSANValue[1] + " " + pruneSANValue[2] + " " + pruneSANValue[3]);
	}
	
	public void setStatus(String name, int str, int inte, int dex, int pow, int con, int app, int size, int edu, int pSV1, int pSV2, int pSV3, int pSV4, int pSV5) {
		super.setStatus(name, str, inte, dex, pow, con, app, size,  edu);
		pruneSANValue[0] = pSV1;
		pruneSANValue[1] = pSV2;
		pruneSANValue[2] = pSV3;
		pruneSANValue[3] = pSV4;
		pruneSANValue[4] = pSV5;
		System.out.print("psv" + pruneSANValue[0] + " " + pruneSANValue[1] + " " + pruneSANValue[2] + " " + pruneSANValue[3]);
	}
	
	public void setStatus(String name, int str, int inte, int dex, int pow, int con, int app, int size, int edu, int pSV1, int pSV2, int pSV3, int pSV4, int pSV5, int pSV6) {
		
		super.setStatus(name, str, inte, dex, pow, con, app, size,  edu);
		pruneSANValue[0] = pSV1;
		pruneSANValue[1] = pSV2;
		pruneSANValue[2] = pSV3;
		pruneSANValue[3] = pSV4;
		pruneSANValue[4] = pSV5;
		pruneSANValue[5] = pSV6;
	}
	
	public void setType(int a, int b, int c) {
		callPruneSanValueType = a;
		defaultSanheckValueType = b;
		sanheckValueType = c;
	}
	
	public String callPruneSanValue() {
		
		switch(callPruneSanValueType) {
			case 1:
				return callPruneSanOneValue();
			case 2:
				return callPruneSanTwoValue();
			default:
				return "";
		}
	}
	
	
	@Override
	public int defaultSanheckValue() {
		switch(defaultSanheckValueType) {
			case 1:
				return pruneSANValue[0];
			case 2:
				return fallDice(pruneSANValue[0], pruneSANValue[1]);
			default:
				return -1;
		}
	}
	
	public String callPruneSanOneValue() {
		return pruneSANValue[0] + "/" + pruneSANValue[2] + "D" + pruneSANValue[3];
	}
	
	public String callPruneSanTwoValue() {
		return pruneSANValue[0] + "D" + pruneSANValue[1] + "/" + pruneSANValue[2] + "D" + pruneSANValue[3];
	}
	
	@Override
	public int sanheckValue() {
		switch(this.sanheckValueType) {
			case 1:
				return sanCheckXdY();
			case 2:
				return sanCheckXdYplusZ();
			default:
				return -1;
		}
	}
	
	public int sanCheckXdY() {
		return fallDice(pruneSANValue[2], pruneSANValue[3]);
	}
	
	public int sanCheckXdYplusZ() {
		return fallDice(pruneSANValue[2], pruneSANValue[3], pruneSANValue[4]);
	}
	
	
	
	
	
	
	public boolean checkLive() {
		
		boolean live = true;
		if(this.getHp() < 1) {
			live = false;
		}
		return live;
	}
	
	public int[] getPruneSanValue() {
		return pruneSANValue;
	}
	

	public void printData() {
		super.printData();
		callPruneSanValue();
	}
	

	
}
