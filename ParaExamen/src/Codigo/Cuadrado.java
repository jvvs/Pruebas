package Codigo;

public class Cuadrado {
	
	private int a;
	
	public Cuadrado (){
		a = 5;
		calcular();
	}
	
	public static void main(String[] args) {
		System.out.println ("En marcha");

	}
	public void setA( int x)
	{
		a = x;
	}
	public int calcular ()
	{
		int c = a * a;
		return c;
	}
	public int getA()
	{
		return a;
	}

}
