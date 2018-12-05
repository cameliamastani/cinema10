package fr.camelia.cda.cinema.web;


import fr.camelia.cda.cinema.dao.DataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {

    // L'annotation @Autowired permet d'effectuer une injection
    @Autowired

    DataModel datamodel;



    // L'annotation @GetMapping permet d'effectuer le mapping
    // càd d'envoyer
    @GetMapping("/")
    public String main(Model model) {


        model.addAttribute("nom", "Cyan");
        model.addAttribute("films", datamodel.getFilms());

        return "index";
    }

    @GetMapping("/film/{id}")//nom_mapping (chemin) différent du nom_template
    public String detail(Model model, @PathVariable("id") String id){
        Integer idFilm = Integer.parseInt(id);
        model.addAttribute("film", datamodel.getById(idFilm));
        model.addAttribute("role", datamodel.getRoles());
        model.addAttribute("acteur", datamodel.getPersonnes());
        model.addAttribute("url", "file:///C:/Users/CDI/Desktop/affiches/ben-hur.jpg");
        return "detail"; //template
    }
    @GetMapping("/act/{id}")//nom_mapping (chemin) différent du nom_template
    public String detailacteur (Model model, @PathVariable("id") String id) {
        Integer idacteur = Integer.parseInt(id);
        model.addAttribute("acteur", datamodel.getByIdp(idacteur));
        return "detailacteur";
    }
}


