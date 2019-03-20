import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class CalculadoraTESTE extends TestCase {

	/**
	* Teste de somar na Calculadora.
	*/
	@Test
	public void testeSomar() {
	int nro1 = 5;
	int nro2 = 5;
	Calculadora calc= new Calculadora();
	int resultadoEsperado = 10;
	int resultadoReal= calc.somar(nro1, nro2);
	assertEquals(resultadoEsperado, resultadoReal);
	}
	
	/**
	* Teste de subtrair na Calculadora.
	*/
	@Test
	public void testeSubtrair() {
	int nro1 = 3;
	int nro2 = 5;
	Calculadora calc= new Calculadora();
	int resultadoEsperado = 2;
	int resultadoReal= calc.subtrair(nro1, nro2);
	assertEquals(resultadoEsperado, resultadoReal);
	}
	
	/**
	* Teste de multiplicar na Calculadora.
	*/
	@Test
	public void testeMultiplicar() {
	int nro1 = 3;
	int nro2 = 5;
	Calculadora calc= new Calculadora();
	int resultadoEsperado = 15;
	int resultadoReal= calc.multiplicar(nro1, nro2);
	assertEquals(resultadoEsperado, resultadoReal);
	}
	
	/**
	* Teste de dividir na Calculadora.
	*/
	@Test
	public void testeDividir() {
	int nro1 = 2;
	int nro2 = 8;
	Calculadora calc= new Calculadora();
	int resultadoEsperado = 4;
	int resultadoReal= calc.dividir(nro1, nro2);
	assertEquals(resultadoEsperado, resultadoReal);
	}
	
}

