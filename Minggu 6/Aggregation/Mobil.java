/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aggregation;

/**
 *
 * @author restu
 */
public class Mobil {
    private Engine mesin;
    public int status;
    public void setEngine(Engine e) 
    { 
        mesin=e; 
    } 
    public void Start() 
    { 
        mesin.On();
    } 
    public void Run()
    { 
        System.out.println("Run...!");
    }

    public void Stop() 
    { 
        mesin.Off(); 
    } 

}
