
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
 * Specifies periods of a corporate action.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPeriod8", propOrder = {
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
    "bookClsrPrd",
    "coDpstriesSspnsnPrd"
})
public class CorporateActionPeriod8 {

    @XmlElement(name = "PricClctnPrd")
    protected Period3Choice pricClctnPrd;
    @XmlElement(name = "IntrstPrd")
    protected Period3Choice intrstPrd;
    @XmlElement(name = "CmplsryPurchsPrd")
    protected Period3Choice cmplsryPurchsPrd;
    @XmlElement(name = "BlckgPrd")
    protected Period3Choice blckgPrd;
    @XmlElement(name = "ClmPrd")
    protected Period3Choice clmPrd;
    @XmlElement(name = "DpstrySspnsnPrdForBookNtryTrf")
    protected Period3Choice dpstrySspnsnPrdForBookNtryTrf;
    @XmlElement(name = "DpstrySspnsnPrdForDpstAtAgt")
    protected Period3Choice dpstrySspnsnPrdForDpstAtAgt;
    @XmlElement(name = "DpstrySspnsnPrdForDpst")
    protected Period3Choice dpstrySspnsnPrdForDpst;
    @XmlElement(name = "DpstrySspnsnPrdForPldg")
    protected Period3Choice dpstrySspnsnPrdForPldg;
    @XmlElement(name = "DpstrySspnsnPrdForSgrtn")
    protected Period3Choice dpstrySspnsnPrdForSgrtn;
    @XmlElement(name = "DpstrySspnsnPrdForWdrwlAtAgt")
    protected Period3Choice dpstrySspnsnPrdForWdrwlAtAgt;
    @XmlElement(name = "DpstrySspnsnPrdForWdrwlInNmneeNm")
    protected Period3Choice dpstrySspnsnPrdForWdrwlInNmneeNm;
    @XmlElement(name = "DpstrySspnsnPrdForWdrwlInStrtNm")
    protected Period3Choice dpstrySspnsnPrdForWdrwlInStrtNm;
    @XmlElement(name = "BookClsrPrd")
    protected Period3Choice bookClsrPrd;
    @XmlElement(name = "CoDpstriesSspnsnPrd")
    protected Period3Choice coDpstriesSspnsnPrd;

    /**
     * Gets the value of the pricClctnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period3Choice }
     *     
     */
    public Period3Choice getPricClctnPrd() {
        return pricClctnPrd;
    }

    /**
     * Sets the value of the pricClctnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period3Choice }
     *     
     */
    public CorporateActionPeriod8 setPricClctnPrd(Period3Choice value) {
        this.pricClctnPrd = value;
        return this;
    }

    /**
     * Gets the value of the intrstPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period3Choice }
     *     
     */
    public Period3Choice getIntrstPrd() {
        return intrstPrd;
    }

    /**
     * Sets the value of the intrstPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period3Choice }
     *     
     */
    public CorporateActionPeriod8 setIntrstPrd(Period3Choice value) {
        this.intrstPrd = value;
        return this;
    }

    /**
     * Gets the value of the cmplsryPurchsPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period3Choice }
     *     
     */
    public Period3Choice getCmplsryPurchsPrd() {
        return cmplsryPurchsPrd;
    }

    /**
     * Sets the value of the cmplsryPurchsPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period3Choice }
     *     
     */
    public CorporateActionPeriod8 setCmplsryPurchsPrd(Period3Choice value) {
        this.cmplsryPurchsPrd = value;
        return this;
    }

    /**
     * Gets the value of the blckgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period3Choice }
     *     
     */
    public Period3Choice getBlckgPrd() {
        return blckgPrd;
    }

    /**
     * Sets the value of the blckgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period3Choice }
     *     
     */
    public CorporateActionPeriod8 setBlckgPrd(Period3Choice value) {
        this.blckgPrd = value;
        return this;
    }

    /**
     * Gets the value of the clmPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period3Choice }
     *     
     */
    public Period3Choice getClmPrd() {
        return clmPrd;
    }

