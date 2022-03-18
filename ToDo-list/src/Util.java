import java.util.List;

public class Util {

	
	public static String formatarTarefa(Task task) {
		String formT;
		formT =		task.id +"# Task."+
				" \n description	: " +  task.description +
				"\n status		: "+ devolverStatus(task.status) +
				"\n priority	: "+ task.priority +
				"\n task created in: " + task.calculateTaskAge();
				
		return formT;
	}
	
	public static String formatarListaTsk(List<Task> tsk) {
		String formT = "" ;
		int id = 0;
		for(Task task :  tsk) {
			formT += "\n" +	 (id += 1) +"# Task."+
					" \n descrição	: " +  task.description +
					"\n status		: "+ devolverStatus(task.status) +
					"\n prioridade	: "+ task.priority +
					"\n tarefa criada em : " + task.calculateTaskAge()+
					"\n";
		}
		return formT;
	}
	
	public static String devolverStatus(int status) {
		String ret = "";
		switch(status) {
		case 1 : 
			ret = "pendente";
			break;
		case 2 :
			ret = "andamento";
			break;
		case 3 :
			ret = "feito";
			break;
		}
		
		return ret;
	}
}
