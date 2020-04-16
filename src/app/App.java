package app;

public class App {
    public static void main(String[] args) throws Exception {
    
        Olimpiada olimpiadaCoronaEdition;
        olimpiadaCoronaEdition = new Olimpiada();
        Maratonista maratonista1;
        maratonista1 = new Maratonista();

        maratonista1.nombre = "Sonic";
        maratonista1.nacionalidad = "Alemania";
        maratonista1.pasaporte = "AL33564789";
        maratonista1.edad = 35;
        maratonista1.energia = 100;

        boolean corrio;
        maratonista1.participar(olimpiadaCoronaEdition);
        corrio = maratonista1.correr();

        /*if (corrio) {
            System.out.println("Perfecto! ha corrido " + maratonista1.nombre);
        } else {
            System.out.println("No ha podido, esta lesionado");
        }*/
        
        while(maratonista1.energia>0){
            maratonista1.correr();
        }

    }

}
