package deserializer;
import java.io.*; 

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		//Please pay attention to packages
		//10:45:34
		
		User user = null; 
		
		FileInputStream fileIn = new FileInputStream("\\Userinfo.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn); 
		user = (User) in.readObject(); 
		in.close(); 
		fileIn.close(); 
		
		System.out.println(user.name); 
		System.out.println(user.password); 
		user.sayHello();
	}

}
