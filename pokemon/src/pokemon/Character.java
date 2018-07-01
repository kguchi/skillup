package pokemon;

import java.util.Random;

public class Character {
	private String name;
	private int hp;
	private int level;
	Character[] myZukan;
	
	Character() {
	}
	
	Character(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getLevel() {
		return this.level;
	}
	
	public void setLevel(int level) {
		this.level =level;
	}
	
//	void attack();
//	void escape();
	public void attack(Character me, Character you) {
		you.setHp(you.getHp() - 2);
		System.out.println(me.getName() + "は" + you.getName() + "にアタックした！");
		if(die(you.getHp())) {
			you.setHp(0);
		}
		System.out.println(you.getName() + "のHPは" + you.getHp() + "になった。");
	}
	
	public void eleShock(Character me, Character you) {
		you.setHp(you.getHp() - 3);
		System.out.println(me.getName() + "は" + you.getName() + "に電気ショックを与えた！");
		if(die(you.getHp())) {
			you.setHp(0);
		}
		System.out.println(you.getName() + "のHPは" + you.getHp() + "になった。");
	}
	
	public void thunder(Character me, Character you) {
		you.setHp(you.getHp() - 4);
		System.out.println(me.getName() + "は" + you.getName() + "にかみなりを与えた！");
		if(die(you.getHp())) {
			you.setHp(0);
		}
		System.out.println(you.getName() + "のHPは" + you.getHp() + "になった。");
	}
	
	public void tenVolt(Character me, Character you) {
		you.setHp(you.getHp() - 4);
		System.out.println(me.getName() + "は" + you.getName() + "に10万ボルトを与えた！");
		if(die(you.getHp())) {
			you.setHp(0);
		}
		System.out.println(you.getName() + "のHPは" + you.getHp() + "になった。");
	}
	
	public boolean die(int hp) {
		return hp < 0;
	}
	
	public void throwBall(Character me, Character you) {
		System.out.println("モンスターボールを投げた!");
		Random rand = new Random();
		int randNum = rand.nextInt(10);
		Encounter enc = new Encounter(me, you);
		if(randNum < 2) {
			System.out.println(you.getName() + "を捕まえられませんでした");
			enc.encounter();
		} else {
			System.out.println(you.getName() + "を捕まえました");
		}
	}
	
	public void escape(Character me) {
		System.out.println(me.getName() + "は逃げ出した！");
	}
}
