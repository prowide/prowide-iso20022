
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
 * Year in which the ISA plan is issued.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ISAYearsOfIssue3", propOrder = {
    "curYrTp",
    "xtndedCurYrTp",
    "cshCmpntInd",
    "curYrSbcptDtls",
    "prvsYrs"
})
public class ISAYearsOfIssue3 {

    @XmlElement(name = "CurYrTp")
    @XmlSchemaType(name = "string")
    protected ISAType1Code curYrTp;
    @XmlElement(name = "XtndedCurYrTp")
    protected String xtndedCurYrTp;
    @XmlElement(name = "CshCmpntInd")
    protected boolean cshCmpntInd;
    @XmlElement(name = "CurYrSbcptDtls", required = true)
    protected SubscriptionInformation1 curYrSbcptDtls;
    @XmlElement(name = "PrvsYrs")
    protected PreviousYear1 prvsYrs;

    /**
     * Gets the value of the curYrTp property.
     * 
     * @return
     *     possible object is
     *     {@link ISAType1Code }
     *     
     */
    public ISAType1Code getCurYrTp() {
        return curYrTp;
    }

    /**
     * Sets the value of the curYrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISAType1Code }
     *     
     */
    public ISAYearsOfIssue3 setCurYrTp(ISAType1Code value) {
        this.curYrTp = value;
        return this;
    }

    /**
     * Gets the value of the xtndedCurYrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedCurYrTp() {
        return xtndedCurYrTp;
    }

    /**
     * Sets the value of the xtndedCurYrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ISAYearsOfIssue3 setXtndedCurYrTp(String value) {
        this.xtndedCurYrTp = value;
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
    public ISAYearsOfIssue3 setCshCmpntInd(boolean value) {
        this.cshCmpntInd = value;
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
    public ISAYearsOfIssue3 setCurYrSbcptDtls(SubscriptionInformation1 value) {
        this.curYrSbcptDtls = value;
        return this;
    }

    /**
     * Gets the value of the prvsYrs property.
     * 
     * @return
     *     possible object is
     *     {@link PreviousYear1 }
     *     
     */
    public PreviousYear1 getPrvsYrs() {
        return prvsYrs;
    }

    /**
     * Sets the value of the prvsYrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousYear1 }
     *     
     */
    public ISAYearsOfIssue3 setPrvsYrs(PreviousYear1 value) {
        this.prvsYrs = value;
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
