
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionStatementType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CorporateActionStatementType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MISS"/&gt;
 *     &lt;enumeration value="ALLL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CorporateActionStatementType1Code")
@XmlEnum
public enum CorporateActionStatementType1Code {


    /**
     * Statement contains missing instructions.
     * 
     */
    MISS,

    /**
     * Statement contains all instructions.
     * 
     */
    ALLL;

    public String value() {
        return name();
    }

    public static CorporateActionStatementType1Code fromValue(String v) {
        return valueOf(v);
    }

}
