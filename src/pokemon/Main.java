package pokemon;

public class Main {
	public static void main(String[] args) {
		System.out.println("Pocketto Monster");
		System.out.println("");
		
		Pikachu pika = new Pikachu("pikachu");
//		System.out.println(pika.getName());
//		System.out.println(pika.getHp());
		
		Fushigidane fushi = new Fushigidane("fushigidane");
//		System.out.println(fushi.getName());
		
		System.out.println(fushi.getName() + "が現れた！");
		
		while(pika.getHp() > 0 || fushi.getHp() > 0) {
			pika.attack(fushi);
			fushi.attack(pika);
		}
		System.out.println(pika.getHp());
		System.out.println(fushi.getHp());
		
//		Character[] c = new Character[2];
//		c[0] = new Electron("ライチュウ");
//		c[1] = new Electron("サンダー");
//		System.out.println(((Electron) c[0]).getName());
//		Jframe("ライチュウ");
		
//		new Jframe1();
	}

}
