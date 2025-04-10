
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionStatementType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CorporateActionStatementType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MISS"/&gt;
 *     &lt;enumeration value="ALLL"/&gt;
 *     &lt;enumeration value="BALO"/&gt;
 *     &lt;enumeration value="BALI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CorporateActionStatementType2Code")
@XmlEnum
public enum CorporateActionStatementType2Code {


    /**
     * Statement contains missing instructions.
     * 
     */
    MISS,

    /**
     * Statement contains all instructions.
     * 
     */
    ALLL,

    /**
     * Balance information with no instruction details provided.
     * 
     */
    BALO,

    /**
     * Balance information with instruction details.
     * 
     */
    BALI;

    public String value() {
        return name();
    }

    public static CorporateActionStatementType2Code fromValue(String v) {
        return valueOf(v);
    }

}
