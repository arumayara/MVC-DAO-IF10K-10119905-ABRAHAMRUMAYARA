/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abraham10119905.latihanmvcjdbc.main;

import Abraham10119905.latihanmvcjdbc.database.BarbershopDatabase;
import Abraham10119905.latihanmvcjdbc.entity.Pelanggan;
import Abraham10119905.latihanmvcjdbc.error.PelangganException;
import Abraham10119905.latihanmvcjdbc.service.PelangganDao;
import Abraham10119905.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import javax.swing.SwingUtilities;

/**
 *
 * @author 
 * Nama : Abraham Rumayara
 * NIM : 10119905
 * Kelas : IF10K
 * Latihan MVC - DATABASE
 */
public class LatihanMVCJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException ex) {
                } catch (PelangganException ex) {
                }
        
            }        
        });
  } 
}
    
