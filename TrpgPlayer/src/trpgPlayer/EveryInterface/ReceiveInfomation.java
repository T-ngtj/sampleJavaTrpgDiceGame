package trpgPlayer.EveryInterface;
import java.util.ArrayList;
import java.util.Scanner;

public interface ReceiveInfomation {
	
	Scanner scanner = new Scanner(System.in);
	
	//入力を受け取るだけ
	default String receiveCommand() {
		
		judgeCommand: while(true) {
			
			String value;
			value = scanner.next();
			
			if(value == null || value == "") {
				System.out.print("情報を入力してください");
				continue judgeCommand;
			}
			
			System.out.println("");
			return value;
		}
	}
	
	//自分でステータスを書き込む
	default int[] recievStatus() {
		
		int str, dex, pow, inte, con, app, size, edu, annualIncome;
		
		System.out.print("1～20の整数を入力\nSTR: ");
		str = receiveNumber();
		System.out.print("DEX: ");
		dex = receiveNumber();
		System.out.print("POW: ");
		pow = receiveNumber();	
		System.out.print("INT: ");
		inte = receiveNumber();	
		System.out.print("CON: ");
		con = receiveNumber();	
		System.out.print("APP: ");
		app = receiveNumber();	
		System.out.print("SIZE: ");
		size = receiveNumber();	
		System.out.print("EDU: ");
		edu = receiveNumber();
		System.out.print("年収 ");
		annualIncome = receiveAnnualIncomeNumber();
		
		int[] statuses = {str, dex, pow, inte, con, app, size, edu, annualIncome};
		return statuses;
	}

	//可変数のアイテムを受け取る
	default ArrayList<String> receiveItems() {
		
		ArrayList<String> items = new ArrayList<>();
		boolean judgeAddItem = true;
		
		while(judgeAddItem) {
			
			System.out.print("アイテムを追加しますか？ (y/n): ");
			String value = scanner.next();
			if(value.equals("n")) {
				break;
			}
			System.out.print("追加するアイテム: ");
			items.add(receiveCommand());
		}
		
		return items;
	}
	
	
	default int receiveNumber() {
		judgeNumber: while(true) {
			int value;
			value = scanner.nextInt();
			if(0 > value || value >= 100 ) {
				System.out.print("1から100の整数を入力してください");
				continue judgeNumber;
			}
			System.out.println();
			return value;
		}
	}
		
	default int receiveAnnualIncomeNumber() {
		judgeNumber: while(true) {
			int value;
			value = scanner.nextInt();
			if(0 > value || value >= 900 ) {
				System.out.print("1から900の整数を入力してください");
				continue judgeNumber;
			}
			System.out.println();
			return value;
		}
	}
		
	default String recieveName() {
		String name;
		System.out.print("名前: ");
		name = receiveCommand();
		return name;
	}
}
