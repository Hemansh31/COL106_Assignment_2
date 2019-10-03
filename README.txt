---------------------------README FOR ASSIGNMENT 2-----------------------------
The TODO parts of the code were completed by me
--------------------------NODE.JAVA------------------------------------------
getPriority(){
  //This function returns the priority of the item in node.
}
getValue(){
 //This function returns the value of the item in the node.
}
-----------------------------QUEUE.JAVA--------------------------------------
size(){
 //This function returns the currentsize of the queue.
}
isEmpty(){
 //This function checks whether queue is empty and returns a boolean.
}
isFull(){
 //This function checks if currentsize of queue is equal to the capacity.
}
enqueue(){
 //This function adds node to the end of queue
}
dequeue(){
 //This function removes node from front and shifts the entire queue
}
-----------------------------PRIORITYQUEUE.JAVA-------------------------------
size(){
 //This function returns the currentsize of the queue.
}
isEmpty(){
 //This function checks whether queue is empty and returns a boolean.
}
isFull(){
 //This function checks if currentsize of queue is equal to the capacity.
}
enqueue(){
 //This function adds node to the end of queue only if queue is not full
}
dequeue(){
 //This function removes nodes with highest priority and shifts the entire queue
}
------------------------------SELLER.JAVA-------------------------------------
sell(){
try{
 /*first the thread acquires the lock
 then the thread checks if catalog is full
 if its full the thread awaits loosing the lock
 else it dequeues items from inventory and enqueues it to the catalog 
 if the inventory is not empty and signals all threads in buy function that
 were waiting because the catalog was empty*/
}
catch{
 //catches the exception
}
finally{
 //looses the lock acquired by the thread
}
}
-----------------------------BUYER.JAVA----------------------------------------
buy(){
try{
 /*first the thread acquires the lock
 then the thread checks if catalog is empty
 if its empty the thread awaits loosing the lock
 else it dequeues items from queue and signals all threads in sell function that
 were waiting because the catalog was full*/
}
catch{
 //catches the exception
}
finally{
 //looses the lock acquired by the thread
}

}