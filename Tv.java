public class Tv extends Electrodomestico {

    private int canal;
    private int volumen;


    @Override
    public void encender() {
      System.out.println("TV encendida");
        
    }
    
    public void cambiarCanal(int canal) {
        this.canal = canal;
    }

    public void subirCanal() {
        canal++;
    }

    public void bajarCanal() {
        canal--;
    }

    public void subirVolumen() {
        volumen++;
    }

    public void bajarVolumen() {
        volumen--;
    }
}
