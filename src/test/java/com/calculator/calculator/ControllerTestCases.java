package com.calculator.calculator;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class ControllerTestCases {

	  @Autowired
	  private MockMvc mockMvc;
	  
	@Test
	  public void addTest() throws Exception {
	    mockMvc.perform(get("/sum/2/2"))
	      .andExpect(status().isOk())
	      .andExpect(content().string("4.0"));
	  }
	  
	  @Test
	  public void negatvieAddTest() throws Exception {
	    mockMvc.perform(get("/sum/one/two"))
	      .andExpect(status().isBadRequest());
	  }
	  
	  @Test
	  public void subTest() throws Exception {
	    mockMvc.perform(get("/sub/5/1"))
	      .andExpect(status().isOk())
	      .andExpect(content().string("4.0"));
	  }
	  
	  @Test
	  public void negatvieSubTest() throws Exception {
	    mockMvc.perform(get("/sub/one/two"))
	      .andExpect(status().isBadRequest());
	  }
	  
	  @Test
	  public void mulTest() throws Exception {
	    mockMvc.perform(get("/mul/2/2"))
	      .andExpect(status().isOk())
	      .andExpect(content().string("4.0"));
	  }
	  
	  @Test
	  public void negatvieMulTest() throws Exception {
	    mockMvc.perform(get("/mul/one/four"))
	      .andExpect(status().isBadRequest());
	  }
	  
	  @Test
	  public void divTest() throws Exception {
	    mockMvc.perform(get("/div/20/5"))
	      .andExpect(status().isOk())
	      .andExpect(content().string("4.0"));
	  }
	  
	 
	  
	  @Test
	  public void negatvieDivTest() throws Exception {
	    mockMvc.perform(get("/div/four/two"))
	      .andExpect(status().isBadRequest());
	  }
	}




