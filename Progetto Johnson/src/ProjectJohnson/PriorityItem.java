package ProjectJohnson;

public class PriorityItem<T>
{
    private T item ;
    private int priority ;
    private int pos ;

    public PriorityItem()
    {
    }

    public PriorityItem(T item)
    {
        this.setItem(item) ;
    }
    
    public PriorityItem(T item, int priority)
    {
        this.setItem(item) ;
        this.priority = priority ;
        this.pos = -1 ;
    }
    
    public PriorityItem(T item, int priority, int pos)
    {
        this.setItem(item) ;
        this.priority = priority ;
        this.pos = pos ;
    }
    
    public T getItem()
    {
        return this.item ;
    }
    
    public void setItem(T item)
    {
        this.item = item ;
    }
    
    public int getPriority() 
    {
        return this.priority ;
    }

    public void setPriority(int priority) 
    {
        this.priority = priority ;
    }
    
    public int getPos()
    {
        return this.pos ;
    }
    
    public void setPos(int pos)
    {
        this.pos = pos ;
    }
    
    @Override
    public boolean equals(Object obj) 
    {
        if(!this.getClass().equals(obj.getClass()))
        {
            return false ;
        }
        if(obj instanceof PriorityItem)
        {
            PriorityItem<Node> item = (PriorityItem<Node>) obj ;
            return this.item.equals(item.getItem()) ;
        }
        return false;
    }
    
}
