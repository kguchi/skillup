import java.text.DecimalFormat;

public class Calculations {
	public static void main(String args[]) {
		int val1 = 0;
		int val2 = 0;
		String ope;
		boolean argsError = true;
		double result;
		
		if(args.length != 3) {
			System.out.println("Error: number of arguments");
			System.out.println("java Calculations 数 演算子 数");
			System.exit(0);
		}
		
		try {
			val1 = Integer.parseInt(args[0]);
			val2 = Integer.parseInt(args[2]);
		} catch(NumberFormatException e) {
			System.out.println("数値でない値が入力されています");
			System.exit(0);
		}
		
		String[] opeLists = {"tasu", "hiku", "kakeru", "waru"};
		for(String opeList: opeLists) {
			if(!opeList.equals(opeLists)) {
				argsError = false;
			}
		}
		
		if(argsError) {
			System.out.println("Error: operations");
			System.exit(0);
		}
		
		DecimalFormat format = new DecimalFormat("0.#");
		
		ope = args[1];
		if(ope.equals("tasu")) {
			result = val1 + val2;
			System.out.println(format.format(result));
		} else if(ope.equals("hiku")) {
			result = val1 - val2;
			System.out.println(format.format(result));
		} else if(ope.equals("kakeru")) {
			result = val1 * val2;
			System.out.println(format.format(result));
		} else {
			if(val2 == 0) {
				System.out.println("0では割れません");
				System.exit(0);
			} else {
				result = val1 / val2;
//				amari = val1 % val2;
				System.out.println(format.format(result));
				System.out.println(result);
			}
		}
		
		
	}

}
