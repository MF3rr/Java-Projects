package tv;

public class app {
    public static void main (String [] args) throws Exception {

        funcoesTv tv = new funcoesTv();

        System.out.println(tv.estado);
        tv.conectarEnergia();
        tv.ligar();
        System.out.println(tv.estado);
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.canalPosterior();
        System.out.println(tv.canal + " " + tv.volume);
        tv.defineCanal(45);
        System.out.println(tv.canal + " " + tv.volume);
    }
}
