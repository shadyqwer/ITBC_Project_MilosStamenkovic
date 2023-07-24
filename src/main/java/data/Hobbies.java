package data;

public enum Hobbies {
    SPORTS("Sports"), READING("Reading"), MUSIC("Music");

    private final String stringValue;

    Hobbies(String stringValue) {
        this.stringValue = stringValue;
    }

    public String getString() {
        return stringValue;
    }
    }