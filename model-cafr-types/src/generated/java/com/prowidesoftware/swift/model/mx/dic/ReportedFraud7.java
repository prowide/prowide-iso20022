
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
 * Fraud reporting type information
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportedFraud7", propOrder = {
    "tp",
    "actn",
    "rptgNtty",
    "submitrCaseRef",
    "caseRef"
})
public class ReportedFraud7 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected FraudType2Code tp;
    @XmlElement(name = "Actn", required = true)
    @XmlSchemaType(name = "string")
    protected FraudReportingAction2Code actn;
    @XmlElement(name = "RptgNtty", required = true)
    @XmlSchemaType(name = "string")
    protected ATICAPartyType1Code rptgNtty;
    @XmlElement(name = "SubmitrCaseRef")
    protected String submitrCaseRef;
    @XmlElement(name = "CaseRef")
    protected String caseRef;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link FraudType2Code }
     *     
     */
    public FraudType2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudType2Code }
     *     
     */
    public ReportedFraud7 setTp(FraudType2Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the actn property.
     * 
     * @return
     *     possible object is
     *     {@link FraudReportingAction2Code }
     *     
     */
    public FraudReportingAction2Code getActn() {
        return actn;
    }

    /**
     * Sets the value of the actn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudReportingAction2Code }
     *     
     */
    public ReportedFraud7 setActn(FraudReportingAction2Code value) {
        this.actn = value;
        return this;
    }

    /**
     * Gets the value of the rptgNtty property.
     * 
     * @return
     *     possible object is
     *     {@link ATICAPartyType1Code }
     *     
     */
    public ATICAPartyType1Code getRptgNtty() {
        return rptgNtty;
    }

    /**
     * Sets the value of the rptgNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATICAPartyType1Code }
     *     
     */
    public ReportedFraud7 setRptgNtty(ATICAPartyType1Code value) {
        this.rptgNtty = value;
        return this;
    }

    /**
     * Gets the value of the submitrCaseRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitrCaseRef() {
        return submitrCaseRef;
    }

    /**
     * Sets the value of the submitrCaseRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportedFraud7 setSubmitrCaseRef(String value) {
        this.submitrCaseRef = value;
        return this;
    }

    /**
     * Gets the value of the caseRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseRef() {
        return caseRef;
    }

    /**
     * Sets the value of the caseRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportedFraud7 setCaseRef(String value) {
        this.caseRef = value;
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
