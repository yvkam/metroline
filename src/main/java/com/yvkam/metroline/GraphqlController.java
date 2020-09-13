package com.yvkam.metroline;

import graphql.kickstart.servlet.AbstractGraphQLHttpServlet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@Slf4j
public class GraphqlController {

    @Autowired
    private AbstractGraphQLHttpServlet graphQLServlet;

    @PostMapping("rest/graphql")
    public void graphql(HttpServletRequest request, HttpServletResponse response) throws Exception {
        log.info("I'in the controller");
        graphQLServlet.service(request, response);
    }
}
