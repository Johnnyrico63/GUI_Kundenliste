package comcave;

import java.io.*;
import java.util.*;

public class DateiManager 
{
	public static void csvSpeichern(File file)
	{
		try
		{
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			String text = "";
			for (Costumer costumer : Costumer.kdList)
			{
				text += costumer.getAnrede() + ",";
				text += costumer.getVorname() + ",";
				text += costumer.getNachname() + ",";
				text += costumer.getAnschrift() + ",";
				text += costumer.getPlz() + ",";
				text += costumer.getOrt() + ",";
				text += costumer.getNeukunde() + "\n";
			}
			bw.write(text);
			bw.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	public static boolean kundenSpeichern()
	{
		try 
		{
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("kunden.comcave"));
			oos.writeObject(Costumer.kdList);
			oos.close();
			return true;
		} 
		catch (Exception e2) 
		{
			e2.printStackTrace();
		}
		return false;
	}
	
	public static boolean kundenLaden()
	{
		try
		{
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("kunden.comcave"));
			Costumer.kdList = (ArrayList<Costumer>)ois.readObject();
			ois.close();
			return true;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return false;
	}
}
