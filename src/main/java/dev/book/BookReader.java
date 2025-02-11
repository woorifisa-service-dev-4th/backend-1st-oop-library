package dev.book;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BookReader {
	private static final String RESOURCES = "src/main/resources/";
	
	public static void main(String[] args) {
		final Path path = Paths.get(RESOURCES + "library_books_en.txt");
			
			try {
				List<String> lines = Files.readAllLines(path);
				List<BookList> books = new ArrayList<>();
				
				for (String line : lines) {
					String[] data = line.split(",");
					if (data.length == 4) {
						books.add(new BookList(data[0].trim(), data[1].trim(), data[2].trim(), data[3].trim()));
					}
				}
		
				 for (BookList book : books) {
		                System.out.println(book);
		          }
			
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
	}

}
