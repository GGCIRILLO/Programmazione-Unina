/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class ExceptionPila extends IndexOutOfBoundsException {

    /**
     * Creates a new instance of <code>ExceptionPila</code> without detail
     * message.
     */
    public ExceptionPila() {
    }

    /**
     * Constructs an instance of <code>ExceptionPila</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public ExceptionPila(String msg) {
        super(msg);
    }
}
