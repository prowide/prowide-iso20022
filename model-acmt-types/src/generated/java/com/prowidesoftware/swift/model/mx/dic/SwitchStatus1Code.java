
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwitchStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SwitchStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACPT"/&gt;
 *     &lt;enumeration value="BTRQ"/&gt;
 *     &lt;enumeration value="BTRS"/&gt;
 *     &lt;enumeration value="COMP"/&gt;
 *     &lt;enumeration value="REDT"/&gt;
 *     &lt;enumeration value="REDE"/&gt;
 *     &lt;enumeration value="REJT"/&gt;
 *     &lt;enumeration value="REQU"/&gt;
 *     &lt;enumeration value="TMTN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SwitchStatus1Code")
@XmlEnum
public enum SwitchStatus1Code {


    /**
     * Account switch is accepted.
     * 
     * Usage: Accepted status should be used when account switch service receives and validates an information response request accepting the switch.
     * 
     */
    ACPT,

    /**
     * Account balance transfer is requested.
     * 
     * Usage: Balance transfer requested status should be used when account switch service receives and validates a request balance transfer request.
     * 
     */
    BTRQ,

    /**
     * Balance transfer responded.
     * 
     * Usage: Balance transfer responded staus should be used when the account switch service receives and validates an acknowledge balance transfer request.
     * 
     */
    BTRS,

    /**
     * Account switch is completed.
     * 
     * Usage: Completed status should be used when account switch service receives and validates a notify account switch complete request.
     * 
     */
    COMP,

    /**
     * Request for redirection. 
     * 
     * Usage: Redirection status should be used when the account switch service receives and validates the first redirection request.
     * 
     */
    REDT,

    /**
     * Redirection ended at the end of the redirection period. 
     * 
     * Usage: Indicates the cessation of account redirection by a particular service.
     * 
     */
    REDE,

    /**
     * Account switch is rejected. 
     * 
     * Usage: Rejected status should be used when account switch service receives and validates an information response request rejecting the account switch.
     * 
     */
    REJT,

    /**
     * Information is requested for the account switch. 
     * 
     * Usage: Requested status should be used when the account switch service receives and validates an information request.
     * 
     */
    REQU,

    /**
     * Account switch is terminated. 
     * 
     * Usage: Terminated status should be used when the account switch service receives and validates a terminate switch request.
     * 
     */
    TMTN;

    public String value() {
        return name();
    }

    public static SwitchStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
