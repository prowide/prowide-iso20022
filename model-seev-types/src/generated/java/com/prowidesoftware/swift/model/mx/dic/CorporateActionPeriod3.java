
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
 * Specifies periods of a corporate action.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPeriod3", propOrder = {
    "pricClctnPrd",
    "intrstPrd",
    "cmplsryPurchsPrd",
    "blckgPrd",
    "clmPrd",
    "dpstrySspnsnPrdForBookNtryTrf",
    "dpstrySspnsnPrdForDpstAtAgt",
    "dpstrySspnsnPrdForDpst",
    "dpstrySspnsnPrdForPldg",
    "dpstrySspnsnPrdForSgrtn",
    "dpstrySspnsnPrdForWdrwlAtAgt",
    "dpstrySspnsnPrdForWdrwlInNmneeNm",
    "dpstrySspnsnPrdForWdrwlInStrtNm",
    "bookClsrPrd"
})
public class CorporateActionPeriod3 {

    @XmlElement(name = "PricClctnPrd")
    protected Period1Choice pricClctnPrd;
    @XmlElement(name = "IntrstPrd")
    protected Period1Choice intrstPrd;
    @XmlElement(name = "CmplsryPurchsPrd")
    protected Period1Choice cmplsryPurchsPrd;
    @XmlElement(name = "BlckgPrd")
    protected Period1Choice blckgPrd;
    @XmlElement(name = "ClmPrd")
    protected Period1Choice clmPrd;
    @XmlElement(name = "DpstrySspnsnPrdForBookNtryTrf")
    protected Period1Choice dpstrySspnsnPrdForBookNtryTrf;
    @XmlElement(name = "DpstrySspnsnPrdForDpstAtAgt")
    protected Period1Choice dpstrySspnsnPrdForDpstAtAgt;
    @XmlElement(name = "DpstrySspnsnPrdForDpst")
    protected Period1Choice dpstrySspnsnPrdForDpst;
    @XmlElement(name = "DpstrySspnsnPrdForPldg")
    protected Period1Choice dpstrySspnsnPrdForPldg;
    @XmlElement(name = "DpstrySspnsnPrdForSgrtn")
    protected Period1Choice dpstrySspnsnPrdForSgrtn;
    @XmlElement(name = "DpstrySspnsnPrdForWdrwlAtAgt")
    protected Period1Choice dpstrySspnsnPrdForWdrwlAtAgt;
    @XmlElement(name = "DpstrySspnsnPrdForWdrwlInNmneeNm")
    protected Period1Choice dpstrySspnsnPrdForWdrwlInNmneeNm;
    @XmlElement(name = "DpstrySspnsnPrdForWdrwlInStrtNm")
    protected Period1Choice dpstrySspnsnPrdForWdrwlInStrtNm;
    @XmlElement(name = "BookClsrPrd")
    protected Period1Choice bookClsrPrd;

    /**
     * Gets the value of the pricClctnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period1Choice }
     *     
     */
    public Period1Choice getPricClctnPrd() {
        return pricClctnPrd;
    }

    /**
     * Sets the value of the pricClctnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1Choice }
     *     
     */
    public CorporateActionPeriod3 setPricClctnPrd(Period1Choice value) {
        this.pricClctnPrd = value;
        return this;
    }

    /**
     * Gets the value of the intrstPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period1Choice }
     *     
     */
    public Period1Choice getIntrstPrd() {
        return intrstPrd;
    }

    /**
     * Sets the value of the intrstPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1Choice }
     *     
     */
    public CorporateActionPeriod3 setIntrstPrd(Period1Choice value) {
        this.intrstPrd = value;
        return this;
    }

    /**
     * Gets the value of the cmplsryPurchsPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period1Choice }
     *     
     */
    public Period1Choice getCmplsryPurchsPrd() {
        return cmplsryPurchsPrd;
    }

    /**
     * Sets the value of the cmplsryPurchsPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1Choice }
     *     
     */
    public CorporateActionPeriod3 setCmplsryPurchsPrd(Period1Choice value) {
        this.cmplsryPurchsPrd = value;
        return this;
    }

    /**
     * Gets the value of the blckgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period1Choice }
     *     
     */
    public Period1Choice getBlckgPrd() {
        return blckgPrd;
    }

    /**
     * Sets the value of the blckgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1Choice }
     *     
     */
    public CorporateActionPeriod3 setBlckgPrd(Period1Choice value) {
        this.blckgPrd = value;
        return this;
    }

    /**
     * Gets the value of the clmPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period1Choice }
     *     
     */
    public Period1Choice getClmPrd() {
        return clmPrd;
    }

