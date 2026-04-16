import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "cp850");
        String frase = "";
        String fraseFormatada = "";
        String fraseCifrada = "";
        int pontuacao;
        char[] letrasMaiusculasSemAcento = { 'A', 'A', 'A', 'A', 'A', 'E', 'E', 'E', 'E', 'I', 'I', 'I', 'I', 'O', 'O',
                'O', 'O', 'O', 'U', 'U', 'U', 'U', 'C' };
        char[] letrasMaiusculasAcento = { 'Á', 'À', 'Ã', 'Â', 'Ä', 'É', 'È', 'Ê', 'Ë', 'Í', 'Ì', 'Î', 'Ï', 'Ó', 'Ò',
                'Õ', 'Ô', 'Ö', 'Ú', 'Ù', 'Û', 'Ü', 'Ç' };
        char[] pontuacoes = {
                ' ', '.', ',', ';', ':', '!', '?', '-', '_', '(', ')', '[', ']', '{', '}', '"', '\'', '/', '\\', '@',
                '#', '$', '%', '&', '*', '+', '=', '<', '>' };

        System.out.print("1 - Cifrador\n2 - Decifrador\n0 - Sair\n\nEscolha sua opção:");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("Digite a frase que deseja cifrar:");
                frase = scanner.nextLine();

                frase = frase.toUpperCase();
                

                for (int i = 0; i < frase.length(); i++) {

                    pontuacao = 0;
                    char letra = frase.charAt(i);

                    for (int j = 0; j < pontuacoes.length; j++) {
                        if (letra == pontuacoes[j]) {
                            pontuacao = 1;
                            break;

                        }

                    }
                    if (pontuacao == 0) {
                        for (int j2 = 0; j2 < letrasMaiusculasAcento.length; j2++) {
                        if (letra == letrasMaiusculasAcento[j2]) {
                            letra = letrasMaiusculasSemAcento[j2];
                            break;
                        }
                    }
                    fraseFormatada += letra;
                    }

                    
                }
                int tamanho = fraseFormatada.length();
                int indice = 0;

                if(tamanho>0){
                    for (int i = 0; i < tamanho; i++) {
                        fraseCifrada+= fraseFormatada.charAt(indice);
                        indice = (indice + 3) % tamanho;
                    }
                }
                System.out.println("\nFrase Limpa:    " + fraseFormatada);
                System.out.println("Mensagem Cifrada: " + fraseCifrada);

                break;

        }
        scanner.close();

    }

}
