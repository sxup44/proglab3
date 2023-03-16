public class Gender {
    public static final Gender MALE = new Gender("Male");
    public static final Gender FEMALE = new Gender("Female");

    private String name;

    private Gender(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
