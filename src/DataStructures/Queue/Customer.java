package DataStructures.Queue;

public class Customer {
    /**
     * Implements the queue interface
     * */
    private boolean hasBeenServed;
    private String name;

    public Customer(String name){
        hasBeenServed = false;
        this.name = name;
    }

    public void serve(){
        hasBeenServed = true;
        System.out.println(name+" has been served");
    }

    @Override
    public String toString(){
        return name;
    }
}
