package m�ller;

/**
 * 
 * @author Maximilian
 * @version 24. Sep. 2015
 *
 */
public class Sch�lerTest {
	
	/**
	 * 
	 * @param args
	 * @since 24. Sep. 2015
	 */
	public static void main(String[] args) {
		Sch�lerListe li = new Sch�lerListe();
		li = Sch�lerIO.lesen("sch�lerListeIn.txt");
		Sch�lerIterator si = li.get();
		Sch�lerIO.schreiben(li, "sch�lerListeOut.txt");
		while(si.hasNext())System.out.println(si.next().toString());
		si = li.get();
	}
}
