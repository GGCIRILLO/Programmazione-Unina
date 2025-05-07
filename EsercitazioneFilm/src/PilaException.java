/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class PilaException extends IndexOutOfBoundsException {

    /**
     * Creates a new instance of <code>PilaException</code> without detail
     * message.
     */
    public PilaException() {
    }

    /**
     * Constructs an instance of <code>PilaException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public PilaException(String msg) {
        super(msg);
    }
}
