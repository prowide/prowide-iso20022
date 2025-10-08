
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Response3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Response3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APPR"/&gt;
 *     &lt;enumeration value="DECL"/&gt;
 *     &lt;enumeration value="FRTH"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="PRCS"/&gt;
 *     &lt;enumeration value="UNPR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Response3Code")
@XmlEnum
public enum Response3Code {


    /**
     * Service has been successfuly provided.
     * 
     */
    APPR,

    /**
     * Service is declined.
     * 
     */
    DECL,

    /**
     * Further action required to complete the transaction, for instance a referral.
     * 
     */
    FRTH,

    /**
     * Service has been partialy provided.
     * 
     */
    PART,

    /**
     * Advice message is processed.
     * 
     */
    PRCS,

    /**
     * Advice message could not be processed.
     * 
     */
    UNPR;

    public String value() {
        return name();
    }

    public static Response3Code fromValue(String v) {
        return valueOf(v);
    }

}
