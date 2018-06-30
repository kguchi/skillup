package pokemon;

public class Waza {
	public void attack(Character me, Character you) {
		you.setHp(you.getHp() - 2);
		System.out.println(me.getName() + "は" + you.getName() + "にアタックした！");
	}
	
	public void sander(Character me, Character you) {
		you.setHp(you.getHp() - 4);
		System.out.println(me.getName() + "は" + you.getName() + "にアタックした！");
	}

	public void escape(Character me) {
		System.out.println(me.getName() + "は逃げ出した");
	}
}
