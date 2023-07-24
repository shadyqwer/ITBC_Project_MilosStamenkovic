package data;

public enum Gender {
    MALE("Male"), FEMALE("Female"), OTHER("Other");

    private final String stringValue;

    Gender(String stringValue) {
        this.stringValue = stringValue;
    }

    public String getString() {
        return stringValue;
    }
}
