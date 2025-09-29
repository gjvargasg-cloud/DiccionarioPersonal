
package com.mycompany.diccionariopersonal;

import java.util.HashMap;

public class DiccionarioPersonal {
    public static void main(String[] args) {
        
        // 1. Crear el diccionario (HashMap) llamado informacionPersonal
        // Un HashMap almacena datos en pares clave-valor (como un diccionario en Python)
        HashMap<String, String> informacionPersonal = new HashMap<>();
        
        // Agregamos los datos ficticios de la persona
        informacionPersonal.put("nombre", "Gloria Vargas"); 
        informacionPersonal.put("edad", "28");
        informacionPersonal.put("ciudad", "Quito");
        informacionPersonal.put("profesion", "Doctora"); 
        informacionPersonal.put("correo", "Glovargas48@icloud.com"); 
        informacionPersonal.put("estado_civil", "Soltera"); 
        
        // 2. Acceder y modificar el valor de la clave "ciudad"
        // Cambiamos la ciudad por otra
        informacionPersonal.put("ciudad", "Cuenca"); 
        
        // 3. Agregar una nueva clave-valor al diccionario
        // Ya existe "profesion", así que agregamos otra información: "hobby"
        informacionPersonal.put("hobby", "Tocar guitarra");
        
        // 4. Verificar si existe la clave "telefono"
        // Si no existe, la agregamos con un número ficticio
        if (!informacionPersonal.containsKey("telefono")) {
            informacionPersonal.put("telefono", "0999999999");
        }
        
        // 5. Eliminar la clave "edad" porque no es necesaria
        informacionPersonal.remove("edad");
        
        // 6. Imprimir el diccionario final
        System.out.println("Diccionario final con la información actualizada:");
        System.out.println(informacionPersonal);
    }
}