package tv;

public class funcoesTv{
    boolean energia = false;
    boolean estado = false;
    int canal = 5;
    int volume = 10;

    /* */
    public void conectarEnergia(){
        energia = true;
    }

    public void desconectarEnergia(){
        energia = false;
    }

    public void ligar(){
        if (energia == true){
            systemInfo("Ligando...");
            estado = true;
            String systemVolume = Integer.toString(volume);
            String systemCanal = Integer.toString(canal);
            systemInfo("CANAL: " + systemCanal + "\n" + "VOLUME: " + systemVolume);
        }else {
            estado = false;
        }
    }

    public void desligar(){
        if (estado == true){
            systemInfo("Desligando..");
            estado = false;
        } else {
            estado = false;
        }
    }

    public void aumentarVolume(){
        if (estado == true){
            volume ++;
            String systemVolume = Integer.toString(volume);
            systemInfo(systemVolume);
        } else{
            estado = false;
        }
    }

    public void dimininuirVolume(){
        if (estado == true){
            volume --;
            String systemVolume = Integer.toString(volume);
            systemInfo(systemVolume);
        }else {
            estado = false;
        }
    }

    public void canalPosterior(){
        if (estado == true){
            canal ++;
            String systemCanal = Integer.toString(canal);
            systemInfo(systemCanal);
        } else {
            estado = false;
        }
    }

    public void canalAnterior(){
        if (estado == true){
            canal --;
            String systemCanal = Integer.toString(canal);
            systemInfo(systemCanal);
        } else{
            estado = false;
        }
    }

    public void defineCanal(int escolhaCanal){
        if (estado == true){
            canal = escolhaCanal;
            String systemCanal = Integer.toString(canal);
            systemInfo(systemCanal);
        }
    }

    public void systemInfo(String info){
        System.out.println(info);
    }

}