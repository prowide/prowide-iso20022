
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
 * Common Reporting Standard (CRS) status information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRSStatus4", propOrder = {
    "tp",
    "src",
    "xcptnlRptgCtry"
})
public class CRSStatus4 {

    @XmlElement(name = "Tp", required = true)
    protected CRSStatus3Choice tp;
    @XmlElement(name = "Src")
    protected CRSSource1Choice src;
    @XmlElement(name = "XcptnlRptgCtry")
    protected String xcptnlRptgCtry;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CRSStatus3Choice }
     *     
     */
    public CRSStatus3Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRSStatus3Choice }
     *     
     */
    public CRSStatus4 setTp(CRSStatus3Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the src property.
     * 
     * @return
     *     possible object is
     *     {@link CRSSource1Choice }
     *     
     */
    public CRSSource1Choice getSrc() {
        return src;
    }

    /**
     * Sets the value of the src property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRSSource1Choice }
     *     
     */
    public CRSStatus4 setSrc(CRSSource1Choice value) {
        this.src = value;
        return this;
    }

    /**
     * Gets the value of the xcptnlRptgCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXcptnlRptgCtry() {
        return xcptnlRptgCtry;
    }

    /**
     * Sets the value of the xcptnlRptgCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CRSStatus4 setXcptnlRptgCtry(String value) {
        this.xcptnlRptgCtry = value;
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
