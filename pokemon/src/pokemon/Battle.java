package pokemon;

import java.util.Scanner;

public class Battle {	
	private Character me;
	private Character you;
//	private Character c;
	private int turn = 1;
	
	Battle(Character me, Character you) {
		this.me = me;
		this.you = you;
	}
	
	Character c = new Character();
	
	public void battle(Character me, Character you) {
		while(true){
			System.out.println("");
			System.out.print(turn + "ターン目");
			System.out.println("どうしますか？");
			System.out.println("1.電光石火");
			System.out.println("2.電気ショック");
			System.out.println("3.かみなり");
			System.out.println("4.10万ボルト");
			System.out.println("");
			Scanner scan = new Scanner(System.in);
			System.out.println("選択肢を入力してください。");
			int num = scan.nextInt();
			System.out.println("");
			
			switch(num) {
			case 1:
				c.attack(me, you);
				break;
			case 2:
				c.eleShock(me, you);
				break;
			case 3:
				c.thunder(me, you);
				break;
			case 4:
				c.tenVolt(me, you);
				break;
			}
			
			if(you.getHp() <= 0) {
				System.out.println("You won!!");
				break;
			} else if(me.getHp() <= 0) {
				System.out.println("You lost!!");
				break;
			} else {
				turn ++;
			}
		}
	}

}
