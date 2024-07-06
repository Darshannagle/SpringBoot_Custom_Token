//package com.SBproject.Main;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class UserController {
//
//
//	@GetMapping("/customToken")
//	public ResponseEntity<String> getCustomToken() throws Exception {
//		String customToken = (String) new GenerateJWTtoken().call();
//		
//		return new ResponseEntity<String> (customToken,HttpStatus.OK);
//	}
//	
//}
