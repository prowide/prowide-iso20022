
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementBasis1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatementBasis1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CONT"/&gt;
 *     &lt;enumeration value="SETT"/&gt;
 *     &lt;enumeration value="TRAD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StatementBasis1Code")
@XmlEnum
public enum StatementBasis1Code {


    /**
     * The statement is based on contractual settlement date irrespective of settled data positions.
     * 
     */
    CONT,

    /**
     * The statement is based on settled date positions to the knowledge of the sender at the time of the statement preparation.
     * 
     */
    SETT,

    /**
     * The statement is based on trade date positions.
     * 
     */
    TRAD;

    public String value() {
        return name();
    }

    public static StatementBasis1Code fromValue(String v) {
        return valueOf(v);
    }

}
