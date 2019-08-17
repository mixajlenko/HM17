package SAX;

public class Worker {

   private String login;

    private String position;

    private String company;

    private String sinceYear;

    public Worker(String login, String position, String company, String sinceYear) {
        this.login = login;
        this.position = position;
        this.company = company;
        this.sinceYear = sinceYear;
    }

    public String getLogin() {
        return login;
    }

    public String getPosition() {
        return position;
    }

    public String getCompany() {
        return company;
    }

    public String getSinceYear() {
        return sinceYear;
    }
}
