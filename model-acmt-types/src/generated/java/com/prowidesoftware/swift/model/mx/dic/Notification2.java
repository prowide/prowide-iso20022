
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
 * Information about the type of notification required.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Notification2", propOrder = {
    "ntfctnTp",
    "reqrd",
    "dstrbtnTp"
})
public class Notification2 {

    @XmlElement(name = "NtfctnTp", required = true)
    protected String ntfctnTp;
    @XmlElement(name = "Reqrd")
    protected boolean reqrd;
    @XmlElement(name = "DstrbtnTp")
    protected InformationDistribution1Choice dstrbtnTp;

    /**
     * Gets the value of the ntfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtfctnTp() {
        return ntfctnTp;
    }

    /**
     * Sets the value of the ntfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Notification2 setNtfctnTp(String value) {
        this.ntfctnTp = value;
        return this;
    }

    /**
     * Gets the value of the reqrd property.
     * 
     */
    public boolean isReqrd() {
        return reqrd;
    }

    /**
     * Sets the value of the reqrd property.
     * 
     */
    public Notification2 setReqrd(boolean value) {
        this.reqrd = value;
        return this;
    }

    /**
     * Gets the value of the dstrbtnTp property.
     * 
     * @return
     *     possible object is
     *     {@link InformationDistribution1Choice }
     *     
     */
    public InformationDistribution1Choice getDstrbtnTp() {
        return dstrbtnTp;
    }

    /**
     * Sets the value of the dstrbtnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationDistribution1Choice }
     *     
     */
    public Notification2 setDstrbtnTp(InformationDistribution1Choice value) {
        this.dstrbtnTp = value;
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
