
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllegementStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AllegementStatus2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACPT"/&gt;
 *     &lt;enumeration value="PEND"/&gt;
 *     &lt;enumeration value="REJT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AllegementStatus2Code")
@XmlEnum
public enum AllegementStatus2Code {


    /**
     * Allegement has been accepted.
     * 
     */
    ACPT,

    /**
     * Allegement is pending.
     * 
     */
    PEND,

    /**
     * Transaction or report has been rejected.
     * 
     */
    REJT;

    public String value() {
        return name();
    }

    public static AllegementStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
