package collection;
import java.util.Arrays;
public class list<Ele> {
	 private int size = 0;
	    private static final int CAPACITY = 10;
	    private Object elements[];
	    public list() {
	        elements = new Object[CAPACITY];
	    }
	 
	    //Add method
	    public void addele(Ele e) {
	        if (size == elements.length) {
	            ensureCapacity();
	        }
	        elements[size++] = e;
	    }
	     
	    //Get method
	    @SuppressWarnings("unchecked")
	    public Ele getele(int i) {
	        if (i >= size || i < 0) {
	            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
	        }
	        return (Ele) elements[i];
	    }
	     
	    //Remove method
	    @SuppressWarnings("unchecked")
	    public Ele removeele(int i) {
	        if (i >= size || i < 0) {
	            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
	        }
	        Object item = elements[i];
	        int numElts = elements.length - ( i + 1 ) ;
	        System.arraycopy( elements, i + 1, elements, i, numElts ) ;
	        size--;
	        return (Ele) item;
	    }
	     
	    //Get Size of list
	    public int size() {
	        return size;
	    }
	    @Override
	    public String toString() 
	    {
	         StringBuilder sb = new StringBuilder();
	         sb.append('[');
	         for(int i = 0; i < size ;i++) {
	             sb.append(elements[i].toString());
	             if(i<size-1){
	                 sb.append(",");
	             }
	         }
	         sb.append(']');
	         return sb.toString();
	    }
	     
	    private void ensureCapacity() {
	        int newSize = elements.length * 2;
	        elements = Arrays.copyOf(elements, newSize);
	    }
	}
	


