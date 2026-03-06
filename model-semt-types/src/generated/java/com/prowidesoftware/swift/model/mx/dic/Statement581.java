
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
 * Characteristics of the report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Statement58__1", propOrder = {
    "qryRef",
    "hstrcData",
    "actvtyInd",
    "subAcctInd"
})
public class Statement581 {

    @XmlElement(name = "QryRef")
    protected String qryRef;
    @XmlElement(name = "HstrcData")
    protected boolean hstrcData;
    @XmlElement(name = "ActvtyInd")
    protected boolean actvtyInd;
    @XmlElement(name = "SubAcctInd")
    protected boolean subAcctInd;

    /**
     * Gets the value of the qryRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryRef() {
        return qryRef;
    }

    /**
     * Sets the value of the qryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Statement581 setQryRef(String value) {
        this.qryRef = value;
        return this;
    }

    /**
     * Gets the value of the hstrcData property.
     * 
     */
    public boolean isHstrcData() {
        return hstrcData;
    }

    /**
     * Sets the value of the hstrcData property.
     * 
     */
    public Statement581 setHstrcData(boolean value) {
        this.hstrcData = value;
        return this;
    }

    /**
     * Gets the value of the actvtyInd property.
     * 
     */
    public boolean isActvtyInd() {
        return actvtyInd;
    }

    /**
     * Sets the value of the actvtyInd property.
     * 
     */
    public Statement581 setActvtyInd(boolean value) {
        this.actvtyInd = value;
        return this;
    }

    /**
     * Gets the value of the subAcctInd property.
     * 
     */
    public boolean isSubAcctInd() {
        return subAcctInd;
    }

    /**
     * Sets the value of the subAcctInd property.
     * 
     */
    public Statement581 setSubAcctInd(boolean value) {
        this.subAcctInd = value;
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
