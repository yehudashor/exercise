// interface Observer<T>  is generic interface for observable design pattern.
public interface Observer<T> extends IType {
    void update(T data);
}
