package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		Comment cm1 = new Comment("Hava a nice trip");
		Comment cm2 = new Comment("Wow that's awesome!");
		LocalDateTime dt1 = LocalDateTime.parse("21/06/2018 13:05:44", fmt1);
		
		Post post = new Post(dt1, "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
		post.addComments(cm1);
		post.addComments(cm2);
		System.out.println(post);
		
		dt1 = LocalDateTime.parse("28/07/2018 23:14:19", fmt1);
		Post post2 = new Post(dt1, "Good night guys", "See you tomorrow", 5);
		Comment cm3 = new Comment("Good night");
		Comment cm4 = new Comment("May the Force be with you");
		post2.addComments(cm3);
		post2.addComments(cm4);
		
		System.out.println(post);
	}

}
