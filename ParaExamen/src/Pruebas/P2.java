package Pruebas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Codigo.Cuadrado;

public class P2 {
	
	Cuadrado obj1 = new Cuadrado ();
	
	@Before
	public void inicializarA ()
	{
		obj1.setA(7);
	}
	@Test
	public void test1() 
	{
		assertNotNull ("Existe el objeto obj1", obj1);
	}
	
	@Test 
	public void test2()
	{
		assertEquals ("debe dar 49", 49, obj1.calcular());
	}
	@Test
	public void test3()
	{
		assertTrue ("Debe ser verdadero", 49 == obj1.getA());
	}
	@Test
	public void test4 ()
	{
		Cuadrado obj2 = obj1;
		assertSame ("Son lo mismo", obj1, obj2);
	}

}
