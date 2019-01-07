
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-01-07T14:21:32.244-02:00
 * Generated source version: 3.2.7
 */

@WebFault(name = "StandardMessageFault", targetNamespace = "http://sap.com/xi/SAPGlobal20/Global")
public class P3StandardMessageFault extends Exception {

    private Object standardMessageFault;

    public P3StandardMessageFault() {
        super();
    }

    public P3StandardMessageFault(String message) {
        super(message);
    }

    public P3StandardMessageFault(String message, Throwable cause) {
        super(message, cause);
    }

    public P3StandardMessageFault(String message, Object standardMessageFault) {
        super(message);
        this.standardMessageFault = standardMessageFault;
    }

    public P3StandardMessageFault(String message, Object standardMessageFault, Throwable cause) {
        super(message, cause);
        this.standardMessageFault = standardMessageFault;
    }

    public Object getFaultInfo() {
        return this.standardMessageFault;
    }
}
