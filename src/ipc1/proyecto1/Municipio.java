package ipc1.proyecto1;

/**
 *
 * @author wilar
 */
public class Municipio extends Departamentos {
    private String codigoDepartamento;
    private String nombreMunicipio;

    public Municipio(String codigoreg, String region, String nombre, String codigoDepartamento, String nombreMunicipio) {
        super(codigoreg, region, nombre);
        this.codigoDepartamento = codigoDepartamento;
        this.nombreMunicipio = nombreMunicipio;
    }

    public String getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public void setCodigoDepartamento(String codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }

    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }
}