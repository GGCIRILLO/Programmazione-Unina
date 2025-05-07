/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class CodaException extends IndexOutOfBoundsException {

    /**
     * Creates a new instance of <code>CodaException</code> without detail
     * message.
     */
    public CodaException() {
    }

    /**
     * Constructs an instance of <code>CodaException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public CodaException(String msg) {
        super(msg);
    }
}
