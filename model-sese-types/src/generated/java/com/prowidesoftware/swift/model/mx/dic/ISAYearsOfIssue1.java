
package com.prowidesoftware.swift.model.mx.dic;

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
 * Year in which the ISA plan is issued.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ISAYearsOfIssue1", propOrder = {
    "curYrTp",
    "xtndedCurYrTp",
    "cshCmpntInd",
    "prvsYrs",
    "curYrSbcptDtls"
})
public class ISAYearsOfIssue1 {

    @XmlElement(name = "CurYrTp")
    @XmlSchemaType(name = "string")
    protected ISAType1Code curYrTp;
    @XmlElement(name = "XtndedCurYrTp")
    protected String xtndedCurYrTp;
    @XmlElement(name = "CshCmpntInd")
    protected boolean cshCmpntInd;
    @XmlElement(name = "PrvsYrs")
    protected PreviousYear1 prvsYrs;
    @XmlElement(name = "CurYrSbcptDtls")
    protected SubscriptionInformation1 curYrSbcptDtls;

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
    public ISAYearsOfIssue1 setCurYrTp(ISAType1Code value) {
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
    public ISAYearsOfIssue1 setXtndedCurYrTp(String value) {
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
    public ISAYearsOfIssue1 setCshCmpntInd(boolean value) {
        this.cshCmpntInd = value;
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
    public ISAYearsOfIssue1 setPrvsYrs(PreviousYear1 value) {
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
    public ISAYearsOfIssue1 setCurYrSbcptDtls(SubscriptionInformation1 value) {
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
