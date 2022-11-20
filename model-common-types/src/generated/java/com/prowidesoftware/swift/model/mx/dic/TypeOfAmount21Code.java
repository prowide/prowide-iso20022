
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfAmount21Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfAmount21Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INTC"/&gt;
 *     &lt;enumeration value="FEEP"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="FEEA"/&gt;
 *     &lt;enumeration value="CSIF"/&gt;
 *     &lt;enumeration value="MXIF"/&gt;
 *     &lt;enumeration value="MNIF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfAmount21Code")
@XmlEnum
public enum TypeOfAmount21Code {


    /**
     * Interchange fee.
     * 
     */
    INTC,

    /**
     * Processing fees.
     * 
     */
    FEEP,

    /**
     * Other type of amount defined at national level.
     * 
     */
    OTHN,

    /**
     * Other type of amount defined at private level.
     * 
     */
    OTHP,

    /**
     * International service assessment fees.
     * 
     */
    FEEA,

    /**
     * Interchange fee applicable to cash back amount.
     * 
     */
    CSIF,

    /**
     * Maximum applicable interchange fee.
     * 
     */
    MXIF,

    /**
     * Minimum interchange fee applicable.
     * 
     */
    MNIF;

    public String value() {
        return name();
    }

    public static TypeOfAmount21Code fromValue(String v) {
        return valueOf(v);
    }

}
