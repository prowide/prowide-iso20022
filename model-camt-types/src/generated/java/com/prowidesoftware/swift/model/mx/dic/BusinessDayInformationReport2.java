
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "BusinessDayInformationReport2", propOrder = {
    "sysId",
    "bizErr",
    "bizDayInf"
})
public class BusinessDayInformationReport2 {

    @XmlElement(name = "SysId", required = true)
    protected List<SystemIdentificationChoice> sysId;
    @XmlElement(name = "BizErr")
    protected ErrorHandling3 bizErr;
    @XmlElement(name = "BizDayInf")
    protected BusinessDayInformationDetails1 bizDayInf;

    /**
     * Gets the value of the sysId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sysId property.
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
     */
    public List<SystemIdentificationChoice> getSysId() {
        if (sysId == null) {
            sysId = new ArrayList<SystemIdentificationChoice>();
        }
        return this.sysId;
    }

    /**
     * Gets the value of the bizErr property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorHandling3 }
     *     
     */
    public ErrorHandling3 getBizErr() {
        return bizErr;
    }

    /**
     * Sets the value of the bizErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorHandling3 }
     *     
     */
    public BusinessDayInformationReport2 setBizErr(ErrorHandling3 value) {
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
    public BusinessDayInformationReport2 setBizDayInf(BusinessDayInformationDetails1 value) {
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
    public BusinessDayInformationReport2 addSysId(SystemIdentificationChoice sysId) {
        getSysId().add(sysId);
        return this;
    }

}
