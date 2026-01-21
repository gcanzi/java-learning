package poo.composicao.instagram.application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import poo.composicao.instagram.entities.Comment;
import poo.composicao.instagram.entities.Post;

public class Program {

	public static void main(String[] args) {

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		Post p1 = new Post(
				LocalDateTime.parse("21/06/2025 13:05:44", fmt),
				"Traveling to New Zealand",
				"I'm going to visit this wonderful country!",
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("May the Force be with you");
		Post p2 = new Post(
				LocalDateTime.parse("28/07/2025 23:14:19", fmt),
				"Good night guys",
				"See you tomorrow",
				5);
		p2.addComment(c3);
		p2.addComment(c4);
				
		System.out.println(p1);
		System.out.println(p2);
	}

}
