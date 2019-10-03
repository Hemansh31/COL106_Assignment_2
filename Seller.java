import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Seller<V> extends SellerBase<V> {
	
    public Seller (int sleepTime, int catalogSize, Lock lock, Condition full, Condition empty, PriorityQueue<V> catalog, Queue<V> inventory) {
        //TODO Complete the constructor method by initializing the attibutes
        // ...
        this.catalog=catalog;
        this.lock=lock;
        this.full=full;
        this.empty=empty;
        this.inventory=inventory;
        this.setSleepTime(sleepTime);
    }
    
    public void sell() throws InterruptedException {
	try {
            //TODO Complete the try block for produce method
            // ...
        lock.lock();
         while(catalog.isFull()){
            full.await();
          }
          if(inventory.size()!=0){
            NodeBase<V> n=inventory.dequeue();
            catalog.enqueue((Node<V>)n);
            empty.signalAll();
        }
	} catch(Exception e) {
            e.printStackTrace();
	} finally {
            //TODO Complete this block
         lock.unlock();
	}		
    }
}
