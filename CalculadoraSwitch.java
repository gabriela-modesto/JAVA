import java.util.Scanner;

public class CalculadoraSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INSIRA O PRIMEIRO NÚMERO: ");
        int n1 = sc.nextInt();
        System.out.println("INSIRA O SEGUNDO NÚMERO: ");
        int n2 = sc.nextInt();
        
        System.out.println("\nESCOLHA UMA FUNÇÃO: ");
        System.out.println("+, -, * ou /");
        char operacao = sc.next().charAt(0);
        
        String resultado = "";
        double total = 0;
        
        switch(operacao) {
            case '+':
                total = total + (n1 + n2);
                resultado = "\nSOMA = " + total;
                break;
            case '-':
                total = total + (n1-n2);
                resultado = "\nSUBTRAÇÃO = " + total;
                break;
            case '*':
                total = total + (n1*n2);
                resultado = "\nMULTIPLICAÇÃO = " + total;
                break;
            case '/':
                total = total + (n1/n2);
                resultado = "\nDIVISÃO = " + total;
                break;
        }
        
        System.out.println(resultado);
       
        sc.close();
    }
}