    /**
     * Sets the value of the clmPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1Choice }
     *     
     */
    public CorporateActionPeriod3 setClmPrd(Period1Choice value) {
        this.clmPrd = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForBookNtryTrf property.
     * 
     * @return
     *     possible object is
     *     {@link Period1Choice }
     *     
     */
    public Period1Choice getDpstrySspnsnPrdForBookNtryTrf() {
        return dpstrySspnsnPrdForBookNtryTrf;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForBookNtryTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1Choice }
     *     
     */
    public CorporateActionPeriod3 setDpstrySspnsnPrdForBookNtryTrf(Period1Choice value) {
        this.dpstrySspnsnPrdForBookNtryTrf = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForDpstAtAgt property.
     * 
     * @return
     *     possible object is
     *     {@link Period1Choice }
     *     
     */
    public Period1Choice getDpstrySspnsnPrdForDpstAtAgt() {
        return dpstrySspnsnPrdForDpstAtAgt;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForDpstAtAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1Choice }
     *     
     */
    public CorporateActionPeriod3 setDpstrySspnsnPrdForDpstAtAgt(Period1Choice value) {
        this.dpstrySspnsnPrdForDpstAtAgt = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForDpst property.
     * 
     * @return
     *     possible object is
     *     {@link Period1Choice }
     *     
     */
    public Period1Choice getDpstrySspnsnPrdForDpst() {
        return dpstrySspnsnPrdForDpst;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForDpst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1Choice }
     *     
     */
    public CorporateActionPeriod3 setDpstrySspnsnPrdForDpst(Period1Choice value) {
        this.dpstrySspnsnPrdForDpst = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForPldg property.
     * 
     * @return
     *     possible object is
     *     {@link Period1Choice }
     *     
     */
    public Period1Choice getDpstrySspnsnPrdForPldg() {
        return dpstrySspnsnPrdForPldg;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForPldg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1Choice }
     *     
     */
    public CorporateActionPeriod3 setDpstrySspnsnPrdForPldg(Period1Choice value) {
        this.dpstrySspnsnPrdForPldg = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForSgrtn property.
     * 
     * @return
     *     possible object is
     *     {@link Period1Choice }
     *     
     */
    public Period1Choice getDpstrySspnsnPrdForSgrtn() {
        return dpstrySspnsnPrdForSgrtn;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForSgrtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1Choice }
     *     
     */
    public CorporateActionPeriod3 setDpstrySspnsnPrdForSgrtn(Period1Choice value) {
        this.dpstrySspnsnPrdForSgrtn = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForWdrwlAtAgt property.
     * 
     * @return
     *     possible object is
     *     {@link Period1Choice }
     *     
     */
    public Period1Choice getDpstrySspnsnPrdForWdrwlAtAgt() {
        return dpstrySspnsnPrdForWdrwlAtAgt;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForWdrwlAtAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1Choice }
     *     
     */
    public CorporateActionPeriod3 setDpstrySspnsnPrdForWdrwlAtAgt(Period1Choice value) {
        this.dpstrySspnsnPrdForWdrwlAtAgt = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForWdrwlInNmneeNm property.
     * 
     * @return
     *     possible object is
     *     {@link Period1Choice }
     *     
     */
    public Period1Choice getDpstrySspnsnPrdForWdrwlInNmneeNm() {
        return dpstrySspnsnPrdForWdrwlInNmneeNm;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForWdrwlInNmneeNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1Choice }
     *     
     */
    public CorporateActionPeriod3 setDpstrySspnsnPrdForWdrwlInNmneeNm(Period1Choice value) {
        this.dpstrySspnsnPrdForWdrwlInNmneeNm = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForWdrwlInStrtNm property.
     * 
     * @return
     *     possible object is
     *     {@link Period1Choice }
     *     
     */
    public Period1Choice getDpstrySspnsnPrdForWdrwlInStrtNm() {
        return dpstrySspnsnPrdForWdrwlInStrtNm;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForWdrwlInStrtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1Choice }
     *     
     */
    public CorporateActionPeriod3 setDpstrySspnsnPrdForWdrwlInStrtNm(Period1Choice value) {
        this.dpstrySspnsnPrdForWdrwlInStrtNm = value;
        return this;
    }

    /**
     * Gets the value of the bookClsrPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period1Choice }
     *     
     */
    public Period1Choice getBookClsrPrd() {
        return bookClsrPrd;
    }

    /**
     * Sets the value of the bookClsrPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1Choice }
     *     
     */
    public CorporateActionPeriod3 setBookClsrPrd(Period1Choice value) {
        this.bookClsrPrd = value;
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
