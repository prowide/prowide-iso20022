
package com.prowidesoftware.swift.model.mx.dic;

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
 * An investor's instruction to either subscribe or redeem an amount of money or its equivalent, eg, other assets, into or out of an investment fund.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentFundOrder6", propOrder = {
    "mstrRef",
    "ordrRef",
    "clntRef",
    "cxlRef",
    "ordrTp",
    "amdmntInd",
    "ordrDtls"
})
public class InvestmentFundOrder6 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "OrdrRef", required = true)
    protected String ordrRef;
    @XmlElement(name = "ClntRef")
    protected String clntRef;
    @XmlElement(name = "CxlRef")
    protected String cxlRef;
    @XmlElement(name = "OrdrTp", required = true)
    @XmlSchemaType(name = "string")
    protected FundOrderType1Code ordrTp;
    @XmlElement(name = "AmdmntInd")
    protected Boolean amdmntInd;
    @XmlElement(name = "OrdrDtls")
    protected SubscriptionOrRedemptionOrSwitchOrderDataChoice ordrDtls;

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentFundOrder6 setMstrRef(String value) {
        this.mstrRef = value;
        return this;
    }

    /**
     * Gets the value of the ordrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdrRef() {
        return ordrRef;
    }

    /**
     * Sets the value of the ordrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentFundOrder6 setOrdrRef(String value) {
        this.ordrRef = value;
        return this;
    }

    /**
     * Gets the value of the clntRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntRef() {
        return clntRef;
    }

    /**
     * Sets the value of the clntRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentFundOrder6 setClntRef(String value) {
        this.clntRef = value;
        return this;
    }

    /**
     * Gets the value of the cxlRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxlRef() {
        return cxlRef;
    }

    /**
     * Sets the value of the cxlRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentFundOrder6 setCxlRef(String value) {
        this.cxlRef = value;
        return this;
    }

    /**
     * Gets the value of the ordrTp property.
     * 
     * @return
     *     possible object is
     *     {@link FundOrderType1Code }
     *     
     */
    public FundOrderType1Code getOrdrTp() {
        return ordrTp;
    }

    /**
     * Sets the value of the ordrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundOrderType1Code }
     *     
     */
    public InvestmentFundOrder6 setOrdrTp(FundOrderType1Code value) {
        this.ordrTp = value;
        return this;
    }

    /**
     * Gets the value of the amdmntInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAmdmntInd() {
        return amdmntInd;
    }

    /**
     * Sets the value of the amdmntInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InvestmentFundOrder6 setAmdmntInd(Boolean value) {
        this.amdmntInd = value;
        return this;
    }

    /**
     * Gets the value of the ordrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionOrRedemptionOrSwitchOrderDataChoice }
     *     
     */
    public SubscriptionOrRedemptionOrSwitchOrderDataChoice getOrdrDtls() {
        return ordrDtls;
    }

    /**
     * Sets the value of the ordrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionOrRedemptionOrSwitchOrderDataChoice }
     *     
     */
    public InvestmentFundOrder6 setOrdrDtls(SubscriptionOrRedemptionOrSwitchOrderDataChoice value) {
        this.ordrDtls = value;
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
