package ejercicio6.Reportes.tests.test;

import ejercicio1Test.InvertirNumerosTest;
import ejercicio2Test.CalcularNotasTest;
import ejercicio3Test.VerificarTest;
import ejercicio4Test.CambioMonedaTest;
import ejercicio5Test.LoginTest;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;

@RunWith(value=Suite.class)
@Suite.SuiteClasses({
        InvertirNumerosTest.class,
        CalcularNotasTest.class,
        CambioMonedaTest.class,
        LoginTest.class,
        VerificarTest.class
})
public class SuitesCases {
}
