
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LevelOfControl1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LevelOfControl1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TRAN"/&gt;
 *     &lt;enumeration value="VIEW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LevelOfControl1Code")
@XmlEnum
public enum LevelOfControl1Code {


    /**
     * Transactions are permitted on the account.
     * 
     */
    TRAN,

    /**
     * Account may be viewed only.
     * 
     */
    VIEW;

    public String value() {
        return name();
    }

    public static LevelOfControl1Code fromValue(String v) {
        return valueOf(v);
    }

}
