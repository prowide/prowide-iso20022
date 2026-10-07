
package com.prowidesoftware.swift.model.mx.sys.dic;

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
 * Java class for SessionHistoryCriteria complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionHistoryCriteria", propOrder = {
    "chnlNmPttrn",
    "rptOptn",
    "tmRg"
})
public class SessionHistoryCriteria {

    @XmlElement(name = "ChnlNmPttrn", required = true)
    protected String chnlNmPttrn;
    @XmlElement(name = "RptOptn")
    @XmlSchemaType(name = "string")
    protected ReportOption rptOptn;
    @XmlElement(name = "TmRg", required = true)
    protected TimeRange tmRg;

    /**
     * Gets the value of the chnlNmPttrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChnlNmPttrn() {
        return chnlNmPttrn;
    }

    /**
     * Sets the value of the chnlNmPttrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SessionHistoryCriteria setChnlNmPttrn(String value) {
        this.chnlNmPttrn = value;
        return this;
    }

    /**
     * Gets the value of the rptOptn property.
     * 
     * @return
     *     possible object is
     *     {@link ReportOption }
     *     
     */
    public ReportOption getRptOptn() {
        return rptOptn;
    }

    /**
     * Sets the value of the rptOptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportOption }
     *     
     */
    public SessionHistoryCriteria setRptOptn(ReportOption value) {
        this.rptOptn = value;
        return this;
    }

    /**
     * Gets the value of the tmRg property.
     * 
     * @return
     *     possible object is
     *     {@link TimeRange }
     *     
     */
    public TimeRange getTmRg() {
        return tmRg;
    }

    /**
     * Sets the value of the tmRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeRange }
     *     
     */
    public SessionHistoryCriteria setTmRg(TimeRange value) {
        this.tmRg = value;
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
