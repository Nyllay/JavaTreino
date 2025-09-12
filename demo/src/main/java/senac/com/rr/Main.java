package senac.com.rr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o seu Nome");
        String nome = scanner.nextLine();

        System.out.println("Digite a Sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite o seu email");
        String email = scanner.nextLine();

        System.out.println("Digite o seu telefone");
        String telefone = scanner.nextLine();

        System.out.println("Digite o seu endereço");
        String endereco = scanner.nextLine();

        System.out.println("Digite a data do seu nascimento");
        String nascimento = scanner.nextLine();

        System.out.println("Digite o seu cpf");
        String cpf = scanner.nextLine();

        System.out.println("Qual é a cor dos seus olhos");
        String corDoOlho = scanner.nextLine();

        System.out.println("Digite a sua matricula");
        String matricula = scanner.nextLine();

        System.out.println("Digite o seu salario");
        double salario = scanner.nextDouble();

         System.out.println("Digite o seu cargo");
        String cargo = scanner.nextLine();

         System.out.println("Digite o seu setor");
        String setor = scanner.nextLine();

        Funcionario F1 = new Funcionario(
            nome, 
            idade, 
            email, 
            telefone, 
            endereco, 
            nascimento, 
            cpf, 
            corDoOlho, 
            matricula, 
            salario,
            cargo, 
            setor);

        }

          
 }