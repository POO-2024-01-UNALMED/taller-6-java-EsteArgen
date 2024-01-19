package vehiculos;

import java.util.ArrayList;
public class Pais {
    private String nombre;
    static ArrayList<String> Listapaises=new ArrayList<>();
    static ArrayList<Integer> CantidadListapaises=new ArrayList<>();

    public Pais(String nombre){
        this.nombre=nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public static Pais paisMasVendedor(){
        int max=-1;
        int indice=-1;
        for (int i=0;i<Pais.CantidadListapaises.size();i++){
            if (Pais.CantidadListapaises.get(i)>max){
                max=CantidadListapaises.get(i);
                indice=i;
            }

        }
        return new Pais(Pais.Listapaises.get(indice));
    }
}