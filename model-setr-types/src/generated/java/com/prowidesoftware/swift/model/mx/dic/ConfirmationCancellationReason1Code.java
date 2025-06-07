
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfirmationCancellationReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConfirmationCancellationReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CSHN"/&gt;
 *     &lt;enumeration value="REPL"/&gt;
 *     &lt;enumeration value="BENA"/&gt;
 *     &lt;enumeration value="CSHW"/&gt;
 *     &lt;enumeration value="DISA"/&gt;
 *     &lt;enumeration value="DISC"/&gt;
 *     &lt;enumeration value="EXCH"/&gt;
 *     &lt;enumeration value="FEEE"/&gt;
 *     &lt;enumeration value="DQUA"/&gt;
 *     &lt;enumeration value="FENA"/&gt;
 *     &lt;enumeration value="GROA"/&gt;
 *     &lt;enumeration value="GROC"/&gt;
 *     &lt;enumeration value="NETA"/&gt;
 *     &lt;enumeration value="NETC"/&gt;
 *     &lt;enumeration value="OPER"/&gt;
 *     &lt;enumeration value="MINI"/&gt;
 *     &lt;enumeration value="DMON"/&gt;
 *     &lt;enumeration value="NCRR"/&gt;
 *     &lt;enumeration value="DDAT"/&gt;
 *     &lt;enumeration value="SETS"/&gt;
 *     &lt;enumeration value="DDEA"/&gt;
 *     &lt;enumeration value="REFE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConfirmationCancellationReason1Code")
@XmlEnum
public enum ConfirmationCancellationReason1Code {


    /**
     * Confirmation is cancelled because the cash has not been received.
     * 
     */
    CSHN,

    /**
     * Confirmation is cancelled because it will be replaced.
     * 
     */
    REPL,

    /**
     * Confirmation is cancelled because the back end load amount is incorrect.
     * 
     */
    BENA,

    /**
     * Confirmation is cancelled because the cash amount is incorrect.
     * 
     */
    CSHW,

    /**
     * Confirmation is cancelled because the discount amount is incorrect.
     * 
     */
    DISA,

    /**
     * Confirmation is cancelled because the discount amount has an incorrect currency.
     * 
     */
    DISC,

    /**
     * Confirmation is cancelled because the exchange rate is incorrect.
     * 
     */
    EXCH,

    /**
     * Confirmation is cancelled because a fee or commission amount is incorrect.
     * 
     */
    FEEE,

    /**
     * Confirmation is cancelled because the financial instrument quantity is incorrect.
     * 
     */
    DQUA,

    /**
     * Confirmation is cancelled because the front end load amount is incorrect.
     * 
     */
    FENA,

    /**
     * Confirmation is cancelled because the gross amount is incorrect.
     * 
     */
    GROA,

    /**
     * Confirmation is cancelled because the gross amount has an incorrect currency.
     * 
     */
    GROC,

    /**
     * Confirmation is cancelled because the net amount is incorrect.
     * 
     */
    NETA,

    /**
     * Confirmation is cancelled because the net amount has an incorrect currency.
     * 
     */
    NETC,

    /**
     * Confirmation is cancelled because of an incorrect operation.
     * 
     */
    OPER,

    /**
     * Confirmation is cancelled because of an incorrect minimum traded quantity or cash amount.
     * 
     */
    MINI,

    /**
     * Confirmation is cancelled because the settlement amount is incorrect.
     * 
     */
    DMON,

    /**
     * Confirmation is cancelled because the settlement amount has an incorrect currency.
     * 
     */
    NCRR,

    /**
     * Confirmation is cancelled because the settlement date is incorrect.
     * 
     */
    DDAT,

    /**
     * Confirmation is cancelled because the settlement method is incorrect.
     * 
     */
    SETS,

    /**
     * Confirmation is cancelled because the trade date is incorrect.
     * 
     */
    DDEA,

    /**
     * Confirmation contains an invalid business reference.
     * 
     */
    REFE;

    public String value() {
        return name();
    }

    public static ConfirmationCancellationReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
