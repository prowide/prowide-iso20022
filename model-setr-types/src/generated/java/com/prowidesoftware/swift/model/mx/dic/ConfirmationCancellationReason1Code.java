
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfirmationCancellationReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ConfirmationCancellationReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CSHN"/>
 *     <enumeration value="REPL"/>
 *     <enumeration value="BENA"/>
 *     <enumeration value="CSHW"/>
 *     <enumeration value="DISA"/>
 *     <enumeration value="DISC"/>
 *     <enumeration value="EXCH"/>
 *     <enumeration value="FEEE"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="FENA"/>
 *     <enumeration value="GROA"/>
 *     <enumeration value="GROC"/>
 *     <enumeration value="NETA"/>
 *     <enumeration value="NETC"/>
 *     <enumeration value="OPER"/>
 *     <enumeration value="MINI"/>
 *     <enumeration value="DMON"/>
 *     <enumeration value="NCRR"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="SETS"/>
 *     <enumeration value="DDEA"/>
 *     <enumeration value="REFE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
