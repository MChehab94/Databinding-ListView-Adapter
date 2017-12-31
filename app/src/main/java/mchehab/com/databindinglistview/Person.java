package mchehab.com.databindinglistview;

/**
 * Created by muhammadchehab on 12/31/17.
 */

public class Person {
    private String firstName;
    private String lastName;
    private String imageURL;
    private int age;

    public Person(String firstName, String lastName, String imageURL, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.imageURL = imageURL;
        this.age = age;
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

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
