
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
 * Environment of the reconciliation exchange.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentEnvironment7", propOrder = {
    "acqrr",
    "mrchntId",
    "poiId"
})
public class CardPaymentEnvironment7 {

    @XmlElement(name = "Acqrr", required = true)
    protected Acquirer1 acqrr;
    @XmlElement(name = "MrchntId")
    protected GenericIdentification32 mrchntId;
    @XmlElement(name = "POIId")
    protected GenericIdentification32 poiId;

    /**
     * Gets the value of the acqrr property.
     * 
     * @return
     *     possible object is
     *     {@link Acquirer1 }
     *     
     */
    public Acquirer1 getAcqrr() {
        return acqrr;
    }

    /**
     * Sets the value of the acqrr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acquirer1 }
     *     
     */
    public CardPaymentEnvironment7 setAcqrr(Acquirer1 value) {
        this.acqrr = value;
        return this;
    }

    /**
     * Gets the value of the mrchntId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification32 }
     *     
     */
    public GenericIdentification32 getMrchntId() {
        return mrchntId;
    }

    /**
     * Sets the value of the mrchntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification32 }
     *     
     */
    public CardPaymentEnvironment7 setMrchntId(GenericIdentification32 value) {
        this.mrchntId = value;
        return this;
    }

    /**
     * Gets the value of the poiId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification32 }
     *     
     */
    public GenericIdentification32 getPOIId() {
        return poiId;
    }

    /**
     * Sets the value of the poiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification32 }
     *     
     */
    public CardPaymentEnvironment7 setPOIId(GenericIdentification32 value) {
        this.poiId = value;
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
