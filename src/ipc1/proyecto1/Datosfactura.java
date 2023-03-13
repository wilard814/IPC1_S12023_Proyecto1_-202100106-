package ipc1.proyecto1;

/**
 *
 * @author wilar
 */
public class Datosfactura {
    private String nombrecliente;
    private String direccion;
    private String nit;

    public Datosfactura(String nombrecliente, String direccion, String nit) {
        this.nombrecliente = nombrecliente;
        this.direccion = direccion;
        this.nit = nit;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
   

}
