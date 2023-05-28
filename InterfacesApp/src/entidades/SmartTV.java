/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Estudiante
 */
public class SmartTV
        extends Dispositivo
        implements Navegador, Reproductor{
    private int TipoEntrada;
    
    private final int HDMI =0;
    private final int VGA=1;
    private final int DVI=2;
    private final int DisplayPort=3;
    private final int RCA=4;
    private final int Sigmal=5;
    private final int SVideo=6;
    private final int coaxial = 7;
    
    /**
     * @return the TipoEntrada
     */
    @Override
    public String getNombre(){
        String nombreEntrada = "";
        switch(TipoEntrada){
            case HDMI:
                nombreEntrada = "HDMI";break;
            case VGA:
                nombreEntrada = "VGA";break;
            case DVI:
                nombreEntrada = "DVI";break;
            case DisplayPort:
                nombreEntrada = "DisplayPort";break;
            case RCA:
                nombreEntrada = "RCA";break;
            case Sigmal:
                nombreEntrada = "Sigmal";break;    
            case SVideo:
                nombreEntrada = "SVideo";break;
            case coaxial:
                nombreEntrada = "coaxial";break;
        }
        return "Modelo: "+ nombreEntrada;
    }
    public int getTipoEntrada() {
        return TipoEntrada;
    }

    /**
     * @param TipoEntrada the TipoEntrada to set
     */
    public void setTipoEntrada(int TipoEntrada) {
        this.TipoEntrada = TipoEntrada;
    }
    
    
    
    @Override
    public void navergar() {
        
    }

    @Override
    public void abrirLink() {
        
    }

    @Override
    public void retroceder() {
        
    }

    @Override
    public void adealantar() {
        
    }

    @Override
    public void reproducir() {
        
    }
}
