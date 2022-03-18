import java.util.ArrayList;
import java.util.List;

public class ManipularTask {
	static List<Task> tskList = new ArrayList<>();
	
	public static void main(String[] args) {
		//tests
		addTask("Buy eggs", 1, "low");
		System.out.println(Util.formatarListaTsk(tskList));
		alterStatus(0, 3);
	}
	
	public static void addTask(String description, int status, String priority) {
		
		Task tsk = new Task();
		tsk.description = description;
		tsk.status = status;
		tsk.priority = priority;
		tskList.add(tsk);
	}
	
	public static void alterTask( int atributoAlter, int idxAlter, String substituirAtributo) {
		
		switch(atributoAlter) {
		case 0 :
			//description
			tskList.get(idxAlter).description = substituirAtributo;
			break;
		case 1 : 
			//priority
			tskList.get(idxAlter).priority = substituirAtributo;
			break;
		}
	}
	
	public static void alterStatus(int idxAlter, int status) {
		tskList.get(idxAlter).status = status;
	}
	
	public static void remTask(int idxRem) {
		tskList.remove(idxRem);	
	}
	
	public static void remAll() {
		tskList.removeAll(tskList);
	}
	
	
}
