import java.io.*;
//					Steps to Serialize
//					---------------------------------------------------------------
//					1. Your class should implement Serializable interface
//					2. add import java.io.Serializable;
//					3. FileOutputStream fileOut = new FileOutputStream(file path)
//					4. ObjectOutputStream out = new ObjectOutputStream(fileOut);
//					5. out.writeObject(objectName)
//					6. out.close(); fileOut.close();
//					---------------------------------------------------------------


public class User implements Serializable
{
	 String name;
	 String password;
	
	public void sayHello()
	{
		System.out.println("Hello: " + this.name);
	}
}
/*
	Prilikom deserijalizacije sam imao problem.
	Elem, program je iz/prve uspjesno kompajliran ali 
	C:\Users\AT95\OneDrive\Desktop\Java serialization and deserialization tutorial\\User.java jeste 'public' za razliku od tekuce klase
	C:\Users\AT95\OneDrive\Desktop\Java serialization and deserialization tutorial\Deserialization\\User.java koja nije bila okarakterisana kao 'public'
	tako da prilikom pokretanja programa dobio sam Exception zbog nekompatibilnosti serijalizovane i deserijalizovane klase.
	
*/