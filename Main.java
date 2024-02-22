public class Main {
    public static void main(String[] args) {
        Main corripio = new Main();

        corripio.probarElectrodomestico(new Plancha());
        corripio.probarElectrodomestico(new Tv());
        corripio.probarElectrodomestico(new BluRay());
        corripio.probarElectrodomestico(new Ipod());
        corripio.probarElectrodomestico(new Xbox());
    
       
    }   

  public void probarElectrodomestico(Electrodomestico e) {
    e.encender();

    if(e instanceof Reproductor) {
            Reproductor r = (Reproductor)e;
            probarReproductor(r);
        }
  }

  public void probarReproductor(Reproductor r) {
    r.play();
    r.pause();
    r.stop();
    r.forward();
    r.rewind();
    
  }



}
