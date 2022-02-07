package ZMyOwnClass.Queue;

class Queue {

    char q[];  // tablica przechowujaca kolejkę
    int putloc, getloc; // indeksy operacji get i put

    Queue(int size) {
        q = new char[size];  // przydziela pamięć kolejce
        putloc = getloc = 0;
    }

    // wstawia znak do kolejki
    public void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" -- Kolejka pełna");
            return;
        }
        q[putloc++] = ch;
    }

    // pobiera znak z kolejki

    public char get() {
        if (getloc == putloc) {
            System.out.println("-- Kolejka pusta");
            return (char) 0;
        }
        return q[getloc++];
    }

}



