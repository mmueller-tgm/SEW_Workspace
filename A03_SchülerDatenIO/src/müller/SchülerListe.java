package m�ller;

/**
 * @author Maximilian
 * @version 17. Sep. 2015
 * 
 */
public class Sch�lerListe {
	int i = 0;
	Sch�ler[] sch�lerListe = new Sch�ler[0];

	/**
	 * @param l
	 * @param sch�lerListe
	 * @since 20. Sep. 2015
	 */
	public class Iterator implements Sch�lerIterator {
		public int i;
		public Sch�ler[] sch�lerListe;

		/**
		 * @param sch�lerListe
		 * @since 20. Sep. 2015
		 */
		public Iterator(Sch�ler[] sch�lerListe) {
			i = 0;
			this.sch�lerListe = sch�lerListe.clone();
		}

		/**
		 * 
		 * @return
		 * @since 20. Sep. 2015
		 */
		@Override
		public Sch�ler next() {
			Sch�ler s = sch�lerListe[i];
			i++;
			return s;
		}

		/**
		 * 
		 * @return
		 * @since 20. Sep. 2015
		 */
		@Override
		public boolean hasNext() {
			return i < sch�lerListe.length;
		}

	}

	/**
	 * 
	 * @param s
	 * @since 20. Sep. 2015
	 */
	public void add(Sch�ler s) {
		Sch�ler[] temp = new Sch�ler[sch�lerListe.length + 1];
		for (int i = 0; i < sch�lerListe.length; i++) {
			temp[i] = sch�lerListe[i];
		}
		temp[i++] = s;
		sch�lerListe = temp.clone();
	}

	/**
	 * @param s
	 * @since 20. Sep. 2015
	 */
	public void remove(Sch�ler s) {
		if (studentToIndex(s) != 0) {
			Sch�ler[] temp = new Sch�ler[sch�lerListe.length - 1];
			for (int i = 0; i < studentToIndex(s); i++) {
				temp[i] = sch�lerListe[i];
			}
			for (int i = studentToIndex(s) + 1; i < temp.length; i++) {
				temp[i] = sch�lerListe[i + 1];
			}
			sch�lerListe = temp.clone();
		}
	}

	/**
	 * @param s
	 * @return
	 * @since 20. Sep. 2015
	 */
	public int studentToIndex(Sch�ler s) {
		for (int i = 0; i < sch�lerListe.length; i++) {
			if (s.equals(sch�lerListe[i]))
				return i;
		}
		return -1;
	}

	/**
	 * @return
	 * @since 20. Sep. 2015
	 */
	public int anzahl() {
		return sch�lerListe.length;
	}

	/**
	 * @return
	 * @since 20. Sep. 2015
	 */
	public Iterator get() {
		return new Iterator(sch�lerListe);
	}
}
