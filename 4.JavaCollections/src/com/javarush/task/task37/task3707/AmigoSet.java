package com.javarush.task.task37.task3707;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class AmigoSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, Serializable {
    private static final Object PRESENT = new Object();
    private transient HashMap<E, Object> map;

    public AmigoSet() {
        this.map = new HashMap<>();
    }

    public AmigoSet(Collection<? extends E> collection) {
        this.map = new HashMap<>(Math.max((int) (collection.size() / .75f) + 1, 16));
        addAll(collection);
    }

    public boolean add(E e) {
        return map.put(e, PRESENT) == null;
    }

    @Override
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean contains(Object o) {
        return super.contains(o);
    }

    @Override
    public boolean remove(Object o) {
         if (map.remove(o) == null) return false;
         else return true;
    }

    @Override
    public AmigoSet<E> clone() {
        try {
            AmigoSet<E> amigoSetnew = (AmigoSet<E>) super.clone();
            amigoSetnew.map = (HashMap<E, Object>) this.map.clone();

            return amigoSetnew;

        }
        catch (Exception e) {
            throw new InternalError(e);
        }
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    private void writeObject(ObjectOutputStream objectOutputStream){
        try {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeInt(HashMapReflectionHelper.<Integer>callHiddenMethod(map, "capacity"));
            objectOutputStream.writeFloat(HashMapReflectionHelper.<Float>callHiddenMethod(map, "loadFactor"));
            objectOutputStream.writeInt(map.size());
            for (E e : map.keySet()){
                objectOutputStream.writeObject(e);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int capacity = objectInputStream.readInt();
        float loadFactor = objectInputStream.readFloat();
        int size = objectInputStream.readInt();
        map = new HashMap <>(capacity, loadFactor);
        for (int i = 0; i < size; i++){
            E e = (E) objectInputStream.readObject();
            map.put(e, PRESENT);
        }
    }

}
