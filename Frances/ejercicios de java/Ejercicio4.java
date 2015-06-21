import java.util.Scanner;
class Ejercicio4{
public static void main( String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("ingrese una palabra");
String palabra = sc.next();
int x=0;
x= palabra.length()-1; 

while (x>=0)
{
System.out.println(palabra.charAt(x));
x--;
}
}
}