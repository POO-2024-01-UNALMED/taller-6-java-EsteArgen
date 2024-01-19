package vehiculos;

public class Camion extends Vehiculo {
    private int ejes;
    private static int CantidadCamion;

    public Camion(String placa,String nombre,int precio,int peso, Fabricante fabricante,int ejes){
        super(placa,2,80,nombre,precio,peso,"4X2",fabricante);
        this.ejes=ejes;
        Camion.CantidadCamion++;
    }

    public String getPlaca(){
        return super.getPlaca();

    }

    public void setPlaca(String placa){
        super.setPlaca(placa);
    }

    public void setPuertas(int puertas){
        super.setPuertas(puertas);
    }

    public int getPuertas(){
        return super.getPuertas();
    }

    public void setVelocidadMaxima(int velocidadMaxima){
        super.setVelocidadMaxima(velocidadMaxima);
    }

    public int getVelocidadMaxima(){
        return super.getVelocidadMaxima();
    }

    public void setNombre(String nombre){
        super.setNombre(nombre);
    }

    public String getNombre(){
        return super.getNombre();
    }

    public void setPrecio(int precio){
        super.setPrecio(precio);
    }

    public int getPrecio(){
        return super.getPrecio();
    }

    public void setPeso(int peso){
        super.setPeso(peso);
    }

    public int getPeso(){
        return super.getPeso();
    }

    public void setTraccion(String traccion){
        super.setTraccion(traccion);
    }

    public String getTraccion(){
        return super.getTraccion();
    }

    public void setFabricante(Fabricante fabricante){
        super.setFabricante(fabricante);
    }

    public Fabricante getFabricante(){
        return super.getFabricante();
    }

    public static void setCantidadVehiculos(int CantidadVehiculos){
        Vehiculo.setCantidadVehiculos(CantidadVehiculos);
    }

    public static int getCantidadVehiculos(){
        return Vehiculo.getCantidadVehiculos();
    }

    public void setEjes(int ejes){
        this.ejes=ejes;
    }

    public int getEjes(){
        return ejes;
    }

    public static void setCantidadCamion(int CantidadCamion){
        Camion.CantidadCamion=CantidadCamion;
    }

    public static int getCantidadCamion(){
        return Camion.CantidadCamion;
    }
}