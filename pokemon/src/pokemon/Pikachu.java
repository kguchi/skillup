package pokemon;

public class Pikachu extends Character {
//public class Pikachu {
	private String name = "pikachu";
	private int hp = 10;
	private int level = 1;
	
//	Pikachu(String name, int hp, int level) {
	Pikachu(String name) {
		super(name);
	}
	
	public String getName() {
		return this.name;
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

	public void attack(Character c) {
		c.setHp(c.getHp() - 2);
		System.out.println(this.name + "は" + c.getName() + "にアタックした！");
	}
	
	public void sander(Character c) {
		c.setHp(c.getHp() - 4);
		System.out.println(this.name + "は" + c.getName() + "にアタックした！");
	}

	public void escape() {
		System.out.println(this.name + "は逃げ出した");
	}
	
}
