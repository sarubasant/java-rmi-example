

import java.rmi.Naming;

public class MyServer {

	public static void main(String[] args) {
		
		try
		{
			Adder adderobject = new AdderRemote();
			Naming.rebind("rmi://localhost:5000/rmiserver", adderobject);
			
		}
catch (Exception e) {
	
	System.out.println(e);
}
	}

}
