import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = "";
        String fraseFormatada = "";
        Boolean pontuacao = false;
        char[] letrasMaiusculasAcento = {'Á','À','Ã','Â','Ä','É','È','Ê','Ë','Í','Ì','Î','Ï','Ó','Ò','Õ','Ô','Ö','Ú','Ù','Û','Ü','Ç'};
        char[] pontuacoes = {
            '.', ',', ';', ':', '!', '?', '-', '_', '(', ')', '[', ']', '{', '}', '"', '\'', '/', '\\', '@', '#', '$', '%', '&', '*', '+', '=', '<', '>'};


    System.out.print("1 - Cifrador\n2 - Decifrador\n0 - Sair\n\nEscolha sua opção:");
    int opcao = scanner.nextInt();
    scanner.nextLine();

    switch (opcao) {
        case 1:
            System.out.println("Digite a frase que deseja cifrar:");
            frase = scanner.nextLine();

            fraseFormatada = frase.toUpperCase();
            pontuacao = false;
            
            for(int i = 0; i < frase.length(); i++){

                char letra = frase.charAt(i);

                for (int j = 0; j < pontuacoes.length; j++) {
                    if (letra == pontuacoes[j]) {
                        pontuacao = true;
                    }
                    
                }
                if (pontuacao == false) {
                        fraseFormatada += letra;
                    }
                }
                System.out.println(fraseFormatada);

            break;
                
            }   
        
    }

    }
