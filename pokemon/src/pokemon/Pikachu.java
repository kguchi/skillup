package pokemon;

public class Pikachu extends Character {
	private int hp = 20;
	private int level = 1;
	
//	Pikachu(String name, int hp, int level) {
	Pikachu(String name) {
		super(name);
	}

	public int getHp() {
		return this.hp;
	}
	
	public int getLevel() {
		return this.level;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void setLevel(int level) {
		this.level =level;
	}
}
