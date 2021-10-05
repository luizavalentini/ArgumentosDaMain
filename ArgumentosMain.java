public class ArgumentosMain {

    public static void help() {
        System.out.println("Usage: java ArgumentosMain <nome> <idade>");
    }

    public static void main(String args[]) {
        
        if (args.length < 2) {
            help();
            return;
        }
    
        String nome = args[0];
        int idade = Integer.parseInt(args[1]);

        System.out.println(nome);
        System.out.println(idade);

        // for (int i = 0; i < args.length; i++) {
        //     System.out.println(i + ": " + args[i]);
        // }
    }

    // public static void main(String args[]) {

    //     String[] vetor = {"Ola", "Mundo"};
    //     main2(vetor);

    // }
}