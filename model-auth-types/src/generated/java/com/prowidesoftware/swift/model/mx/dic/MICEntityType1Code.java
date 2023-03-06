
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MICEntityType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MICEntityType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APPA"/&gt;
 *     &lt;enumeration value="CTPS"/&gt;
 *     &lt;enumeration value="MLTF"/&gt;
 *     &lt;enumeration value="OTFS"/&gt;
 *     &lt;enumeration value="RMKT"/&gt;
 *     &lt;enumeration value="SINT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MICEntityType1Code")
@XmlEnum
public enum MICEntityType1Code {


    /**
     * Person authorised under the provisions established in the regulation to provide the service of publishing trade reports on behalf of investment firms.
     * 
     */
    APPA,

    /**
     * Provider which will consolidate post-trade information into a continuous electronic data stream and make it publicly available as close to real time as technologically possible on a reasonable commercial basis and free of charge after 15 minutes.
     * 
     */
    CTPS,

    /**
     * Multilateral system which brings together multiple third-party buying and selling interests in financial instruments in a way that results in a contract.
     * 
     */
    MLTF,

    /**
     * Multilateral system which is not a regulated market or multilateral trading facility in which multiple third-party buying and selling interests in bonds, structured finance products, emission allowances or derivatives are able to interact in a way that results in a contract.
     * 
     */
    OTFS,

    /**
     * Market on which financial instruments can be traded according to rules defined by the stock exchange.
     * 
     */
    RMKT,

    /**
     * Investment firm which, on an organised, frequent systematic and substantial basis, deals on own account when executing client orders outside a regulated market, an multilateral trading facility or an organised trading facility without operating a multilateral system.
     * 
     */
    SINT;

    public String value() {
        return name();
    }

    public static MICEntityType1Code fromValue(String v) {
        return valueOf(v);
    }

}
