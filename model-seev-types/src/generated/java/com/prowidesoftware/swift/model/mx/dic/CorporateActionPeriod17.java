
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
@XmlType(name = "CorporateActionPeriod17", propOrder = {
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
public class CorporateActionPeriod17 {

    @XmlElement(name = "IntrstPrd")
    protected Period12Choice intrstPrd;
    @XmlElement(name = "CmplsryPurchsPrd")
    protected Period12Choice cmplsryPurchsPrd;
    @XmlElement(name = "ClmPrd")
    protected Period12Choice clmPrd;
    @XmlElement(name = "DpstrySspnsnPrdForBookNtryTrf")
    protected Period12Choice dpstrySspnsnPrdForBookNtryTrf;
    @XmlElement(name = "DpstrySspnsnPrdForDpstAtAgt")
    protected Period12Choice dpstrySspnsnPrdForDpstAtAgt;
    @XmlElement(name = "DpstrySspnsnPrdForDpst")
    protected Period12Choice dpstrySspnsnPrdForDpst;
    @XmlElement(name = "DpstrySspnsnPrdForPldg")
    protected Period12Choice dpstrySspnsnPrdForPldg;
    @XmlElement(name = "DpstrySspnsnPrdForSgrtn")
    protected Period12Choice dpstrySspnsnPrdForSgrtn;
    @XmlElement(name = "DpstrySspnsnPrdForWdrwlAtAgt")
    protected Period12Choice dpstrySspnsnPrdForWdrwlAtAgt;
    @XmlElement(name = "DpstrySspnsnPrdForWdrwlInNmneeNm")
    protected Period12Choice dpstrySspnsnPrdForWdrwlInNmneeNm;
    @XmlElement(name = "DpstrySspnsnPrdForWdrwlInStrtNm")
    protected Period12Choice dpstrySspnsnPrdForWdrwlInStrtNm;
    @XmlElement(name = "BookClsrPrd")
    protected Period12Choice bookClsrPrd;
    @XmlElement(name = "CoDpstriesSspnsnPrd")
    protected Period12Choice coDpstriesSspnsnPrd;
    @XmlElement(name = "SpltPrd")
    protected Period12Choice spltPrd;
    @XmlElement(name = "FsclYrPrd")
    protected Period12Choice fsclYrPrd;

    /**
     * Gets the value of the intrstPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period12Choice }
     *     
     */
    public Period12Choice getIntrstPrd() {
        return intrstPrd;
    }

    /**
     * Sets the value of the intrstPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period12Choice }
     *     
     */
    public CorporateActionPeriod17 setIntrstPrd(Period12Choice value) {
        this.intrstPrd = value;
        return this;
    }

    /**
     * Gets the value of the cmplsryPurchsPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period12Choice }
     *     
     */
    public Period12Choice getCmplsryPurchsPrd() {
        return cmplsryPurchsPrd;
    }

    /**
     * Sets the value of the cmplsryPurchsPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period12Choice }
     *     
     */
    public CorporateActionPeriod17 setCmplsryPurchsPrd(Period12Choice value) {
        this.cmplsryPurchsPrd = value;
        return this;
    }

    /**
     * Gets the value of the clmPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period12Choice }
     *     
     */
    public Period12Choice getClmPrd() {
        return clmPrd;
    }

    /**
     * Sets the value of the clmPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period12Choice }
     *     
     */
    public CorporateActionPeriod17 setClmPrd(Period12Choice value) {
        this.clmPrd = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForBookNtryTrf property.
     * 
     * @return
     *     possible object is
     *     {@link Period12Choice }
     *     
     */
    public Period12Choice getDpstrySspnsnPrdForBookNtryTrf() {
        return dpstrySspnsnPrdForBookNtryTrf;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForBookNtryTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period12Choice }
     *     
     */
    public CorporateActionPeriod17 setDpstrySspnsnPrdForBookNtryTrf(Period12Choice value) {
        this.dpstrySspnsnPrdForBookNtryTrf = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForDpstAtAgt property.
     * 
     * @return
     *     possible object is
     *     {@link Period12Choice }
     *     
     */
    public Period12Choice getDpstrySspnsnPrdForDpstAtAgt() {
        return dpstrySspnsnPrdForDpstAtAgt;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForDpstAtAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period12Choice }
     *     
     */
    public CorporateActionPeriod17 setDpstrySspnsnPrdForDpstAtAgt(Period12Choice value) {
        this.dpstrySspnsnPrdForDpstAtAgt = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForDpst property.
     * 
     * @return
     *     possible object is
     *     {@link Period12Choice }
     *     
     */
    public Period12Choice getDpstrySspnsnPrdForDpst() {
        return dpstrySspnsnPrdForDpst;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForDpst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period12Choice }
     *     
     */
    public CorporateActionPeriod17 setDpstrySspnsnPrdForDpst(Period12Choice value) {
        this.dpstrySspnsnPrdForDpst = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForPldg property.
     * 
     * @return
     *     possible object is
     *     {@link Period12Choice }
     *     
     */
    public Period12Choice getDpstrySspnsnPrdForPldg() {
        return dpstrySspnsnPrdForPldg;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForPldg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period12Choice }
     *     
     */
    public CorporateActionPeriod17 setDpstrySspnsnPrdForPldg(Period12Choice value) {
        this.dpstrySspnsnPrdForPldg = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForSgrtn property.
     * 
     * @return
     *     possible object is
     *     {@link Period12Choice }
     *     
     */
    public Period12Choice getDpstrySspnsnPrdForSgrtn() {
        return dpstrySspnsnPrdForSgrtn;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForSgrtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period12Choice }
     *     
     */
    public CorporateActionPeriod17 setDpstrySspnsnPrdForSgrtn(Period12Choice value) {
        this.dpstrySspnsnPrdForSgrtn = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForWdrwlAtAgt property.
     * 
     * @return
     *     possible object is
     *     {@link Period12Choice }
     *     
     */
    public Period12Choice getDpstrySspnsnPrdForWdrwlAtAgt() {
        return dpstrySspnsnPrdForWdrwlAtAgt;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForWdrwlAtAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period12Choice }
     *     
     */
    public CorporateActionPeriod17 setDpstrySspnsnPrdForWdrwlAtAgt(Period12Choice value) {
        this.dpstrySspnsnPrdForWdrwlAtAgt = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForWdrwlInNmneeNm property.
     * 
     * @return
     *     possible object is
     *     {@link Period12Choice }
     *     
     */
    public Period12Choice getDpstrySspnsnPrdForWdrwlInNmneeNm() {
        return dpstrySspnsnPrdForWdrwlInNmneeNm;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForWdrwlInNmneeNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period12Choice }
     *     
     */
    public CorporateActionPeriod17 setDpstrySspnsnPrdForWdrwlInNmneeNm(Period12Choice value) {
        this.dpstrySspnsnPrdForWdrwlInNmneeNm = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForWdrwlInStrtNm property.
     * 
     * @return
     *     possible object is
     *     {@link Period12Choice }
     *     
     */
    public Period12Choice getDpstrySspnsnPrdForWdrwlInStrtNm() {
        return dpstrySspnsnPrdForWdrwlInStrtNm;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForWdrwlInStrtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period12Choice }
     *     
     */
    public CorporateActionPeriod17 setDpstrySspnsnPrdForWdrwlInStrtNm(Period12Choice value) {
        this.dpstrySspnsnPrdForWdrwlInStrtNm = value;
        return this;
    }

    /**
     * Gets the value of the bookClsrPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period12Choice }
     *     
     */
    public Period12Choice getBookClsrPrd() {
        return bookClsrPrd;
    }

    /**
     * Sets the value of the bookClsrPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period12Choice }
     *     
     */
    public CorporateActionPeriod17 setBookClsrPrd(Period12Choice value) {
        this.bookClsrPrd = value;
        return this;
    }

    /**
     * Gets the value of the coDpstriesSspnsnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period12Choice }
     *     
     */
    public Period12Choice getCoDpstriesSspnsnPrd() {
        return coDpstriesSspnsnPrd;
    }

    /**
     * Sets the value of the coDpstriesSspnsnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period12Choice }
     *     
     */
    public CorporateActionPeriod17 setCoDpstriesSspnsnPrd(Period12Choice value) {
        this.coDpstriesSspnsnPrd = value;
        return this;
    }

    /**
     * Gets the value of the spltPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period12Choice }
     *     
     */
    public Period12Choice getSpltPrd() {
        return spltPrd;
    }

    /**
     * Sets the value of the spltPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period12Choice }
     *     
     */
    public CorporateActionPeriod17 setSpltPrd(Period12Choice value) {
        this.spltPrd = value;
        return this;
    }

    /**
     * Gets the value of the fsclYrPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period12Choice }
     *     
     */
    public Period12Choice getFsclYrPrd() {
        return fsclYrPrd;
    }

    /**
     * Sets the value of the fsclYrPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period12Choice }
     *     
     */
    public CorporateActionPeriod17 setFsclYrPrd(Period12Choice value) {
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
