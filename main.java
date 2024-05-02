/**
 * main
 */

 import java.util.Scanner;
 import java.util.Random;

public class main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random randomChoice = new Random();
        
        // dados do jogo: Pontuacao/Estado do jogo.
        boolean jogoOn = true;
        int pontosJogador = 0;
        int pontosComputador = 0;

        // opçoes do pc
        String[] pcOptions = {"pedra", "papel", "tesoura"};
        
        // escolha jogador

        // escolha random pc



        // while loop
        while (jogoOn == true) {

            System.out.println("Escolha entre pedra papel e tesoura.");
            String escolhaJogador = input.nextLine();

            int randomNumber = randomChoice.nextInt(0, pcOptions.length);
            String escolhaComputador = pcOptions[randomNumber];

            if (escolhaJogador.equals("pedra") && escolhaComputador.equals("tesoura")) {
                System.out.println("Jogador venceu. Escolha jogador: "+escolhaJogador+". Escolha computador: "+escolhaComputador+".");
                pontosJogador += 1;
                if (pontosJogador == 3) {
                    System.out.println("Parabéns! Você venceu o jogo.");
                    System.out.println("Jogo encerrado.");
                    jogoOn = false;
                }
                else{
                    System.out.println("Pontos jogador: "+pontosJogador+".");
                    System.out.println("Pontos computador: "+pontosComputador+".");
                }
            }
            else if (escolhaJogador.equals(escolhaComputador)) {
                System.out.println("empate");
            }
            else if (escolhaJogador.equals("papel") && escolhaComputador.equals("pedra")) {
                System.out.println("Jogador venceu. Escolha jogador: "+escolhaJogador+". Escolha computador: "+escolhaComputador+".");
                pontosJogador += 1;

            }
            else if (escolhaJogador.equals("tesoura") && escolhaComputador.equals("papel")) {
                System.out.println("Jogador venceu. Escolha jogador: "+escolhaJogador+". Escolha computador: "+escolhaComputador+".");
                pontosJogador += 1;

            }
            else {
                System.out.println("Você perdeu. Escolha jogador: "+escolhaJogador+". Escolha computador: "+escolhaComputador+".");
                pontosComputador += 1;
                if (pontosComputador == 3) {
                    System.out.println("Infelizmente! Você perdeu o jogo.");
                    System.out.println("Jogo encerrado.");
                    jogoOn = false;
                }
                else{
                    System.out.println("Pontos jogador: "+pontosJogador+".");
                    System.out.println("Pontos computador: "+pontosComputador+".");
                }
            }


        }

    


    }
}