package ejercicio4Test;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import p4.CambioMoneda;
import p4.Util;

public class CambioMonedaTest {
    Util utilMockito= Mockito.mock(Util.class);

    @Test
    public void verify_cambio_moneda_test(){

        Mockito.when(utilMockito.obtenerTipoDeCambio("Dolares", "Bolivianos")).thenReturn(7);

        CambioMoneda cambioMoneda = new CambioMoneda(utilMockito);
        String actualResult= cambioMoneda.saveInNewMoney(100, "Dolares", "Bolivianos");
        String expectedResult = "La cantidad convertida fue : [700] Bolivianos";
        Assert.assertEquals("ERROR en el cambio de moneda!",expectedResult,actualResult);

        Mockito.verify(utilMockito).obtenerTipoDeCambio("Dolares", "Bolivianos");
    }
}
