package trpgPlayer.EveryInterface;

public interface RandomInt {
	
	//0からmaxDiceNumberまでのランダムな正の整数を返す
	default int randomInt(int maxDiceNumber) {
		
		return (int)(Math.random() * (maxDiceNumber + 1)) ;
		
	}
	
	//0以上20以下のランダムな正の整数を返す
	default int randomIntFiveToTwenty() {
		
		int number = 0;
		
		while(number < 5 || number > 20) {
			number = (int)(Math.random() * 21);
		}
		
		return number;
	}
	
	
	
}
