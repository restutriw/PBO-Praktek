/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependence;

/**
 *
 * @author restu
 */
public class Mobil {
    public int status;
    public void Start(Engine e) {
        e.On(); 
    } 
    public void Run() { 
        System.out.println("Run...!");
    } 
    public void Stop(Engine e) {
        e.Off(); 
    } 
}
