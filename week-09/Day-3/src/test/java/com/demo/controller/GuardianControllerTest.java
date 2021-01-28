package com.demo.controller;

import org.junit.jupiter.api.Test;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {


    @Autowired
  private MockMvc mockMvc;
  @Test
    public void translate_badRequest() throws Exception {
        mockMvc.perform(get("/groot"))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("error", is("I am Groot!")))
        .andDo(print());
    }
    @Test
    public void translate_HappyCase() throws Exception {
        mockMvc.perform(get("/groot")
                .param("message", "somemessage"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.translated", is("I am Groot!")))
                .andDo(print());
    }
    @Test
    public void arrow_HappyCase() throws Exception {
        mockMvc.perform(get("/arrow")
                .param("distance", "10.0")
                .param("time", "2.0"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.speed", is(5.0)))
                .andDo(print());
    }
    @Test
    public void arrow_TimeIsNull() throws Exception {
        mockMvc.perform(get("/arrow")
                .param("distance", "10.0")
                .param("time", "0"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.speed", is("Infinity")))
                .andDo(print());
    }
    @Test
    public void arrow_MissingParam() throws Exception {
        mockMvc.perform(get("/arrow")
                .param("distance", "10.0"))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("error", is("Missing data")))
                .andDo(print());
    }
    @Test
    public void cargo_Empty() throws Exception {
        mockMvc.perform(get("/rocket"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.shipstatus", is("empty")))
            .andDo(print());
    }
    @Test
    public void cargo_Ready() throws Exception{
        mockMvc.perform(get("/rocket/fill")
                .param("caliber", ".50")
                .param("amount", "12500"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.ready",is(true)));
    }
    @Test
    public void cargo_MissingInputAtFill() throws Exception{
        mockMvc.perform(get("/rocket/fill")
                .param("amount", "12500"))
                .andExpect(jsonPath("error",is("Missing input data")));
    }
}