/**
 * 
 */
package m�ller;

import java.util.ArrayList;

/**
 * @author Maximilian
 * @version 08. Okt. 2015
 * 
 */
public class test1 {

	/**
	 * @param args
	 * @since 08. Okt. 2015
	 */
	public static void main(String[] args) {
		ArrayList<Sch�ler> li = Sch�lerIO.lesen("sch�lerListeIn.txt");
		Sch�lerIO.schreiben(li, "sch�lerListeOut.txt");
		for (Sch�ler sch�ler : li) {
			System.out.println(sch�ler.toString());
		}
	}

}
