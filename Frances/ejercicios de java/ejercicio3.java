import java.util.Scanner;
class Ejercicio3{
public static void main (String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("ingrese un numero: ");
int numero=sc.nextInt(); 
int x=0;
while (x<numero){
System.out.println("*");
x++;
}
}
}
