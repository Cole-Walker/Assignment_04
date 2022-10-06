package com.mycompany.assignment04_1;

class QNode 
{
    int key;
    QNode next;

    public QNode(int key)
    {
        this.key = key;
        this.next = null;
    }
}

class Queue 
{
    QNode front, rear;

    public Queue() { this.front = this.rear = null; }

    void enqueue(int key)
    {

        QNode temp = new QNode(key);

        if (this.rear == null) 
        {
            this.front = this.rear = temp;
            return;
        }

        this.rear.next = temp;
        this.rear = temp;
    }

    void dequeue()
    {

        if (this.front == null)
            return;

        QNode temp = this.front;
        this.front = this.front.next;

        if (this.front == null)
            this.rear = null;
    }
    
    int smallest(Queue q)
    {
        int temp1;
        while(q.front.next !=null)
        {
            temp1 = q.front.key;
            int temp2 = q.front.next.key;
            if(temp2<temp1)
            {
                q.enqueue(temp2);
                q.dequeue();
                if(q.front != q.rear)
                {
                    q.dequeue();
                }
                else break;
            }
            else if(temp1<temp2)
            {
                q.enqueue(temp1);
                q.dequeue();
                if(q.front != q.rear)
                {
                    q.dequeue();
                }
                else 
                {
                    break;
                }
            }
        }
        return q.front.key;
    }
}

public class Assignment04_1 
{
    public static void main(String[] args) 
    {
        Queue q = new Queue();
        q.enqueue(49);
        q.enqueue(25);
        q.enqueue(6);
        q.enqueue(1);
        q.enqueue(115);
        q.enqueue(326);

        System.out.println("Smallest Element in Queue is : " + q.smallest(q));
    }
}
