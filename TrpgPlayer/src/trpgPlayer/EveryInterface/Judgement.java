package trpgPlayer.EveryInterface;

//yならtrue nならfalseをreturn それ以外なら再度入力を促すインターフェイス
public interface Judgement {
	
	default public boolean judgeYesOrNo(String yn) {
		
		reCommand:while(true) {
			
			if(yn.equals("y")) {
				return true;
			} else if (yn.equals("n")) {
				return false;
			} else {
				System.out.println("yかnを入力してください");
				continue reCommand;
			}
		}
	}
	
	default public String criticalFumble(int san, int diceNum) {
		if(diceNum == 0 || diceNum > 95) {
			return "ファンブル!!! ";
		} else if(diceNum <= 5) {
			return "クリティカル! ";
		} else if(diceNum < san){
			return "成功 ";
		} else {
			return "失敗 ";
		}
	}
	
	default public boolean judgeSanCheck(int san, int diceNum) {
		
		System.out.println(criticalFumble(san, diceNum) + diceNum + " / " + san);
			
		if(diceNum < san) {
			return true;
		} 
		return false;
			
	}
	
	default boolean shockRoll(int roll, int maxHp) {
		if(roll < maxHp / 2 ) {
			return true;
		}
		return false;
	}
	
	
	
}
