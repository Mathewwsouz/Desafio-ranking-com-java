import java.util.Scanner;

class Desafio {
    
    public static int saldo(int vitorias, int derrotas) {
        return vitorias - derrotas;
    }

    public static String ranking(int vitorias) {
        if (vitorias < 10) {
            return "FERRO";
        } else if (vitorias < 20) {
            return "BRONZE";
        } else if (vitorias < 30) {
            return "PRATA";
        } else {
            return "OURO";
        }
    }
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int vitorias, derrotas;
        
        // Solicitar o número de vitórias e derrotas ao usuário
        System.out.println("Digite o número de vitórias:");
        vitorias = console.nextInt();
        System.out.println("Digite o número de derrotas:");
        derrotas = console.nextInt();
        
        // Criar uma instância da classe Desafio
        Desafio desafio = new Desafio();
        
        // Calcular o saldo
        int saldo = desafio.saldo(vitorias, derrotas);
        
        // Determinar o ranking
        String nivel = desafio.ranking(vitorias);
        
        // Exibir o saldo e o ranking
        System.out.println("O herói tem saldo de " + saldo + " e está no nível " + nivel);
        
        // Fechar o scanner
        console.close();
    }
}
