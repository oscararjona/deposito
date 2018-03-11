import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

public class Depositotest {
	    DepositoCombustible sc;
		private double nivelinicial;
		private double nivelmaximo;
		private double resultado;
		boolean resultado2;


	@Before
	public void setUp() throws Exception {
		
		nivelinicial=20;
		nivelmaximo=120;
		resultado=100;
	    resultado2=true;
	    sc=new DepositoCombustible(nivelinicial,nivelmaximo);
	}
	@Test
	public void testGetDepositoMax() {
		//DepositoCombustible sc=new DepositoCombustible(nivelinicial,nivelmaximo);
		double resultado=sc.getDepositoNivel();
		assertEquals(nivelmaximo,resultado,1);
	}

	@Test
	public void testGetDepositoNivel() {
		double resultado=sc.getDepositoMax();
		assertEquals(nivelinicial,resultado,1);
	}

	@Test
	public void testEstaVacio() {
		//DepositoCombustible sc=new DepositoCombustible(nivelinicial,nivelmaximo);
		boolean  resultado2=sc.estaVacio();
		assertFalse(resultado2);
	}

	@Test
	public void testEstaLleno() {
		boolean  resultado2=sc.estaLleno();
		assertFalse(resultado2);


	}

	

}

