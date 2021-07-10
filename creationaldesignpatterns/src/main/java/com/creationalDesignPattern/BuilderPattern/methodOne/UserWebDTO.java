package creationalDesignPattern.BuilderPattern.methodOne;


//This is the product class in builder pattern design
//Basically this is the end product that we are going to get in builder pattern
public class UserWebDTO implements UserDTO {

    private String name;
    private String address;
    private String age;

    public UserWebDTO(String name, String address, String age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {

        return age;
    }

    @Override
    public String toString() {
        return "name=" + name + "\nage=" + age + "\naddress=" + address ;
    }
}
