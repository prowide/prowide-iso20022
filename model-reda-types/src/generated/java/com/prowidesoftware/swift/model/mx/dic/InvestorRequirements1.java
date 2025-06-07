
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Investor’s investment requirements.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestorRequirements1", propOrder = {
    "rtrPrflPrsrvtn",
    "rtrPrflGrwth",
    "rtrPrflIncm",
    "rtrPrflHdgg",
    "optnOrLvrgdRtrPrfl",
    "rtrPrflOthr",
    "rtrPrflPnsnSchmeDE",
    "minHldgPrd",
    "mayBeTermntdEarly",
    "spcfcInvstmtNeed",
    "othr"
})
public class InvestorRequirements1 {

    @XmlElement(name = "RtrPrflPrsrvtn")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code rtrPrflPrsrvtn;
    @XmlElement(name = "RtrPrflGrwth")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code rtrPrflGrwth;
    @XmlElement(name = "RtrPrflIncm")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code rtrPrflIncm;
    @XmlElement(name = "RtrPrflHdgg")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code rtrPrflHdgg;
    @XmlElement(name = "OptnOrLvrgdRtrPrfl")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code optnOrLvrgdRtrPrfl;
    @XmlElement(name = "RtrPrflOthr")
    @XmlSchemaType(name = "string")
    protected TargetMarket2Code rtrPrflOthr;
    @XmlElement(name = "RtrPrflPnsnSchmeDE")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code rtrPrflPnsnSchmeDE;
    @XmlElement(name = "MinHldgPrd")
    protected TimeHorizon1Choice minHldgPrd;
    @XmlElement(name = "MayBeTermntdEarly")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code mayBeTermntdEarly;
    @XmlElement(name = "SpcfcInvstmtNeed")
    protected InvestmentNeed1Choice spcfcInvstmtNeed;
    @XmlElement(name = "Othr")
    protected List<OtherInvestmentNeed1> othr;

    /**
     * Gets the value of the rtrPrflPrsrvtn property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getRtrPrflPrsrvtn() {
        return rtrPrflPrsrvtn;
    }

    /**
     * Sets the value of the rtrPrflPrsrvtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public InvestorRequirements1 setRtrPrflPrsrvtn(TargetMarket1Code value) {
        this.rtrPrflPrsrvtn = value;
        return this;
    }

    /**
     * Gets the value of the rtrPrflGrwth property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getRtrPrflGrwth() {
        return rtrPrflGrwth;
    }

    /**
     * Sets the value of the rtrPrflGrwth property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public InvestorRequirements1 setRtrPrflGrwth(TargetMarket1Code value) {
        this.rtrPrflGrwth = value;
        return this;
    }

    /**
     * Gets the value of the rtrPrflIncm property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getRtrPrflIncm() {
        return rtrPrflIncm;
    }

    /**
     * Sets the value of the rtrPrflIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public InvestorRequirements1 setRtrPrflIncm(TargetMarket1Code value) {
        this.rtrPrflIncm = value;
        return this;
    }

    /**
     * Gets the value of the rtrPrflHdgg property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getRtrPrflHdgg() {
        return rtrPrflHdgg;
    }

    /**
     * Sets the value of the rtrPrflHdgg property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public InvestorRequirements1 setRtrPrflHdgg(TargetMarket1Code value) {
        this.rtrPrflHdgg = value;
        return this;
    }

    /**
     * Gets the value of the optnOrLvrgdRtrPrfl property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getOptnOrLvrgdRtrPrfl() {
        return optnOrLvrgdRtrPrfl;
    }

    /**
     * Sets the value of the optnOrLvrgdRtrPrfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public InvestorRequirements1 setOptnOrLvrgdRtrPrfl(TargetMarket1Code value) {
        this.optnOrLvrgdRtrPrfl = value;
        return this;
    }

    /**
     * Gets the value of the rtrPrflOthr property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket2Code }
     *     
     */
    public TargetMarket2Code getRtrPrflOthr() {
        return rtrPrflOthr;
    }

    /**
     * Sets the value of the rtrPrflOthr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket2Code }
     *     
     */
    public InvestorRequirements1 setRtrPrflOthr(TargetMarket2Code value) {
        this.rtrPrflOthr = value;
        return this;
    }

    /**
     * Gets the value of the rtrPrflPnsnSchmeDE property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getRtrPrflPnsnSchmeDE() {
        return rtrPrflPnsnSchmeDE;
    }

    /**
     * Sets the value of the rtrPrflPnsnSchmeDE property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public InvestorRequirements1 setRtrPrflPnsnSchmeDE(TargetMarket1Code value) {
        this.rtrPrflPnsnSchmeDE = value;
        return this;
    }

    /**
     * Gets the value of the minHldgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link TimeHorizon1Choice }
     *     
     */
    public TimeHorizon1Choice getMinHldgPrd() {
        return minHldgPrd;
    }

    /**
     * Sets the value of the minHldgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeHorizon1Choice }
     *     
     */
    public InvestorRequirements1 setMinHldgPrd(TimeHorizon1Choice value) {
        this.minHldgPrd = value;
        return this;
    }

    /**
     * Gets the value of the mayBeTermntdEarly property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getMayBeTermntdEarly() {
        return mayBeTermntdEarly;
    }

    /**
     * Sets the value of the mayBeTermntdEarly property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public InvestorRequirements1 setMayBeTermntdEarly(TargetMarket1Code value) {
        this.mayBeTermntdEarly = value;
        return this;
    }

    /**
     * Gets the value of the spcfcInvstmtNeed property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentNeed1Choice }
     *     
     */
    public InvestmentNeed1Choice getSpcfcInvstmtNeed() {
        return spcfcInvstmtNeed;
    }

    /**
     * Sets the value of the spcfcInvstmtNeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentNeed1Choice }
     *     
     */
    public InvestorRequirements1 setSpcfcInvstmtNeed(InvestmentNeed1Choice value) {
        this.spcfcInvstmtNeed = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherInvestmentNeed1 }
     * 
     * 
     */
    public List<OtherInvestmentNeed1> getOthr() {
        if (othr == null) {
            othr = new ArrayList<OtherInvestmentNeed1>();
        }
        return this.othr;
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
     * Adds a new item to the othr list.
     * @see #getOthr()
     * 
     */
    public InvestorRequirements1 addOthr(OtherInvestmentNeed1 othr) {
        getOthr().add(othr);
        return this;
    }

}
