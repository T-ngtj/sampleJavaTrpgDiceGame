package trpgPlayer.EveryInterface;

public interface GameMessage {
	
	default void makeCharcterMessage() {
		System.out.println("キャラクターを作成します");
	}
	
	default void startMessage() {
		System.out.println("これからゲームを始めます");
		
	}
	
	default void diceRollMessage() {
		System.out.print("ダイスの情報を入力してください: ");
		System.out.println();
	}
	
	default void continueMessage() {
		System.out.print("最初からやり直しますか？(y/n): ");
	}
	
	default void endMessage() {
		System.out.print("探索を続けますか？(y/n): ");
	}
	
	default void goodbyeMessage() {
		System.out.println("ゲームを終了します");
	}
	
	default void selectActionMessage() {
		System.out.println("次の行動を選択してください: ");
	}
	
	default void charMakeMessage() {
		System.out.println("キャラクターを作成します\nキャラクター情報を自分で入力しますか？ (y/n) : ");
	}
	
	default void remakeCharMessage() {
		System.out.println("キャラクターを作り直しますか？(y/n): ");
	}
	
	default void notSanMessage() {
		System.out.println("SAN値が0以下になりました (ゲームオーバー)");
	}
	
	default void serchStartMessage() {
		System.out.println("探索開始!");
	}
	
	default void encountMessage(String name) {
		System.out.println(name + "が現れた! ");
	}
	
	default void sanCheckMessage() {
		System.out.print("SANチェック!  " );
	}
}
