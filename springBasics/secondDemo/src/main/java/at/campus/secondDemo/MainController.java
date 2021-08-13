package at.campus.secondDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/demo")
public class MainController {

    @Autowired
    private PersonRepository personRepository;

    @PostMapping(path = "/add")
    public @ResponseBody
    String addNewPerson(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String email) {
        Person p = new Person();
        p.setFirstName(firstName);
        p.setLastName(lastName);
        p.setEmail(email);
        personRepository.save(p);
        return "saved.";
    }

    @GetMapping(path = "/findAll")
    private @ResponseBody
    List<Person> findAll() {
        return personRepository.findAll();
    }

    @GetMapping(path = "/all")
    private @ResponseBody
    Iterable<Person> getAllPeople() {
        return personRepository.findAll();
    }

}
