package com.micnusz.backend;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return List.of(
                new SoftwareEngineer(1, "Jarek Pasza", "js, react, nextjs"),
                new SoftwareEngineer(2, "Marek marucha", "ts, spring, nodejs"),
                new SoftwareEngineer(1, "Marlenka Bula", "angular, nextjs, tailwind"));
    }
}
