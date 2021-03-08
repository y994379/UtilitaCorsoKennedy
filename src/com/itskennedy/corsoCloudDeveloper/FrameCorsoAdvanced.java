package com.itskennedy.corsoCloudDeveloper;


import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.awt.Window;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FrameCorsoAdvanced extends JFrame {

	//COSTRUTTORE SENZA PARAMETRI
	public FrameCorsoAdvanced(){
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setLocation(200, 200);
		this.setSize(400,300);
		this.setTitle("titolo");
		WinListener wl = new WinListener();
		this.addWindowListener(wl);
		this.setVisible(true);
	}
	//COSTRUTTORE A 1 PARAMETRO CHE SETTA IL TITOLO DELLA FINESTRA CON LA STRINGA PASSATA
	public FrameCorsoAdvanced(String titolo) {
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setLocation(200, 200);
		this.setSize(400,300);
		this.setTitle(titolo);
		WinListener wl = new WinListener();
		this.addWindowListener(wl);
		this.setVisible(true);	
	}
	
}
	class WinListener implements WindowListener{
	
		@Override
		//APRE LA FINESTRA ALLE COORDINATE DELL'ULTIMA CHIUSURA
		public void windowOpened(WindowEvent e) {
			File f = new File("C:/position.txt");
			if(f.exists()) {
			Scanner in;
			try {
				in = new Scanner(f);
				String position= in.nextLine();
				String[] coordinata = position.split(" ");
				FrameCorsoAdvanced frameHandle= (FrameCorsoAdvanced)e.getSource();				
				//System.out.println(coordinata[0]+" "+coordinata[1] );
				frameHandle.setLocation(Integer.parseInt(coordinata[0]),Integer.parseInt(coordinata[1]));
				} catch (FileNotFoundException ex) {
					System.err.println("File non trovato");
					ex.printStackTrace();
				}
			}
		}
		
		@Override
		//SALVA LE COORDINATE SU FILE ALLA CHIUSURA DELLA FINESTRA TRAMITE BUTTON
		public void windowClosed(WindowEvent e) {
			File file = new File("C:/position.txt"); 			// crea un riferimento al file fisico
			PrintWriter out;
			try {
				out = new PrintWriter(file);					// si aggancia al file per scrivere
				
				FrameCorsoAdvanced frameHandle = (FrameCorsoAdvanced)e.getSource();				
				
				out.println(frameHandle.getX() + " " + frameHandle.getY());	//scrive le coordinate separate da uno spazio
				//System.out.println(frameHandle.getX() + " " + frameHandle.getY());
				out.close();
			} catch (FileNotFoundException ex) {
				System.err.println("File non trovato");
				ex.printStackTrace();
			} 
		}
		
		@Override
		//SALVA LE COORDINATE SU FILE ALLA CHIUSURA DELLA FINESTRA TRAMITE IL PULSANTE X DELLA FINESTRA
		public void windowClosing(WindowEvent e) {
			File file = new File("C:/position.txt"); 			// crea un riferimento al file fisico
			PrintWriter out;
			try {
				out = new PrintWriter(file);					// si aggancia al file per scrivere
				
				FrameCorsoAdvanced frameHandle = (FrameCorsoAdvanced)e.getSource();				
				
				out.println(frameHandle.getX() + " " + frameHandle.getY());	//scrive le coordinate separate da uno spazio
				//System.out.println(frameHandle.getX() + " " + frameHandle.getY());
				out.close();
			} catch (FileNotFoundException ex) {
				System.err.println("File non trovato");
				ex.printStackTrace();
			} 
			JOptionPane p= new JOptionPane();
			int scelta= p.showConfirmDialog(null,"Vuoi uscire?", "USCIRE?", JOptionPane.YES_NO_OPTION);
			
			if(JOptionPane.YES_OPTION == scelta)
				System.exit(0);
		}	
		@Override
		public void windowActivated(WindowEvent arg0) {}
	
		@Override
		public void windowDeactivated(WindowEvent arg0) {}
	
		@Override
		public void windowDeiconified(WindowEvent arg0) {}
	
		@Override
		public void windowIconified(WindowEvent arg0) {}


}
