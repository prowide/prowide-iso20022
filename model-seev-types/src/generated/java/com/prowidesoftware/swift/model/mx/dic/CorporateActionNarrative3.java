
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
 * Provides additional information such as the taxation conditions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionNarrative3", propOrder = {
    "offerr",
    "newCpnyNm",
    "urlAdr"
})
public class CorporateActionNarrative3 {

    @XmlElement(name = "Offerr")
    protected UpdatedAdditionalInformation3 offerr;
    @XmlElement(name = "NewCpnyNm")
    protected UpdatedAdditionalInformation3 newCpnyNm;
    @XmlElement(name = "URLAdr")
    protected UpdatedURLlnformation urlAdr;

    /**
     * Gets the value of the offerr property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation3 }
     *     
     */
    public UpdatedAdditionalInformation3 getOfferr() {
        return offerr;
    }

    /**
     * Sets the value of the offerr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation3 }
     *     
     */
    public CorporateActionNarrative3 setOfferr(UpdatedAdditionalInformation3 value) {
        this.offerr = value;
        return this;
    }

    /**
     * Gets the value of the newCpnyNm property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation3 }
     *     
     */
    public UpdatedAdditionalInformation3 getNewCpnyNm() {
        return newCpnyNm;
    }

    /**
     * Sets the value of the newCpnyNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation3 }
     *     
     */
    public CorporateActionNarrative3 setNewCpnyNm(UpdatedAdditionalInformation3 value) {
        this.newCpnyNm = value;
        return this;
    }

    /**
     * Gets the value of the urlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedURLlnformation }
     *     
     */
    public UpdatedURLlnformation getURLAdr() {
        return urlAdr;
    }

    /**
     * Sets the value of the urlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedURLlnformation }
     *     
     */
    public CorporateActionNarrative3 setURLAdr(UpdatedURLlnformation value) {
        this.urlAdr = value;
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
