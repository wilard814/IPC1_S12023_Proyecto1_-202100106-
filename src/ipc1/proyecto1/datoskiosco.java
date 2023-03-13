package ipc1.proyecto1;

/**
 *
 * @author wilar
 */
public class datoskiosco {
    
    private String codigokiosco;
    private String nombrekiosco;
    private String codigoregkiosco;

    public datoskiosco(String codigokiosco, String nombrekiosco, String codigoregkiosco) {
        this.codigokiosco = codigokiosco;
        this.nombrekiosco = nombrekiosco;
        this.codigoregkiosco = codigoregkiosco;
    }

    public String getCodigokiosco() {
        return codigokiosco;
    }

    public void setCodigokiosco(String codigokiosco) {
        this.codigokiosco = codigokiosco;
    }

    public String getNombrekiosco() {
        return nombrekiosco;
    }

    public void setNombrekiosco(String nombrekiosco) {
        this.nombrekiosco = nombrekiosco;
    }

    public String getCodigoregkiosco() {
        return codigoregkiosco;
    }

    public void setCodigoregkiosco(String codigoregkiosco) {
        this.codigoregkiosco = codigoregkiosco;
    }

  
    
}
