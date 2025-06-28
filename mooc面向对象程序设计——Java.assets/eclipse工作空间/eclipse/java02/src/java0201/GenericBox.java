package java0201;
//·ºĞÍÀà
public class GenericBox<T> {
	private T t;
	 
    public void set(T t) {
        this.t = t;
    }
 
    public T get() {
        return t;
    }
}
