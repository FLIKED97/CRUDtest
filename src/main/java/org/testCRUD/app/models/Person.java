package org.testCRUD.app.models;

import javax.validation.constraints.*;

public class Person {
    private int id;

    @NotEmpty(message = "Ім'я не повинно бути пустим")
    @Size(min = 2, max = 30, message = "Ім'я повинно бути між 2 до 30 символів")
    private String name;

    @Min(value = 0, message = "Мінімальне значення - 0")
    private int age;

    @NotEmpty(message = "пошта не повинна бути пуста")
    @Email(message = "пошта повинна бути правильною")
    private String email;

    @Pattern(regexp = "[A-Z]\\w+, [A-Z]\\w+, \\d{6}", message = "Your address should be in this format: Country, City, Postal Code (6 digits)")
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person(int id, String name, int age, String email, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
