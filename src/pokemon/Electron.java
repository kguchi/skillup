package pokemon;

public class Electron implements Character {
	private String name;
	
	Electron(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void attack(Character c) {
		System.out.println(this.c + "はアタックした!");
	}
	
	public void escape(Character c) {
		System.out.println(c + "は逃げ出した");
	}
}
