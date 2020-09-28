
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TMSContactLevel2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TMSContactLevel2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ASAP"/&gt;
 *     &lt;enumeration value="CRIT"/&gt;
 *     &lt;enumeration value="DTIM"/&gt;
 *     &lt;enumeration value="ENCS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TMSContactLevel2Code")
@XmlEnum
public enum TMSContactLevel2Code {


    /**
     * Terminal management system has to be contacted as soon as possible (for example after reconciliation).
     * 
     */
    ASAP,

    /**
     * Terminal management system has to be contacted before the next transaction.
     * 
     */
    CRIT,

    /**
     * Terminal management system has to be contacted at the date and time provided.
     * 
     */
    DTIM,

    /**
     * After the end of the customer session
     * 
     */
    ENCS;

    public String value() {
        return name();
    }

    public static TMSContactLevel2Code fromValue(String v) {
        return valueOf(v);
    }

}
