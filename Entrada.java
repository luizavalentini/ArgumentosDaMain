import java.util.Scanner;

public class Entrada {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Digite nome: ");
        String nome = sc.nextLine();
        System.err.println("Digite idade: ");
        int idade = Integer.parseInt(sc.nextLine());


        System.out.println("Dados do usuário");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
