package com.example.WebApp; 
 
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.ResponseBody; 
 
@Controller 
public class HomeController { 
 
  @RequestMapping("/") 
  public @ResponseBody String greeting() { 
    return "Hello, World!!!!"; 
  } 
  
  @RequestMapping("/ramide") 
  public @ResponseBody String greetingRamide() { 
    return "Hello, Ramide!!!!!!!"; 
  } 
  
  @RequestMapping("/eclipse") 
  public @ResponseBody String greetingEclipse() { 
    return "Hello, Eclipse Eclipse Eclipse!";
  }

  @RequestMapping("/intellij")
  public @ResponseBody String greetingIntelliJ() {
    return "Hello, IntelliJ!";
  }
  
  @RequestMapping("/izabelle")
  public @ResponseBody String greetingIzabelle() {
    return "Hello, Izabelle!";
  }

  @RequestMapping("/gabriel")
  public @ResponseBody String greetingGabriel() {
    return "Hello, Gabriel!";
  }
  
  @RequestMapping("/hotfix")
  public @ResponseBody String greetingHotfix() {
    return "Hello, Hotfix!";
  }

}  