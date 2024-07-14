package atvrevisaofila;

import java.util.Scanner;

/**
 *
 * @author Quiqu
 */
public class AtvRevisaoFila {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Fila<Camioneiro> fila = new Fila<>(10);
        
        while(true){
        System.out.println("1. Adicionar motorista");
            System.out.println("2. Atender motorista");
            System.out.println("3. Exibir fila");
            System.out.println("4. Exibir primeiro da fila");
            System.out.println("5. Exibir ultimo da fila");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scan.nextInt();
            scan.nextLine();
            
            switch (opcao) {
                case 1:
                    if (fila.isFull()) {
                        System.out.println("A fila está cheia.");
                    } else {
                        System.out.print("Digite o nome do motorista: ");
                        String nome = scan.nextLine();
                        System.out.print("Digite a placa do veículo: ");
                        String placa = scan.nextLine();
                        System.out.print("Digite a idade do motorista: ");
                        int idade = scan.nextInt();
                        scan.nextLine();
                        System.out.print("Digite o CPF do motorista: ");
                        int CPF = scan.nextInt();
                        scan.nextLine();
                        System.out.print("Digite a hora de chegada do motorista: ");
                        String horaChegada = scan.nextLine();
                        Camioneiro camioneiro = new Camioneiro(nome, idade, CPF, placa, horaChegada);
                        fila.enqueue(camioneiro);
                    }
                    break;

                case 2:
                    fila.dequeue();
                    break;

                case 3:
                    fila.exibirFila();
                    break;
                    
                case 4:
                    fila.first();
                    break;
                    
                case 5:
                    fila.last();
                    break;    

                case 6:
                    System.out.println("Saindo...");
                    scan.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }    
    
}
