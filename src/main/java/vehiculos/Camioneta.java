package vehiculos;

public class Camioneta extends Vehiculo{
    private Boolean volco;
    private static int CantidadCamioneta;

    public Camioneta(String placa,int puertas,String nombre,int precio,int peso, Fabricante fabricante,Boolean volco){
        super(placa,puertas,90,nombre,precio,peso,"4X4",fabricante);
        this.volco=volco;
        Camioneta.CantidadCamioneta++;
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

    public void setVolco(Boolean volco){
        this.volco=volco;
    }

    public Boolean isVolco(){
        return volco;
    }

    public static void setCantidadCamioneta(int CantidadCamioneta){
       Camioneta.CantidadCamioneta=CantidadCamioneta;
    }

    public static int getCantidadCamioneta(){
        return Camioneta.CantidadCamioneta;
    }
}