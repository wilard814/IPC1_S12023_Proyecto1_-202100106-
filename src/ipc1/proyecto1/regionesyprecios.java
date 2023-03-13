package ipc1.proyecto1;

/**
 *
 * @author wilar
 */
public class regionesyprecios {
    //Region metropolitana
   private String metro;
   private double mestandar;
   private double mespecial;
    //Region note
   private String nt;
   private double ntestandar;
   private double ntespecial;
    //Region nororiente
   private String no;
   private double noestandar;
   private double noespecial;
    //Region suroriente
   private String so;
   private double soestandar;
   private double soespecial;
    //Region suroccidente
   private String soc;
   private double socestandar;
   private double socespecial;
    //Region noroccidente
   private String noc;
   private double nocestandar;
   private double nocespecial;

    public regionesyprecios(String metro, double mestandar, double mespecial, String nt, double ntestandar, double ntespecial, String no, double noestandar, double noespecial, String so, double soestandar, double soespecial, String soc, double socestandar, double socespecial, String noc, double nocestandar, double nocespecial) {
        this.metro = metro;
        this.mestandar = mestandar;
        this.mespecial = mespecial;
        this.nt = nt;
        this.ntestandar = ntestandar;
        this.ntespecial = ntespecial;
        this.no = no;
        this.noestandar = noestandar;
        this.noespecial = noespecial;
        this.so = so;
        this.soestandar = soestandar;
        this.soespecial = soespecial;
        this.soc = soc;
        this.socestandar = socestandar;
        this.socespecial = socespecial;
        this.noc = noc;
        this.nocestandar = nocestandar;
        this.nocespecial = nocespecial;
    }

    public String getMetro() {
        return metro;
    }

    public void setMetro(String metro) {
        this.metro = metro;
    }

    public double getMestandar() {
        return mestandar;
    }

    public void setMestandar(double mestandar) {
        this.mestandar = mestandar;
    }

    public double getMespecial() {
        return mespecial;
    }

    public void setMespecial(double mespecial) {
        this.mespecial = mespecial;
    }

    public String getNt() {
        return nt;
    }

    public void setNt(String nt) {
        this.nt = nt;
    }

    public double getNtestandar() {
        return ntestandar;
    }

    public void setNtestandar(double ntestandar) {
        this.ntestandar = ntestandar;
    }

    public double getNtespecial() {
        return ntespecial;
    }

    public void setNtespecial(double ntespecial) {
        this.ntespecial = ntespecial;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public double getNoestandar() {
        return noestandar;
    }

    public void setNoestandar(double noestandar) {
        this.noestandar = noestandar;
    }

    public double getNoespecial() {
        return noespecial;
    }

    public void setNoespecial(double noespecial) {
        this.noespecial = noespecial;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public double getSoestandar() {
        return soestandar;
    }

    public void setSoestandar(double soestandar) {
        this.soestandar = soestandar;
    }

    public double getSoespecial() {
        return soespecial;
    }

    public void setSoespecial(double soespecial) {
        this.soespecial = soespecial;
    }

    public String getSoc() {
        return soc;
    }

    public void setSoc(String soc) {
        this.soc = soc;
    }

    public double getSocestandar() {
        return socestandar;
    }

    public void setSocestandar(double socestandar) {
        this.socestandar = socestandar;
    }

    public double getSocespecial() {
        return socespecial;
    }

    public void setSocespecial(double socespecial) {
        this.socespecial = socespecial;
    }

    public String getNoc() {
        return noc;
    }

    public void setNoc(String noc) {
        this.noc = noc;
    }

    public double getNocestandar() {
        return nocestandar;
    }

    public void setNocestandar(double nocestandar) {
        this.nocestandar = nocestandar;
    }

    public double getNocespecial() {
        return nocespecial;
    }

    public void setNocespecial(double nocespecial) {
        this.nocespecial = nocespecial;
    }
   
}
