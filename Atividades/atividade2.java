/* ATIVIDADE
 * Receber dois parametros via terminal, sendo dois numeros inteiros.
 * O programa deverá imprimir do primeiro valor ao segundo valor.
 * EX: 
 * in >>> 1,5
 * out >> numero 1
 * out >> numero 2
 * ...
 * Caso o valor do primeiro seja MAIOR que o do segundo,
 * deverá sera levantada uma exceção personalizado
 * A classe da exceção, deve se chamar ParametrosInvalidosExceptipon
 */

 package Atividades;

 import java.util.Scanner;
 
 public class atividade2 {
     public static void main(String[] args) {
         Scanner terminal = new Scanner(System.in);
         System.out.println("Digite o primeiro valor: ");
         int paramUm = terminal.nextInt();
         System.out.println("Digite o segundo valor: ");
         int paramDois = terminal.nextInt();

         try {
             contar(paramUm, paramDois);
         } catch (ParametrosInvalidosException e) {
             System.out.println("Valor do segundo termo é inferior ao primeiro termo.");
         }
     }
 
     static void contar(int paramUm, int paramDois) throws ParametrosInvalidosException {
         if (paramUm > paramDois) {
             throw new ParametrosInvalidosException();
         } else {
             for (int c = paramUm; c <= paramDois; c++) {
                 System.out.println(c);
             }
         }
     }
 }
 