package curso_programcao;

import java.util.Locale;

public class ex01 {
	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office Desk";

		int age = 30;
		int code = 2024;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products:");
		System.out.printf("%s witch  price is %.2f%n", product1, price1);
		System.out.printf("%s witch  price is %.2f%n", product2, price2);
		System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender);
		System.out.println("Measure with eight decimal places: " + measure);
		System.out.printf("Rounded %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);

	}

}
