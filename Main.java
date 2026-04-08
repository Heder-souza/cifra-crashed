import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = "";
        String fraseFormatada = "";
        char[] letrasMaiusculas = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] letrasMinusculas = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] letrasMaiusculasAcento = {'Á','À','Ã','Â','Ä','É','È','Ê','Ë','Í','Ì','Î','Ï','Ó','Ò','Õ','Ô','Ö','Ú','Ù','Û','Ü','Ç'};
        char[] letrasMinusculasAcento = {'á','à','ã','â','ä','é','è','ê','ë','í','ì','î','ï','ó','ò','õ','ô','ö','ú','ù','û','ü','ç'};

    System.out.print("1 - Cifrador\n2 - Decifrador\n0 - Sair\n\nEscolha sua opção:");
    int opcao = scanner.nextInt();

    switch (opcao) {
        case 1:
            System.out.println("Digite a frase que deseja cifrar:");
            frase = scanner.nextLine();
            
            for(int i = 0; i < frase.length(); i++){

                char letra = frase.charAt(i);

                if (letra == ' ') {
                    continue;
                }

                for (int j = 0; j < 26; j++) {
                    if (frase.charAt(i) == letrasMinusculas[j] || frase.charAt(i) == letrasMinusculasAcento[j]) {
                    fraseFormatada+= letrasMaiusculas[j];

                    break;
                }

                else if (frase.charAt(i) == letrasMaiusculas[j] || frase.charAt(i) == letrasMaiusculasAcento[j]) {
                    fraseFormatada+= letrasMaiusculas[j];

                    break;
                }
                }
                
                
            }   
            System.out.println(fraseFormatada);

            break;
    
        default:
            break;
    }

    }
}