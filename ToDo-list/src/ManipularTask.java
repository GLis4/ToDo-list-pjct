import java.util.ArrayList;
import java.util.List;

public class ManipularTask {
	
	List<Task> tskList = new ArrayList<>();
	
	
	public static void main(String[] args) {
		//tests
		Task tsk = new Task();

		tsk.description = "Buy 5 eggs";
		tsk.status = 1;
		tsk.priority = "low";	
		
		//System.out.println(tsk.calculateTaskAge()+ "\n" + tsk.description );
		System.out.println(Util.formatarTarefa(tsk));
		
	}
}
