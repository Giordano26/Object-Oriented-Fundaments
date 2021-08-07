/**
 * MediaAprovacao
 */
public class MediaAprovacao {
  // Método da lógica de controle
  public static void main(String[] args) { 
    // Lógica de modelo
    MediaAprovacao mv = new MediaAprovacao();
    //System.out.println("Invalido(5): " + mv.invalido(5)); 
   // mv.metodoCalcularMf(10, 10);
    // Lógica de interação
    //System.out.println(mv.metodoMostrar());
    System.out.println(mv.metodoMostrar());
  }

  // Variáveis de estado
  String info;
  boolean valido;
  double valor;

  // Método da lógica de aplicação
  void metodoCalcularMf(double p1, double p2) {
    metodoMediaFinal(p1, p2);
    metodoSituacao();
  }

  // Função da lógica de validação de domínio
  boolean invalido(double p) {
    if (p < 0 || 10 < p)
      return true;
    return false;
  }

  // Método da lógica de aplicação
  void metodoMediaFinal(double p1, double p2) {
    if (invalido(p1)) {
      info = "P1 nao eh valido";
      valido = false;
      return;
    }
    if (invalido(p2)) {
      info = "P2 nao eh valido";
      valido = false;
      return;
    }
    valido = true;

    valor = mediaFinal(p1, p2);
    System.out.println("metodoMediaFinal(10,10): " + valido);
  }

  // Função de cálculo da média final
  double mediaFinal( double p1, double p2 ) {
    return (p1+p2)/2.0;
  }

  // Método da lógica de aplicação
  void metodoSituacao() {
    if (valido) {
      if (valor < 5) {
        info = "REPROVADO";
      }
      if (valor >= 5) {
        info = "APROVADO";
      }
    }
  }

  // Método da Lógica de saída
  String metodoMostrar() {
    return "Situacao final= " + info + " (" + valor + ")";
  }



}