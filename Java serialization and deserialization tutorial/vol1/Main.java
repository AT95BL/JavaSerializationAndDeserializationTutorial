import java.io.*;

public class Main implements Serializable
{
	public static void main(String[] args)
	{
		/*
			searialVersionUID = serialVersionUID is a unique ID that functions like a version #
			verifies that the sender and receiver of a serialized object,
			have loaded classes for that object that match.
			Ensures object will be compatible between machines.
			Number must match otherwise this will cause a InvalidClassException.
			A SerialVersionUID will be calculated based on class properties, members
			A serializable class can declare its own serialVersionUID explicitly.
			
			Serialization = The process of converting an object into a byte stream.
			Persists (saves the state), the object after program exits.
			This byte stream can be saved as a file or sent over a network.
			Can be sent to a differenet machine.
			Byte stream can be saved as a file (.ser) which is platform independendent
			(Think of this as if you're saving a file with the object's informaction)
			Kada se program sa diska ucita u glavnu memoriju on postaje proces. Proces predstavlja totalno okruzenje u kojem se izvodi program, tj.
			datoteke&direktorijui pridruzene/i programu, memorija dodjeljena programu, processor threads i tome slicno.
			Serijalizacijom radimo SavePoint trenutnog stanja programa! Dakle, program tj. proces takav kakav je konvertuje se u niz bajtova i kao takav biva sacuvan
			negdje na nekoj sekundarnoj memoriji.
			
			Deserialization = The reverse process of converting a byte stream into an object.
			(Think of this as if you're loading a saved file)
		*/
		
		User user = new User();
		user.name = "Bro";
		user.password ="theloneliestsport";
		
		try 
		{
			FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(user);
			out.close();
			fileOut.close();
			System.out.println("Object info saved! ");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		//					Steps to Serialize
		//					---------------------------------------------------------------
		//					1. Your class should implement Serializable interface
		//					2. add import java.io.Serializable;
		//					3. FileOutputStream fileOut = new FileOutputStream(file path)
		//					4. ObjectOutputStream out = new ObjectOutputStream(fileOut);
		//					5. out.writeObject(objectName)
		//					6. out.close(); fileOut.close();
		//					---------------------------------------------------------------
	}
}