/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class NoElementFound extends Exception{

    /**
     * Creates a new instance of <code>NoElementFound</code> without detail
     * message.
     */
    public NoElementFound() {
    }

    /**
     * Constructs an instance of <code>NoElementFound</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public NoElementFound(String msg) {
        super(msg);
    }
}
