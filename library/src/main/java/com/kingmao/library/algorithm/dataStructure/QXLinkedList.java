package com.kingmao.library.algorithm.dataStructure;

import java.util.*;

/**
 * @author qinxuan
 * @date 2020/3/18
 */
public class QXLinkedList <E>
        extends AbstractSequentialList<E>
        implements List<E>, Deque<E>, Cloneable, java.io.Serializable {


    /**
     * transient 不被序列化
     */
    transient int size = 0;

    /**
     * 第一个节点
     */
    transient Node<E> first;

    /**
     * 最后一个节点
     */
    transient Node<E> last;

    /**
     * 无参构造
     */
    QXLinkedList(){

    }


    /**
     * 如果链表为空时，代码是否能正常工作？
     * 如果链表只包含一个结点时，代码是否能正常工作？
     * 如果链表只包含两个结点时，代码是否能正常工作？
     * 代码逻辑在处理头结点和尾结点的时候，是否能正常工作？
     */

    /**
     * 将节点添加在首位
     * @param e
     */
    private void linkFirst(E e) {
        final Node<E> f = first;
        final Node<E> newNode = new Node<E>(null,e,f);
        first = newNode;
        if (f == null)
            last = newNode;
        else
            f.prev = newNode;
        size++;
        modCount++;
    }

    /**
     * 将节点添加在末尾
     * @param e
     */
    void linkLast(E e){
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l,e,null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
        modCount++;
    }

    /**
     * succ 是否为首节点
     * @param e
     * @param succ
     */
    void linkBefore(E e, Node<E> succ) {
        final Node<E> pre = succ.prev;
        final Node<E> newNode = new Node<>(pre,e,succ);
        succ.next = newNode;
        if (pre == null)
            first = newNode;
        else
            pre.next = newNode;
        size++;
        modCount++;
    }

    private E unlinkFirst(Node<E> f) {
        return null;
    }


    /**
     * 内部类Node
     * @param <E>
     */
    private static class Node<E>{
        E item;
        Node<E> prev;
        Node<E> next;

        /**
         * 无参构造
         * @param prev
         * @param element
         * @param next
         */
        Node(Node<E> prev,E element,Node<E> next){
            this.prev = prev;
            this.item = element;
            this.next = next;
        }
    }

    public ListIterator<E> listIterator(int index) {
        return null;
    }

    public int size() {
        return size;
    }

    public void addFirst(E e) {

    }

    public void addLast(E e) {

    }

    public boolean offerFirst(E e) {
        return false;
    }

    public boolean offerLast(E e) {
        return false;
    }

    public E removeFirst() {
        return null;
    }

    public E removeLast() {
        return null;
    }

    public E pollFirst() {
        return null;
    }

    public E pollLast() {
        return null;
    }

    public E getFirst() {
        return null;
    }

    public E getLast() {
        return null;
    }

    public E peekFirst() {
        return null;
    }

    public E peekLast() {
        return null;
    }

    public boolean removeFirstOccurrence(Object o) {
        return false;
    }

    public boolean removeLastOccurrence(Object o) {
        return false;
    }

    public boolean offer(E e) {
        return false;
    }

    public E remove() {
        return null;
    }

    public E poll() {
        return null;
    }

    public E element() {
        return null;
    }

    public E peek() {
        return null;
    }

    public void push(E e) {

    }

    public E pop() {
        return null;
    }

    public Iterator<E> descendingIterator() {
        return null;
    }
}
