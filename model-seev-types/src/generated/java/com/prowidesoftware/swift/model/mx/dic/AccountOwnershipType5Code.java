
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountOwnershipType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AccountOwnershipType5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="USUF"/>
 *     <enumeration value="OWNR"/>
 *     <enumeration value="BOWN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AccountOwnershipType5Code")
@XmlEnum
public enum AccountOwnershipType5Code {


    /**
     * The person is ...
     * 
     */
    USUF,

    /**
     * A person has full ownership on the asset. 
     * 
     */
    OWNR,

    /**
     * A person has bare ownership on the asset.
     * 
     */
    BOWN;

    public String value() {
        return name();
    }

    public static AccountOwnershipType5Code fromValue(String v) {
        return valueOf(v);
    }

}
