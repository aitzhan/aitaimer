package timer.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import timer.DTO.NameDTO;

@RestController
public class SampleRestController {

    @GetMapping(value = "rest/name/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public NameDTO getNameByName(@PathVariable("name") final String name) {
        return new NameDTO(name);
    }

}
