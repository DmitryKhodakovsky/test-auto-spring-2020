package lesson04.dp.builder;

public class Person {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String address;

    private Person(String firstName, String lastName, String dateOfBirth, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder {

        private String firstName;
        private String lastName;
        private String dateOfBirth;
        private String address;

        Builder() {
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            return new Person(firstName, lastName, dateOfBirth, address);
        }
    }
}
