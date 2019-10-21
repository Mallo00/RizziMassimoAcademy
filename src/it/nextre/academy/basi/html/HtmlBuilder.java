package it.nextre.academy.basi.html;

public class HtmlBuilder {
    private final String titolo;
    private String page = "";

    public HtmlBuilder(String titolo) {
        this.titolo = titolo.trim();
        this.page += "<!DOCTYPE html>\n" +
                "<html lang=\"it\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
                "    <title>" + titolo + "</title>\n" +
                "</head>\n" +
                "<body>\n";
    }

    public HtmlBuilder addP(String text) {
        page += "<p>" + text + "</p>";
        return this;
    }

    public HtmlBuilder addH(int valore, String titolo) {
        page += "<h" + valore + ">" + titolo + "</h" + valore + ">";
        return this;
    }

    public String getPage() {
        return page + "</body></html>";
    }

    public void setPage(String page) {
        if (titolo == null || titolo.length() == 0) {
            throw new RuntimeException("Invalid value in HTMLBuilder");
        }
        this.page = page;
    }
}//end class
