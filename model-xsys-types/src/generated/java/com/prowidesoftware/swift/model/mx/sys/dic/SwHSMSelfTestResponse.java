
package com.prowidesoftware.swift.model.mx.sys.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for HSMSelfTestResponse complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSMSelfTestResponse", propOrder = {
    "actionCode",
    "hsmClusterList",
    "hsmSelfTestReport",
    "hsmSelfTestSummary"
})
public class SwHSMSelfTestResponse {

    @XmlElement(name = "ActionCode", required = true)
    protected String actionCode;
    @XmlElement(name = "HSMClusterList", required = true)
    protected SwHSMClusterList hsmClusterList;
    @XmlElement(name = "HSMSelfTestReport", required = true)
    protected SwHSMSelfTestReport hsmSelfTestReport;
    @XmlElement(name = "HSMSelfTestSummary", required = true)
    protected SwHSMSelfTestSummary hsmSelfTestSummary;

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMSelfTestResponse setActionCode(String value) {
        this.actionCode = value;
        return this;
    }

    /**
     * Gets the value of the hsmClusterList property.
     * 
     * @return
     *     possible object is
     *     {@link SwHSMClusterList }
     *     
     */
    public SwHSMClusterList getHSMClusterList() {
        return hsmClusterList;
    }

    /**
     * Sets the value of the hsmClusterList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwHSMClusterList }
     *     
     */
    public SwHSMSelfTestResponse setHSMClusterList(SwHSMClusterList value) {
        this.hsmClusterList = value;
        return this;
    }

    /**
     * Gets the value of the hsmSelfTestReport property.
     * 
     * @return
     *     possible object is
     *     {@link SwHSMSelfTestReport }
     *     
     */
    public SwHSMSelfTestReport getHSMSelfTestReport() {
        return hsmSelfTestReport;
    }

    /**
     * Sets the value of the hsmSelfTestReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwHSMSelfTestReport }
     *     
     */
    public SwHSMSelfTestResponse setHSMSelfTestReport(SwHSMSelfTestReport value) {
        this.hsmSelfTestReport = value;
        return this;
    }

    /**
     * Gets the value of the hsmSelfTestSummary property.
     * 
     * @return
     *     possible object is
     *     {@link SwHSMSelfTestSummary }
     *     
     */
    public SwHSMSelfTestSummary getHSMSelfTestSummary() {
        return hsmSelfTestSummary;
    }

    /**
     * Sets the value of the hsmSelfTestSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwHSMSelfTestSummary }
     *     
     */
    public SwHSMSelfTestResponse setHSMSelfTestSummary(SwHSMSelfTestSummary value) {
        this.hsmSelfTestSummary = value;
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
