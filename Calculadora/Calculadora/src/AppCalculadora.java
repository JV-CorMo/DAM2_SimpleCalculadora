import java.util.Scanner;

public class AppCalculadora {
    public int num1;
    public int num2;
    public String signo;


    public AppCalculadora() {

    }

    public void calculadora(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Hola buenos, Vamos a calcular");
        System.out.print("Introduce un primer numero: ");
        num1 = sc.nextInt();
        System.out.print("\nIntroduce un segundo numero: ");
        num2 = sc.nextInt();
        System.out.print("\nIntroduce el signo de calculo * + - /: ");
        signo = sc.next();

        
        switch(signo){
            case "+":
                System.out.print("Resultado es: " + sumar());

                break;
            case "-":
                System.out.print("Resultado es: " + restar());

                break;
            case "*":
                System.out.print("Resultado es: " + multiplica());

                break;
            case "/":
                System.out.print("Resultado es: " + dividir());

                break;
            default:
                System.out.println("Opción no es válida.");
                break;
        }

    }

    public int sumar(){
        int valor = this.num1 + this.num2;
        return valor;
    }

    public int restar(){
        int valor = this.num1 - this.num2;
        return valor;
    }
    public int multiplica(){
        int valor = this.num1 * this.num2;
        return valor;
    }
    public int dividir(){
        int valor = this.num1 / this.num2;
        return valor;
    }
}

