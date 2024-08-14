
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
 * Defines the criteria used to report on business day information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDayReturnCriteria2", propOrder = {
    "sysDtInd",
    "sysStsInd",
    "sysCcyInd",
    "clsrPrdInd",
    "evtInd",
    "ssnPrdInd",
    "evtTpInd"
})
public class BusinessDayReturnCriteria2 {

    @XmlElement(name = "SysDtInd")
    protected Boolean sysDtInd;
    @XmlElement(name = "SysStsInd")
    protected Boolean sysStsInd;
    @XmlElement(name = "SysCcyInd")
    protected Boolean sysCcyInd;
    @XmlElement(name = "ClsrPrdInd")
    protected Boolean clsrPrdInd;
    @XmlElement(name = "EvtInd")
    protected Boolean evtInd;
    @XmlElement(name = "SsnPrdInd")
    protected Boolean ssnPrdInd;
    @XmlElement(name = "EvtTpInd")
    protected Boolean evtTpInd;

    /**
     * Gets the value of the sysDtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSysDtInd() {
        return sysDtInd;
    }

    /**
     * Sets the value of the sysDtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public BusinessDayReturnCriteria2 setSysDtInd(Boolean value) {
        this.sysDtInd = value;
        return this;
    }

    /**
     * Gets the value of the sysStsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSysStsInd() {
        return sysStsInd;
    }

    /**
     * Sets the value of the sysStsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public BusinessDayReturnCriteria2 setSysStsInd(Boolean value) {
        this.sysStsInd = value;
        return this;
    }

    /**
     * Gets the value of the sysCcyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSysCcyInd() {
        return sysCcyInd;
    }

    /**
     * Sets the value of the sysCcyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public BusinessDayReturnCriteria2 setSysCcyInd(Boolean value) {
        this.sysCcyInd = value;
        return this;
    }

    /**
     * Gets the value of the clsrPrdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClsrPrdInd() {
        return clsrPrdInd;
    }

    /**
     * Sets the value of the clsrPrdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public BusinessDayReturnCriteria2 setClsrPrdInd(Boolean value) {
        this.clsrPrdInd = value;
        return this;
    }

    /**
     * Gets the value of the evtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEvtInd() {
        return evtInd;
    }

    /**
     * Sets the value of the evtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public BusinessDayReturnCriteria2 setEvtInd(Boolean value) {
        this.evtInd = value;
        return this;
    }

    /**
     * Gets the value of the ssnPrdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSsnPrdInd() {
        return ssnPrdInd;
    }

    /**
     * Sets the value of the ssnPrdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public BusinessDayReturnCriteria2 setSsnPrdInd(Boolean value) {
        this.ssnPrdInd = value;
        return this;
    }

    /**
     * Gets the value of the evtTpInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEvtTpInd() {
        return evtTpInd;
    }

    /**
     * Sets the value of the evtTpInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public BusinessDayReturnCriteria2 setEvtTpInd(Boolean value) {
        this.evtTpInd = value;
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
