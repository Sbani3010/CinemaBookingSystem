package za.ac.cput.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Show;
import za.ac.cput.service.ShowService;
import java.util.List;
@RestController
@RequestMapping("/show")
public class ShowController {
    @Autowired
    private ShowService showService;

    @PostMapping("/create")
    Show create(@RequestBody Show show) {
        return showService.create(show);
    }

    @GetMapping("/read/{id}")
    Show read(@PathVariable Integer id){
        return showService.read(id);
    }

    @PostMapping("/update")
    Show update(@RequestBody Show show) {
        return showService.create(show);
    }

    @GetMapping({"/", "/all"})
    List<Show> getAll() {
        return showService.getAll();
    }
}
