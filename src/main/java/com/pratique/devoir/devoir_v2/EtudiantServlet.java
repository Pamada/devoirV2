package com.pratique.devoir.devoir_v2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Etudiant;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/search")
public class EtudiantServlet  extends HttpServlet {

    private List<Etudiant> etudiants = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        super.init();
        // Initialize with some data
        etudiants.add(new Etudiant(1, "Dupont", "Jean", "Informatique"));
        etudiants.add(new Etudiant(2, "Durand", "Marie", "Mathématiques"));
        etudiants.add(new Etudiant(3, "Martin", "Paul", "Physique"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String searchQuery = req.getParameter("searchQuery");
        java.util.List<Etudiant> filteredEtudiants = new ArrayList<>();

        if (searchQuery != null && !searchQuery.isEmpty()) {
            for (Etudiant etudiant : etudiants) {
                if (etudiant.getNom().contains(searchQuery) || etudiant.getPrenom().contains(searchQuery) || etudiant.getSpecialite().contains(searchQuery)) {
                    filteredEtudiants.add(etudiant);
                }
            }
        } else {
            filteredEtudiants = etudiants;
        }

        req.setAttribute("etudiants", filteredEtudiants);
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }


}
