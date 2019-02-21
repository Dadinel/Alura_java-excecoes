
public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100);

		SeguroDeVida seguro = new SeguroDeVida();
		AcaoBolsa acao = new AcaoBolsa();

		CalculadorDeImposto c = new CalculadorDeImposto();
		c.registra(cc);
		c.registra(seguro);
		c.registra(acao);

		System.out.println(c.getTotalImposto());
	}

}
