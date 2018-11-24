package app.responsability.models;

import java.io.Serializable;

import app.responsability.models.component.Sex;
import app.responsability.services.UsersService;

public class UserProfile implements Serializable {

    private String name;

    private Integer age;

    private Sex sex;

    private String profilePic;

    private String locationName;

    private Double latitude;

    private Double longitude;

    private Double radius;

    public UserProfile() {}

    public UserProfile(String name, Integer age, Sex sex, String profilePic, String locationName, Double latitude, Double longitude, Double radius) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.profilePic = profilePic;
        this.locationName = locationName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
