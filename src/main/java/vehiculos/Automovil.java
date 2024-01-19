package vehiculos;

public class Automovil extends Vehiculo{
    private int puestos;
    private static int CantidadAutomovil;

    public Automovil(String placa,String nombre,int precio,int peso,Fabricante fabricante,int puestos){
        super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
        this.puestos=puestos;
        Automovil.CantidadAutomovil++;
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

    public void setPuestos(int puestos){
        this.puestos=puestos;
    }

    public int getPuestos(){
        return puestos;
    }

    public static void setCantidadAutomovil(int CantidadAutomovil){
        Automovil.CantidadAutomovil=CantidadAutomovil;
    }

    public static int getCantidadAutomovil(){
        return Automovil.CantidadAutomovil;
    }


}