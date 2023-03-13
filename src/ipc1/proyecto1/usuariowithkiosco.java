package ipc1.proyecto1;

/**
 *
 * @author wilar
 */
public class usuariowithkiosco {
    private String usrk;
    private String codek;
    private String namek;
    private String coder;

    public usuariowithkiosco(String usrk, String codek, String namek, String coder) {
        this.usrk = usrk;
        this.codek = codek;
        this.namek = namek;
        this.coder = coder;
        
    }

    public String getUsrk() {
        return usrk;
    }

    public void setUsrk(String usrk) {
        this.usrk = usrk;
    }

    public String getCodek() {
        return codek;
    }

    public void setCodek(String codek) {
        this.codek = codek;
    }

    public String getNamek() {
        return namek;
    }

    public void setNamek(String namek) {
        this.namek = namek;
    }

    public String getCoder() {
        return coder;
    }

    public void setCoder(String coder) {
        this.coder = coder;
    }
    
}
