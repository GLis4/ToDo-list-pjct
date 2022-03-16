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
	
	public static void alterTask( int option, int idxAlter, String propertyToAlter) {
		
		switch(option) {
		case 1 :
			//description
			tskList.get(idxAlter).description = propertyToAlter;
			break;
		case 2 : 
			//priority
			tskList.get(idxAlter).priority = propertyToAlter;
			break;
		}
	}
	
	public static void alterStatus(int idxAlter, int status) {
		tskList.get(idxAlter).status = status;
	}
	
	public static void remTask(int idxRem) {
		tskList.remove(idxRem);	
	}
	
	public static void remAll(int idxRem) {
		tskList.removeAll(tskList);
	}
	
	
}
