
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceType12Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BalanceType12Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="XPCD"/&gt;
 *     &lt;enumeration value="OPAV"/&gt;
 *     &lt;enumeration value="ITAV"/&gt;
 *     &lt;enumeration value="CLAV"/&gt;
 *     &lt;enumeration value="FWAV"/&gt;
 *     &lt;enumeration value="CLBD"/&gt;
 *     &lt;enumeration value="ITBD"/&gt;
 *     &lt;enumeration value="OPBD"/&gt;
 *     &lt;enumeration value="PRCD"/&gt;
 *     &lt;enumeration value="INFO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BalanceType12Code")
@XmlEnum
public enum BalanceType12Code {


    /**
     * Balance, composed of booked entries and pending items known at the time of calculation, which projects the end of day balance if everything is booked on the account and no other entry is posted.
     * 
     */
    XPCD,

    /**
     * Opening balance of amount of money that is at the disposal of the account owner on the date specified.
     * 
     */
    OPAV,

    /**
     * Available balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.
     * 
     */
    ITAV,

    /**
     * Closing balance of amount of money that is at the disposal of the account owner on the date specified.
     * 
     */
    CLAV,

    /**
     * Forward available balance of money that is at the disposal of the account owner on the date specified.
     * 
     */
    FWAV,

    /**
     * Balance of the account at the end of the pre-agreed account reporting period. It is the sum of the opening booked balance at the beginning of the period and all entries booked to the account during the pre-agreed account reporting period.
     * 
     */
    CLBD,

    /**
     * Balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.
     * 
     */
    ITBD,

    /**
     * Book balance of the account at the beginning of the account reporting period. It always equals the closing book balance from the previous report.
     * 
     */
    OPBD,

    /**
     * Balance of the account at the previously closed account reporting period. The opening booked balance for the new period has to be equal to this balance. 
     * 
     * Usage: the previously booked closing balance should equal (inclusive date) the booked closing balance of the date it references and equal the actual booked opening balance of the current date.
     * 
     */
    PRCD,

    /**
     * Balance for informational purposes.
     * 
     */
    INFO;

    public String value() {
        return name();
    }

    public static BalanceType12Code fromValue(String v) {
        return valueOf(v);
    }

}
