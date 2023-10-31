package com.jorawar.singh.socialmediaapp.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    // URL Versioning
    @GetMapping("/v1/person")
    public PersonV1 getFirstVersionOfPerson(){
        return new PersonV1("John Doe");
    }

    @GetMapping("/v2/person")
    public PersonV2 getSecondVersionOfPerson(){
        Name name  = new Name("John", "Doe");
        return new PersonV2(name);
    }

    // Request Params Versioning
    @GetMapping(path = "/person", params = "version=1")
    public PersonV1 getFirstVersionOfPersonByRequestParams(){
        return new PersonV1("John Doe");
    }

    @GetMapping(path = "/person", params = "version=2")
    public PersonV2 getSecondVersionOfPersonByRequestParams(){
        Name name  = new Name("John", "Doe");
        return new PersonV2(name);
    }

    // Headers Versioning

    @GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
    public PersonV1 getFirstVersionOfPersonByHeaders(){
        return new PersonV1("John Doe");
    }

    @GetMapping(path = "/person/header", headers = "X-API-VERSION=2")
    public PersonV2 getSecondVersionOfPersonByHeaders(){
        Name name  = new Name("John", "Doe");
        return new PersonV2(name);
    }

    @GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v1+json")
    public PersonV1 getFirstVersionOfPersonByMIME(){
        return new PersonV1("John Doe");
    }
    @GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v2+json")
    public PersonV2 getSecondVersionOfPersonByMIME(){
        Name name  = new Name("John", "Doe");
        return new PersonV2(name);
    }

}
