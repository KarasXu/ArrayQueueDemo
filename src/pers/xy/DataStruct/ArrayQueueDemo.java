package pers.xy.DataStruct;

public class ArrayQueueDemo
{
    public static void main(String[] args) {

    }
}

//试用数组模拟队列
class ArrayQueue
{
    private int maxSize;        //表示数组最大容量
    private int front;          //队列头
    private int rear;           //队列尾
    private int[] arr;          //该数组用于存放数据

    //创建队列构造器
    public ArrayQueue(int arrMaxSize)
    {
        maxSize = arrMaxSize;
        arr = new int[maxSize];
        front = -1;             //指向队列头部，指向队列头的前一个位置
        rear = -1;              //指向队列尾部，指向队列尾的数据（包含队列最后一个数据）
    }

    //判断队列是否满
    public boolean isFull()
    {
        return rear == maxSize - 1;
    }

    //判断队列是否为空
    public boolean isEmpty()
    {
        return rear == front;
    }

    //添加数据到队列
    public void addQueue(int n)
    {
        if (isFull())
        {
            System.out.println("队列满，无法加入数据");
            return;
        }
        rear++;                //让rear后移
        arr[rear] = n;
    }

    //获取队列的数据，出队列
    public int getQueue()
    {
        if (isEmpty())
        {
            throw new RuntimeException("队列空，不能读取数据");
        }
        front++;
        return arr[front];
    }

    //显示队列所有数据
    public void showQueue()
    {
        if (isEmpty())
        {

        }
    }
}
