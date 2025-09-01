
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OptionType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CALL"/&gt;
 *     &lt;enumeration value="PUTO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OptionType1Code")
@XmlEnum
public enum OptionType1Code {


    /**
     * Right to buy a quantity of an asset for an agreed price at exercise date.
     * 
     */
    CALL,

    /**
     * Right to sell a quantity of an asset for an agreed price at exercise date.
     * 
     */
    PUTO;

    public String value() {
        return name();
    }

    public static OptionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
