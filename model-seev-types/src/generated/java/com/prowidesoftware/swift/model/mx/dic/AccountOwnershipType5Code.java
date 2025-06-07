
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountOwnershipType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountOwnershipType5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="USUF"/&gt;
 *     &lt;enumeration value="OWNR"/&gt;
 *     &lt;enumeration value="BOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccountOwnershipType5Code")
@XmlEnum
public enum AccountOwnershipType5Code {


    /**
     * Person having the temporary right to use and derive income or benefit from someone else's property.
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
