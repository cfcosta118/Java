package basico;

public class ConcatenaString {

	public static void main(String[] args) {
		String primeiroNome = "Carol";
		String segundoNome = "&";
		String terceiroNome = "Léo";
		String divisor = "-";
		String nome = primeiroNome + divisor + segundoNome + divisor + terceiroNome;
		System.out.println("Nome = " + nome);
	}

}
