package ddd.leave.controller;

import ddd.leave.service.LoginApplicationService;
import ddd.leave.infrastructure.common.api.Response;
import ddd.leave.mapper.PersonAssembler;
import ddd.leave.dto.PersonDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping("/auth")
@Slf4j
public class AuthApi {

    @Autowired
    LoginApplicationService loginApplicationService;

    @PostMapping("/login")
    public Response login(PersonDTO personDTO) throws ParseException {
        return loginApplicationService.login(PersonAssembler.toDO(personDTO));
    }
}
