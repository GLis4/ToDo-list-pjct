import java.util.ArrayList;
import java.util.List;

public class ManipularTask {
	
	static List<Task> tskList = new ArrayList<>();
	
	
	public static void main(String[] args) {
		//tests
		Task tsk = new Task();

		tsk.description = "Buy 5 eggs";
		tsk.status = 1;
		tsk.priority = "low";	
		
		System.out.println(Util.formatarTarefa(tsk));
		
	}
	
	public static void addTask(String description, byte status, String priority) {
		
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
	
	public static void remTask(int idxRem) {
		tskList.remove(idxRem);
		
	}
	
	
}
