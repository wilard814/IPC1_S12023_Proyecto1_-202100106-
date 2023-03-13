package ipc1.proyecto1;
import Interfaz.Login;
import java.util.ArrayList;


public class IPC1PROYECTO1 {
    
  public static ArrayList<datoskiosco> kiosco = new ArrayList<>(); 
  public static ArrayList<Municipio> municipios = new ArrayList<>(); 
  public static ArrayList<usuariowithkiosco> uskiosco = new ArrayList<>(); 
  public static ArrayList<regionesyprecios> regyprec = new ArrayList<>(1);
  public static ArrayList<tarjeta> creditodebito = new ArrayList<>();
  public static ArrayList<Datosfactura> factura = new ArrayList<>();
  public static ArrayList<guiayfactura> facyguia = new ArrayList<>();
  
    public static void main(String[] args) {
        
        Login pantallalog = new Login();
        pantallalog.setVisible(true);
        pantallalog.setLocationRelativeTo(null);
    }
    
}
