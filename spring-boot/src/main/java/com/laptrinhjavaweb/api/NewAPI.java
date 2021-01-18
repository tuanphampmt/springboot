package com.laptrinhjavaweb.api;

import com.laptrinhjavaweb.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.laptrinhjavaweb.dto.NewDTO;

@CrossOrigin
@RestController
public class NewAPI {

    @Autowired
    private INewService newService;

    @PostMapping(value = "/new")
    public NewDTO createNew(@RequestBody NewDTO model) {
        try {
            return newService.save(model);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @PutMapping(value = "/new/{id}")
    public NewDTO updateNew(@RequestBody NewDTO model, @PathVariable("id") long id) {
        model.setId(id);
        try {
            return newService.save(model);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @DeleteMapping(value = "/new")
    public void deleteNew(@RequestBody long[] ids) {

    }
}
