package com.itskennedy.corsoCloudDeveloper;

import java.text.SimpleDateFormat;

public class DateUtils {
	public static final SimpleDateFormat SDF_ANNO_MESE_GIORNO = new SimpleDateFormat("dd/MMM/yyyy");
	public static final SimpleDateFormat SDF_SETTIMANA_ANNO_MESE_GIORNO = new SimpleDateFormat("EEE dd/MMM/yyyy");
	public static final SimpleDateFormat SDF_ANNO_MESE_GIORNO_ORE_MINUTI_SECONDI = new SimpleDateFormat("dd/MMM/yyyy hh:mm:ss");
	public static final SimpleDateFormat SDF_ORE_MINUTI_SECONDI = new SimpleDateFormat("hh:mm:ss");
	public static final SimpleDateFormat SDF_MINUTI_SECONDI_MILLISECONDI = new SimpleDateFormat("mm:ss:SSS");
	public static final SimpleDateFormat SDF_MINUTI_SECONDI_MILLISECONDI_PARLANTE  = new SimpleDateFormat("mm 'minuti' ss 'secondi' SSS 'milli'");

}
