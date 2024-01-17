
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
 * Defines the criteria used to report on a system or a member of the system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemReturnCriteria2", propOrder = {
    "sysIdInd",
    "mmbIdInd",
    "ctryIdInd",
    "acctIdInd"
})
public class SystemReturnCriteria2 {

    @XmlElement(name = "SysIdInd")
    protected Boolean sysIdInd;
    @XmlElement(name = "MmbIdInd")
    protected Boolean mmbIdInd;
    @XmlElement(name = "CtryIdInd")
    protected Boolean ctryIdInd;
    @XmlElement(name = "AcctIdInd")
    protected Boolean acctIdInd;

    /**
     * Gets the value of the sysIdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSysIdInd() {
        return sysIdInd;
    }

    /**
     * Sets the value of the sysIdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SystemReturnCriteria2 setSysIdInd(Boolean value) {
        this.sysIdInd = value;
        return this;
    }

    /**
     * Gets the value of the mmbIdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMmbIdInd() {
        return mmbIdInd;
    }

    /**
     * Sets the value of the mmbIdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SystemReturnCriteria2 setMmbIdInd(Boolean value) {
        this.mmbIdInd = value;
        return this;
    }

    /**
     * Gets the value of the ctryIdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCtryIdInd() {
        return ctryIdInd;
    }

    /**
     * Sets the value of the ctryIdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SystemReturnCriteria2 setCtryIdInd(Boolean value) {
        this.ctryIdInd = value;
        return this;
    }

    /**
     * Gets the value of the acctIdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcctIdInd() {
        return acctIdInd;
    }

    /**
     * Sets the value of the acctIdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SystemReturnCriteria2 setAcctIdInd(Boolean value) {
        this.acctIdInd = value;
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
