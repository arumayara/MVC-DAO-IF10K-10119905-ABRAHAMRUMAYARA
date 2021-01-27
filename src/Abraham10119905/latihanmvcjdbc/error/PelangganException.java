/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abraham10119905.latihanmvcjdbc.error;

/**
 *
 * @author 
 * Nama : Abraham Rumayara
 * NIM : 10119905
 * Kelas : IF10K
 * Latihan MVC - DATABASE
 */
public class PelangganException extends Exception {

    /**
     * Creates a new instance of <code>PelangganException</code> without detail
     * message.
     */
    public PelangganException() {
    }

    /**
     * Constructs an instance of <code>PelangganException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PelangganException(String msg) {
        super(msg);
    }
}
