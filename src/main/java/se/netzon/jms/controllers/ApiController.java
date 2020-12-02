package se.netzon.jms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import se.netzon.jms.services.ApiService;

@RestController
public class ApiController {

    @Autowired
    private ApiService apiService;

    @GetMapping({"/", "/greet"})
    public @ResponseBody
    ResponseEntity<String>
    getIndexOrGreet() {
        String response = this.apiService.getIndexOrGreeting();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping({"/", "/shortText"})
    public @ResponseBody
    ResponseEntity<String>
    getShortText() {
        String response = this.apiService.getShortText();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/longText")
    public @ResponseBody
    ResponseEntity<String>
    getLongText() {
        String response = this.apiService.getLongText();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/allText")
    public @ResponseBody
    ResponseEntity<String>
    getAllText() {
        String response = this.apiService.getAllText();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
