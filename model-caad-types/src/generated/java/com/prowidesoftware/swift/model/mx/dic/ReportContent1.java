
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Contains the content of a report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportContent1", propOrder = {
    "rptLineSeq",
    "frmtdCntt"
})
public class ReportContent1 {

    @XmlElement(name = "RptLineSeq")
    protected String rptLineSeq;
    @XmlElement(name = "FrmtdCntt", required = true)
    protected ReportContent1Choice frmtdCntt;

    /**
     * Gets the value of the rptLineSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptLineSeq() {
        return rptLineSeq;
    }

    /**
     * Sets the value of the rptLineSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportContent1 setRptLineSeq(String value) {
        this.rptLineSeq = value;
        return this;
    }

    /**
     * Gets the value of the frmtdCntt property.
     * 
     * @return
     *     possible object is
     *     {@link ReportContent1Choice }
     *     
     */
    public ReportContent1Choice getFrmtdCntt() {
        return frmtdCntt;
    }

    /**
     * Sets the value of the frmtdCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportContent1Choice }
     *     
     */
    public ReportContent1 setFrmtdCntt(ReportContent1Choice value) {
        this.frmtdCntt = value;
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
