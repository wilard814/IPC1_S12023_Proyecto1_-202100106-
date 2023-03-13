package ipc1.proyecto1;

/**
 *
 * @author wilar
 */
public class tarjeta {
    private String nombretarjeta;
    private String numerotarjeta;
    private String fechavencimiento;
    private String numerotarjetatruncado;

    public tarjeta(String nombretarjeta, String numerotarjeta, String fechavencimiento, String numerotarjetatruncado) {
        this.nombretarjeta = nombretarjeta;
        this.numerotarjeta = numerotarjeta;
        this.fechavencimiento = fechavencimiento;
        this.numerotarjetatruncado = numerotarjetatruncado;
    }

    public String getNombretarjeta() {
        return nombretarjeta;
    }

    public void setNombretarjeta(String nombretarjeta) {
        this.nombretarjeta = nombretarjeta;
    }

    public String getNumerotarjeta() {
        return numerotarjeta;
    }

    public void setNumerotarjeta(String numerotarjeta) {
        this.numerotarjeta = numerotarjeta;
    }

    public String getFechavencimiento() {
        return fechavencimiento;
    }

    public void setFechavencimiento(String fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }

    public String getNumerotarjetatruncado() {
        return numerotarjetatruncado;
    }

    public void setNumerotarjetatruncado(String numerotarjetatruncado) {
        this.numerotarjetatruncado = numerotarjetatruncado;
    }
    
}


  
