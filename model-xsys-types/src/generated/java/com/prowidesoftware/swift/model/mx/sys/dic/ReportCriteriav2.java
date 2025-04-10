
package com.prowidesoftware.swift.model.mx.sys.dic;

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
 * Java class for ReportCriteriav2 complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportCriteriav2", propOrder = {
    "qNmPttrn",
    "rptOptn",
    "qFrst",
    "rptVrsn"
})
public class ReportCriteriav2 {

    @XmlElement(name = "QNmPttrn", required = true)
    protected String qNmPttrn;
    @XmlElement(name = "RptOptn")
    @XmlSchemaType(name = "string")
    protected ReportOptionCode rptOptn;
    @XmlElement(name = "QFrst")
    @XmlSchemaType(name = "string")
    protected SwBooleanIndicator qFrst;
    @XmlElement(name = "RptVrsn", required = true)
    protected String rptVrsn;

    /**
     * Gets the value of the qNmPttrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQNmPttrn() {
        return qNmPttrn;
    }

    /**
     * Sets the value of the qNmPttrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportCriteriav2 setQNmPttrn(String value) {
        this.qNmPttrn = value;
        return this;
    }

    /**
     * Gets the value of the rptOptn property.
     * 
     * @return
     *     possible object is
     *     {@link ReportOptionCode }
     *     
     */
    public ReportOptionCode getRptOptn() {
        return rptOptn;
    }

    /**
     * Sets the value of the rptOptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportOptionCode }
     *     
     */
    public ReportCriteriav2 setRptOptn(ReportOptionCode value) {
        this.rptOptn = value;
        return this;
    }

    /**
     * Gets the value of the qFrst property.
     * 
     * @return
     *     possible object is
     *     {@link SwBooleanIndicator }
     *     
     */
    public SwBooleanIndicator getQFrst() {
        return qFrst;
    }

    /**
     * Sets the value of the qFrst property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwBooleanIndicator }
     *     
     */
    public ReportCriteriav2 setQFrst(SwBooleanIndicator value) {
        this.qFrst = value;
        return this;
    }

    /**
     * Gets the value of the rptVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptVrsn() {
        return rptVrsn;
    }

    /**
     * Sets the value of the rptVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportCriteriav2 setRptVrsn(String value) {
        this.rptVrsn = value;
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
