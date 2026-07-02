
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
 * Provides additional information such as the taxation conditions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionNarrative18", propOrder = {
    "offerr",
    "newCpnyNm",
    "urlAdr"
})
public class CorporateActionNarrative18 {

    @XmlElement(name = "Offerr")
    protected UpdatedAdditionalInformation6 offerr;
    @XmlElement(name = "NewCpnyNm")
    protected UpdatedAdditionalInformation6 newCpnyNm;
    @XmlElement(name = "URLAdr")
    protected UpdatedURLlnformation1 urlAdr;

    /**
     * Gets the value of the offerr property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation6 }
     *     
     */
    public UpdatedAdditionalInformation6 getOfferr() {
        return offerr;
    }

    /**
     * Sets the value of the offerr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation6 }
     *     
     */
    public CorporateActionNarrative18 setOfferr(UpdatedAdditionalInformation6 value) {
        this.offerr = value;
        return this;
    }

    /**
     * Gets the value of the newCpnyNm property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation6 }
     *     
     */
    public UpdatedAdditionalInformation6 getNewCpnyNm() {
        return newCpnyNm;
    }

    /**
     * Sets the value of the newCpnyNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation6 }
     *     
     */
    public CorporateActionNarrative18 setNewCpnyNm(UpdatedAdditionalInformation6 value) {
        this.newCpnyNm = value;
        return this;
    }

    /**
     * Gets the value of the urlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedURLlnformation1 }
     *     
     */
    public UpdatedURLlnformation1 getURLAdr() {
        return urlAdr;
    }

    /**
     * Sets the value of the urlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedURLlnformation1 }
     *     
     */
    public CorporateActionNarrative18 setURLAdr(UpdatedURLlnformation1 value) {
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
