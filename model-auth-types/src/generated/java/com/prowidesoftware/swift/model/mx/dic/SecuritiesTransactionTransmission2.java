
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
 * Specifies the securities order transmission attributes.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionTransmission2", propOrder = {
    "trnsmssnInd",
    "trnsmttgBuyr",
    "trnsmttgSellr"
})
public class SecuritiesTransactionTransmission2 {

    @XmlElement(name = "TrnsmssnInd")
    protected boolean trnsmssnInd;
    @XmlElement(name = "TrnsmttgBuyr")
    protected String trnsmttgBuyr;
    @XmlElement(name = "TrnsmttgSellr")
    protected String trnsmttgSellr;

    /**
     * Gets the value of the trnsmssnInd property.
     * 
     */
    public boolean isTrnsmssnInd() {
        return trnsmssnInd;
    }

    /**
     * Sets the value of the trnsmssnInd property.
     * 
     */
    public SecuritiesTransactionTransmission2 setTrnsmssnInd(boolean value) {
        this.trnsmssnInd = value;
        return this;
    }

    /**
     * Gets the value of the trnsmttgBuyr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnsmttgBuyr() {
        return trnsmttgBuyr;
    }

    /**
     * Sets the value of the trnsmttgBuyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesTransactionTransmission2 setTrnsmttgBuyr(String value) {
        this.trnsmttgBuyr = value;
        return this;
    }

    /**
     * Gets the value of the trnsmttgSellr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnsmttgSellr() {
        return trnsmttgSellr;
    }

    /**
     * Sets the value of the trnsmttgSellr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesTransactionTransmission2 setTrnsmttgSellr(String value) {
        this.trnsmttgSellr = value;
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
