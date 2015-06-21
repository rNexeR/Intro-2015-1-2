import java.util.Scanner;
class Ejercicio1{
public static void main(String[] args){
int numero;
Scanner sc = new Scanner(System.in);
System.out.print("Ingrese un numero: ");
numero=sc.nextInt();
int x=2;
if ((numero%2)==0)
{x=x+1;}
else
{
	if ((numero!=3)&&(numero%3)==0)
	{
		x=x+1;
	}
	else
	{
		if ((numero!=5)&&(numero%5)==0)
	{
		x=x+1;
	}
	else
	{
		if ((numero!=7)&&(numero%7)==0)
	{
		x=x+1;
	}
	else
	{
		if ((numero!=13)&&(numero%13)==0)
	{
		x=x+1;
	}
	}
	}
	}
	
	
	
	if (x>2)
	{
		System.out.println("El Numero es Compuesto");
	}
	
	else
	{
	   System.out.println("El Numero es primo");	
	}
	
}


	
}
}