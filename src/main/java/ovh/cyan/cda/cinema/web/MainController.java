package ovh.cyan.cda.cinema.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ovh.cyan.cda.cinema.dao.*;

@Controller
public class MainController {

    // L'annotation @Autowired permet d'effectuer une injection
    @Autowired
    FilmsDao filmsDao;


    // L'annotation @GetMapping permet d'effectuer le mapping
    // càd d'envoyer
    @GetMapping("/")
    public String main(Model model) {


        model.addAttribute("nom", "Cyanw");
        model.addAttribute("films", filmsDao.films());

        return "index";
    }

    @GetMapping("/film/{id}")//nom_mapping (chemin) différent du nom_template
    public String detail(Model model, @PathVariable("id") String id){
        Integer idFilm = Integer.parseInt(id);
        model.addAttribute("film", filmsDao.getById(idFilm));




        model.addAttribute("url", "file:///C:/Users/CDI/Desktop/affiches/ben-hur.jpg");
        return "detail"; //template
    }
}


