/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalrojgarkendra;

import finalview.AddJobs;
import finalview.ApplicationProposal;
import finalview.EmployeeDashboard;
import finalview.JobDescription;
import finalview.EmployeerDashboard;
import finalview.GiverSignup;
import finalview.HunterSignup;
import finalview.LoginGiver;
import finalview.LoginHunter;

/**
 *
 * @author NITRO V
 */
public class FinalRojgarkendra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LoginHunter Login = new LoginHunter();
        Login.setVisible(true);
        Login.pack();
        Login.setLocationRelativeTo(null);
        
        LoginGiver Giver = new LoginGiver();
        Giver.setVisible(true);
        Giver.pack();
        Giver.setLocationRelativeTo(null);
//
//
        HunterSignup Hunter = new HunterSignup();
        Hunter.setVisible(true);
        Hunter.pack();
        Hunter.setLocationRelativeTo(null);
//
//        
        GiverSignup give = new GiverSignup();
        give.setVisible(true);
        give.pack();
        give.setLocationRelativeTo(null);
//        
        EmployeerDashboard ab = new EmployeerDashboard();
        ab.setVisible(true);
        ab.pack();
        ab.setLocationRelativeTo(null);
        
        EmployeeDashboard bc = new EmployeeDashboard();
        bc.setVisible(true);
        bc.pack();
        bc.setLocationRelativeTo(null);

        JobDescription de = new JobDescription();
        de.setVisible(true);
        de.pack();
        de.setLocationRelativeTo(null);
        
        AddJobs ef = new AddJobs();
        ef.setVisible(true);
        ef.pack();
        ef.setLocationRelativeTo(null);
        
        ApplicationProposal fg = new ApplicationProposal();
        fg.setVisible(true);
        fg.pack();
        fg.setLocationRelativeTo(null);
    }
    
}
