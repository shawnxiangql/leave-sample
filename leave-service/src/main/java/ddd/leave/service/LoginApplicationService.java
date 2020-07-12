package ddd.leave.service;

import ddd.leave.domain.aggregation.Person;
import ddd.leave.infrastructure.client.AuthFeignClient;
import ddd.leave.infrastructure.common.api.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginApplicationService{

    @Autowired
    AuthFeignClient authService;
    @Autowired
    PersonDomainService personDomainService;

    public Response login(Person person){
        //调用鉴权微服务
        return authService.login(person);
    }
}