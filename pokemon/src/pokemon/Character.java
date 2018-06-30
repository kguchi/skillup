package pokemon;

public class Character {
	private String name;
	private int hp;
	private int level;
	
	Character(String name) {
		this.name = name;
//		this.hp = hp;
//		this.level = level;
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
		this.level = level;
	}
	
//	void attack();
//	void escape();
}
