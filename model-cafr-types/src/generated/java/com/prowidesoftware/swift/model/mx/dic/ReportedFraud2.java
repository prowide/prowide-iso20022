
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
@XmlType(name = "ReportedFraud2", propOrder = {
    "frdTp",
    "othrFrdTp",
    "frdRptgActn",
    "othrFrdRptgActn",
    "rptgNtty",
    "othrRptgNtty",
    "submitrCaseRef",
    "caseRef"
})
public class ReportedFraud2 {

    @XmlElement(name = "FrdTp", required = true)
    @XmlSchemaType(name = "string")
    protected FraudType1Code frdTp;
    @XmlElement(name = "OthrFrdTp")
    protected String othrFrdTp;
    @XmlElement(name = "FrdRptgActn", required = true)
    @XmlSchemaType(name = "string")
    protected FraudReportingAction1Code frdRptgActn;
    @XmlElement(name = "OthrFrdRptgActn")
    protected String othrFrdRptgActn;
    @XmlElement(name = "RptgNtty", required = true)
    @XmlSchemaType(name = "string")
    protected PartyType25Code rptgNtty;
    @XmlElement(name = "OthrRptgNtty")
    protected String othrRptgNtty;
    @XmlElement(name = "SubmitrCaseRef")
    protected String submitrCaseRef;
    @XmlElement(name = "CaseRef")
    protected String caseRef;

    /**
     * Gets the value of the frdTp property.
     * 
     * @return
     *     possible object is
     *     {@link FraudType1Code }
     *     
     */
    public FraudType1Code getFrdTp() {
        return frdTp;
    }

    /**
     * Sets the value of the frdTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudType1Code }
     *     
     */
    public ReportedFraud2 setFrdTp(FraudType1Code value) {
        this.frdTp = value;
        return this;
    }

    /**
     * Gets the value of the othrFrdTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrFrdTp() {
        return othrFrdTp;
    }

    /**
     * Sets the value of the othrFrdTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportedFraud2 setOthrFrdTp(String value) {
        this.othrFrdTp = value;
        return this;
    }

    /**
     * Gets the value of the frdRptgActn property.
     * 
     * @return
     *     possible object is
     *     {@link FraudReportingAction1Code }
     *     
     */
    public FraudReportingAction1Code getFrdRptgActn() {
        return frdRptgActn;
    }

    /**
     * Sets the value of the frdRptgActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudReportingAction1Code }
     *     
     */
    public ReportedFraud2 setFrdRptgActn(FraudReportingAction1Code value) {
        this.frdRptgActn = value;
        return this;
    }

    /**
     * Gets the value of the othrFrdRptgActn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrFrdRptgActn() {
        return othrFrdRptgActn;
    }

    /**
     * Sets the value of the othrFrdRptgActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportedFraud2 setOthrFrdRptgActn(String value) {
        this.othrFrdRptgActn = value;
        return this;
    }

    /**
     * Gets the value of the rptgNtty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType25Code }
     *     
     */
    public PartyType25Code getRptgNtty() {
        return rptgNtty;
    }

    /**
     * Sets the value of the rptgNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType25Code }
     *     
     */
    public ReportedFraud2 setRptgNtty(PartyType25Code value) {
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
    public ReportedFraud2 setOthrRptgNtty(String value) {
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
    public ReportedFraud2 setSubmitrCaseRef(String value) {
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
    public ReportedFraud2 setCaseRef(String value) {
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
