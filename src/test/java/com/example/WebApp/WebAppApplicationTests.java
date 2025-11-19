package com.example.WebApp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class WebAppApplicationTests {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void shouldReturnDefaultMessage() throws Exception {
    this.mockMvc.perform(get("/"))
        .andDo(print()).andExpect(status().isOk())
        .andExpect(content()
            .string(containsString("Hello, World!")));
  }

  @Test
  public void shouldReturnRamide() throws Exception {
    this.mockMvc.perform(get("/ramide"))
        .andDo(print()).andExpect(status().isOk())
        .andExpect(content()
            .string(containsString("Hello, Ramide!")));
  }

  @Test
  public void shouldReturnIzabelle() throws Exception {
    this.mockMvc.perform(get("/izabelle"))
        .andDo(print()).andExpect(status().isOk())
        .andExpect(content()
            .string(containsString("Hello, Izabelle!")));
  }
  
  @Test
  public void shouldReturnJoaoFork () throws Exception{
      this.mockMvc.perform(get("/JoaoFork")) 
          .andDo(print()).andExpect(status().isOk()) 
          .andExpect(content() 
          .string(containsString("Hello, JoaoFork!"))); 
  }

  @Test
  public void shouldReturnGabriel() throws Exception {
    this.mockMvc.perform(get("/gabriel"))
        .andDo(print()).andExpect(status().isOk())
        .andExpect(content()
            .string(containsString("Hello, Gabriel!")));
  }

  @Test
  public void shouldReturnDavi() throws Exception {
    this.mockMvc.perform(get("/Davi"))
        .andDo(print()).andExpect(status().isOk())
        .andExpect(content()
            .string(containsString("Hello, Davi!")));
  }
    @Test
  public void shouldReturnDaviBranch() throws Exception {
    this.mockMvc.perform(get("/Davi_Branch"))
        .andDo(print()).andExpect(status().isOk())
        .andExpect(content()
            .string(containsString("Hello, Davi Branch!")));
  }

    @Test
  public void shouldReturnDaviFork() throws Exception {
    this.mockMvc.perform(get("/Davi_Fork"))
        .andDo(print()).andExpect(status().isOk())
        .andExpect(content()
            .string(containsString("Hello, Davi Fork!")));
  }

  @Test
  public void shouldReturnJoao() throws Exception {
    this.mockMvc.perform(get("/Joao"))
        .andDo(print()).andExpect(status().isOk())
        .andExpect(content()
            .string(containsString("Hello, Joao!")));
  }

  @Test
  public void shouldReturnGuilherme() throws Exception {
    this.mockMvc.perform(get("/Guilherme"))
        .andDo(print()).andExpect(status().isOk())
        .andExpect(content()
            .string(containsString("Hello, Guilherme!")));
  }

  @Test
  public void shouldReturnRebeka() throws Exception {
    this.mockMvc.perform(get("/Rebeka"))
        .andDo(print()).andExpect(status().isOk())
        .andExpect(content()
            .string(containsString("Hello, Rebeka!")));
  }

  @Test
  public void shouldReturnGuilhermeBranch() throws Exception {
    this.mockMvc.perform(get("/GuilhermeBranch"))
        .andDo(print()).andExpect(status().isOk())
        .andExpect(content()
            .string(containsString("Hello, GuilhermeBranch!")));
  }

  @Test
  public void shouldReturnGuilhermeForkParteQuatro() throws Exception {
    this.mockMvc.perform(get("/GuilhermeFork"))
        .andDo(print()).andExpect(status().isOk())
        .andExpect(content()
            .string(containsString("Hello, GuilhermeFork!")));
  }
  
  @Test
  public void shouldReturnAlana() throws Exception {
    this.mockMvc.perform(get("/Alana"))
        .andDo(print()).andExpect(status().isOk())
        .andExpect(content()
            .string(containsString("Hello, Alana!")));
  }
  
  @Test
  public void shouldReturnJoaoBranch () throws Exception{
      this.mockMvc.perform(get("/JoaoBranch")) 
          .andDo(print()).andExpect(status().isOk()) 
          .andExpect(content() 
          .string(containsString("Hello, JoaoBranch!"))); 

  public void shouldReturnAlanaBranch() throws Exception {
    this.mockMvc.perform(get("/alana_freitas_branch"))
        .andDo(print()).andExpect(status().isOk())
        .andExpect(content()
            .string(containsString("Hello, Alana Freitas Branch!")));

  }


}