package comcave;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.io.*;

import javax.accessibility.AccessibleContext;

public class Costumer implements Serializable
{
	Object anrede;
	String vorname, nachname, anschrift, plz, ort, telefon;
	AccessibleContext neukunde;
	
	public static ArrayList<Costumer> kdList = new ArrayList<Costumer>();
	
	public Costumer( Object anrede, String vorname, String nachname, String anschrift, String plz, String ort, String telefon, AccessibleContext neukunde)
	{
		this.anrede = anrede;
		this.vorname = vorname;
		this.nachname = nachname;
		this.anschrift = anschrift;
		this.plz = plz;
		this.ort = ort;
		this.telefon = telefon;
		this.neukunde = neukunde;
	}
	
	
	public Object getAnrede()
	{
		return anrede;
	}
	
	public void setAnrede(Object anrede)
	{
		this.anrede = anrede;
	}
	
	public String getVorname()
	{
		return vorname;
	}
	
	public void setVorname(String vorname)
	{
		this.vorname = vorname;
	}
	
	public String getNachname()
	{
		return nachname;
	}
	
	public void setNachname(String nachname)
	{
		this.nachname = nachname;
	}
	
	public String getAnschrift()
	{
		return anschrift;
	}
	
	public void setAnschrift(String anschrift)
	{
		this.anschrift = anschrift;
	}

	public String getPlz()
	{
		return plz;
	}
	
	public void setPlz(String plz)
	{
		this.plz = plz;
	}
	
	public String getOrt()
	{
		return ort;
	}
	
	public void setOrt(String ort)
	{
		this.ort = ort;
	}
	
	public String getTelefon()
	{
		return telefon;
	}
	
	public void setTelefon(String telefon)
	{
		this.telefon = telefon;
	}
	
	public AccessibleContext getNeukunde()
	{
		return neukunde;
	}
	
	public void setNeukunde(AccessibleContext neukunde)
	{
		this.neukunde = neukunde;
	}
}
