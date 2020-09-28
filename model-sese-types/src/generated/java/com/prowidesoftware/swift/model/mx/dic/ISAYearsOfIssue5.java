
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
 * Year in which the ISA plan is issued.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ISAYearsOfIssue5", propOrder = {
    "curYr",
    "cshCmpntInd",
    "prvsYrs",
    "curYrSbcptDtls"
})
public class ISAYearsOfIssue5 {

    @XmlElement(name = "CurYr")
    protected CurrentYearType1Choice curYr;
    @XmlElement(name = "CshCmpntInd")
    protected boolean cshCmpntInd;
    @XmlElement(name = "PrvsYrs")
    protected PreviousYear3 prvsYrs;
    @XmlElement(name = "CurYrSbcptDtls", required = true)
    protected SubscriptionInformation1 curYrSbcptDtls;

    /**
     * Gets the value of the curYr property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentYearType1Choice }
     *     
     */
    public CurrentYearType1Choice getCurYr() {
        return curYr;
    }

    /**
     * Sets the value of the curYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentYearType1Choice }
     *     
     */
    public ISAYearsOfIssue5 setCurYr(CurrentYearType1Choice value) {
        this.curYr = value;
        return this;
    }

    /**
     * Gets the value of the cshCmpntInd property.
     * 
     */
    public boolean isCshCmpntInd() {
        return cshCmpntInd;
    }

    /**
     * Sets the value of the cshCmpntInd property.
     * 
     */
    public ISAYearsOfIssue5 setCshCmpntInd(boolean value) {
        this.cshCmpntInd = value;
        return this;
    }

    /**
     * Gets the value of the prvsYrs property.
     * 
     * @return
     *     possible object is
     *     {@link PreviousYear3 }
     *     
     */
    public PreviousYear3 getPrvsYrs() {
        return prvsYrs;
    }

    /**
     * Sets the value of the prvsYrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousYear3 }
     *     
     */
    public ISAYearsOfIssue5 setPrvsYrs(PreviousYear3 value) {
        this.prvsYrs = value;
        return this;
    }

    /**
     * Gets the value of the curYrSbcptDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionInformation1 }
     *     
     */
    public SubscriptionInformation1 getCurYrSbcptDtls() {
        return curYrSbcptDtls;
    }

    /**
     * Sets the value of the curYrSbcptDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionInformation1 }
     *     
     */
    public ISAYearsOfIssue5 setCurYrSbcptDtls(SubscriptionInformation1 value) {
        this.curYrSbcptDtls = value;
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
