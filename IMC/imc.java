import java.util.Scanner;

public class imc{
    
    static double validar_a(double a){

        return 
        Math.round(100 * a)/100.0;
    }
    
    
    //modelo matématico imc(p,a) == p/a²

    private static double imcCalc(int p,double a){

        double a_sig = validar_a(a);
        if((40 <= p) && (p <= 130) &&
            (1.4 <= a_sig) && (a_sig <= 2.0)){
                return p/ (a*a);
            }
        throw new RuntimeException("Argumentos inválidos" );
    }

     static String categoria(double k){
        if( k < 18.5) return "MAGRO";
        if(18.5 <= k && k < 24.9) return "NORMAL";
        if(25 <= k && k <= 29.9) return "GORDO";
        if(30 < k) return "OBESO";
        
        throw new IllegalArgumentException("Dados inválidos");
    }
    


    public static void main(String args[]){

        String p,a;
        Double aD;
        int pI;


            Scanner sc = new Scanner(System.in);
    
            System.out.println("Digite seu peso (em kg): ");
            p = sc.nextLine();
            pI = Integer.parseInt(p);
    
            System.out.println("Digite a sua altura (em metros): ");
            a = sc.nextLine();
            aD = Double.parseDouble(a);
    
            sc.close();


        String resultado = String.format("%.2f", imcCalc(pI, aD));
        String i = categoria(imcCalc(pI, aD));

        System.out.println("IMC = " + resultado);
        System.out.println("Categoria: " + i);


    }
}