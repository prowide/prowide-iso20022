
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
 * Specifies the details related to the parties involved in the securities lending transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionCounterpartyData11", propOrder = {
    "bnfcry",
    "trptyAgt",
    "brkr",
    "clrMmb",
    "sttlmPties",
    "agtLndr"
})
public class TransactionCounterpartyData11 {

    @XmlElement(name = "Bnfcry")
    protected PartyIdentification236Choice bnfcry;
    @XmlElement(name = "TrptyAgt")
    protected OrganisationIdentification15Choice trptyAgt;
    @XmlElement(name = "Brkr")
    protected OrganisationIdentification15Choice brkr;
    @XmlElement(name = "ClrMmb")
    protected OrganisationIdentification15Choice clrMmb;
    @XmlElement(name = "SttlmPties")
    protected SettlementParties34Choice sttlmPties;
    @XmlElement(name = "AgtLndr")
    protected OrganisationIdentification15Choice agtLndr;

    /**
     * Gets the value of the bnfcry property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification236Choice }
     *     
     */
    public PartyIdentification236Choice getBnfcry() {
        return bnfcry;
    }

    /**
     * Sets the value of the bnfcry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification236Choice }
     *     
     */
    public TransactionCounterpartyData11 setBnfcry(PartyIdentification236Choice value) {
        this.bnfcry = value;
        return this;
    }

    /**
     * Gets the value of the trptyAgt property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getTrptyAgt() {
        return trptyAgt;
    }

    /**
     * Sets the value of the trptyAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public TransactionCounterpartyData11 setTrptyAgt(OrganisationIdentification15Choice value) {
        this.trptyAgt = value;
        return this;
    }

    /**
     * Gets the value of the brkr property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getBrkr() {
        return brkr;
    }

    /**
     * Sets the value of the brkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public TransactionCounterpartyData11 setBrkr(OrganisationIdentification15Choice value) {
        this.brkr = value;
        return this;
    }

    /**
     * Gets the value of the clrMmb property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getClrMmb() {
        return clrMmb;
    }

    /**
     * Sets the value of the clrMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public TransactionCounterpartyData11 setClrMmb(OrganisationIdentification15Choice value) {
        this.clrMmb = value;
        return this;
    }

    /**
     * Gets the value of the sttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties34Choice }
     *     
     */
    public SettlementParties34Choice getSttlmPties() {
        return sttlmPties;
    }

    /**
     * Sets the value of the sttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties34Choice }
     *     
     */
    public TransactionCounterpartyData11 setSttlmPties(SettlementParties34Choice value) {
        this.sttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the agtLndr property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getAgtLndr() {
        return agtLndr;
    }

    /**
     * Sets the value of the agtLndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public TransactionCounterpartyData11 setAgtLndr(OrganisationIdentification15Choice value) {
        this.agtLndr = value;
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
