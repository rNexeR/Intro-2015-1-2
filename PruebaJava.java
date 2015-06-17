import java.util.Scanner;
class PruebaJava{
	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);

		//Ejercicio 1
		System.out.println("\t **--Ejercicio 1--**");
		//Forma 1
		int x = 0;
		while(x<=20){
			System.out.println(x);
			x+=2;
		}

		//Forma 2
		x = 0;
		while(x<=20){
			if(x%2 == 0)
				System.out.println(x);
			x++;
		}


		//Ejercicio 2
		System.out.println("\t **--Ejercicio 2--**");
		//Forma 1
		System.out.print("Ingrese numero: ");
		int num = rd.nextInt();
		int resultado;

		if(num%2 == 0)
			resultado = num*5;
		else
			resultado = num/5;
		System.out.println("El resultado es: "+resultado);

		//Forma 2
		System.out.print("Ingrese numero: ");
		int numero = rd.nextInt();
		//Tomen en cuenta que la variable resultado la declare en la Forma 1
		resultado = numero/5;

		if(numero%2 == 0)
			resultado = numero*5;
		System.out.println("El resultado es: "+resultado);

		//Forma 3
		System.out.print("Ingrese numero: ");
		int nume = rd.nextInt();
		//Tomen en cuenta que la variable resultado la declare en la Forma 1

		if(nume%2 == 0)
			System.out.println("El resultado es: "+(nume*5));
		else
			System.out.println("El resultado es: "+(nume/5));


		//Ejercicio 3
		System.out.println("\t **--Ejercicio 3--**");
		System.out.print("Ingrese palabra: ");
		String palabra = rd.next();
		int y = 0;
		while(y<5){
			System.out.println(palabra.charAt(y));
			y++;
		}

		//Ejercicio 4
		System.out.println("\t **--Ejercicio 4--**");
		System.out.print("Ingrese numero: ");
		int valor = rd.nextInt();
		int absoluto;

		if(valor<0)
			absoluto = valor*-1;
		else
			absoluto = valor;
		System.out.println("|" + valor + "| = " + absoluto);

	}
}