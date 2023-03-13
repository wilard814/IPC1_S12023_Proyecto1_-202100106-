package ipc1.proyecto1;

/**
 *
 * @author wilar
 */
public class guiayfactura {
    private String usuariofactura;
    private String usuariodest;
    private String nfactura;
    private String codigopaq;
    private String origen;
    private String municipiorig;
    private String destino;
    private String municipiodest;
    private String nitz;
    private String cliente;
    private String direccioncliente;
    private String tipopago;
    private String npaquete;
    private String tamapaquete;
    private double total;
    private String fechaenvio;
    private String servicetype;

    public guiayfactura(String usuariofactura, String usuariodest, String nfactura, String codigopaq, String origen, String municipiorig, String destino, String municipiodest, String nitz, String cliente, String direccioncliente, String tipopago, String npaquete, String tamapaquete, double total, String fechaenvio, String servicetype) {
        this.usuariofactura = usuariofactura;
        this.usuariodest = usuariodest;
        this.nfactura = nfactura;
        this.codigopaq = codigopaq;
        this.origen = origen;
        this.municipiorig = municipiorig;
        this.destino = destino;
        this.municipiodest = municipiodest;
        this.nitz = nitz;
        this.cliente = cliente;
        this.direccioncliente = direccioncliente;
        this.tipopago = tipopago;
        this.npaquete = npaquete;
        this.tamapaquete = tamapaquete;
        this.total = total;
        this.fechaenvio = fechaenvio;
        this.servicetype = servicetype;
    }

    public String getUsuariofactura() {
        return usuariofactura;
    }

    public void setUsuariofactura(String usuariofactura) {
        this.usuariofactura = usuariofactura;
    }

    public String getUsuariodest() {
        return usuariodest;
    }

    public void setUsuariodest(String usuariodest) {
        this.usuariodest = usuariodest;
    }

    public String getNfactura() {
        return nfactura;
    }

    public void setNfactura(String nfactura) {
        this.nfactura = nfactura;
    }

    public String getCodigopaq() {
        return codigopaq;
    }

    public void setCodigopaq(String codigopaq) {
        this.codigopaq = codigopaq;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getMunicipiorig() {
        return municipiorig;
    }

    public void setMunicipiorig(String municipiorig) {
        this.municipiorig = municipiorig;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getMunicipiodest() {
        return municipiodest;
    }

    public void setMunicipiodest(String municipiodest) {
        this.municipiodest = municipiodest;
    }

    public String getNitz() {
        return nitz;
    }

    public void setNitz(String nitz) {
        this.nitz = nitz;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDireccioncliente() {
        return direccioncliente;
    }

    public void setDireccioncliente(String direccioncliente) {
        this.direccioncliente = direccioncliente;
    }

    public String getTipopago() {
        return tipopago;
    }

    public void setTipopago(String tipopago) {
        this.tipopago = tipopago;
    }

    public String getNpaquete() {
        return npaquete;
    }

    public void setNpaquete(String npaquete) {
        this.npaquete = npaquete;
    }

    public String getTamapaquete() {
        return tamapaquete;
    }

    public void setTamapaquete(String tamapaquete) {
        this.tamapaquete = tamapaquete;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getFechaenvio() {
        return fechaenvio;
    }

    public void setFechaenvio(String fechaenvio) {
        this.fechaenvio = fechaenvio;
    }

    public String getServicetype() {
        return servicetype;
    }

    public void setServicetype(String servicetype) {
        this.servicetype = servicetype;
    }

    

   

   

}