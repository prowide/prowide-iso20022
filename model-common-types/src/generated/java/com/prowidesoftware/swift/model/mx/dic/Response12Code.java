
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Response12Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Response12Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="APPR"/>
 *     <enumeration value="DECL"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="ASUP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Response12Code")
@XmlEnum
public enum Response12Code {


    /**
     * Service has been successfuly provided.
     * 
     */
    APPR,

    /**
     * Service is declined.
     * 
     */
    DECL,

    /**
     * Service has been partialy provided.
     * 
     */
    PART,

    /**
     * To provide this service additional information needs to be provided by the customer.
     * 
     */
    ASUP;

    public String value() {
        return name();
    }

    public static Response12Code fromValue(String v) {
        return valueOf(v);
    }

}
