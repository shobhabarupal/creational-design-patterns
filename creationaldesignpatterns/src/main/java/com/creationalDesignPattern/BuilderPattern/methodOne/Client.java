package creationalDesignPattern.BuilderPattern.methodOne;


import java.time.LocalDate;

//This is our client which also works as a "director"
public class Client {

    public static void main(String[] args) {

        User user = createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();
        UserDTO dto = directBuild(builder,user);
        System.out.println(dto);

    }

    //This is the director method that is going to build the final product using the builder and the entity object
    private static UserDTO directBuild(UserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withBirthday(user.getBirthday())
                .build();
    }

    //This method is just for creating User object
    //In the real scenario this object will be created by persistence layer.
    public static User createUser() {
        User user = new User();
        user.setFirstName("Gaveesh");
        user.setLastName("Gupta");
        user.setBirthday(LocalDate.of(1995,2,1));

        Address address = new Address();
        address.setHouseNumber("B19B");
        address.setStreet("gordhan bari");
        address.setCity("Jaipur");
        address.setState("Rajasthan");
        user.setAddress(address);

        return user;
    }
}
