package comcave;

import java.awt.event.*;
import java.util.ArrayList;

public class Click implements ActionListener
{
	Window w;
	
	public Click(Window w)
	{
		this.w = w;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(w.btnSpeichern))
		{		
			Costumer.kdList.add(new Costumer (
									w.cbAnrede.getSelectedItem(), 
									w.tfVorname.getText(),
									w.tfNachname.getText(),
									w.tfAnschrift.getText(),
									w.tfPlz.getText(),
									w.tfOrt.getText(),
									w.tfTelefon.getText(),
									w.cbxNeukunde.getAccessibleContext()
								));
		}
		else if (e.getSource().equals(w.btnShowKunde))
		{
			w.taKundenAnzeige.setText(""); // TextArea leeren
			String text = "";
			for( Costumer costumer : Costumer.kdList)
			{
				text += costumer.getAnrede() + "\t" + costumer.getVorname() + "\t" + costumer.getNachname() + "\n";
			}
			w.taKundenAnzeige.setText(text);
			
		}
	}

}
