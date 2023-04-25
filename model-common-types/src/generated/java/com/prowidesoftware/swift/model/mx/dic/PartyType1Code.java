
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PartyType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EXEC"/>
 *     <enumeration value="BROK"/>
 *     <enumeration value="CORR"/>
 *     <enumeration value="COFI"/>
 *     <enumeration value="COCL"/>
 *     <enumeration value="UNDE"/>
 *     <enumeration value="GIVE"/>
 *     <enumeration value="ORDE"/>
 *     <enumeration value="SPON"/>
 *     <enumeration value="CLEA"/>
 *     <enumeration value="INTR"/>
 *     <enumeration value="ENTE"/>
 *     <enumeration value="CLIE"/>
 *     <enumeration value="STEP"/>
 *     <enumeration value="AFFI"/>
 *     <enumeration value="ETC1"/>
 *     <enumeration value="ETC2"/>
 *     <enumeration value="INVE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PartyType1Code")
@XmlEnum
public enum PartyType1Code {


    /**
     * Party that identifies an executing / give-up broker.
     * 
     */
    EXEC("EXEC"),

    /**
     * Party that receives the trade credit.
     * 
     */
    BROK("BROK"),

    /**
     * Party that is going to carry the position on their books at another clearinghouse (exchanges).
     * 
     */
    CORR("CORR"),

    /**
     * Party that is the counterparty in a trade.
     * 
     */
    COFI("COFI"),

    /**
     * Party that is the clearing firm of the counterparty in a trade.
     * 
     */
    COCL("COCL"),

    /**
     * Party (broker or other firm), which is the contra side of the trade for the underlying security.
     * 
     */
    UNDE("UNDE"),

    /**
     * Party to which the trade is given up (carries the position that results from a trade).
     * 
     */
    GIVE("GIVE"),

    /**
     * Party that originates an order.
     * 
     */
    ORDE("ORDE"),

    /**
     * Party (member of an exchange)that is sponsoring an entering firm to send orders directly to the exchange.
     * 
     */
    SPON("SPON"),

    /**
     * Party (broker) that settles security transactions from another broker for a fee = take up broker.
     * 
     */
    CLEA("CLEA"),

    /**
     * Party that can relay an order directly to the trading floor, or give clients direct access to the floor. The introducing firm delegates the work of the floor operation, trade execution and accounting.
     * 
     */
    INTR("INTR"),

    /**
     * Party that has recorded or reported an execution of a trade. When an entering firm that is not a party to a trade enters the trade into a trade recording system, any inquiries can be directed to the appropriate source.
     * 
     */
    ENTE("ENTE"),

    /**
     * A client is identified in third party-transactions or for investor in intermediary transactions.
     * 
     */
    CLIE("CLIE"),

    /**
     * Broker to which the investment manager directs the execution of a portion of the trade.
     * 
     */
    STEP("STEP"),

    /**
     * Party (buyer or seller) that positively affirms the details of a previously agreed security trade confirmation.
     * 
     */
    AFFI("AFFI"),

    /**
     * Party acting as the Electronic Trade Confirmation (ETC) service provider 1.
     * 
     */
    @XmlEnumValue("ETC1")
    ETC_1("ETC1"),

    /**
     * Party acting as the Electronic Trade Confirmation (ETC) service provider 2.
     * 
     */
    @XmlEnumValue("ETC2")
    ETC_2("ETC2"),

    /**
     * Party, either an individual or organisation, whose assets are being invested.
     * 
     */
    INVE("INVE");
    private final String value;

    PartyType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PartyType1Code fromValue(String v) {
        for (PartyType1Code c: PartyType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
