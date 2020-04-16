package app;

import java.util.ArrayList;
import java.util.List;

public class Olimpiada {

    public List <Deportista> participantes = new ArrayList<>();
    public int anio;
    public int duracion;
    public String ubicacion;
    public int cantidadNaciones;
    public int cantidadDeportistas;
    public String tipo;
    public String mascota;

    public void inscribir (Deportista deportista){
        this.participantes.add(deportista);
    }

}