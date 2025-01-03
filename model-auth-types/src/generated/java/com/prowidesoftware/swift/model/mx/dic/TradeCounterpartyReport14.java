
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
@XmlType(name = "TradeCounterpartyReport14", propOrder = {
    "rptgCtrPty",
    "othrCtrPty",
    "brkr",
    "submitgAgt",
    "clrMmb",
    "bnfcry"
})
public class TradeCounterpartyReport14 {

    @XmlElement(name = "RptgCtrPty", required = true)
    protected Counterparty34 rptgCtrPty;
    @XmlElement(name = "OthrCtrPty", required = true)
    protected Counterparty31 othrCtrPty;
    @XmlElement(name = "Brkr")
    protected OrganisationIdentification10Choice brkr;
    @XmlElement(name = "SubmitgAgt")
    protected OrganisationIdentification10Choice submitgAgt;
    @XmlElement(name = "ClrMmb")
    protected OrganisationIdentification10Choice clrMmb;
    @XmlElement(name = "Bnfcry", required = true)
    protected List<PartyIdentification235Choice> bnfcry;

    /**
     * Gets the value of the rptgCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link Counterparty34 }
     *     
     */
    public Counterparty34 getRptgCtrPty() {
        return rptgCtrPty;
    }

    /**
     * Sets the value of the rptgCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Counterparty34 }
     *     
     */
    public TradeCounterpartyReport14 setRptgCtrPty(Counterparty34 value) {
        this.rptgCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the othrCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link Counterparty31 }
     *     
     */
    public Counterparty31 getOthrCtrPty() {
        return othrCtrPty;
    }

    /**
     * Sets the value of the othrCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Counterparty31 }
     *     
     */
    public TradeCounterpartyReport14 setOthrCtrPty(Counterparty31 value) {
        this.othrCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the brkr property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification10Choice }
     *     
     */
    public OrganisationIdentification10Choice getBrkr() {
        return brkr;
    }

    /**
     * Sets the value of the brkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification10Choice }
     *     
     */
    public TradeCounterpartyReport14 setBrkr(OrganisationIdentification10Choice value) {
        this.brkr = value;
        return this;
    }

    /**
     * Gets the value of the submitgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification10Choice }
     *     
     */
    public OrganisationIdentification10Choice getSubmitgAgt() {
        return submitgAgt;
    }

    /**
     * Sets the value of the submitgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification10Choice }
     *     
     */
    public TradeCounterpartyReport14 setSubmitgAgt(OrganisationIdentification10Choice value) {
        this.submitgAgt = value;
        return this;
    }

    /**
     * Gets the value of the clrMmb property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification10Choice }
     *     
     */
    public OrganisationIdentification10Choice getClrMmb() {
        return clrMmb;
    }

    /**
     * Sets the value of the clrMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification10Choice }
     *     
     */
    public TradeCounterpartyReport14 setClrMmb(OrganisationIdentification10Choice value) {
        this.clrMmb = value;
        return this;
    }

    /**
     * Gets the value of the bnfcry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bnfcry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBnfcry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification235Choice }
     * 
     * 
     * @return
     *     The value of the bnfcry property.
     */
    public List<PartyIdentification235Choice> getBnfcry() {
        if (bnfcry == null) {
            bnfcry = new ArrayList<>();
        }
        return this.bnfcry;
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

    /**
     * Adds a new item to the bnfcry list.
     * @see #getBnfcry()
     * 
     */
    public TradeCounterpartyReport14 addBnfcry(PartyIdentification235Choice bnfcry) {
        getBnfcry().add(bnfcry);
        return this;
    }

}
