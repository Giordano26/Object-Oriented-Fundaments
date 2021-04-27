import java.util.Scanner;

public class Temperatura {
    static double ST() {
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite a temperatura em °C: ");
      int t = Integer.parseInt(sc.nextLine());
      System.out.println("Digite a velocidade em m/s: ");
      int v = Integer.parseInt(sc.nextLine());
      sc.close();
      double ST;
      if((t > -60) && (t < 45)){
      ST = 33 + (10 * Math.sqrt(v) + 10.45 - v) * (t -33)/22;
      return ST;
      }
    else{
      throw new RuntimeException("Temperatura invalida = " + t);
    }
    }
  
  public static void main
  (String...ps) {
      System.out.printf("Sensação térmica de: %.1f°C\n",ST());
      }
    }