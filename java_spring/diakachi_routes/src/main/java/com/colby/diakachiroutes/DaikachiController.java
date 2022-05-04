
	package com.colby.diakachiroutes;

	import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping("/diakachi")
	public class DaikachiController {

		@RequestMapping("")
		public String welcome() {
			return "Welcome";
		}
		@RequestMapping("/tomorrow")
		public String tomorrow() {
			return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas";
		}
		@RequestMapping("/today")
		public String today() {
			return "Today you will find luck in all your endeavors";
		}
		
		@RequestMapping("/lotto/{num}")
		public String lotto(@PathVariable("num") int num) {
			
			if (num%2 == 0) {
				return "You will take a grand journey in the near future, but be weary of tempting offers";
			}else {
				return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
			}
		}
		@RequestMapping("/travel/{location}")
		public String location(@PathVariable("location")String location) {
			return "Congratulations! You will soon travel to " + location;
		}
		
		}
	