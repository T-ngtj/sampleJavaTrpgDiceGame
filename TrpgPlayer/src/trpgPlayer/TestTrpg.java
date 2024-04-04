package trpgPlayer;

import trpgPlayer.EveryData.Enemy;
import trpgPlayer.EveryData.Player;
import trpgPlayer.EveryData.enemys.Shoggoth;

public class TestTrpg {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		GameControll game = new GameControll();
		Player player1 = new Player();	
		Enemy enemy = new Shoggoth();
		enemy.printData();
		game.encountEnemy(player1, enemy);
		
	}
	

}
