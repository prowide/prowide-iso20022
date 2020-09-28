
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Identification of a settlement party by a choice between a BIC or a name and address or a party identification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementParties29", propOrder = {
    "dlvryAgt",
    "intrmy",
    "rcvgAgt",
    "bnfcryInstn"
})
public class SettlementParties29 {

    @XmlElement(name = "DlvryAgt")
    protected PartyIdentification73Choice dlvryAgt;
    @XmlElement(name = "Intrmy")
    protected PartyIdentification73Choice intrmy;
    @XmlElement(name = "RcvgAgt", required = true)
    protected PartyIdentification73Choice rcvgAgt;
    @XmlElement(name = "BnfcryInstn")
    protected PartyIdentification73Choice bnfcryInstn;

    /**
     * Gets the value of the dlvryAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public PartyIdentification73Choice getDlvryAgt() {
        return dlvryAgt;
    }

    /**
     * Sets the value of the dlvryAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public SettlementParties29 setDlvryAgt(PartyIdentification73Choice value) {
        this.dlvryAgt = value;
        return this;
    }

    /**
     * Gets the value of the intrmy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public PartyIdentification73Choice getIntrmy() {
        return intrmy;
    }

    /**
     * Sets the value of the intrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public SettlementParties29 setIntrmy(PartyIdentification73Choice value) {
        this.intrmy = value;
        return this;
    }

    /**
     * Gets the value of the rcvgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public PartyIdentification73Choice getRcvgAgt() {
        return rcvgAgt;
    }

    /**
     * Sets the value of the rcvgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public SettlementParties29 setRcvgAgt(PartyIdentification73Choice value) {
        this.rcvgAgt = value;
        return this;
    }

    /**
     * Gets the value of the bnfcryInstn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public PartyIdentification73Choice getBnfcryInstn() {
        return bnfcryInstn;
    }

    /**
     * Sets the value of the bnfcryInstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public SettlementParties29 setBnfcryInstn(PartyIdentification73Choice value) {
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
