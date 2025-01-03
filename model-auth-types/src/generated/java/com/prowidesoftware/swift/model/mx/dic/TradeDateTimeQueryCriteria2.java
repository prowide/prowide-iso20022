
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
 * Date and time query criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeDateTimeQueryCriteria2", propOrder = {
    "rptgDtTm",
    "exctnDtTm",
    "mtrtyDt",
    "termntnDt"
})
public class TradeDateTimeQueryCriteria2 {

    @XmlElement(name = "RptgDtTm")
    protected DateTimePeriod1 rptgDtTm;
    @XmlElement(name = "ExctnDtTm")
    protected DateTimePeriod1 exctnDtTm;
    @XmlElement(name = "MtrtyDt")
    protected DateOrBlankQuery2Choice mtrtyDt;
    @XmlElement(name = "TermntnDt")
    protected DateOrBlankQuery2Choice termntnDt;

    /**
     * Gets the value of the rptgDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public DateTimePeriod1 getRptgDtTm() {
        return rptgDtTm;
    }

    /**
     * Sets the value of the rptgDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public TradeDateTimeQueryCriteria2 setRptgDtTm(DateTimePeriod1 value) {
        this.rptgDtTm = value;
        return this;
    }

    /**
     * Gets the value of the exctnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public DateTimePeriod1 getExctnDtTm() {
        return exctnDtTm;
    }

    /**
     * Sets the value of the exctnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public TradeDateTimeQueryCriteria2 setExctnDtTm(DateTimePeriod1 value) {
        this.exctnDtTm = value;
        return this;
    }

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateOrBlankQuery2Choice }
     *     
     */
    public DateOrBlankQuery2Choice getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOrBlankQuery2Choice }
     *     
     */
    public TradeDateTimeQueryCriteria2 setMtrtyDt(DateOrBlankQuery2Choice value) {
        this.mtrtyDt = value;
        return this;
    }

    /**
     * Gets the value of the termntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateOrBlankQuery2Choice }
     *     
     */
    public DateOrBlankQuery2Choice getTermntnDt() {
        return termntnDt;
    }

    /**
     * Sets the value of the termntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOrBlankQuery2Choice }
     *     
     */
    public TradeDateTimeQueryCriteria2 setTermntnDt(DateOrBlankQuery2Choice value) {
        this.termntnDt = value;
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
