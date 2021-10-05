public class Comandos {
    public static void showHelp() {
        System.out.println("Usage: java Comandos <comando>");
        System.out.println("Comandos suportado:");
        System.out.println("\t init - inicializa alguma coisa");
        System.out.println("\t status - imprimie o estado atual de alguma coisa");
    }

    public static void main(String args[]) {
        if (args.length < 1) {
            showHelp();
            return;
        }

        String cmd = args[0];
        
        if (cmd.equals("init")) {
            System.out.println("Executa comando init");
        } else if (cmd.equals("status")) {
            System.out.println("Executa comando status");
        } else {
            System.out.println("Comando desconhecido");
            showHelp();
            return;
        }
        

    }
}
