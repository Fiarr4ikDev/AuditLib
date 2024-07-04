package ru.fiarr4ik.springbootstarterauditlib;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.AutoConfigureWebClient;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.fiarr4ik.springbootstarterauditlib.annotations.AuditLog;
import ru.fiarr4ik.springbootstarterauditlib.enums.LogLevel;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

    @ExtendWith(SpringExtension.class)
    @WebMvcTest(SpringBootStarterAuditLibTests.TestController.class)
    @AutoConfigureMockMvc
    @AutoConfigureWebClient
    public class SpringBootStarterAuditLibTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void exampleTest() throws Exception {
        ResultActions resultActions = this.mockMvc
                .perform(get("/test"));
        resultActions
                .andDo(print());
    }

    @RestController
    public static class TestController {

        @GetMapping("/test")
        @AuditLog(logLevel = LogLevel.INFO)
        public String test() {
            return "Hello";
        }
    }

}