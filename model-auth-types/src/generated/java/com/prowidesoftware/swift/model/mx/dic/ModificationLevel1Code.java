
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModificationLevel1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ModificationLevel1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PSTN"/&gt;
 *     &lt;enumeration value="TCTN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ModificationLevel1Code")
@XmlEnum
public enum ModificationLevel1Code {


    /**
     * Modification applies to a position.
     * 
     */
    PSTN,

    /**
     * Modification applies to a transaction.
     * 
     */
    TCTN;

    public String value() {
        return name();
    }

    public static ModificationLevel1Code fromValue(String v) {
        return valueOf(v);
    }

}
