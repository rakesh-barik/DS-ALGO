package javafunda;

/**
 * Created by rakesh.barik on 27-02-2016.
 */
public class CustomerNotFoundException extends Exception {
    String cid;
   public CustomerNotFoundException(){

    }

    public CustomerNotFoundException(String cid){
        this.cid = cid;
    }

    public String getMessage(){
        return "Customer not found with id" + cid;
    }
}
