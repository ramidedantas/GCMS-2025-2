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
  
	@RequestMapping("/Davi_Branch")
	public @ResponseBody String greetingDavi_Branch() {
		return "Hello, Davi Branch!";
	}

	@RequestMapping("/Davi_Fork")
	public @ResponseBody String greetingDavi_Fork() {
		return "Hello, Davi Fork!";
	}

	@RequestMapping("/Joao")
	public @ResponseBody String greetingJoao() {
		return "Hello, Joao!";
	}

	@RequestMapping("/JoaoFork")
	public @ResponseBody String greetingJoaoFork() {
		return "Hello, JoaoFork!";
	}

	@RequestMapping("/glauco_fork")
	public @ResponseBody String greetingGlaucoFork() {
		return "Hello, Glauco fork!!";
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
		return "Hello, GuilhermeBranch!";
	}

	@RequestMapping("/GuilhermeFork")
	public @ResponseBody String greetingGuilhermeFork() {
		return "Hello, GuilhermeFork! ";
	}

	@RequestMapping("/izabelle_fork")
	public @ResponseBody String greetingIzabelleFork() {
		return "Hello, Izabelle Fork!!!";
	}

	@RequestMapping("/Alana")
	public @ResponseBody String greetingAlana() { 
		return "Hello, Alana!"; 
	}

	@RequestMapping("/RebekaBranch")
	public @ResponseBody String greetingRebekaBranch() {
		return "Hello, RebekaBranch!";
	}

}
