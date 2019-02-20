
public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		metodo1();
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		try {
			metodo2();
		} catch (ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			//ex.printStackTrace();
		} /*catch(NullPointerException ex) {
			ex.printStackTrace();
		}*/
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			// try {
			//int a = i / 0;
			Conta c = null;
			c.deposita();
			// System.out.println(a);
			// }
			// catch(ArithmeticException ex) {
			// System.out.println("ArithmeticException");
			// }
		}
		System.out.println("Fim do metodo2");
	}

}
