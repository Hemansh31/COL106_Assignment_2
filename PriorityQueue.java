
public class PriorityQueue<V> implements QueueInterface<V>{

    private NodeBase<V>[] queue;
    private int capacity;
    private int currentSize;
	
    //TODO Complete the Priority Queue implementation
    // You may create other member variables/ methods if required.
    public PriorityQueue(int capacity) {    
        this.capacity=capacity;
        queue=new NodeBase[capacity];
        for(int i=0;i<capacity;i++){
            queue[i]=null;
        }
        /*currentSize=0;*/
    }

    public int size() {
        int tempsize=0;
        for(int i=0;i<capacity;i++){
            if(queue[i]!=null){
                tempsize++;
            }
        }
        //currentSize=tempsize;
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

    public void enqueue(Node<V> node) { 
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
        }
    }

    // In case of priority queue, the dequeue() should 
    // always remove the element with minimum priority value
    public NodeBase<V> dequeue() {
        /* if(currentSize!=0){
            int prioritytoprint=queue[0].getPriority();
            int priorityindex=0;
            for(int i=0;i<currentSize;i++){
                if(queue[i].getPriority()<prioritytoprint){
                    prioritytoprint=queue[i].getPriority();
                    priorityindex=i;
                }
            }
            NodeBase<V> answer=queue[priorityindex];
            queue[priorityindex]=null;
            for(int i=priorityindex;i<currentSize-1;i++){
                queue[i]=queue[i+1];
            }           
            currentSize=currentSize-1;
            return answer;
        }
        else{
            return null;
        }*/
        if(isEmpty()){
            return null;
        }
        else{
            int prioritytoprint=0;
            int priorityindex=0;
            for(int i=0;i<capacity;i++){
                if(queue[i]!=null){
                    prioritytoprint=queue[i].getPriority();
                    priorityindex=i;
                    break;
                }
            }
            for(int i=0;i<capacity;i++){
                if(queue[i]!=null){
                    if(queue[i].getPriority()<prioritytoprint){
                        prioritytoprint=queue[i].getPriority();
                        priorityindex=i;
                    }
                }
            }
            NodeBase<V> answer=queue[priorityindex];
            queue[priorityindex]=queue[currentSize-1];
            queue[currentSize-1]=null;
            currentSize--;
            return answer;
        }
    }
    public void add(int prioritytoadd,V valuetoadd){
        Node<V> addthis=new Node<V>(prioritytoadd,valuetoadd);
        enqueue(addthis);
    }
    public NodeBase<V> removeMin(){
        return dequeue();
    }
    public void display () {
	if (this.isEmpty()) {
            System.out.println("Queue is empty");
	}
	for(int i=0; i<currentSize; i++) {
            queue[i+1].show();
	}
    }
}

