
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessedStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessedStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RECE"/&gt;
 *     &lt;enumeration value="SENT"/&gt;
 *     &lt;enumeration value="WARN"/&gt;
 *     &lt;enumeration value="PACK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProcessedStatus1Code")
@XmlEnum
public enum ProcessedStatus1Code {


    /**
     * The instruction/request has been received.
     * 
     */
    RECE,

    /**
     * The advice has been sent to the market.
     * 
     */
    SENT,

    /**
     * The announcement has been accepted but another source has provided different information.
     * 
     */
    WARN,

    /**
     * The request is accepted.
     * 
     */
    PACK;

    public String value() {
        return name();
    }

    public static ProcessedStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
