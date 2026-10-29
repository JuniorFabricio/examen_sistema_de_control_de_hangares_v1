/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_sistema_de_control_de_hangares_v1.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author jfabr
 */
public class HibernateUtil 
{
    
    private static final SessionFactory sessionFactory;
    
    static {
        try {
            // Construye de forma automática la factoría leyendo el archivo hibernate.cfg.xml
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("❌ Fallo crítico en la inicialización de SessionFactory: " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    /**
     * Retorna la instancia única del SessionFactory de la aplicación.
     */
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    /**
     * Cierra de forma segura el pool de conexiones al terminar la ejecución.
     */
    public static void shutdown() {
        if (sessionFactory != null && !sessionFactory.isClosed()) {
            sessionFactory.close();
        }
    }


}
