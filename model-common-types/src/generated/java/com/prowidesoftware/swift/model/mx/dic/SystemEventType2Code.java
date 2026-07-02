
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemEventType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SystemEventType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LVCO"/&gt;
 *     &lt;enumeration value="LVCC"/&gt;
 *     &lt;enumeration value="LVRT"/&gt;
 *     &lt;enumeration value="EUSU"/&gt;
 *     &lt;enumeration value="STSU"/&gt;
 *     &lt;enumeration value="LWSU"/&gt;
 *     &lt;enumeration value="EUCO"/&gt;
 *     &lt;enumeration value="FIRE"/&gt;
 *     &lt;enumeration value="STDY"/&gt;
 *     &lt;enumeration value="LTNC"/&gt;
 *     &lt;enumeration value="CRCO"/&gt;
 *     &lt;enumeration value="RECC"/&gt;
 *     &lt;enumeration value="LTGC"/&gt;
 *     &lt;enumeration value="LTDC"/&gt;
 *     &lt;enumeration value="CUSC"/&gt;
 *     &lt;enumeration value="IBKC"/&gt;
 *     &lt;enumeration value="SYSC"/&gt;
 *     &lt;enumeration value="SSSC"/&gt;
 *     &lt;enumeration value="REOP"/&gt;
 *     &lt;enumeration value="PCOT"/&gt;
 *     &lt;enumeration value="NPCT"/&gt;
 *     &lt;enumeration value="ESTF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SystemEventType2Code")
@XmlEnum
public enum SystemEventType2Code {


    /**
     * Event is the cutoff time for low value payments processed by the system.
     * 
     */
    LVCO,

    /**
     * Event is the cutoff time after which low value payments can no longer be cancelled.
     * 
     */
    LVCC,

    /**
     * Event is the time at which the members will be provided with the report corresponding to the processing of low value payments.
     * 
     */
    LVRT,

    /**
     * Event is the opening of the Euro 1 system operation.
     * 
     */
    EUSU,

    /**
     * Event is the start of the Step 1 system operation.
     * 
     */
    STSU,

    /**
     * Event is the start of the limit warning period.
     * 
     */
    LWSU,

    /**
     * Event is the cutoff time for the Euro1 system, that is, the deadline for processing Euro1 transactions.
     * 
     */
    EUCO,

    /**
     * Event is the report after all operations have ceased in the system.
     * 
     */
    FIRE,

    /**
     * Event is the start of the operating day.
     * 
     */
    STDY,

    /**
     * Event is the cutoff for the settlement of the cash multilateral balances resulting from the overnight cycle of the securities settlement system.
     * 
     */
    LTNC,

    /**
     * Event is the cutoff for the cash reservation window.
     * 
     */
    CRCO,

    /**
     * Event is the cutoff for the settlement of the multilateral balances stemming from the retail clearing system.
     * 
     */
    RECC,

    /**
     * Event is the cutoff for the daytime cycle of the securities settlement system.
     * 
     */
    LTGC,

    /**
     * Event is the cutoff for the settlement of the cash multilateral balances resulting from the daylight cycle of the securities settlement system.
     * 
     */
    LTDC,

    /**
     * Event is the cutoff for customer payments.
     * 
     */
    CUSC,

    /**
     * Event is the cutoff for interbank payments.
     * 
     */
    IBKC,

    /**
     * Event is the cutoff for the system.
     * 
     */
    SYSC,

    /**
     * Event is the cutoff for the securities settlement system cash reservation window.
     * 
     */
    SSSC,

    /**
     * Event is the expected resume time for a TARGET component.
     * 
     */
    REOP,

    /**
     * Event is the cutoff time for the processing of payments.
     * 
     */
    PCOT,

    /**
     * Event is the cutoff time for the receipt of new commercial payments.
     * 
     */
    NPCT,

    /**
     * Event is the cut off for the standing facilities.
     * 
     */
    ESTF;

    public String value() {
        return name();
    }

    public static SystemEventType2Code fromValue(String v) {
        return valueOf(v);
    }

}
