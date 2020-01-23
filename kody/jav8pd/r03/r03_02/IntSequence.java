package r03.r03_02;

public interface IntSequence {
    default boolean hasNext() { return true; };
    int next();
}