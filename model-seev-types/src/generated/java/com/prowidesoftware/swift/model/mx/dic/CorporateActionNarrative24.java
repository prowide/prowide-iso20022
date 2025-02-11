
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
 * Provides additional information such as the taxation conditions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionNarrative24", propOrder = {
    "offerr",
    "newCpnyNm",
    "urlAdr"
})
public class CorporateActionNarrative24 {

    @XmlElement(name = "Offerr")
    protected List<UpdatedAdditionalInformation3> offerr;
    @XmlElement(name = "NewCpnyNm")
    protected UpdatedAdditionalInformation3 newCpnyNm;
    @XmlElement(name = "URLAdr")
    protected UpdatedURLlnformation urlAdr;

    /**
     * Gets the value of the offerr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the offerr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdatedAdditionalInformation3 }
     * 
     * 
     * @return
     *     The value of the offerr property.
     */
    public List<UpdatedAdditionalInformation3> getOfferr() {
        if (offerr == null) {
            offerr = new ArrayList<>();
        }
        return this.offerr;
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
    public CorporateActionNarrative24 setNewCpnyNm(UpdatedAdditionalInformation3 value) {
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
    public CorporateActionNarrative24 setURLAdr(UpdatedURLlnformation value) {
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

    /**
     * Adds a new item to the offerr list.
     * @see #getOfferr()
     * 
     */
    public CorporateActionNarrative24 addOfferr(UpdatedAdditionalInformation3 offerr) {
        getOfferr().add(offerr);
        return this;
    }

}
