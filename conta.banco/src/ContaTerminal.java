import java.util.Scanner;

public class ContaTerminal {

   
    
    /**
     * Programa básico proposto como atividade para o Bootcamp Santander:
     * 
     * 1 - Crie o projeto contabanco que receberá dados via terminal contendo as caracteristicas de conta,
     *  como , numero , agência, nome e saldo.
     * 
     * 2 - Dentro do projeto cria a classe ContaTerminal.java para realizar toda a codificação do nosso programa.
     * 
     * @author Artur Martins Ferreira
     * @version 1.0
     * @since 2024 - 05 - 29
     * @param args
     * @throws Exception
     */

    public static void main(String[] args) throws Exception {

         int numero;
         String nome;
         String agencia;
         double saldo;
    
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        
        System.out.println("Digite o numero da conta: \n");
        numero = scanner.nextInt();

        System.out.println("Digite o nome:\n");
        nome = scanner.next();
        

        System.out.println("Digite a agência :\n");
        agencia = scanner2.next();

        System.out.println("Digite o saldo da conta:");
        saldo = scanner.nextDouble();

        System.out.println("\n______________________________________________________________________\n");

        System.out.println("Conta criada:");
        System.out.println("Nome do titular: "+nome+"\n");
        System.out.println("Número da conta: "+numero+"\n");
        System.out.println("Agência: "+agencia+"\n");
        System.out.println("Saldo do titular: "+saldo+"\n");


    }




}
