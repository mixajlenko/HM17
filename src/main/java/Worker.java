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

    public Worker() {
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

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setSinceYear(String sinceYear) {
        this.sinceYear = sinceYear;
    }
}
