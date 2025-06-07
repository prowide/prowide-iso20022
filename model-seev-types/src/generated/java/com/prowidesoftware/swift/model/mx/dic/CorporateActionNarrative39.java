
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
@XmlType(name = "CorporateActionNarrative39", propOrder = {
    "offerr",
    "newCpnyNm",
    "urlAdr"
})
public class CorporateActionNarrative39 {

    @XmlElement(name = "Offerr")
    protected List<UpdatedAdditionalInformation6> offerr;
    @XmlElement(name = "NewCpnyNm")
    protected UpdatedAdditionalInformation6 newCpnyNm;
    @XmlElement(name = "URLAdr")
    protected UpdatedURLlnformation3 urlAdr;

    /**
     * Gets the value of the offerr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerr property.
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
     * {@link UpdatedAdditionalInformation6 }
     * 
     * 
     */
    public List<UpdatedAdditionalInformation6> getOfferr() {
        if (offerr == null) {
            offerr = new ArrayList<UpdatedAdditionalInformation6>();
        }
        return this.offerr;
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
    public CorporateActionNarrative39 setNewCpnyNm(UpdatedAdditionalInformation6 value) {
        this.newCpnyNm = value;
        return this;
    }

    /**
     * Gets the value of the urlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedURLlnformation3 }
     *     
     */
    public UpdatedURLlnformation3 getURLAdr() {
        return urlAdr;
    }

    /**
     * Sets the value of the urlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedURLlnformation3 }
     *     
     */
    public CorporateActionNarrative39 setURLAdr(UpdatedURLlnformation3 value) {
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
    public CorporateActionNarrative39 addOfferr(UpdatedAdditionalInformation6 offerr) {
        getOfferr().add(offerr);
        return this;
    }

}
