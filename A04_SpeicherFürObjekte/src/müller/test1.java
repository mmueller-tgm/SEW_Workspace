package m�ller;

import java.util.GregorianCalendar;

public class test1 {

	/**
	 * @param args
	 * @since 08. Okt. 2015
	 */
	public static void main(String[] args) {
		int i = 0;
		ObjektSpeicher<Sch�ler> sch�lerSpeicher = new ObjektSpeicher<Sch�ler>(5);

		sch�lerSpeicher.add(new Sch�ler("Max", "M�ller", "m", new GregorianCalendar(1998, 12-1, 23)), i++);
		sch�lerSpeicher.add(new Sch�ler("Maxi", "Mueller", "m", new GregorianCalendar(1998, 12-1, 23)), i++);
		sch�lerSpeicher.add(new Sch�ler("Maximilian", "M.", "m", new GregorianCalendar(1998, 12-1, 23)), i++);

		System.out.println(sch�lerSpeicher.toString());
	}
}