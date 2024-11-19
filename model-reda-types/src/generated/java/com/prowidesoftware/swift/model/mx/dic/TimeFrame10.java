
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Time frame elements that define a period as number of days before or after a activity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeFrame10", propOrder = {
    "othrTmFrameDesc",
    "tPlus",
    "nonWorkgDayAdjstmnt",
    "refrToOrdrDsk"
})
public class TimeFrame10 {

    @XmlElement(name = "OthrTmFrameDesc")
    protected String othrTmFrameDesc;
    @XmlElement(name = "TPlus")
    protected BigDecimal tPlus;
    @XmlElement(name = "NonWorkgDayAdjstmnt")
    @XmlSchemaType(name = "string")
    protected BusinessDayConvention1Code nonWorkgDayAdjstmnt;
    @XmlElement(name = "RefrToOrdrDsk")
    @XmlSchemaType(name = "string")
    protected ReferToFundOrderDesk1Code refrToOrdrDsk;

    /**
     * Gets the value of the othrTmFrameDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTmFrameDesc() {
        return othrTmFrameDesc;
    }

    /**
     * Sets the value of the othrTmFrameDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TimeFrame10 setOthrTmFrameDesc(String value) {
        this.othrTmFrameDesc = value;
        return this;
    }

    /**
     * Gets the value of the tPlus property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTPlus() {
        return tPlus;
    }

    /**
     * Sets the value of the tPlus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TimeFrame10 setTPlus(BigDecimal value) {
        this.tPlus = value;
        return this;
    }

    /**
     * Gets the value of the nonWorkgDayAdjstmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDayConvention1Code }
     *     
     */
    public BusinessDayConvention1Code getNonWorkgDayAdjstmnt() {
        return nonWorkgDayAdjstmnt;
    }

    /**
     * Sets the value of the nonWorkgDayAdjstmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDayConvention1Code }
     *     
     */
    public TimeFrame10 setNonWorkgDayAdjstmnt(BusinessDayConvention1Code value) {
        this.nonWorkgDayAdjstmnt = value;
        return this;
    }

    /**
     * Gets the value of the refrToOrdrDsk property.
     * 
     * @return
     *     possible object is
     *     {@link ReferToFundOrderDesk1Code }
     *     
     */
    public ReferToFundOrderDesk1Code getRefrToOrdrDsk() {
        return refrToOrdrDsk;
    }

    /**
     * Sets the value of the refrToOrdrDsk property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferToFundOrderDesk1Code }
     *     
     */
    public TimeFrame10 setRefrToOrdrDsk(ReferToFundOrderDesk1Code value) {
        this.refrToOrdrDsk = value;
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
