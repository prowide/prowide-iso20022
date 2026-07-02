
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
 * Additional data to be considered for risk assessment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiskInputData1", propOrder = {
    "ntty",
    "tp",
    "val"
})
public class RiskInputData1 {

    @XmlElement(name = "Ntty")
    protected RiskAssessmentDataEntityProvider1 ntty;
    @XmlElement(name = "Tp", required = true)
    protected String tp;
    @XmlElement(name = "Val", required = true)
    protected String val;

    /**
     * Gets the value of the ntty property.
     * 
     * @return
     *     possible object is
     *     {@link RiskAssessmentDataEntityProvider1 }
     *     
     */
    public RiskAssessmentDataEntityProvider1 getNtty() {
        return ntty;
    }

    /**
     * Sets the value of the ntty property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskAssessmentDataEntityProvider1 }
     *     
     */
    public RiskInputData1 setNtty(RiskAssessmentDataEntityProvider1 value) {
        this.ntty = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RiskInputData1 setTp(String value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RiskInputData1 setVal(String value) {
        this.val = value;
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
