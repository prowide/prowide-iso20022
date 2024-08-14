
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
 * Body of the Abort Request message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbortData1", propOrder = {
    "xchgId",
    "abrtRsn",
    "dispOutpt"
})
public class AbortData1 {

    @XmlElement(name = "XchgId", required = true)
    protected String xchgId;
    @XmlElement(name = "AbrtRsn", required = true)
    protected String abrtRsn;
    @XmlElement(name = "DispOutpt")
    protected ActionMessage6 dispOutpt;

    /**
     * Gets the value of the xchgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXchgId() {
        return xchgId;
    }

    /**
     * Sets the value of the xchgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AbortData1 setXchgId(String value) {
        this.xchgId = value;
        return this;
    }

    /**
     * Gets the value of the abrtRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbrtRsn() {
        return abrtRsn;
    }

    /**
     * Sets the value of the abrtRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AbortData1 setAbrtRsn(String value) {
        this.abrtRsn = value;
        return this;
    }

    /**
     * Gets the value of the dispOutpt property.
     * 
     * @return
     *     possible object is
     *     {@link ActionMessage6 }
     *     
     */
    public ActionMessage6 getDispOutpt() {
        return dispOutpt;
    }

    /**
     * Sets the value of the dispOutpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionMessage6 }
     *     
     */
    public AbortData1 setDispOutpt(ActionMessage6 value) {
        this.dispOutpt = value;
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
