package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Seat;
import za.ac.cput.service.SeatService;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/seat")
public class SeatController {
    @Autowired
    private SeatService service;

    @PostMapping("/create")
    Seat create(@RequestBody Seat seat) {
        return service.create(seat);
    }

    @GetMapping("/{id}")
    Seat read(@PathVariable Integer id) {
        return service.read(id);
    }

    @GetMapping("/all")
    List<Seat> getAll() {
        return service.getAll();
    }

    @PostMapping("/update")
    Seat update(@RequestBody Seat seat) {
        Seat x=new Seat.Builder().copy(seat).setReserved(true).build();
        System.out.println(x);
        return service.update(x);
    }
}
