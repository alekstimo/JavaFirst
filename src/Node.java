public class Node<T> {
    private Node next;
    private T data;

    public Node(){ //конструктор по умолчанию для элемента
        this.next=null;

    }
    public Node(T e){
        this.next=null;
        this.data=e;
    }

    public Node getNext(){ //получение указателя на следующий
        return next;
    }

    public void setNext(Node next){ //добавление после элемента
        this.next=next;
    }

    public T getData(){
        return data;
    }
    public void setData(T data){
        this.data=data;
    }
    public boolean equals(Object obj) {
        return data.equals(obj);
    }
}
