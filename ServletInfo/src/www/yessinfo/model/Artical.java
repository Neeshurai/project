package www.yessinfo.model;

public class Artical {

	private int id;
	private String tital;
	private String body;
	public Artical() {
		// TODO Auto-generated constructor stub
	}
	public Artical(int id, String tital, String body) {
		super();
		this.id = id;
		this.tital = tital;
		this.body = body;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTital() {
		return tital;
	}
	public void setTital(String tital) {
		this.tital = tital;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}

}
