
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceRequestStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceRequestStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACPT"/&gt;
 *     &lt;enumeration value="RJCT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceRequestStatus1Code")
@XmlEnum
public enum ServiceRequestStatus1Code {


    /**
     * Service request is accepted.
     * 
     */
    ACPT,

    /**
     * Service request has been rejected.
     * 
     */
    RJCT;

    public String value() {
        return name();
    }

    public static ServiceRequestStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
