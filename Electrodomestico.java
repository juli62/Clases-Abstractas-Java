public abstract class Electrodomestico {
    
    private double watts;
    
    public abstract void encender();

    public double getWatts() {
        return watts;
    }

    public void setWatts(double watts) {
        this.watts = watts;
    }

    
}
