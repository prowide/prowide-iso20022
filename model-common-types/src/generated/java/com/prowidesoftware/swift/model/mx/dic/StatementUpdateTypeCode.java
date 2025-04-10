
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementUpdateTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatementUpdateTypeCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COMP"/&gt;
 *     &lt;enumeration value="DELT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StatementUpdateTypeCode")
@XmlEnum
public enum StatementUpdateTypeCode {


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

    public static StatementUpdateTypeCode fromValue(String v) {
        return valueOf(v);
    }

}
