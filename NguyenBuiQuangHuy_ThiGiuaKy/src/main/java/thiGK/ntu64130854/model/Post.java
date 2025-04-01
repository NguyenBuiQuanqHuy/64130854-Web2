package thiGK.ntu64130854.model;

public class Post {
	String id,title,content,catetoryID;

	public Post(String id, String title, String content, String catetoryID) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.catetoryID = catetoryID;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCatetoryID() {
		return catetoryID;
	}

	public void setCatetoryID(String catetoryID) {
		this.catetoryID = catetoryID;
	}
	
	
}
