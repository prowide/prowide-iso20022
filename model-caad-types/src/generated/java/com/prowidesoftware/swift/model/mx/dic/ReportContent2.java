
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
 * Contains the content of a report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportContent2", propOrder = {
    "rptLineSeq",
    "frmtdCntt"
})
public class ReportContent2 {

    @XmlElement(name = "RptLineSeq")
    protected String rptLineSeq;
    @XmlElement(name = "FrmtdCntt", required = true)
    protected ReportContent2Choice frmtdCntt;

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
    public ReportContent2 setRptLineSeq(String value) {
        this.rptLineSeq = value;
        return this;
    }

    /**
     * Gets the value of the frmtdCntt property.
     * 
     * @return
     *     possible object is
     *     {@link ReportContent2Choice }
     *     
     */
    public ReportContent2Choice getFrmtdCntt() {
        return frmtdCntt;
    }

    /**
     * Sets the value of the frmtdCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportContent2Choice }
     *     
     */
    public ReportContent2 setFrmtdCntt(ReportContent2Choice value) {
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
