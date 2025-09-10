
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
@XmlType(name = "CorporateActionPeriod16", propOrder = {
    "pricClctnPrd",
    "intrstPrd",
    "cmplsryPurchsPrd",
    "clmPrd",
    "dpstrySspnsnPrdForBookNtryTrf",
    "dpstrySspnsnPrdForDpstAtAgt",
    "dpstrySspnsnPrdForDpst",
    "dpstrySspnsnPrdForPldg",
    "dpstrySspnsnPrdForSgrtn",
    "dpstrySspnsnPrdForWdrwlAtAgt",
    "dpstrySspnsnPrdForWdrwlInNmneeNm",
    "dpstrySspnsnPrdForWdrwlInStrtNm",
    "bookClsrPrd",
    "coDpstriesSspnsnPrd",
    "spltPrd",
    "fsclYrPrd"
})
public class CorporateActionPeriod16 {

    @XmlElement(name = "PricClctnPrd")
    protected Period6Choice pricClctnPrd;
    @XmlElement(name = "IntrstPrd")
    protected Period6Choice intrstPrd;
    @XmlElement(name = "CmplsryPurchsPrd")
    protected Period6Choice cmplsryPurchsPrd;
    @XmlElement(name = "ClmPrd")
    protected Period6Choice clmPrd;
    @XmlElement(name = "DpstrySspnsnPrdForBookNtryTrf")
    protected Period6Choice dpstrySspnsnPrdForBookNtryTrf;
    @XmlElement(name = "DpstrySspnsnPrdForDpstAtAgt")
    protected Period6Choice dpstrySspnsnPrdForDpstAtAgt;
    @XmlElement(name = "DpstrySspnsnPrdForDpst")
    protected Period6Choice dpstrySspnsnPrdForDpst;
    @XmlElement(name = "DpstrySspnsnPrdForPldg")
    protected Period6Choice dpstrySspnsnPrdForPldg;
    @XmlElement(name = "DpstrySspnsnPrdForSgrtn")
    protected Period6Choice dpstrySspnsnPrdForSgrtn;
    @XmlElement(name = "DpstrySspnsnPrdForWdrwlAtAgt")
    protected Period6Choice dpstrySspnsnPrdForWdrwlAtAgt;
    @XmlElement(name = "DpstrySspnsnPrdForWdrwlInNmneeNm")
    protected Period6Choice dpstrySspnsnPrdForWdrwlInNmneeNm;
    @XmlElement(name = "DpstrySspnsnPrdForWdrwlInStrtNm")
    protected Period6Choice dpstrySspnsnPrdForWdrwlInStrtNm;
    @XmlElement(name = "BookClsrPrd")
    protected Period6Choice bookClsrPrd;
    @XmlElement(name = "CoDpstriesSspnsnPrd")
    protected Period6Choice coDpstriesSspnsnPrd;
    @XmlElement(name = "SpltPrd")
    protected Period6Choice spltPrd;
    @XmlElement(name = "FsclYrPrd")
    protected Period6Choice fsclYrPrd;

