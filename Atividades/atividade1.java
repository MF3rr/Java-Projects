/* ATIVIDADE 1
 * SALARIO 2000
 * SE VALOR SALARIO BASE MAIOR SALARIO PRETENDIDO = LIGAR CANDIDATO
 * SE VALOR SALARIO BASE IGUAL SALARIO PRETENDIDO = LIGAR PARA O CANDIDATO COM PROPOSTA
 * SENAO = AGUARDANDO RESULTADO DE DEMAIS CANDIDATOS
 */

 /*ATIVIDADE 2
  * SELECIONE SOMENTE CANDIDATOS APTOS E ARMAZENE EM UMA LISTA
  */

 /* ATIVIDADE 3
  * IMPRIMA TODOS CANDIDATOS APTOS DA LISTA
 */

 /* ATIVIDADE 4
  * LIGUE PARA OS CANDIDATOS APTOS
  */

package Atividades;
import java.util.concurrent.ThreadLocalRandom; 
import java.util.ArrayList; // importando array
import java.util.Random;

public class atividade1 {
    public static void main(String[] args){
        
        String candidatos[] = {"JOAO","MAQUIAVEL","KAFKA","LISBOA","RODRIGO","JOAQUIN"};
        ArrayList<String> candidatosAptos = new ArrayList<String>(); //criando lista
        
        // Iterando sobre as pretenções salarias de cada candidato
        for (int c = 0; c <= 5; c++){
            double salarioPretendido = valorPretendido();
            String analiseDeCandidato = analiseDeCandidato(salarioPretendido);
            System.out.println(candidatos[c] + " " + analiseDeCandidato(salarioPretendido));
            if (analiseDeCandidato == "Ligar para o candidato" | analiseDeCandidato == "Ligar para o candidato com proposta"){
                candidatosAptos.add(candidatos[c]);
            }
        }

        System.out.println();

        // Ligando 3 vezes para cada candidato apto
        for (int c = 0; c <= candidatosAptos.size(); c ++){
            String telefoneCandidato = gerarTelefone(); // Gerando telefone
            for (int chamar = 1; chamar <= 3; chamar ++){
                System.out.println("Ligando para " + candidatosAptos.get(c) + " no numero " + telefoneCandidato);
                System.out.println("Ligando..." + chamar);
                String ligando = ligacao();
                if (ligando == "Atendeu"){
                    System.out.println(candidatosAptos.get(c) + " atendeu a ligação.");
                    break;
                } else if (chamar == 3){
                    System.out.println(candidatosAptos.get(c) + " não atendeu as ligações.");
                    break;
                }
            }
        }
    }

    // Analisa Candidato
    static String analiseDeCandidato(double salarioPretendido){
        double salarioBase;
        salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            return ("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            return ("Ligar para o candidato com proposta");
        }else {
            return ("Aguardando demais candidatos");
        }   
    }

    // Gerador de salario
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    // Gerador de telefone
    static String gerarTelefone(){
        int numero = ThreadLocalRandom.current().nextInt(60000000, 99999999);
        int ddd = ThreadLocalRandom.current().nextInt(11, 91);
        String telefone = String.format("(%d) 9 %d",ddd, numero);
        return telefone;
    }

    // Atende/Não atende
    static String ligacao(){
        String letras[] = {"Atendeu", "Não atendeu"};
        Random escolha = new Random();
        return letras[escolha.nextInt(0,2)];
    }
}
 