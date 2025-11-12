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

  @RequestMapping("/glauco")
  public @ResponseBody String greeetingGlauco() {
    return "Hello, Glauco!";
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

  @RequestMapping("/ramide_branch")
  public @ResponseBody String greetingRamideBranch() {
    return "Hello, Ramide Branch!";
  }

  @RequestMapping("/rasd_fork")
  public @ResponseBody String greetingRasdFork() {
    return "Hello, Rasd Fork!!!";
  }
  
  @RequestMapping("/izabelle_tais_branch")
  public @ResponseBody String greetingIzabelleBranch() {
    return "Hello, Izabelle Tais Branch!";
  }

  @RequestMapping("/Davi")
  public @ResponseBody String greetingDavi() {
    return "Hello, Davi!";
  }

  @RequestMapping("/Joao")
  public @ResponseBody String greetingJoao() {
    return "Hello, Joao!";
  }
  
  @RequestMapping("/JoaoFork")
  public @ResponseBody String greetingJoaoFork() {
    return "Hello, JoaoFork!";
  }

  @RequestMapping("/Guilherme")
  public @ResponseBody String greetingGuilherme() {
    return "Hello, Guilherme!";
  }

  @RequestMapping("/Rebeka")
  public @ResponseBody String greetingRebeka() {
    return "Hello, Rebeka!";
  }

  @RequestMapping("/GuilhermeBranch")
  public @ResponseBody String greetingGuilhermeBranch() {
    return "Hello, GuilhermeBranch! ";
  }

  @RequestMapping("/GuilhermeFork")
  public @ResponseBody String greetingGuilhermeFork() {
    return "Hello, GuilhermeFork! ";
  }

  @RequestMapping("/glauco_branch")
  public @ResponseBody String greetingGlaucoBranch() {
    return "Hello, branch glauco!";
  }

}
}
