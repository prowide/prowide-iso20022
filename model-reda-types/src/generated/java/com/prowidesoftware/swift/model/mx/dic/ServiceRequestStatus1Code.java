
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceRequestStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ServiceRequestStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACPT"/>
 *     <enumeration value="RJCT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