    /**
     * Gets the value of the pricClctnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getPricClctnPrd() {
        return pricClctnPrd;
    }

    /**
     * Sets the value of the pricClctnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public CorporateActionPeriod16 setPricClctnPrd(Period6Choice value) {
        this.pricClctnPrd = value;
        return this;
    }

    /**
     * Gets the value of the intrstPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getIntrstPrd() {
        return intrstPrd;
    }

    /**
     * Sets the value of the intrstPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public CorporateActionPeriod16 setIntrstPrd(Period6Choice value) {
        this.intrstPrd = value;
        return this;
    }

    /**
     * Gets the value of the cmplsryPurchsPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getCmplsryPurchsPrd() {
        return cmplsryPurchsPrd;
    }

    /**
     * Sets the value of the cmplsryPurchsPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public CorporateActionPeriod16 setCmplsryPurchsPrd(Period6Choice value) {
        this.cmplsryPurchsPrd = value;
        return this;
    }

    /**
     * Gets the value of the clmPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getClmPrd() {
        return clmPrd;
    }

    /**
     * Sets the value of the clmPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public CorporateActionPeriod16 setClmPrd(Period6Choice value) {
        this.clmPrd = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForBookNtryTrf property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getDpstrySspnsnPrdForBookNtryTrf() {
        return dpstrySspnsnPrdForBookNtryTrf;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForBookNtryTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public CorporateActionPeriod16 setDpstrySspnsnPrdForBookNtryTrf(Period6Choice value) {
        this.dpstrySspnsnPrdForBookNtryTrf = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForDpstAtAgt property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getDpstrySspnsnPrdForDpstAtAgt() {
        return dpstrySspnsnPrdForDpstAtAgt;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForDpstAtAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public CorporateActionPeriod16 setDpstrySspnsnPrdForDpstAtAgt(Period6Choice value) {
        this.dpstrySspnsnPrdForDpstAtAgt = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForDpst property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getDpstrySspnsnPrdForDpst() {
        return dpstrySspnsnPrdForDpst;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForDpst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public CorporateActionPeriod16 setDpstrySspnsnPrdForDpst(Period6Choice value) {
        this.dpstrySspnsnPrdForDpst = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForPldg property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getDpstrySspnsnPrdForPldg() {
        return dpstrySspnsnPrdForPldg;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForPldg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public CorporateActionPeriod16 setDpstrySspnsnPrdForPldg(Period6Choice value) {
        this.dpstrySspnsnPrdForPldg = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForSgrtn property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getDpstrySspnsnPrdForSgrtn() {
        return dpstrySspnsnPrdForSgrtn;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForSgrtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public CorporateActionPeriod16 setDpstrySspnsnPrdForSgrtn(Period6Choice value) {
        this.dpstrySspnsnPrdForSgrtn = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForWdrwlAtAgt property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getDpstrySspnsnPrdForWdrwlAtAgt() {
        return dpstrySspnsnPrdForWdrwlAtAgt;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForWdrwlAtAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public CorporateActionPeriod16 setDpstrySspnsnPrdForWdrwlAtAgt(Period6Choice value) {
        this.dpstrySspnsnPrdForWdrwlAtAgt = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForWdrwlInNmneeNm property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getDpstrySspnsnPrdForWdrwlInNmneeNm() {
        return dpstrySspnsnPrdForWdrwlInNmneeNm;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForWdrwlInNmneeNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public CorporateActionPeriod16 setDpstrySspnsnPrdForWdrwlInNmneeNm(Period6Choice value) {
        this.dpstrySspnsnPrdForWdrwlInNmneeNm = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForWdrwlInStrtNm property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getDpstrySspnsnPrdForWdrwlInStrtNm() {
        return dpstrySspnsnPrdForWdrwlInStrtNm;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForWdrwlInStrtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public CorporateActionPeriod16 setDpstrySspnsnPrdForWdrwlInStrtNm(Period6Choice value) {
        this.dpstrySspnsnPrdForWdrwlInStrtNm = value;
        return this;
    }

    /**
     * Gets the value of the bookClsrPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getBookClsrPrd() {
        return bookClsrPrd;
    }

    /**
     * Sets the value of the bookClsrPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public CorporateActionPeriod16 setBookClsrPrd(Period6Choice value) {
        this.bookClsrPrd = value;
        return this;
    }

    /**
     * Gets the value of the coDpstriesSspnsnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getCoDpstriesSspnsnPrd() {
        return coDpstriesSspnsnPrd;
    }

    /**
     * Sets the value of the coDpstriesSspnsnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public CorporateActionPeriod16 setCoDpstriesSspnsnPrd(Period6Choice value) {
        this.coDpstriesSspnsnPrd = value;
        return this;
    }

    /**
     * Gets the value of the spltPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getSpltPrd() {
        return spltPrd;
    }

    /**
     * Sets the value of the spltPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public CorporateActionPeriod16 setSpltPrd(Period6Choice value) {
        this.spltPrd = value;
        return this;
    }

    /**
     * Gets the value of the fsclYrPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getFsclYrPrd() {
        return fsclYrPrd;
    }

    /**
     * Sets the value of the fsclYrPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public CorporateActionPeriod16 setFsclYrPrd(Period6Choice value) {
        this.fsclYrPrd = value;
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
