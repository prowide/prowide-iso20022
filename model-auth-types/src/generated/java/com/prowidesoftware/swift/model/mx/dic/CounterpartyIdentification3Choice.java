
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
 * Provides the identification of the reporting agent counterparty.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartyIdentification3Choice", propOrder = {
    "lei",
    "sctrAndLctn",
    "nmAndLctn"
})
public class CounterpartyIdentification3Choice {

    @XmlElement(name = "LEI")
    protected String lei;
    @XmlElement(name = "SctrAndLctn")
    protected SectorAndLocation1 sctrAndLctn;
    @XmlElement(name = "NmAndLctn")
    protected NameAndLocation1 nmAndLctn;

    /**
     * Gets the value of the lei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEI() {
        return lei;
    }

    /**
     * Sets the value of the lei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CounterpartyIdentification3Choice setLEI(String value) {
        this.lei = value;
        return this;
    }

    /**
     * Gets the value of the sctrAndLctn property.
     * 
     * @return
     *     possible object is
     *     {@link SectorAndLocation1 }
     *     
     */
    public SectorAndLocation1 getSctrAndLctn() {
        return sctrAndLctn;
    }

    /**
     * Sets the value of the sctrAndLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectorAndLocation1 }
     *     
     */
    public CounterpartyIdentification3Choice setSctrAndLctn(SectorAndLocation1 value) {
        this.sctrAndLctn = value;
        return this;
    }

    /**
     * Gets the value of the nmAndLctn property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndLocation1 }
     *     
     */
    public NameAndLocation1 getNmAndLctn() {
        return nmAndLctn;
    }

    /**
     * Sets the value of the nmAndLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndLocation1 }
     *     
     */
    public CounterpartyIdentification3Choice setNmAndLctn(NameAndLocation1 value) {
        this.nmAndLctn = value;
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
