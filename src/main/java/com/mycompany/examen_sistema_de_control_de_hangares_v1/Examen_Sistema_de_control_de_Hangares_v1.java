/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.examen_sistema_de_control_de_hangares_v1;

import com.mycompany.examen_sistema_de_control_de_hangares_v1.modelos.CazaTIE;
import com.mycompany.examen_sistema_de_control_de_hangares_v1.modelos.DestructorEstelar;
import com.mycompany.examen_sistema_de_control_de_hangares_v1.modelos.NaveGalactica;
import com.mycompany.examen_sistema_de_control_de_hangares_v1.utils.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author jfabr
 */
public class Examen_Sistema_de_control_de_Hangares_v1 {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();

        try {
            session.beginTransaction();

            CazaTIE caza = new CazaTIE("Caza TIE de Pruebas", 90);
            session.persist(caza);
            DestructorEstelar destructor = new DestructorEstelar("Devastator", 5000);
            session.persist(destructor);
            
            session.getTransaction().commit();
            System.out.println("¡Naves guardadas correctamente en la base de datos hangar_imperio_db!");
            
            System.out.println("\n--- LISTADO DE NAVES ---");
            List<NaveGalactica> naves = session.createQuery("FROM NaveGalactica", NaveGalactica.class).getResultList();
            
            for (NaveGalactica nave : naves) {
                System.out.println("-> Nave encontrada: " + nave.getNombre());
            }
        } catch (Exception e) {
            if (session.getTransaction().isActive()) {
                session.getTransaction().rollback();
            }
            System.err.println(e.getMessage());

        }finally {
            session.close();
            
        }

    }
}
