package pokemon;

import java.util.Random;
import java.util.Scanner;

public class Encounter {
	private Character me;
	private Character you;
	Battle bat = new Battle(me, you);
	Character c = new Character();
	
	public Character getMe() {
		return this.me;
	}
	
	public Character getYou() {
		return this.you;
	}
	
	Encounter(Character me, Character you) {
		this.me = me;
		this.you = you;
	}
	
	public void encounter() {
		System.out.println("");
		System.out.println(me.getName() + "のHP=" + me.getHp() + ": " + you.getName() + "のHP=" + you.getHp());
		System.out.println("どうする？");
		System.out.println("1.戦う");
		System.out.println("2.捕まえる");
		System.out.println("3.逃げる");
		System.out.println("");
		Scanner scan = new Scanner(System.in);
		System.out.println("選択肢を入力してください。");
		int num = scan.nextInt();
		System.out.println("");
			
		switch(num) {
		case 1:
			System.out.println("battle start");
			bat.battle(me, you);
			break;
		case 2:
			c.throwBall(me, you);		
			break;
		case 3:
			c.escape(me);
		}
	}
			   
//		while(me.getHp() > 0 || you.getHp() > 0) {
//			me.attack(you);
//			you.attack(me);
//		}
//		System.out.println(me.getHp());
//		System.out.println(you.getHp());
//	}
}
