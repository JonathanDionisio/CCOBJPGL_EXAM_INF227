public class NationalM implements Locations{
    

    int airFare =600;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
        
        
    }
    

    
}
