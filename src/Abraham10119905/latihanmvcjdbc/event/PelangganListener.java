/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abraham10119905.latihanmvcjdbc.event;

import Abraham10119905.latihanmvcjdbc.entity.Pelanggan;
import Abraham10119905.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author 
 * Nama : Abraham Rumayara
 * NIM : 10119905
 * Kelas : IF10K
 * Latihan MVC - DATABASE
 */
public interface PelangganListener {
    public void onChange(PelangganModel model);
    
    public void onInsert(Pelanggan pelanggan);
    public void onUpdate(Pelanggan pelanggan);
    
    public void onDelete();
}
