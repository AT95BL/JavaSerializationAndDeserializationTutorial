import java.io.*;

public class Main implements Serializable
{
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
	   //					Steps to Deserialize
	   //					---------------------------------------------------------------
	   //					1. Your class should implement Serializable interface
	   //					2. add import java.io.Serializable;
	   //					3. FileInputStream fileIn = new FileInputStream(file path);
	   //					4. ObjectInputStream in = new ObjectInputStream(fileIn);
	   //					5. objectNam = (Class) in.readObject();
	   //					6. in.close(); fileIn.close();
	   //					---------------------------------------------------------------
	   
	   User user = null;
	   
	   try	
	   {
			FileInputStream fileIn = new FileInputStream("C:\\Users\\AT95\\OneDrive\\Desktop\\Java serialization and deserialization tutorial\\vol2\\UserInfo.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			user = (User)in.readObject();
			in.close();
			fileIn.close();
	   }
	   catch(IOException ex)
	   {
		   ex.printStackTrace();
	   }
	   catch (ClassNotFoundException ex) 
	   {
            ex.printStackTrace();
            System.err.println("Error during deserialization: " + ex.getMessage());
            return;
       }
	   
	   if (user != null) 
	   {
            System.out.println(user.name);
            System.out.println(user.password);
            user.sayHello();
			
			long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
			System.out.println("serialVersionUID: "+serialVersionUID);
       } 
	   else 
	   {
           System.err.println("Deserialization failed: User object is null.");
       }
	}
}