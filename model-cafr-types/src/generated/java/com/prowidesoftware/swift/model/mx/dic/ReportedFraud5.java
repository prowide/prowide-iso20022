
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
 * Fraud reporting type information
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportedFraud5", propOrder = {
    "tp",
    "othrTp",
    "actn",
    "othrActn",
    "rptgNtty",
    "othrRptgNtty",
    "submitrCaseRef",
    "caseRef"
})
public class ReportedFraud5 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected FraudType1Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "Actn", required = true)
    @XmlSchemaType(name = "string")
    protected FraudReportingAction1Code actn;
    @XmlElement(name = "OthrActn")
    protected String othrActn;
    @XmlElement(name = "RptgNtty", required = true)
    @XmlSchemaType(name = "string")
    protected PartyType26Code rptgNtty;
    @XmlElement(name = "OthrRptgNtty")
    protected String othrRptgNtty;
    @XmlElement(name = "SubmitrCaseRef")
    protected String submitrCaseRef;
    @XmlElement(name = "CaseRef")
    protected String caseRef;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link FraudType1Code }
     *     
     */
    public FraudType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudType1Code }
     *     
     */
    public ReportedFraud5 setTp(FraudType1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the othrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTp() {
        return othrTp;
    }

    /**
     * Sets the value of the othrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportedFraud5 setOthrTp(String value) {
        this.othrTp = value;
        return this;
    }

    /**
     * Gets the value of the actn property.
     * 
     * @return
     *     possible object is
     *     {@link FraudReportingAction1Code }
     *     
     */
    public FraudReportingAction1Code getActn() {
        return actn;
    }

    /**
     * Sets the value of the actn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudReportingAction1Code }
     *     
     */
    public ReportedFraud5 setActn(FraudReportingAction1Code value) {
        this.actn = value;
        return this;
    }

    /**
     * Gets the value of the othrActn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrActn() {
        return othrActn;
    }

    /**
     * Sets the value of the othrActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportedFraud5 setOthrActn(String value) {
        this.othrActn = value;
        return this;
    }

    /**
     * Gets the value of the rptgNtty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType26Code }
     *     
     */
    public PartyType26Code getRptgNtty() {
        return rptgNtty;
    }

    /**
     * Sets the value of the rptgNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType26Code }
     *     
     */
    public ReportedFraud5 setRptgNtty(PartyType26Code value) {
        this.rptgNtty = value;
        return this;
    }

    /**
     * Gets the value of the othrRptgNtty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrRptgNtty() {
        return othrRptgNtty;
    }

    /**
     * Sets the value of the othrRptgNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportedFraud5 setOthrRptgNtty(String value) {
        this.othrRptgNtty = value;
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
    public ReportedFraud5 setSubmitrCaseRef(String value) {
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
    public ReportedFraud5 setCaseRef(String value) {
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
