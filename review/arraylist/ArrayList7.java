public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable {
    /**
     * <p>The <tt>size</tt>, <tt>isEmpty</tt>, <tt>get</tt>, <tt>set</tt>,
     * <tt>iterator</tt>, and <tt>listIterator</tt> operations run in constant
     * time.  The <tt>add</tt> operation runs in <i>amortized constant time</i>,
     * that is, adding n elements requires O(n) time.  All of the other operations
     * run in linear time (roughly speaking).  The constant factor is low compared
     * to that for the <tt>LinkedList</tt> implementation.
     *
     * <p>Each <tt>ArrayList</tt> instance has a <i>capacity</i>.  The capacity is
     * the size of the array used to store the elements in the list.  It is always
     * at least as large as the list size.  As elements are added to an ArrayList,
     * its capacity grows automatically.  The details of the growth policy are not
     * specified beyond the fact that adding an element has constant amortized
     * time cost.
     *
     * <p>An application can increase the capacity of an <tt>ArrayList</tt> instance
     * before adding a large number of elements using the <tt>ensureCapacity</tt>
     * operation.  This may reduce the amount of incremental reallocation.
     */

    private static final long serialVersionUID = 8683452581122892189L;

    /**
     * Appends the specified element to the end of this list.
     *
     * @param e element to be appended to this list
     * @return <tt>true</tt> (as specified by {@link Collection#add})
     */
    public boolean add(E e) {
        ensureCapacity(size + 1);  // Increments modCount!!
        elementData[size++] = e;
        return true;
    }

    /**
     * Increases the capacity of this <tt>ArrayList</tt> instance, if
     * necessary, to ensure that it can hold at least the number of elements
     * specified by the minimum capacity argument.
     *
     * @param minCapacity the desired minimum capacity
     */
    public void ensureCapacity(int minCapacity) {
        modCount++;
        // overflow-conscious code
        if (minCapacity - elementData.length > 0)
            grow(minCapacity);
    }

    /**
     * Increases the capacity to ensure that it can hold at least the
     * number of elements specified by the minimum capacity argument.
     *
     * @param minCapacity the desired minimum capacity
     */
    private void grow(int minCapacity) {
        // overflow-conscious code
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        if (newCapacity - MAX_ARRAY_SIZE > 0)
            newCapacity = hugeCapacity(minCapacity);
        // minCapacity is usually close to size, so this is a win:
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

}