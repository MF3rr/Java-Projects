package banco;

public class conta {

    /*
     * Extrato
     * Deposito
     * Saque
     * 
     * Criar Conta
     * Excluir Conta
     */

    double saldo = 0;
    double nConta = Math.random();
    boolean status = true;

    String nome;
    String cpf;
    char sex;
    
    public void extrato(){
        System.out.println(saldo);
    }

    public void saque(double valor){
        if (saldo <= 0){
        } else {
            saldo = saldo - valor;
        }
    }
    
    public void deposito(double valor){
        saldo = saldo + valor;
    }

    public void gerenciarConta(String statusConta){
        if (statusConta.equals("Desativada")){
            status = false;
        } else if (statusConta.equals("Ativada")) {
            status = true;
        } else {
            status = status;
        }
    }

}
