/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Repositorio;

import com.example.demo.Interface.ReservationInterface;
import com.example.demo.Interface.ToolInterface;
import com.example.demo.Modelo.Reservation;
import com.example.demo.Modelo.Tool;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author fernandaismeldamosqueramotta
 */
@Repository // Decimos que esta clase se va a usar como un repositorio

public class ToolRepository {
    @Autowired
    private ToolInterface extencionesCrud; 
    
    public List<Tool> getAll(){
        return (List<Tool>) extencionesCrud.findAll();
    }
    
    public Optional<Tool> getTool(int id){
        return extencionesCrud.findById(id);
    }
    
    public Tool save(Tool tool){
        return extencionesCrud.save(tool);
    }
       
    public void delete(Tool tool){
        extencionesCrud.delete(tool);
    }
    
}
