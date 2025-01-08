
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountStatusUpdateRequestReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AccountStatusUpdateRequestReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CLOE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AccountStatusUpdateRequestReason1Code")
@XmlEnum
public enum AccountStatusUpdateRequestReason1Code {


    /**
     * Previous account closure instruction was sent in error.
     * 
     */
    CLOE;

    public String value() {
        return name();
    }

    public static AccountStatusUpdateRequestReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
