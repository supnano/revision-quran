package com.laaribi.revisionquran.api.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.laaribi.revisionquran.api.model.Utilisateur;
import com.laaribi.revisionquran.api.service.UtilisateurService;

@WebMvcTest(controllers = UtilisateurController.class)
public class UtilisateurControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UtilisateurService utilisateurService;

    @Test
    void testGetUtilisateurs() throws Exception{
        mockMvc.perform(get("/utilisateurs"))
            .andExpect(status().isOk());
            //.andExpect(jsonPath("$[0].firstName", is("Najib")));
    }
}
