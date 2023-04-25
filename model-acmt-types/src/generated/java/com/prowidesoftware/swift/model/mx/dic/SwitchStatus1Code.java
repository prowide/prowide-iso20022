
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwitchStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SwitchStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACPT"/>
 *     <enumeration value="BTRQ"/>
 *     <enumeration value="BTRS"/>
 *     <enumeration value="COMP"/>
 *     <enumeration value="REDT"/>
 *     <enumeration value="REDE"/>
 *     <enumeration value="REJT"/>
 *     <enumeration value="REQU"/>
 *     <enumeration value="TMTN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
