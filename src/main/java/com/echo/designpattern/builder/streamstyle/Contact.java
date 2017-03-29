package com.echo.designpattern.builder.streamstyle;

/**
 * @author congyou.wu
 * @since 2017-03-29 下午9:17
 */
public class Contact {

    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public static ContactBuilder builder(String firstName, String lastName) {
        return new ContactBuilder(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Contact{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", phone='" + phone + '\'' +
            ", address='" + address + '\'' +
            '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static class ContactBuilder {
        private String firstName;
        private String lastName;
        private String phone;
        private String address;

        public ContactBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public ContactBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public ContactBuilder address(String address) {
            this.address = address;
            return this;
        }

        public Contact build() {
            Contact c = new Contact();
            c.setFirstName(firstName);
            c.setLastName(lastName);
            c.setPhone(phone);
            c.setAddress(address);
            return c;
        }
    }
}
