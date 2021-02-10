package fi.hh.swd20.bookstore.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fi.hh.swd20.bookstore.domain.Book;

@Controller
public class BookController {
	
	// kirjalistaus
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String getBook(Model model) {
		List<Book> books = new ArrayList<Book>(); // luodaan tyhjä lista
		books.add(new Book("Kotkanpesä", "Ilkka Remes", 2020, "9789510452639", "14.90")); // lisätään listaan
		books.add(new Book("Luvattu maa", "Barack Obama", 2020, "9789511320845", "27.90")); 
		model.addAttribute("books", books); // välitetään kirjalista templatelle model-olion avulla
		return "bookform"; 
	}

}
