

public class Person  {
    String name;
    String address;

    Person(String name,String address) {
        this.name=  name;
        this.address = address;

    }
    
    String getName() {
        return this.name ;
    }
    
    String getAddress() {
        return this.address ;
    }

    void setAdddress(String address) {
        this.address = address;
    }

    String getData() {
        return this.name+"("+this.address+")";
    }
}
