import java.util.Scanner;
import java.lang.reflect.Array;
import java.text.*;
import java.util.Date;
import java.util.Arrays;

public class M01S02Ex10 {
	public static void main(String args[]) {

		System.out.println("Digite a palavra a ser checada: ");
		Scanner input = new Scanner(System.in);
		String palin = input.nextLine();

		palin = palin.replaceAll("\\s+", "");

		// reverse the string
		String reverse = new StringBuilder(palin).reverse().toString();

		if (palin.equals(reverse)) {
			System.out.println("É um palindromo");

		} else {
			System.out.println("Não é um palindromo");

		}

	}
}

/*
 * String[] stringArray = "STRING TO STRING CONVERSION".split(" "); for (int j =
 * 0; j < stringArray.length; j++) { System.out.println(stringArray[j]);
 * 
 * 
 * }
 * 
 * 
 * System.out.println(stringArray[0]); // elementos de arrays separados//6
 * 
 * System.out.println(stringArray[1]);
 * 
 * System.out.println(stringArray[2]);
 * 
 * System.out.println(stringArray[3]);
 * 
 * 
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.println("Digite a palavra: "); String x = sc.next();
 * 
 * 
 * String stringArray1 = x; String[] array = stringArray1.split("(?!^)");
 * System.out.println(Arrays.toString());
 * 
 * 
 * String y = Arrays.toString(x1); for ( int i = 0; i < y.length(); i++) {
 * 
 * 
 * System.out.println(y.toCharArray()); }
 * System.out.println(Arrays.toString(x1).length());
 * 
 */

// 2 condicoes se a palavra for par ou impar para palavra.length

// TODO Auto-generated method stub

/*
 * 
 * Um palíndrome (ou palíndromo), segundo o dicionário Houaiss, "diz-se de frase
 * ou palavra que se pode ler, indiferentemente, da esquerda para direita ou
 * vice-versa", como por exemplo: osso, ana, radar. Ou seja, é uma palavra que
 * quando lida de trás pra frente tem o mesmo significado.
 * 
 * Implemente um código com o que aprendemos até agora que retorne se
 * determinada palavra é um palíndromo.
 */
