
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
@XmlType(name = "BusinessDayInformationReturnCriteria", propOrder = {
    "sysStsInd",
    "evtInd",
    "ssnPrdInd",
    "clsrInfInd"
})
public class BusinessDayInformationReturnCriteria {

    @XmlElement(name = "SysStsInd")
    protected Boolean sysStsInd;
    @XmlElement(name = "EvtInd")
    protected Boolean evtInd;
    @XmlElement(name = "SsnPrdInd")
    protected Boolean ssnPrdInd;
    @XmlElement(name = "ClsrInfInd")
    protected Boolean clsrInfInd;

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
    public BusinessDayInformationReturnCriteria setSysStsInd(Boolean value) {
        this.sysStsInd = value;
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
    public BusinessDayInformationReturnCriteria setEvtInd(Boolean value) {
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
    public BusinessDayInformationReturnCriteria setSsnPrdInd(Boolean value) {
        this.ssnPrdInd = value;
        return this;
    }

    /**
     * Gets the value of the clsrInfInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClsrInfInd() {
        return clsrInfInd;
    }

    /**
     * Sets the value of the clsrInfInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public BusinessDayInformationReturnCriteria setClsrInfInd(Boolean value) {
        this.clsrInfInd = value;
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
