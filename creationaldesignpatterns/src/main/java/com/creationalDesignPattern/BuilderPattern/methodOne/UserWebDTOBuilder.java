package creationalDesignPattern.BuilderPattern.methodOne;

import java.time.LocalDate;
import java.time.Period;


//This is the concrete builder of UserWebDTO
public class UserWebDTOBuilder implements UserDTOBuilder {

    private String fName;
    private String lName;
    private String age;
    private String address;
    private UserDTO dto;

    @Override
    public UserDTOBuilder withFirstName(String firstName) {
        fName = firstName;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lastName) {
        lName = lastName;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate date) {
        Period ageInYears = Period.between(date,LocalDate.now());
        age = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.toString();
        return this;
    }

    @Override
    public UserDTO build() {
        dto = new UserWebDTO(fName + " " + lName,address,age);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }
}
