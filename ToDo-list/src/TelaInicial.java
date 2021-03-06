import java.util.Scanner;

public class TelaInicial {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		select();
	}

	public static void select(){

		try {
			int op = 1;
			while (op != 0) {
				System.out.println("Voce deseja. . .");
				System.out.println();
				System.out.println( "0.Sair \n" + 
						"1. Adicionar Tarefa\n" +
						"2. Consultar Tarefas\n" + 
						"3. Alterar Status\n" +
						"4. Alterar Tarefa\n"+
						"5. Remover Tarefa");

				op = Integer.parseInt(sc.nextLine());
				
				switch(op) {
				case 0:
					sc.close();
					break;
				
				case 1: 
					pedirDadosAddTarefa();
					break;
				case 2 : 
					System.out.println(Util.formatarListaTsk(ManipularTask.tskList));
					break;
				case 3: 
					pedirDadosAlterStatus();
					break;
				case 4 :
					pedirDadosAlter();
					break;
				case 5:
					pedirDadosRem();
					break;
					
				}
			}
		} catch (Exception e) {
			System.out.println("Erro... op?cao invalida");
		}
	}

	public static void pedirDadosAddTarefa() {

		System.out.println("Adicionar Tarefa. . .");
		System.out.println("descri?ao: ");
		String descricao = sc.nextLine();
		System.out.println("prioridade: (baixa, normal, alta)");
		String prioridade = sc.nextLine();
		ManipularTask.addTask(descricao, 1, prioridade );
		System.out.println("Tarefa adicionada com sucesso! ");
	}
	
	public static void pedirDadosAlterStatus() {
		
		System.out.println("Deseja atualizar o status de qual tarefa ? ");
		System.out.println(Util.formatarListaTsk(ManipularTask.tskList));
		int idxAlter = Integer.parseInt(sc.nextLine());
		System.out.println("Atualizar o status para: ");
		System.out.println("0. pendente\n1. andamento \n2. feito");
		int attStatus = Integer.parseInt(sc.nextLine());
		ManipularTask.alterStatus(idxAlter, attStatus);
		System.out.println("Tarefa Atualizada. . .");
	}
	
	public static void pedirDadosAlter(){
		System.out.println("Deseja alterar qual tarefa ? ");
		System.out.println(Util.formatarListaTsk(ManipularTask.tskList));
		int idxAlter = Integer.parseInt(sc.nextLine());
		System.out.println("Deseja alterar...");
		System.out.println("0. descri?ao\n 1.prioridade");
		int toAlter = Integer.parseInt(sc.nextLine());
		System.out.println("Deseja alterar para...");
		String atributoAtt = sc.nextLine();
		ManipularTask.alterTask(toAlter, idxAlter, atributoAtt);;
		System.out.println("Atributo atualizado. . .");
	}

	public static void pedirDadosRem() {
		System.out.println("Deseja... \n1.Remover uma Tarefa\n2.Limpar lista");
		int op = Integer.parseInt(sc.nextLine());
		
		switch(op) {
		
		case 1 : 
			System.out.println("Deseja remover item...");
			int idxRem = Integer.parseInt(sc.nextLine());
			ManipularTask.remTask(idxRem);
			break;
		case 2 :
			ManipularTask.remAll();
			System.out.println("lista limpa com sucesso");
			break;
		}
	}
}	
