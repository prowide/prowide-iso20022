
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
@XmlType(name = "CorporateActionNarrative58", propOrder = {
    "offerr",
    "newCpnyNm",
    "urlAdr",
    "evtPrcgWebSiteAdr"
})
public class CorporateActionNarrative58 {

    @XmlElement(name = "Offerr")
    protected List<String> offerr;
    @XmlElement(name = "NewCpnyNm")
    protected String newCpnyNm;
    @XmlElement(name = "URLAdr")
    protected List<UpdatedURLlnformation6> urlAdr;
    @XmlElement(name = "EvtPrcgWebSiteAdr")
    protected String evtPrcgWebSiteAdr;

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
     * {@link String }
     * 
     * 
     */
    public List<String> getOfferr() {
        if (offerr == null) {
            offerr = new ArrayList<String>();
        }
        return this.offerr;
    }

    /**
     * Gets the value of the newCpnyNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCpnyNm() {
        return newCpnyNm;
    }

    /**
     * Sets the value of the newCpnyNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionNarrative58 setNewCpnyNm(String value) {
        this.newCpnyNm = value;
        return this;
    }

    /**
     * Gets the value of the urlAdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urlAdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getURLAdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdatedURLlnformation6 }
     * 
     * 
     */
    public List<UpdatedURLlnformation6> getURLAdr() {
        if (urlAdr == null) {
            urlAdr = new ArrayList<UpdatedURLlnformation6>();
        }
        return this.urlAdr;
    }

    /**
     * Gets the value of the evtPrcgWebSiteAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtPrcgWebSiteAdr() {
        return evtPrcgWebSiteAdr;
    }

    /**
     * Sets the value of the evtPrcgWebSiteAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionNarrative58 setEvtPrcgWebSiteAdr(String value) {
        this.evtPrcgWebSiteAdr = value;
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
    public CorporateActionNarrative58 addOfferr(String offerr) {
        getOfferr().add(offerr);
        return this;
    }

    /**
     * Adds a new item to the uRLAdr list.
     * @see #getURLAdr()
     * 
     */
    public CorporateActionNarrative58 addURLAdr(UpdatedURLlnformation6 uRLAdr) {
        getURLAdr().add(uRLAdr);
        return this;
    }

}
