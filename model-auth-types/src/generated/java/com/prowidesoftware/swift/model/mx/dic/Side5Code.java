
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Side5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Side5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SESH"/&gt;
 *     &lt;enumeration value="SELL"/&gt;
 *     &lt;enumeration value="SSEX"/&gt;
 *     &lt;enumeration value="UNDI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Side5Code")
@XmlEnum
public enum Side5Code {


    /**
     * An order to sell a security that the seller does not own; a sale effected by delivering a security borrowed by, or for the account of, the seller. Can only be executed on a plus or zero plus tick.
     * 
     */
    SESH,

    /**
     * Order is sell driven.
     * 
     */
    SELL,

    /**
     * Short sale exempt from short-sale rules.
     * 
     */
    SSEX,

    /**
     * The side of the indication of interest is not disclosed.
     * 
     */
    UNDI;

    public String value() {
        return name();
    }

    public static Side5Code fromValue(String v) {
        return valueOf(v);
    }

}
