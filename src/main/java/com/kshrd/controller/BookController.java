package com.kshrd.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.github.javafaker.Faker;
import com.kshrd.model.Book;
import com.kshrd.service.BookService;
import com.kshrd.service.FileUploadService;
import com.kshrd.service.PublisherService;

@Controller
public class BookController {
	@Autowired
	BookService bookService;
	
	@Autowired
	FileUploadService fileUploadService;
	
	@Autowired
	PublisherService publisherService;
	
	@GetMapping("/")
	public String getBooks(Model model){
		List<Book> books = bookService.findAll();
		model.addAttribute("books",books);
		return "book/index";
	}
	@GetMapping("/book/") //@RequestParam
	public String findBookById(@RequestParam("id")int id,Model model){
		Faker fk = new Faker();
		String str = fk.lorem().paragraph(41);
		model.addAttribute("str", str);
		Book b = bookService.findById(id);
		model.addAttribute("book", b);
		return "book/detail";
	}
	
	@GetMapping("/add")
	public String addBook(Model model){
		model.addAttribute("addStatus", true);
		model.addAttribute("book", new Book());
		model.addAttribute("publishers", publisherService.findAll());
		return "book/add_edit";
	}
	@PostMapping("/add")
	public String saveBook (@Validated Book b ,BindingResult result, Model model,@RequestParam("file") MultipartFile file,@RequestParam(value="pId") Integer[] publisherId){
		if(result.hasErrors()){
			for(FieldError error: result.getFieldErrors()){
				System.out.println(error.getField() +": "+ error.getDefaultMessage());
			}
			model.addAttribute("addStatus", true);
			model.addAttribute("book", b);
			return "book/add_edit";
		}
		
		b.setId(bookService.findAll().size()+1);
		System.out.println(b.getId());
		String filePath = fileUploadService.uploadFile(file);
		b.setCoverImage(filePath);
		System.out.println(filePath);
		bookService.save(b);
		for(Integer id : publisherId){
			System.out.println(id);
			bookService.savesaveBookPublisher(b.getId(), id);
		}
		return "redirect:/";
	}
	
	@GetMapping("/edit/")
	public String editBook(@RequestParam("id")int id,Model model){
		model.addAttribute("addStatus", false);
		Book b = bookService.findById(id);
		model.addAttribute("book", b);
		model.addAttribute("publishers", publisherService.findAll());
		return "book/add_edit";
	}
	@PostMapping("/edit")
	public String updatBook(@RequestParam("file") MultipartFile file,@Validated Book b ,BindingResult result, Model model,@RequestParam(value="pId") Integer[] publisherId){
		if(result.hasErrors()){
			for(FieldError error: result.getFieldErrors()){
				System.out.println(error.getField() +": "+ error.getDefaultMessage());
			}
			model.addAttribute("addStatus", false);
			model.addAttribute("book", b);
			return "book/add_edit";
		}
		if(!file.isEmpty()){
			b.setCoverImage(fileUploadService.uploadFile(file));
		}
		//b.setCoverImage(fileUploadService.uploadFile(file));
		bookService.deleteBookPublisherByBookId(b.getId());
		bookService.update(b, b.getId());
		for(Integer id : publisherId){
			System.out.println(id);
			bookService.savesaveBookPublisher(b.getId(), id);
		}
		return "redirect:/";
		
		
	}
	@PostMapping("/remove/{id}")//@PathVaiable
	public String removeBook(@PathVariable("id") int id){
		bookService.remove(id);
		return "redirect:/";
	}
	
	@GetMapping("/search")
	public String searchBook(@RequestParam("keyword") String keyword,Model model ){
		List<Book> books = bookService.searchBook(keyword);
		model.addAttribute("books",books );
		model.addAttribute("keyword",keyword);
		return "book/index";
	}
}
