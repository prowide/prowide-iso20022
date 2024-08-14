
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides a settlement party by a choice between a BIC or a name and address or a party identification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementParties120", propOrder = {
    "dlvryAgt",
    "intrmy",
    "rcvgAgt",
    "bnfcryInstn"
})
public class SettlementParties120 {

    @XmlElement(name = "DlvryAgt")
    protected PartyIdentification242Choice dlvryAgt;
    @XmlElement(name = "Intrmy")
    protected PartyIdentification242Choice intrmy;
    @XmlElement(name = "RcvgAgt", required = true)
    protected PartyIdentification242Choice rcvgAgt;
    @XmlElement(name = "BnfcryInstn")
    protected PartyIdentification242Choice bnfcryInstn;

    /**
     * Gets the value of the dlvryAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getDlvryAgt() {
        return dlvryAgt;
    }

    /**
     * Sets the value of the dlvryAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public SettlementParties120 setDlvryAgt(PartyIdentification242Choice value) {
        this.dlvryAgt = value;
        return this;
    }

    /**
     * Gets the value of the intrmy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getIntrmy() {
        return intrmy;
    }

    /**
     * Sets the value of the intrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public SettlementParties120 setIntrmy(PartyIdentification242Choice value) {
        this.intrmy = value;
        return this;
    }

    /**
     * Gets the value of the rcvgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getRcvgAgt() {
        return rcvgAgt;
    }

    /**
     * Sets the value of the rcvgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public SettlementParties120 setRcvgAgt(PartyIdentification242Choice value) {
        this.rcvgAgt = value;
        return this;
    }

    /**
     * Gets the value of the bnfcryInstn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getBnfcryInstn() {
        return bnfcryInstn;
    }

    /**
     * Sets the value of the bnfcryInstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public SettlementParties120 setBnfcryInstn(PartyIdentification242Choice value) {
        this.bnfcryInstn = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
