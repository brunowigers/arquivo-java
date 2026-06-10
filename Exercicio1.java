import java.util.Scanner; 

public class Maioridade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual sua idade? ");.
        
        int idade = leitor.nextInt();

System.out.println("Qual o seu ano de nascimento? ");
int anoNascimento = leitor.nextInt(); 

int idade = 2026 - anoNascimento;

if (idade >= 18) {
 System.out.println("você é maior de idade!");
} else {
 System.out.println("Vocẽ é menor de idade!");
}

        leitor.close(); 
    }
}
