package com.example.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
    public @ResponseBody
    String greeting() {
        return "Hello, World!!!!????!!!!!!!?????????";
    }

    @RequestMapping("/ramide")
    public @ResponseBody
    String greetingRamide() {
        return "Hello, Ramide!!!!!!!?????";
    }

    @RequestMapping("/eclipse")
    public @ResponseBody
    String greetingEclipse() {
        return "Hello, Eclipse Eclipse Eclipse!";
    }

    @RequestMapping("/intellij")
    public @ResponseBody
    String greetingIntelliJ() {
        return "Hello, IntelliJ!";
    }

    @RequestMapping("/glauco")
    public @ResponseBody
    String greeetingGlauco() {
        return "Hello, Glauco!";
    }

    @RequestMapping("/izabelle")
    public @ResponseBody
    String greetingIzabelle() {
        return "Hello, Izabelle!";
    }

    @RequestMapping("/gabriel")
    public @ResponseBody
    String greetingGabriel() {
        return "Hello, Gabriel!";
    }

    @RequestMapping("/hotfix")
    public @ResponseBody
    String greetingHotfix() {
        return "Hello, Hotfix!";
    }

    @RequestMapping("/ramide_branch")
    public @ResponseBody
    String greetingRamideBranch() {
        return "Hello, Ramide Branch!";
    }

    @RequestMapping("/rasd_fork")
    public @ResponseBody
    String greetingRasdFork() {
        return "Hello, Rasd Fork!!!";
    }

    @RequestMapping("/izabelle_tais_branch")
    public @ResponseBody
    String greetingIzabelleBranch() {
        return "Hello, Izabelle Tais Branch!";
    }

    @RequestMapping("/Davi")
    public @ResponseBody
    String greetingDavi() {
        return "Hello, Davi!";
    }

    public @ResponseBody
    @RequestMapping("/Alana")
    String greetingAlana() {
        return "Hello, Alana!";
    }

    @RequestMapping("/alana_freitas_branch")
    public @ResponseBody
    String greetingAlanaBranch() {
        return "Hello, Alana Freitas Branch!";
    }
    
    @RequestMapping("/Davi_Branch")
    public @ResponseBody
    String greetingDavi_Branch() {
        return "Hello, Davi Branch!";
    }

    @RequestMapping("/Davi_Fork")
    public @ResponseBody
    String greetingDavi_Fork() {
        return "Hello, Davi Fork!";
    }

    @RequestMapping("/Joao")
    public @ResponseBody
    String greetingJoao() {
        return "Hello, Joao!";
    }

    @RequestMapping("/JoaoFork")
    public @ResponseBody
    String greetingJoaoFork() {
        return "Hello, JoaoFork!";
    }

    @RequestMapping("/glauco_fork")
    public @ResponseBody
    String greetingGlaucoFork() {
        return "Hello, Glauco fork!!";
    }

    @RequestMapping("/Guilherme")
    public @ResponseBody
    String greetingGuilherme() {
        return "Hello, Guilherme!";
    }

    @RequestMapping("/Rebeka")
    public @ResponseBody
    String greetingRebeka() {
        return "Hello, Rebeka!";
    }

    @RequestMapping("/GuilhermeBranch")
    public @ResponseBody
    String greetingGuilhermeBranch() {
        return "Hello, GuilhermeBranch!";
    }

    @RequestMapping("/GuilhermeFork")
    public @ResponseBody
    String greetingGuilhermeFork() {
        return "Hello, GuilhermeFork! ";
    }

	@RequestMapping("/RebekaBranch")
	public @ResponseBody String greetingRebekaBranch() {
		return "Hello, RebekaBranch!";
	}
		
	@RequestMapping("/wellington")
	public @ResponseBody String greetingWellington() {
		return "Olá, Wellington!!!";
	}
	
	@RequestMapping("/wellington_branch")
	public @ResponseBody String greetingWellington_branch() {
		return "Olá, Wellington_branch!!!";
	}

    @RequestMapping("/izabelle_fork")
    public @ResponseBody
    String greetingIzabelleFork() {
        return "Hello, Izabelle Fork!!!";
    }

    @RequestMapping("/Clarice")
    public @ResponseBody
    String greetingClarice() {
        return "Hello, Clarice!!!";
    }
    
     @RequestMapping("/clarice_queiroz_branch")
    public @ResponseBody
    String greetingClariceBranch() {
        return "Hello, Clarice Queiroz branch!";
    }
    @RequestMapping("/Clarice_fork")
    public @ResponseBody
    String greetingClariceFork() {
        return "Hello, Clarice fork!";
    }
    
    @RequestMapping("/vitor")
    public @ResponseBody
    String greetingVitor() {
        return "Olá, Vitor!!!";
    }

    @RequestMapping("/branch_wallace_gabriel")
    public @ResponseBody
    String greetingBranchWallaceGabriel() {
        return "Hello, Wallace Gabriel Branch!";
    }

    @RequestMapping("/fork_wallace_gabriel")
    public @ResponseBody
    String greetingForkWallaceGabriel() {
        return "Hello, Wallace Gabriel Fork!";
    }

    @RequestMapping("/gustavo")
    public @ResponseBody String greetingGustavo() {
    return "Hello, Gustavo!";
}
    
    @RequestMapping("/marcosandre")
    public @ResponseBody String greetingMarcosAndre() {
        return "Hello, Marcos André! Branch realizado";
    }

    @RequestMapping("/alana_fork")
    public @ResponseBody String greetingAlanaFork() {
        return "Hello, Alana Fork!";
    }
    @RequestMapping("/Alane")
    public @ResponseBody
    String greetingAlane() {

        return "Hello, Alane!!!!!!";
    }
    
    @RequestMapping("/marcosandre_fork")
    public @ResponseBody String greetingMarcosAndreFork() {
        return "Hello, Marcos André FORK!";
    }
    
    @RequestMapping("/julia")
    public @ResponseBody String greetingJulia() {
        return "Hello, Julia!?!?";
    }

    @RequestMapping("/marina")
    public @ResponseBody String greetingMarina() {
        return "Hello, Marina!";
    }
    
    @RequestMapping("/thais")
    public @ResponseBody String greetingThais() {
        return "Hello, Thais!";
    }
    
    @RequestMapping("/gabriel")
    public @ResponseBody String greetingThais() {
        return "Hello, Gabriel!";
    }
    
    @GetMapping("/hotfix")
    public String hotfix() {
        return "hotfix funcionando!";
    }
    
}
