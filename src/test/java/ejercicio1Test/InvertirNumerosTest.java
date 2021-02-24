package ejercicio1Test;

import org.junit.*;
import p1.Ej1UtilsNumeros;

public class InvertirNumerosTest {

    private Ej1UtilsNumeros ej1;
    @Before
    public void before(){
        ej1 = new Ej1UtilsNumeros();
        System.out.println("**************Inicio de la Prueba**************");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("----------Inicio de la Clase------------");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("-----------Fin de la Clase-------------");
    }

    @After
    public void after(){System.out.println("**************Fin de la prueba**************");}

    @Test
    public void positivo(){
        int actualResult = ej1.invertirNumero(1234);
        int expectedResult = 4321;
        System.out.println("Numero Inicial: 1234");
        System.out.println("Resultado Final: " + expectedResult);
        Assert.assertEquals("Error", actualResult, expectedResult);
    }

    @Test
    public void negativo(){
        int actualResult = ej1.invertirNumero(-1234);
        int expectedResult = -4321;
        System.out.println("Numero Inicial: -1234");
        System.out.println("Resultado Final: " + expectedResult);
        Assert.assertEquals("Error", actualResult, expectedResult);
    }

    @Test
    public void positivoFail(){
        int actualResult = ej1.invertirNumero(1234);
        int expectedResult = 1234;
        System.out.println("Numero Inicial: 1234");
        System.out.println("Resultado Final: " + expectedResult);
        Assert.assertEquals("Error", actualResult, expectedResult);
    }
}
