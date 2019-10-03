// This class implements the Queue
public class Queue<V> implements QueueInterface<V>{

    //TODO Complete the Queue implementation
    private NodeBase<V>[] queue;
    private int capacity, currentSize, front, rear;
	
    public Queue(int capacity) {    
        this.capacity=capacity;
        queue=new NodeBase[capacity];
        for(int i=0;i<capacity;i++){
            queue[i]=null;
        }
        /*front=0;
        rear=0;*/
        currentSize=0;
    }

    public int size() {
        int tempsize=0;
        for(int i=0;i<capacity;i++){
            if(queue[i]!=null){
                tempsize++;
            }
        }
        return tempsize;
    }

    public boolean isEmpty() {
        if(size()==0){
            return true;
        }
        else{
            return false;
        }
    }
	
    public boolean isFull() {
        if(size()==capacity){
            return true;
        }
        else{
            return false;
        }
    }

    public synchronized void enqueue(Node<V> node) {
        if(isFull()){
            return;
        }
        else{
            for(int i=0;i<capacity;i++){
                if(queue[i]==null){
                    queue[i]=node;
                    break;
                }
            }
            currentSize++; 
            /*if(rear<capacity)
            queue[rear]=node;
            rear++;           
            currentSize++;  
            }*/
        
    }
}

    public synchronized NodeBase<V> dequeue() {
        if(isEmpty()){
            return null;           
        }
        else{
            NodeBase<V> temp=null;
            for(int i=0;i<capacity;i++){
                if(queue[i]!=null){
                   temp=queue[i];
                    queue[i]=queue[currentSize-1];
                    queue[currentSize-1]=null;
                    currentSize--;
                    break;
                }
            }
            
            return temp;
            /*NodeBase<V> temp=queue[front];
            queue[front]=null;
            for(int i=0;i<rear-1;i++){

            }
            currentSize--;
            return temp;*/
        }
    }

}

