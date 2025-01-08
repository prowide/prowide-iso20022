
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
 * Information related to parties in the contract.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeCounterpartyReport9", propOrder = {
    "rptgCtrPty",
    "othrCtrPty",
    "brkr",
    "submitgAgt",
    "clrMmb",
    "bnfcry"
})
public class TradeCounterpartyReport9 {

    @XmlElement(name = "RptgCtrPty", required = true)
    protected Counterparty26 rptgCtrPty;
    @XmlElement(name = "OthrCtrPty", required = true)
    protected Counterparty29 othrCtrPty;
    @XmlElement(name = "Brkr")
    protected OrganisationIdentification9Choice brkr;
    @XmlElement(name = "SubmitgAgt")
    protected OrganisationIdentification9Choice submitgAgt;
    @XmlElement(name = "ClrMmb")
    protected OrganisationIdentification9Choice clrMmb;
    @XmlElement(name = "Bnfcry")
    protected OrganisationIdentification9Choice bnfcry;

    /**
     * Gets the value of the rptgCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link Counterparty26 }
     *     
     */
    public Counterparty26 getRptgCtrPty() {
        return rptgCtrPty;
    }

    /**
     * Sets the value of the rptgCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Counterparty26 }
     *     
     */
    public TradeCounterpartyReport9 setRptgCtrPty(Counterparty26 value) {
        this.rptgCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the othrCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link Counterparty29 }
     *     
     */
    public Counterparty29 getOthrCtrPty() {
        return othrCtrPty;
    }

    /**
     * Sets the value of the othrCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Counterparty29 }
     *     
     */
    public TradeCounterpartyReport9 setOthrCtrPty(Counterparty29 value) {
        this.othrCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the brkr property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification9Choice }
     *     
     */
    public OrganisationIdentification9Choice getBrkr() {
        return brkr;
    }

    /**
     * Sets the value of the brkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification9Choice }
     *     
     */
    public TradeCounterpartyReport9 setBrkr(OrganisationIdentification9Choice value) {
        this.brkr = value;
        return this;
    }

    /**
     * Gets the value of the submitgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification9Choice }
     *     
     */
    public OrganisationIdentification9Choice getSubmitgAgt() {
        return submitgAgt;
    }

    /**
     * Sets the value of the submitgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification9Choice }
     *     
     */
    public TradeCounterpartyReport9 setSubmitgAgt(OrganisationIdentification9Choice value) {
        this.submitgAgt = value;
        return this;
    }

    /**
     * Gets the value of the clrMmb property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification9Choice }
     *     
     */
    public OrganisationIdentification9Choice getClrMmb() {
        return clrMmb;
    }

    /**
     * Sets the value of the clrMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification9Choice }
     *     
     */
    public TradeCounterpartyReport9 setClrMmb(OrganisationIdentification9Choice value) {
        this.clrMmb = value;
        return this;
    }

    /**
     * Gets the value of the bnfcry property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification9Choice }
     *     
     */
    public OrganisationIdentification9Choice getBnfcry() {
        return bnfcry;
    }

    /**
     * Sets the value of the bnfcry property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification9Choice }
     *     
     */
    public TradeCounterpartyReport9 setBnfcry(OrganisationIdentification9Choice value) {
        this.bnfcry = value;
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
