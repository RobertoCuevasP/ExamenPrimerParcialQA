package parcial1.filaA.p4;

public class CambioMoneda {
    private Util util = new Util();
    private String message;
    public CambioMoneda(){}

    public String saveInNewMoney(int amount, String monedaOriginal, String monedaDestino){
        if (amount> 0){
            message="La cantidad convertida fue : ["+(amount*util.obtenerTipoDeCambio(monedaOriginal,monedaDestino))+"] "+monedaDestino;
        }else{
            message="Cantidad incorrecta";
        }
        return message;
    }
}
