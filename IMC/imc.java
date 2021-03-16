import java.util.Scanner;

public class imc{

    //modelo matématico imc(p,a) == p/a²

    private static double imcCalc(double p,double a){
        double a2 = a*a;

        return p/a2;
    }


    public static void main(String args[]){

        String p,a;
        double pD,aD;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu peso (em kg): ");
        p = sc.nextLine();
        pD = Double.parseDouble(p);

        System.out.println("Digite a sua altura (em metros): ");
        a = sc.nextLine();
        aD = Double.parseDouble(a);

        sc.close();


        String resultado = String.format("%.2f", imcCalc(pD, aD));

        System.out.println("IMC = " + resultado);


    }
}