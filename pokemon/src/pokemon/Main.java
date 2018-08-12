package pokemon;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		System.out.println("Pocketto Monster");
		System.out.println("");
		
		Pikachu me = new Pikachu("pikachu");
		Fushigidane you = new Fushigidane("fushigidane");
		System.out.println(you.getName() + "が現れた！");
		Encounter enc = new Encounter(me, you);
		enc.encounter();
		
		ArrayList<String> zukan = new ArrayList<String>();
		
		zukan.add(me.getName());
		zukan.add(you.getName());
//		System.out.println(zukan.size());

/*
		Character[] myZukan = new Character[2];
		myZukan[0] = me;
*/
		/*
		System.out.println(myZukan[0].getName());
		myZukan[1] = you;
		System.out.println(myZukan[1].getName());
//		System.out.println(myZukan.length);
		*/
		
//		Jframe("ライチュウ");
		
		new Jframe1();
	}

}
