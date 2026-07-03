
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
 * Java class for Y-CopyStatusResponse complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Y-CopyStatusResponse", propOrder = {
    "reqRef",
    "rptInf",
    "cpSts"
})
public class YCopyStatusResponseXsys02500101 {

    @XmlElement(name = "ReqRef", required = true)
    protected RequestReference reqRef;
    @XmlElement(name = "RptInf", required = true)
    protected ReportInfo rptInf;
    @XmlElement(name = "CpSts")
    protected CopyStatusXsys02500101 cpSts;

    /**
     * Gets the value of the reqRef property.
     * 
     * @return
     *     possible object is
     *     {@link RequestReference }
     *     
     */
    public RequestReference getReqRef() {
        return reqRef;
    }

    /**
     * Sets the value of the reqRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestReference }
     *     
     */
    public YCopyStatusResponseXsys02500101 setReqRef(RequestReference value) {
        this.reqRef = value;
        return this;
    }

    /**
     * Gets the value of the rptInf property.
     * 
     * @return
     *     possible object is
     *     {@link ReportInfo }
     *     
     */
    public ReportInfo getRptInf() {
        return rptInf;
    }

    /**
     * Sets the value of the rptInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportInfo }
     *     
     */
    public YCopyStatusResponseXsys02500101 setRptInf(ReportInfo value) {
        this.rptInf = value;
        return this;
    }

    /**
     * Gets the value of the cpSts property.
     * 
     * @return
     *     possible object is
     *     {@link CopyStatusXsys02500101 }
     *     
     */
    public CopyStatusXsys02500101 getCpSts() {
        return cpSts;
    }

    /**
     * Sets the value of the cpSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyStatusXsys02500101 }
     *     
     */
    public YCopyStatusResponseXsys02500101 setCpSts(CopyStatusXsys02500101 value) {
        this.cpSts = value;
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
