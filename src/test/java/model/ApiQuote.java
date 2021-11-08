package model;

public class ApiQuote {
    Integer id;   // в модельках викор врапери, щоб небуло дефолтного стану
    String quote;

    public ApiQuote(Integer id, String quote) {
        this.id = id;
        this.quote = quote;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
