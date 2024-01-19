package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    private String nombre;
    private Pais pais;
    static ArrayList<String> Listafabrica=new ArrayList<>();
    static ArrayList<Integer> CantidadListafabrica=new ArrayList<>();
    

    public Fabricante(String nombre,Pais pais){
        this.nombre=nombre;
        this.pais=pais;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return nombre;
    }

    public void setPais(Pais pais){
        this.pais=pais;
    }
    
    public Pais getPais(){
        return pais;
    }

    public static Fabricante fabricaMayorVentas(){
        int max=-1;
        int indice=-1;
        for(int i=0;i<CantidadListafabrica.size();i++){
            if (CantidadListafabrica.get(i)>max){
                max=CantidadListafabrica.get(i);
                indice=i;
            }
        }

        return new Fabricante(Fabricante.Listafabrica.get(indice), null);
    }

    
}