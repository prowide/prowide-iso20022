
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementUpdateType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatementUpdateType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COMP"/&gt;
 *     &lt;enumeration value="DELT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StatementUpdateType1Code")
@XmlEnum
public enum StatementUpdateType1Code {


    /**
     * Statement is complete.
     * 
     */
    COMP,

    /**
     * Statement contains changes only.
     * 
     */
    DELT;

    public String value() {
        return name();
    }

    public static StatementUpdateType1Code fromValue(String v) {
        return valueOf(v);
    }

}
