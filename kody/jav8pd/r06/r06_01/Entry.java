package r06.r06_01;

public class Entry<K, V> {
    private K klucz;
    private V wartoœæ;

    public Entry(K klucz, V wartoœæ) {
        this.klucz = klucz;
        this.wartoœæ = wartoœæ;
    }

    public K getKlucz() { return klucz; }
    public V getWartoœæ() { return wartoœæ; }
}
