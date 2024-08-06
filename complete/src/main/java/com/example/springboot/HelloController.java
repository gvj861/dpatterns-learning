package com.example.springboot;

import com.example.springboot.dialog.Dialog;
import com.example.springboot.dialog.HtmlDialog;
import com.example.springboot.repo.User;
import com.example.springboot.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

@RestController
public class HelloController {

	@Autowired
	private UserRepo userRepo;

	private LocalDateTime startTime;

	@Autowired
	private final HtmlDialog dialog;

	@GetMapping("/")
	public List<User> index() {
		startTime = LocalDateTime.now();
		dialog.renderWindow();
		List<User> res = userRepo.findAll();
		System.out.println("Time to process : " + Duration.between(LocalDateTime.now() , startTime).getNano());
		return res;
	}

}
