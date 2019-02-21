
public class TesteConexao {

	public static void main(String[] args) {

		try (Conexao conexao = new Conexao() ) {
			conexao.leDados();
			
		}
		catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexão");
			
		}

		//------------------------------------------------------------------

		//Código legado

		Conexao con = null;

		try {
			con = new Conexao();
			con.leDados();
		}
		/*catch(IllegalStateException ex) {
			System.out.println("Legado: Deu erro na conexão");
		}*/
		finally {
			if(con != null) {
				con.fecha();
			}
		}
	}

}
