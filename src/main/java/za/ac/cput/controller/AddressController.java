/*
 * AddressController.java
 * Controller for address entity
 * Author: Sinethemba Sithela (219112940)
 * Date: 26/08/2023
 */

package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Address;
import za.ac.cput.service.AddressService;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressService service;

    @PostMapping("/create")
    Address create(@RequestBody Address address){
        return service.create(address);
    }

    @GetMapping({"/", "/all"})
    List<Address> getAll(){
        return service.getAll();
    }
}
