
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidityPeriodType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValidityPeriodType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FOKV"/&gt;
 *     &lt;enumeration value="GADV"/&gt;
 *     &lt;enumeration value="GASV"/&gt;
 *     &lt;enumeration value="GATV"/&gt;
 *     &lt;enumeration value="DAVY"/&gt;
 *     &lt;enumeration value="GTCV"/&gt;
 *     &lt;enumeration value="GTDV"/&gt;
 *     &lt;enumeration value="GTSV"/&gt;
 *     &lt;enumeration value="GTTV"/&gt;
 *     &lt;enumeration value="IOCV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ValidityPeriodType1Code")
@XmlEnum
public enum ValidityPeriodType1Code {


    /**
     * Orde executed upon its entering into the order book provided that it can be fully filled (e.g. in the event the order can only be partially executed, then it is automatically rejected and cannot therefore be executed).
     * 
     */
    FOKV,

    /**
     * Order being active only from the beginning of a pre-determined date.
     * 
     */
    GADV,

    /**
     * Order being active only from a pre-determined time on a pre-determined date. 
     * 
     */
    GASV,

    /**
     * Order being active only after a pre-determined time within the current trading session.
     * 
     */
    GATV,

    /**
     * Order expiring at the end of the trading day on which it was entered in the order book.
     * 
     */
    DAVY,

    /**
     * Order remaining active in the order book and be executable until it is actually cancelled
     * 
     */
    GTCV,

    /**
     * Order expiring at the end of a specified date.
     * 
     */
    GTDV,

    /**
     * Order expiring at a specified date and time. 
     * 
     */
    GTSV,

    /**
     * Order expiring at the latest at a pre-determined time within the current trading session.
     * 
     */
    GTTV,

    /**
     * Order executed upon its entering into the order book (for the quantity that can be executed) and which does not remain in the order book for the remaining quantity (if any) that has not been executed. 
     * 
     */
    IOCV;

    public String value() {
        return name();
    }

    public static ValidityPeriodType1Code fromValue(String v) {
        return valueOf(v);
    }

}
