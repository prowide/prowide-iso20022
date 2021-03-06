
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PenaltyListType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PenaltyListType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CURR"/&gt;
 *     &lt;enumeration value="FWAM"/&gt;
 *     &lt;enumeration value="FWIS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PenaltyListType1Code")
@XmlEnum
public enum PenaltyListType1Code {


    /**
     * To report the new penalties and the modified penalties in one single message /report.
     * 
     * 
     */
    CURR,

    /**
     * To report a penalty list that has been amended (that is the penalty list contains only updated and/or removed penalties that have already been previously reported in a FWIS Penalty List).
     * 
     */
    FWAM,

    /**
     * To report a daily penalty list created for the first time (that is the penalty list contains only newly computed penalties)
     * 
     */
    FWIS;

    public String value() {
        return name();
    }

    public static PenaltyListType1Code fromValue(String v) {
        return valueOf(v);
    }

}
