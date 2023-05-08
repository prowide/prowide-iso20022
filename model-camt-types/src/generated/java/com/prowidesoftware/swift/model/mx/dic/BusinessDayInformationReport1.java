
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Reports either on business day information or on a business error.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDayInformationReport1", propOrder = {
    "sysId",
    "bizErr",
    "bizDayInf"
})
public class BusinessDayInformationReport1 {

    @XmlElement(name = "SysId", required = true)
    protected List<SystemIdentificationChoice> sysId;
    @XmlElement(name = "BizErr")
    protected ErrorHandling2 bizErr;
    @XmlElement(name = "BizDayInf")
    protected BusinessDayInformationDetails1 bizDayInf;

    /**
     * Gets the value of the sysId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sysId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSysId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemIdentificationChoice }
     * 
     * 
     * @return
     *     The value of the sysId property.
     */
    public List<SystemIdentificationChoice> getSysId() {
        if (sysId == null) {
            sysId = new ArrayList<>();
        }
        return this.sysId;
    }

    /**
     * Gets the value of the bizErr property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorHandling2 }
     *     
     */
    public ErrorHandling2 getBizErr() {
        return bizErr;
    }

    /**
     * Sets the value of the bizErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorHandling2 }
     *     
     */
    public BusinessDayInformationReport1 setBizErr(ErrorHandling2 value) {
        this.bizErr = value;
        return this;
    }

    /**
     * Gets the value of the bizDayInf property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDayInformationDetails1 }
     *     
     */
    public BusinessDayInformationDetails1 getBizDayInf() {
        return bizDayInf;
    }

    /**
     * Sets the value of the bizDayInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDayInformationDetails1 }
     *     
     */
    public BusinessDayInformationReport1 setBizDayInf(BusinessDayInformationDetails1 value) {
        this.bizDayInf = value;
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

    /**
     * Adds a new item to the sysId list.
     * @see #getSysId()
     * 
     */
    public BusinessDayInformationReport1 addSysId(SystemIdentificationChoice sysId) {
        getSysId().add(sysId);
        return this;
    }

}
