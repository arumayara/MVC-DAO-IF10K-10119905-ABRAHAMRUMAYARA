/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abraham10119905.latihanmvcjdbc.service;

import Abraham10119905.latihanmvcjdbc.entity.Pelanggan;
import Abraham10119905.latihanmvcjdbc.error.PelangganException;
import java.util.List;

/**
 *
 * @author 
 * Nama : Abraham Rumayara
 * NIM : 10119905
 * Kelas : IF10K
 * Latihan MVC - DATABASE
 */
public interface PelangganDao {
    
    public void insertPelanggan (Pelanggan pelanggan) throws PelangganException;
    
    public void updatePelanggan (Pelanggan pelanggan) throws PelangganException;
    
    public void deletePelanggan (Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan (Integer id) throws PelangganException;
    
    //unique
    public Pelanggan getPelanggan (String email) throws PelangganException;
    
    //meload semua data
    public List<Pelanggan> selectAllPelanggan() throws PelangganException;
}
