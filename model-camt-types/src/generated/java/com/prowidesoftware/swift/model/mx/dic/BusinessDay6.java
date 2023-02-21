
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
 * Reports on business day information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDay6", propOrder = {
    "sysId",
    "bizDayOrErr"
})
public class BusinessDay6 {

    @XmlElement(name = "SysId", required = true)
    protected List<SystemIdentification2Choice> sysId;
    @XmlElement(name = "BizDayOrErr", required = true)
    protected BusinessDayReportOrError8Choice bizDayOrErr;

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
     * {@link SystemIdentification2Choice }
     * 
     * 
     */
    public List<SystemIdentification2Choice> getSysId() {
        if (sysId == null) {
            sysId = new ArrayList<SystemIdentification2Choice>();
        }
        return this.sysId;
    }

    /**
     * Gets the value of the bizDayOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDayReportOrError8Choice }
     *     
     */
    public BusinessDayReportOrError8Choice getBizDayOrErr() {
        return bizDayOrErr;
    }

    /**
     * Sets the value of the bizDayOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDayReportOrError8Choice }
     *     
     */
    public BusinessDay6 setBizDayOrErr(BusinessDayReportOrError8Choice value) {
        this.bizDayOrErr = value;
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
    public BusinessDay6 addSysId(SystemIdentification2Choice sysId) {
        getSysId().add(sysId);
        return this;
    }

}
