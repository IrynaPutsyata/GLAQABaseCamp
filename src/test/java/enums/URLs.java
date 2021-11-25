package enums;

public enum URLs {
    BASE_URL("https://demoqa.com/");

    private final String value;

    URLs(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
