
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChequePartyRole1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChequePartyRole1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DWEA"/&gt;
 *     &lt;enumeration value="DWRA"/&gt;
 *     &lt;enumeration value="PAYE"/&gt;
 *     &lt;enumeration value="PAYR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChequePartyRole1Code")
@XmlEnum
public enum ChequePartyRole1Code {


    /**
     * Specifies the agent on which a cheque is drawn, that is the financial institution that services the account of the payee that issued the cheque.
     * 
     */
    DWEA,

    /**
     * Specifies the agent servicing the account of the cheque payer.
     * 
     */
    DWRA,

    /**
     * Party that receives an amount of money as specified in the cheque.
     * 
     */
    PAYE,

    /**
     * Party that issues a cheque ordering the drawee agent to pay a specific amount, upon demand, to the payee.
     * 
     */
    PAYR;

    public String value() {
        return name();
    }

    public static ChequePartyRole1Code fromValue(String v) {
        return valueOf(v);
    }

}
