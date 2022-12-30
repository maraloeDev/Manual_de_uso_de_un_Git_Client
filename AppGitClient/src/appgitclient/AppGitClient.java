/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appgitclient;

/**
 *
 * @author rhtuf
 */
public class AppGitClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GitClient client= new GitClient();
        client.setCliente("gitg");
        client.setSistemOper("Linux");
        client.setLicencia("gratuito");
        client.setVersion("41");
        
    }
    
}
