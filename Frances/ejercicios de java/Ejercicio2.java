import java.util.Scanner;
class Ejercicio2{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Ingrese una palabra: ");
String palabra= sc.next();
int x=0;
while (palabra.length() > x)
{
System.out.println(palabra.charAt(x));
x++;
}


}}