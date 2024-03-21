import  java.util.Scanner;
public class Main {
    public  void Suma(double numer1, double number2){
        double result = numer1 + number2;
        System.out.println("La sumatoria es: " + result);
    }

    public  void Resta(double numer1, double number2){
        double result = numer1 + number2;
        System.out.println("La sumatoria es: " + result);
    }

    public  void Multiplicacion(double numer1, double number2){
        double result = numer1 + number2;
        System.out.println("La sumatoria es: " + result);
    }

    public  void DIvision(double numer1, double number2){
        if(number2 == 0){
            System.out.println("ERROR NO DIVIDIR ENTRE 0");
        }else{
            double result = numer1 / number2;
            System.out.println("La division es: " + result);
        }
    }




    public static void main(String[] args) {
        Main main = new Main();
        boolean salir = false;
        double firstNumber;
        double secondNumber;
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("1. Hacer suma");
            System.out.println("2. Hacer resta");
            System.out.println("3. Hacer multiplicacion");
            System.out.println("4. Hacer division");
            System.out.println("5. Salir");
            int opcion = input.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el primer numero: ");
                    firstNumber = input.nextDouble();
                    System.out.println("Ingrese el segundo numero: ");
                    secondNumber = input.nextDouble();
                    main.Suma(firstNumber, secondNumber);
                    break;

                case 2:
                    System.out.println("Ingrese el primer numero: ");
                    firstNumber = input.nextDouble();
                    System.out.println("Ingrese el segundo numero: ");
                    secondNumber = input.nextDouble();
                    main.Resta(firstNumber, secondNumber);
                    break;

                case 3:
                    System.out.println("Ingrese el primer numero: ");
                    firstNumber = input.nextDouble();
                    System.out.println("Ingrese el segundo numero: ");
                    secondNumber = input.nextDouble();
                    main.Multiplicacion(firstNumber, secondNumber);
                    break;

                case 4:
                    System.out.println("Ingrese el primer numero: ");
                    firstNumber = input.nextDouble();
                    System.out.println("Ingrese el segundo numero: ");
                    secondNumber = input.nextDouble();
                    main.DIvision(firstNumber, secondNumber);
                    break;

                case  5:
                    salir = true;
                    break;

                default:
                    break;

            }
        }
        while(salir != true);

    }
}

