package r06.r06_01;

public class Entry<K, V> {
    private K klucz;
    private V warto��;

    public Entry(K klucz, V warto��) {
        this.klucz = klucz;
        this.warto�� = warto��;
    }

    public K getKlucz() { return klucz; }
    public V getWarto��() { return warto��; }
}
