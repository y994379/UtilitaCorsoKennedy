package com.itskennedy.corsoCloudDeveloper;

import javax.swing.JOptionPane;

public class Utils {

	/**
	 * torna true se l'utente preme SI
	 * 
	 * @param msg
	 * @return boolean se si
	 */
	public static boolean sceltaSiNo(String msg) {
		boolean risposta = false;

		int scelta=JOptionPane.showConfirmDialog(null
				, msg
				, "uscita"
				, JOptionPane.YES_NO_OPTION);
		
		if (JOptionPane.YES_OPTION == scelta) {
			risposta = true;
		}

		return risposta;
	}

	/**
	 * apre un dialog che visualizza l'eccezione
	 * @param e
	 */
	public static void msgBox(Exception e) {
		JOptionPane.showMessageDialog(null, "Errore:"+e.getMessage()
		, "Applicazione", JOptionPane.ERROR_MESSAGE);
		e.printStackTrace();
	}
}
