package trpgPlayer;

import trpgPlayer.EveryData.Enemy;
import trpgPlayer.EveryData.Player;
import trpgPlayer.EveryData.enemys.DeepOne;
import trpgPlayer.EveryData.enemys.Ghoul;
import trpgPlayer.EveryData.enemys.Shoggoth;
import trpgPlayer.EveryInterface.CalcDice;
import trpgPlayer.EveryInterface.GameMessage;
import trpgPlayer.EveryInterface.Judgement;
import trpgPlayer.EveryInterface.ReceiveInfomation;


//プレイヤー情報の作成 ゲーム続行か終了の判断をreturnするクラス
public class GameControll implements CalcDice, GameMessage, Judgement, ReceiveInfomation{
	
	
	GameControll(){	}
	
	public Player charcterMake(Player player) {
		
		charMakeMessage();
			
		if(judgeYesOrNo(receiveCommand())) {
			String name = recieveName();
			int[] sta = recievStatus();
			player.setStatus(name, sta[0], sta[1], sta[2], sta[3], sta[4], sta[5], sta[6], sta[7], sta[8]);
			player.setItems(receiveItems());
			return player;
	
		} else {
			player.setRandomStatus();
			player.setItems(receiveItems());
			return player;		
		} 
	}
	
	
	public boolean remakeChar() {
		remakeCharMessage();
		return judgeYesOrNo(receiveCommand());
	}

	
	public void encountEnemy(Player player, Enemy enemy) {
		encountMessage(enemy.getName());
		sanCheckRoll(player, enemy);
	}
	
	
	public void sanCheckRoll(Player player, Enemy enemy) {
		sanCheckMessage();
		int preSan = player.getSan();
		int reduceSan = 0;
		System.out.println(enemy.callPruneSanValue());
		
		if(judgeSanCheck(preSan, fallDice(1,100))) {
			reduceSan = enemy.defaultSanheckValue();
			player.decrementSan(reduceSan);
		} else {
			reduceSan = enemy.sanheckValue();
			player.decrementSan(reduceSan);
		}
		System.out.println("正気度減少値： " + reduceSan);
		System.out.println("SAN値:" + preSan + " → " + player.getSan());
		
	}
	
	public void selectAction() {
		
		
	}
	
	public Enemy RandomEncountEnemy() {
		int num = fallDice(1, 2);
		Enemy enemy = null;
		
		switch(num) {
			case 0:
				enemy = new DeepOne();
				break;
			case 1:
				enemy = new Ghoul();
				break;
			case 2:
				enemy = new Shoggoth();
		}

		return enemy;
	}
	
	public boolean isGameEnd(Player player) {
		boolean end = true;
		
		if(player.getSan() < 1) {
			notSanMessage();
			goodbyeMessage();
			return end;
		}
		
		endMessage();
		
		if(judgeYesOrNo(receiveCommand())) {
			end = false;
		} else {
			goodbyeMessage();
		}
		return end;
	}
}

	
