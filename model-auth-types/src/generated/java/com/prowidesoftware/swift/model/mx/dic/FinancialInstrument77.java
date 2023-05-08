
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
 * Specifies further details of the financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrument77", propOrder = {
    "fndNttyId",
    "fndMgmtCpny",
    "fndAttrbts"
})
public class FinancialInstrument77 {

    @XmlElement(name = "FndNttyId", required = true)
    protected PartyIdentification194 fndNttyId;
    @XmlElement(name = "FndMgmtCpny", required = true)
    protected PartyIdentification195 fndMgmtCpny;
    @XmlElement(name = "FndAttrbts", required = true)
    protected FinancialInstrumentAttributes99 fndAttrbts;

    /**
     * Gets the value of the fndNttyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification194 }
     *     
     */
    public PartyIdentification194 getFndNttyId() {
        return fndNttyId;
    }

    /**
     * Sets the value of the fndNttyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification194 }
     *     
     */
    public FinancialInstrument77 setFndNttyId(PartyIdentification194 value) {
        this.fndNttyId = value;
        return this;
    }

    /**
     * Gets the value of the fndMgmtCpny property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification195 }
     *     
     */
    public PartyIdentification195 getFndMgmtCpny() {
        return fndMgmtCpny;
    }

    /**
     * Sets the value of the fndMgmtCpny property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification195 }
     *     
     */
    public FinancialInstrument77 setFndMgmtCpny(PartyIdentification195 value) {
        this.fndMgmtCpny = value;
        return this;
    }

    /**
     * Gets the value of the fndAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes99 }
     *     
     */
    public FinancialInstrumentAttributes99 getFndAttrbts() {
        return fndAttrbts;
    }

    /**
     * Sets the value of the fndAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes99 }
     *     
     */
    public FinancialInstrument77 setFndAttrbts(FinancialInstrumentAttributes99 value) {
        this.fndAttrbts = value;
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
