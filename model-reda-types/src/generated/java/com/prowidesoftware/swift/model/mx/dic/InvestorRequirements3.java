
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "InvestorRequirements3", propOrder = {
    "rtrPrflPrsrvtn",
    "rtrPrflGrwth",
    "rtrPrflIncm",
    "rtrPrflHdgg",
    "optnOrLvrgdRtrPrfl",
    "rtrPrflPnsnSchmeDE",
    "minHldgPrd",
    "esgPrefs",
    "sstnbltyPrefs",
    "othrSpcfcInvstmtNeed",
    "othr"
})
public class InvestorRequirements3 {

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
    @XmlElement(name = "RtrPrflPnsnSchmeDE")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code rtrPrflPnsnSchmeDE;
    @XmlElement(name = "MinHldgPrd")
    protected TimeHorizon2Choice minHldgPrd;
    @XmlElement(name = "ESGPrefs")
    @XmlSchemaType(name = "string")
    protected TargetMarket2Code esgPrefs;
    @XmlElement(name = "SstnbltyPrefs")
    @XmlSchemaType(name = "string")
    protected SustainabilityPreferences1Code sstnbltyPrefs;
    @XmlElement(name = "OthrSpcfcInvstmtNeed")
    protected InvestmentNeed2Choice othrSpcfcInvstmtNeed;
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
    public InvestorRequirements3 setRtrPrflPrsrvtn(TargetMarket1Code value) {
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
    public InvestorRequirements3 setRtrPrflGrwth(TargetMarket1Code value) {
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
    public InvestorRequirements3 setRtrPrflIncm(TargetMarket1Code value) {
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
    public InvestorRequirements3 setRtrPrflHdgg(TargetMarket1Code value) {
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
    public InvestorRequirements3 setOptnOrLvrgdRtrPrfl(TargetMarket1Code value) {
        this.optnOrLvrgdRtrPrfl = value;
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
    public InvestorRequirements3 setRtrPrflPnsnSchmeDE(TargetMarket1Code value) {
        this.rtrPrflPnsnSchmeDE = value;
        return this;
    }

    /**
     * Gets the value of the minHldgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link TimeHorizon2Choice }
     *     
     */
    public TimeHorizon2Choice getMinHldgPrd() {
        return minHldgPrd;
    }

    /**
     * Sets the value of the minHldgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeHorizon2Choice }
     *     
     */
    public InvestorRequirements3 setMinHldgPrd(TimeHorizon2Choice value) {
        this.minHldgPrd = value;
        return this;
    }

    /**
     * Gets the value of the esgPrefs property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket2Code }
     *     
     */
    public TargetMarket2Code getESGPrefs() {
        return esgPrefs;
    }

    /**
     * Sets the value of the esgPrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket2Code }
     *     
     */
    public InvestorRequirements3 setESGPrefs(TargetMarket2Code value) {
        this.esgPrefs = value;
        return this;
    }

    /**
     * Gets the value of the sstnbltyPrefs property.
     * 
     * @return
     *     possible object is
     *     {@link SustainabilityPreferences1Code }
     *     
     */
    public SustainabilityPreferences1Code getSstnbltyPrefs() {
        return sstnbltyPrefs;
    }

    /**
     * Sets the value of the sstnbltyPrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SustainabilityPreferences1Code }
     *     
     */
    public InvestorRequirements3 setSstnbltyPrefs(SustainabilityPreferences1Code value) {
        this.sstnbltyPrefs = value;
        return this;
    }

    /**
     * Gets the value of the othrSpcfcInvstmtNeed property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentNeed2Choice }
     *     
     */
    public InvestmentNeed2Choice getOthrSpcfcInvstmtNeed() {
        return othrSpcfcInvstmtNeed;
    }

    /**
     * Sets the value of the othrSpcfcInvstmtNeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentNeed2Choice }
     *     
     */
    public InvestorRequirements3 setOthrSpcfcInvstmtNeed(InvestmentNeed2Choice value) {
        this.othrSpcfcInvstmtNeed = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othr property.
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
     * @return
     *     The value of the othr property.
     */
    public List<OtherInvestmentNeed1> getOthr() {
        if (othr == null) {
            othr = new ArrayList<>();
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
    public InvestorRequirements3 addOthr(OtherInvestmentNeed1 othr) {
        getOthr().add(othr);
        return this;
    }

}
