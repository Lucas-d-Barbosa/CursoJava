package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
	private static DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	private LocalDateTime moment;
	private String title;
	private String content;
	private Integer likes;
	private List<Comment> comments = new ArrayList<>();
	
	public Post() {
	}

	public Post(LocalDateTime moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
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

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}
	public void addComments(Comment comment) {
		comments.add(comment);
	}
	
	public String toString() {
		StringBuilder postComplete = new StringBuilder();
		postComplete.append(String.format("%s%n", title));
		postComplete.append(String.format("%d Likes - %s%n", likes,moment.format(fmt1)));
		postComplete.append(String.format("%s%n",content));
		postComplete.append(String.format("Comments:%n"));
		for(Comment comment : comments) {
			postComplete.append(String.format("%s%n", comment.getText()));
		}
		return String.valueOf(postComplete);
	}
	
	
}
