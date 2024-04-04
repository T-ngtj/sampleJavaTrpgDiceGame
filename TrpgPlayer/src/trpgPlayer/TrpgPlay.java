package trpgPlayer;

import trpgPlayer.EveryData.Enemy;
import trpgPlayer.EveryData.Player;


public class TrpgPlay {

	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		int totalScore = 0;
		GameControll game = new GameControll();
		Player player1 = new Player();	
		Enemy enemy;
		

		gamePoint:while(true) {
			while(true) {
				
				player1 = game.charcterMake(player1);
				player1.printData();

				if(game.remakeChar()) {
					continue;
				} else {
					totalScore += 10;
					break;
				}
			}
			
			game.serchStartMessage();
			
			while(true) {
				enemy = game.RandomEncountEnemy();
				game.encountEnemy(player1, enemy);
				
				totalScore += 10;
				
				if(game.isGameEnd(player1)) {
					break gamePoint;
				}
			}
		}
		
		System.out.println("スコア： " + totalScore );
	}

}
