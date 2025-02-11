package dev.book;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BookList {
	private static final String RESOURCES = "src/main/resources/";
	
	public static void main(String[] args) {

			final Path path = Paths.get(RESOURCES + "library_books_en.txt");
			System.out.println(path);
			
			try {
				List<String> lines = Files.readAllLines(path);
				
				if (lines.isEmpty()) {
					System.out.println("해당 도서가 존재하지 않습니다.");
					return;	
				}
				
				System.out.println(lines);
			
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
	}

}
