package app;

public class Deportista extends Persona{

    public String deportes;
    public int nroDeportista;
    public double altura;
    public double peso;

    public void participar (Olimpiada olimpiada){
        olimpiada.inscribir(this);
    }


}