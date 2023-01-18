package com.javarush.task.task20.task2028;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
Построй дерево(1)
*/

public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {
    public CustomTree() {
        root = new Entry<String>("aa");
        listTree.add(root);
    }

    Entry root;
    ArrayList<Entry> listTree = new ArrayList();

    @Override
    public void add(int index, String element) {
        throw new UnsupportedOperationException();
    }
    @Override
    public boolean add(String elementName){
        for (Entry<String> element : listTree){
            if (element.availableToAddLeftChildren){
                Entry<String> newElement = new Entry<String>(elementName);
                newElement.parent = element;
                element.leftChild = newElement;
                element.availableToAddLeftChildren = false;
                listTree.add(newElement);
                return true;
            } else if (element.availableToAddRightChildren){
                Entry<String> newElement = new Entry<String>(elementName);
                newElement.parent = element;
                element.rightChild = newElement;
                element.availableToAddRightChildren = false;
                listTree.add(newElement);
                return true;
            }
        }
        return false;
    }

    @Override
    public String remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
    }
    @Override
    public String set(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        return listTree.size() - 1;
    }
    public String getParent(String s) {
        for (Entry<String> element : listTree){
            if (element.elementName != null) {
                if (element.elementName.equals(s)) {
                    if (element.parent.elementName != null) {
                        return element.parent.elementName;
                    } else {
                        return "у него совсем никого нет :\"(";
                    }
                }
            }
        }
        return null;
    }

    static class  Entry<T> implements Serializable{
        String elementName;
        boolean availableToAddLeftChildren, availableToAddRightChildren;
        Entry<T> parent, leftChild, rightChild;

        public boolean isAvailableToAddChildren(){
            return (availableToAddLeftChildren||availableToAddRightChildren);
        }
        public Entry(String elementName) {
            this.elementName = elementName;
            availableToAddLeftChildren = true;
            availableToAddRightChildren = true;
        }
    }
}
