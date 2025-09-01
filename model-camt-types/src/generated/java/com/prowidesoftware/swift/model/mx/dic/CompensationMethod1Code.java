
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompensationMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompensationMethod1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NOCP"/&gt;
 *     &lt;enumeration value="DBTD"/&gt;
 *     &lt;enumeration value="INVD"/&gt;
 *     &lt;enumeration value="DDBT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CompensationMethod1Code")
@XmlEnum
public enum CompensationMethod1Code {


    /**
     * Account does not pay and charges or taxes due.
     * 
     */
    NOCP,

    /**
     * Account is debited for any charges or taxes due.
     * 
     */
    DBTD,

    /**
     * Account or summary account is invoiced for any charges or taxes due.
     * 
     */
    INVD,

    /**
     * Account is automatically debited on a future date.
     * 
     */
    DDBT;

    public String value() {
        return name();
    }

    public static CompensationMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
