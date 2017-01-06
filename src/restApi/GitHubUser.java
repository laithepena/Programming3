package restApi;

public class GitHubUser {

    private String login;
    
    private int id;
    
    private String blog;

    public String getBlog() {
		return blog;
	}

	public void setBlog(String blog) {
		this.blog = blog;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public GitHubUser() {
       // super();
    }

    // API

    public String getLogin() {
        return login;
    }

    public void setLogin(final String login) {
        this.login = login;
    }

}