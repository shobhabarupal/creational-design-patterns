package creationalDesignPattern.BuilderPattern.methodTwo;


import creationalDesignPattern.BuilderPattern.methodOne.Address;

import java.time.LocalDate;
import java.time.Period;

//This is the product class in builder pattern design
//Basically this is the end product that we are going to get in builder pattern
public class UserDTO {

    private String name;
    private String address;
    private String age;

    //There is no constructor in product class which needs lot of argument

    //Still we are going to create immutable objects of our class

    //We have setter method as private

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {

        return age;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    private void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name=" + name + "\nage=" + age + "\naddress=" + address ;
    }

    //might not required
    public static UserDTOBuilder getBuilder() {
        return new UserDTOBuilder();
    }
    //Builder
    public static class UserDTOBuilder {

        private String firstName;

        private String lastName;

        private String age;

        private String address;

        private UserDTO userDTO;

        public UserDTOBuilder withFirstName(String fname) {
            this.firstName = fname;
            return this;
        }

        public UserDTOBuilder withLastName(String lname) {
            this.lastName = lname;
            return this;
        }

        public UserDTOBuilder withBirthday(LocalDate date) {
            age = Integer.toString(Period.between(date, LocalDate.now()).getYears());
            return this;
        }

        public UserDTOBuilder withAddress(Address address) {
            this.address = address.toString();
            return this;
        }

        public UserDTO build() {
            this.userDTO = new UserDTO();
            userDTO.setName(firstName+" " + lastName);
            userDTO.setAddress(address);
            userDTO.setAge(age);
            return this.userDTO;
        }

        public UserDTO getUserDTO() {
            return this.userDTO;
        }
    }
}
