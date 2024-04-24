package behavioural_design_patterns.iterator;

public interface Aggregrate<T> {
    Iterator<T> createIterator();
}
