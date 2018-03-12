import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;



@RunWith(Parameterized.class)
public  class Depositocombustibletest2{
double nivelinicial;
double nivelmaximo;
double cantidad;
double añadircombustible;
double retirarcombustible;


public  Depositocombustibletest2(double nivel,double capacidad, double cantidadañadida,
		double llenado, double vaciado) {
		nivelinicial = nivel;
		nivelmaximo = capacidad;
		cantidad= cantidadañadida;
		añadircombustible=llenado;
		retirarcombustible=vaciado;
	}
	@Parameters
	public static Collection<Object[]> numeros(){
	return (Collection<Object[]>) Arrays.asList (new Object[][]{
	{130,130,20,110,110}  //inicial 20 , capacidad 120, consumo 20, lleno 0, resultado quedan 0
	,{120,120,20,100,100}
	,{60,60,10,50,50}
	,{100,100,80,20,20}
	});
	
	
}
	@Test
	public void testParemetrosConsumir() {
	DepositoCombustible sc = new DepositoCombustible(nivelinicial,nivelmaximo);
	sc.consumir(cantidad);
	assertEquals(retirarcombustible,sc.getDepositoNivel(),1);
	}
	@Test
	public void testParemetrosllenar() {
	DepositoCombustible sc = new DepositoCombustible(nivelinicial,nivelmaximo);
	sc.consumir(cantidad);
	assertEquals(añadircombustible,sc.getDepositoNivel(),1);
	
	}}


