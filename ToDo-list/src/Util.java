
public class Util {

	
	public static String formatarTarefa(Task task) {
		String formT;
		formT =		task.id +"# Task."+
				" \n description	: " +  task.description +
				"\n status		: "+ devolverStatus(task) +
				"\n priority	: "+ task.priority +
				"\n task created in: " + task.calculateTaskAge();
				
		return formT;
	}
	
	public static String devolverStatus(Task task ) {
		
		switch(task.id) {
		
		case 1 : 
			return "pending";
		case 2 :
			return "doing";
		case 3 :
			return "done";
		
		}
		
		return "empty...";
	}
}
