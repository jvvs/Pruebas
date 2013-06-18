package Pruebas;

import static org.junit.Assert.*;

import org.junit.Test;

import Codigo.Cuadrado;

public class P1 {

	
	
	Cuadrado obj1 = new Cuadrado ();
	@Test
	public void test1() {
		assertNotNull ("Comprobar si existe el objeto obj1", obj1);
	}
	@Test
	public void test2()
	{
		assertEquals ("Debe dar 25", 25, obj1.calcular());
	}
	@Test
	public void test3()
	{
		obj1.setA(3);
		assertEquals ("Debe dar 9", 9, obj1.calcular ());
	}
	@Test
	public void test4 ()
	{
		assertTrue ("Verdadero", 0 != obj1.getA() );
		//assertTrue ("Debe ser verdad", 9 == obj1.getA() );
	}
	@Test
	public void test5 ()
	{
		Cuadrado obj2 = obj1;
		assertNotNull ("Debe existir", obj2);
	}
	@Test
	
	public void test6 ()
	{
		Cuadrado obj2 = obj1;
		assertSame ("Deben ser el mismo objeto", obj1, obj2);
	}
	

}
