package trpgPlayer.EveryInterface;

public interface CalcDice extends RandomInt {
	
	//xDyのダイスを振る
	default public int fallDice(int fallTimes, int whatSurface) {
		int count = 1;
		int diceNumber = 0;
		
		while(count <= fallTimes) {
			
			int diceFallNumber = randomInt(whatSurface);
			//System.out.println(count + "回目:" +diceFallNumber + " が出ました");
			
			diceNumber += diceFallNumber;
			count++;
		}
		
		//System.out.println("結果: " + diceNumber);
		
		return diceNumber;
		
	}
	//xDy+zのダイスを振る
	default public int fallDice(int fallTimes, int whatSurface, int pulsInt) {
		int count = 1;
		int diceNumber = 0;
		
		while(count <= fallTimes) {
			
			
			int diceFallNumber = randomInt(whatSurface);
			//System.out.println(count + "回目:" +diceFallNumber + " が出ました");
			
			diceNumber += diceFallNumber;
			count++;
		}
		
		diceNumber += pulsInt;
		//System.out.println("結果: " + diceNumber);
		
		return diceNumber;
		
	}
	
	//3D6のダイスを振る
	default public int randomDiceTreeDSix() {
		return this.fallDice(3,6);
	}
	
	//3D6 + aのダイスを振る
	default public int randomDiceTreeDSixPuls(int pulsInt) {
		return this.fallDice(3, 6, pulsInt);
	}
	
	
	
}
