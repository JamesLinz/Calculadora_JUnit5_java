package calculadora;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

import org.junit.Test;

import calculadorasimples.Calculadora;

public class CalculadoraTest {
    static Calculadora calculadora;

    @Test
    public void testaSomaMenosIngenuo() {
        Calculadora myCalc = new Calculadora();

        boolean temErro = false;
        if (myCalc.soma(2, 2) != 4) {
            temErro = true;
        }
        if (myCalc.soma(2, -2) != 0) {
            temErro = true;
        }
        if (myCalc.soma(-2, 2) != 0) {
            temErro = true;
        }
        if (myCalc.soma(-2, -2) != -4) {
            temErro = true;
        }
        if (myCalc.soma(0, 0) != 0) {
            temErro = true;
        }
        if (temErro) {
            fail("Houve um erro na validação da soma.");
        }
    }

    @Test
    public void deveResultarQuatroAoSomarDoisEDois() {
    	 Calculadora calculadora = new Calculadora();
    }

    @Test
    public void deveResultarZeroAoSomarDoisEMenosDois() {
         Calculadora calculadora = new Calculadora();
    }

    @BeforeAll
    public static void setup() {
       calculadora = new Calculadora();
    }

    //@DisplayName("Valida múltiplas somas com informações em CSV")
    //@ParameterizedTest
    //@CsvSource({ "1.0, 1.0, 2.0", "2.0, 3.0, 6.0" })
    //void validaMultiplasSomasCSV(double parcela1, double parcela2, double resultadoEsperado) {
    //   assertEquals(resultadoEsperado, calculadora.soma(parcela1, parcela2));
    //}

    //@DisplayName("Valida múltiplas somas com informações em arquivo CSV")
    //@ParameterizedTest
    //@CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    //void validaMultiplasSomasArqCSV(double parcela1, double parcela2, double resultadoEsperado) {
    //    assertEquals(resultadoEsperado, calculadora.soma(parcela1, parcela2));
    //}

    //@Test
    //public void divisaoPorZeroGeraExcecao() {
    //   assertThrows(ArithmeticException.class, () -> {
    //   	int resultado = calculadora.restoDivisaoInteira(4, 0);
    //       System.out.println(resultado);
    //   });
    //}
}
