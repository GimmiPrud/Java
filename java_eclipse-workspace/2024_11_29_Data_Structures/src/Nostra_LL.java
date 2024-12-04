
// facciamo la nostra implementazione della Linkedlist
public class Nostra_LL<T> {
	T data;
	Nostra_LL<T> Next;
	// sopra abbiamo creato una lista con un oggetto data ed il contatore all'oggetto successivo next.
	
	
	private Nostra_LL<T> first;

	public Nostra_LL() {
		first = null;
	}

	void addFirst(T info) {
		Nostra_LL<T> l = new Nostra_LL<T>();
		l.data = info;
		l.Next = null;

		if (first == null) {
			// la lista è vuota
			first = l;
		} else {
			l.Next = first;
			first = l;
		}
	}

	void addLast(T info) {
		Nostra_LL<T> l = new Nostra_LL<T>();
		l.data = info;
		l.Next = null;
		if (first == null) {
			first = l;
		} else {
			if (Next == null) {
				Next = l;
			} else {
				while (Next.Next != null) {
					Next = Next.Next;
				}
				Next.Next = l;
			}
		}
	}

}
