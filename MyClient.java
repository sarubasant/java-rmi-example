

import java.rmi.Naming;

public class MyClient {
	public static void main(String[] args) throws Exception {
		Adder a = (Adder) Naming.lookup("rmi://localhost:5000/rmiserver");
		int s=a.add(3,4);
		System.out.println("Sum="+s);
	}

}
