package pendu_tcp.util;

import java.util.TreeMap;

public class ConstantUtil {
	
	public static final String HOST = "127.0.0.1";
	public static final int PORT = 12345;
	
	public static final String SERVER_ON = "SERVEUR EN-LINE SUR LA PORTE ";
	public static final String CLIENT_ON = "CLIENT CONNECTÉ SUR ";
	public static final String CLIENT_OFF = "CLIENT DÉCONNECTÉ SUR ";
	
	public static final String VICTORY = "VICTOIRE";
	public static final String FAILURE = "ECHEC";

	public static final String MSG_WIN = "VOUS AVEZ GAGNÉ.";
	public static final String MSG_LOSE = "VOUS AVEZ PERDU.";
	
	public static final String LUNDI = "Lundi";
	public static final String MARDI = "Mardi";
	public static final String MERCREDI = "Mercredi";
	public static final String JEUDI = "Jeudi";
	public static final String VENDREDI = "Vendredi";
	public static final String SAMEDI = "Samedi";
	public static final String DIMANCHE = "Dimanche";
	
	public static final String JANVIER = "Janvier";
	public static final String FEVRIER = "Fevrier";
	public static final String MARS = "Mars";
	public static final String AVRIL = "Avril";
	public static final String MAI = "Mai";
	public static final String JUIN = "Juin";
	public static final String JUILLET = "Juillet";
	public static final String AOUT = "Aout";
	public static final String SEPTEMBRE = "Septembre";	
	public static final String OCTOBRE = "Octobre";
	public static final String NOVEMBRE = "Novembre";
	public static final String DECEMBRE = "Decembre";
	
	public static TreeMap<Integer,String> dayOfWeek = new TreeMap<Integer,String>();
	public static TreeMap<Integer,String> monthOfYear = new TreeMap<Integer,String>();
	
	static {
		dayOfWeek.put(1, DIMANCHE);
		dayOfWeek.put(2, LUNDI);
		dayOfWeek.put(3, MARDI);
		dayOfWeek.put(4, MERCREDI);
		dayOfWeek.put(5, JEUDI);
		dayOfWeek.put(6, VENDREDI);
		dayOfWeek.put(7, SAMEDI);
		
		monthOfYear.put(0, JANVIER);
		monthOfYear.put(1, FEVRIER);
		monthOfYear.put(2, MARS);
		monthOfYear.put(3, AVRIL);
		monthOfYear.put(4, MAI);
		monthOfYear.put(5, JUIN);
		monthOfYear.put(6, JUILLET);
		monthOfYear.put(7, AOUT);
		monthOfYear.put(8, SEPTEMBRE);
		monthOfYear.put(9, OCTOBRE);
		monthOfYear.put(10, NOVEMBRE);
		monthOfYear.put(11, DECEMBRE);
	}
	

}
