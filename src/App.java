import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        System.out.println("Olá bem vindo!! Inicie o seu dia bem informado!");
        System.out.println("Digite o seu Assunto preferido!");
        String assunto=sc.next();
        ConsumoApi api= new ConsumoApi();
        String json=api.news(assunto);
        System.out.println("Noticias de hoje!");
        System.out.println(json);
        sc.close();;
    }
    }
   