    /**
     * Sets the value of the clmPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period3Choice }
     *     
     */
    public CorporateActionPeriod8 setClmPrd(Period3Choice value) {
        this.clmPrd = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForBookNtryTrf property.
     * 
     * @return
     *     possible object is
     *     {@link Period3Choice }
     *     
     */
    public Period3Choice getDpstrySspnsnPrdForBookNtryTrf() {
        return dpstrySspnsnPrdForBookNtryTrf;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForBookNtryTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period3Choice }
     *     
     */
    public CorporateActionPeriod8 setDpstrySspnsnPrdForBookNtryTrf(Period3Choice value) {
        this.dpstrySspnsnPrdForBookNtryTrf = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForDpstAtAgt property.
     * 
     * @return
     *     possible object is
     *     {@link Period3Choice }
     *     
     */
    public Period3Choice getDpstrySspnsnPrdForDpstAtAgt() {
        return dpstrySspnsnPrdForDpstAtAgt;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForDpstAtAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period3Choice }
     *     
     */
    public CorporateActionPeriod8 setDpstrySspnsnPrdForDpstAtAgt(Period3Choice value) {
        this.dpstrySspnsnPrdForDpstAtAgt = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForDpst property.
     * 
     * @return
     *     possible object is
     *     {@link Period3Choice }
     *     
     */
    public Period3Choice getDpstrySspnsnPrdForDpst() {
        return dpstrySspnsnPrdForDpst;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForDpst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period3Choice }
     *     
     */
    public CorporateActionPeriod8 setDpstrySspnsnPrdForDpst(Period3Choice value) {
        this.dpstrySspnsnPrdForDpst = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForPldg property.
     * 
     * @return
     *     possible object is
     *     {@link Period3Choice }
     *     
     */
    public Period3Choice getDpstrySspnsnPrdForPldg() {
        return dpstrySspnsnPrdForPldg;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForPldg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period3Choice }
     *     
     */
    public CorporateActionPeriod8 setDpstrySspnsnPrdForPldg(Period3Choice value) {
        this.dpstrySspnsnPrdForPldg = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForSgrtn property.
     * 
     * @return
     *     possible object is
     *     {@link Period3Choice }
     *     
     */
    public Period3Choice getDpstrySspnsnPrdForSgrtn() {
        return dpstrySspnsnPrdForSgrtn;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForSgrtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period3Choice }
     *     
     */
    public CorporateActionPeriod8 setDpstrySspnsnPrdForSgrtn(Period3Choice value) {
        this.dpstrySspnsnPrdForSgrtn = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForWdrwlAtAgt property.
     * 
     * @return
     *     possible object is
     *     {@link Period3Choice }
     *     
     */
    public Period3Choice getDpstrySspnsnPrdForWdrwlAtAgt() {
        return dpstrySspnsnPrdForWdrwlAtAgt;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForWdrwlAtAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period3Choice }
     *     
     */
    public CorporateActionPeriod8 setDpstrySspnsnPrdForWdrwlAtAgt(Period3Choice value) {
        this.dpstrySspnsnPrdForWdrwlAtAgt = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForWdrwlInNmneeNm property.
     * 
     * @return
     *     possible object is
     *     {@link Period3Choice }
     *     
     */
    public Period3Choice getDpstrySspnsnPrdForWdrwlInNmneeNm() {
        return dpstrySspnsnPrdForWdrwlInNmneeNm;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForWdrwlInNmneeNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period3Choice }
     *     
     */
    public CorporateActionPeriod8 setDpstrySspnsnPrdForWdrwlInNmneeNm(Period3Choice value) {
        this.dpstrySspnsnPrdForWdrwlInNmneeNm = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForWdrwlInStrtNm property.
     * 
     * @return
     *     possible object is
     *     {@link Period3Choice }
     *     
     */
    public Period3Choice getDpstrySspnsnPrdForWdrwlInStrtNm() {
        return dpstrySspnsnPrdForWdrwlInStrtNm;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForWdrwlInStrtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period3Choice }
     *     
     */
    public CorporateActionPeriod8 setDpstrySspnsnPrdForWdrwlInStrtNm(Period3Choice value) {
        this.dpstrySspnsnPrdForWdrwlInStrtNm = value;
        return this;
    }

    /**
     * Gets the value of the bookClsrPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period3Choice }
     *     
     */
    public Period3Choice getBookClsrPrd() {
        return bookClsrPrd;
    }

    /**
     * Sets the value of the bookClsrPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period3Choice }
     *     
     */
    public CorporateActionPeriod8 setBookClsrPrd(Period3Choice value) {
        this.bookClsrPrd = value;
        return this;
    }

    /**
     * Gets the value of the coDpstriesSspnsnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period3Choice }
     *     
     */
    public Period3Choice getCoDpstriesSspnsnPrd() {
        return coDpstriesSspnsnPrd;
    }

    /**
     * Sets the value of the coDpstriesSspnsnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period3Choice }
     *     
     */
    public CorporateActionPeriod8 setCoDpstriesSspnsnPrd(Period3Choice value) {
        this.coDpstriesSspnsnPrd = value;
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
