package creationalDesignPattern.BuilderPattern.methodOne;

import java.time.LocalDate;

//This is the abstract builder in the UML diagram of builder pattern
public interface UserDTOBuilder {

    //All four methods returning an object of type UserDTOBuilder.
    //With this approach we can use the concept of method chaining.

    UserDTOBuilder withFirstName(String firstName);
    UserDTOBuilder withLastName(String lastName);
    UserDTOBuilder withBirthday(LocalDate date);
    UserDTOBuilder withAddress(Address address);

    //method to assemble final product
    UserDTO build();

    //(optional) method to fetch already build object
    UserDTO getUserDTO();
}
