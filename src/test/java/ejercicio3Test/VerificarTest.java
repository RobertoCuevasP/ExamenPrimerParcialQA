package ejercicio3Test;

import org.junit.Assert;
import org.junit.Test;
import p3.Ej3Utils;

public class VerificarTest {
    Ej3Utils ej3 = new Ej3Utils();

    @Test(expected = Exception.class)
    public void verify_1() throws Exception {
        ej3.isCorrectCI("");
    }

    @Test(expected = Exception.class)
    public void verify_2() throws Exception{
        String ci = "Hola";
        ej3.isCorrectCI(ci);
    }

    @Test (timeout = 3000)
    public void verify_Tiempo() throws Exception{
        boolean actualResult = ej3.isCorrectCI("123456");
        Assert.assertEquals("CI incorrecto", true, actualResult);
    }
}
