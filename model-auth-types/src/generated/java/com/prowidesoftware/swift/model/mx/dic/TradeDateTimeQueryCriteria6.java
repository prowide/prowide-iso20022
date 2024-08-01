
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
@XmlType(name = "TradeDateTimeQueryCriteria6", propOrder = {
    "rptgDtTm",
    "exctnDtTm",
    "mtrtyDt",
    "fctvDt",
    "valtnDtTm",
    "xprtnDt",
    "earlyTermntnDt",
    "collTmStmp",
    "hstrclAsOfDt"
})
public class TradeDateTimeQueryCriteria6 {

    @XmlElement(name = "RptgDtTm")
    protected DateTimePeriod1 rptgDtTm;
    @XmlElement(name = "ExctnDtTm")
    protected DateTimePeriod1 exctnDtTm;
    @XmlElement(name = "MtrtyDt")
    protected DateOrBlankQuery2Choice mtrtyDt;
    @XmlElement(name = "FctvDt")
    protected DatePeriod1 fctvDt;
    @XmlElement(name = "ValtnDtTm")
    protected DateTimePeriod1 valtnDtTm;
    @XmlElement(name = "XprtnDt")
    protected DateOrBlankQuery2Choice xprtnDt;
    @XmlElement(name = "EarlyTermntnDt")
    protected DatePeriod1 earlyTermntnDt;
    @XmlElement(name = "CollTmStmp")
    protected DateTimeOrBlankQuery1Choice collTmStmp;
    @XmlElement(name = "HstrclAsOfDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate hstrclAsOfDt;

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
    public TradeDateTimeQueryCriteria6 setRptgDtTm(DateTimePeriod1 value) {
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
    public TradeDateTimeQueryCriteria6 setExctnDtTm(DateTimePeriod1 value) {
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
    public TradeDateTimeQueryCriteria6 setMtrtyDt(DateOrBlankQuery2Choice value) {
        this.mtrtyDt = value;
        return this;
    }

    /**
     * Gets the value of the fctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod1 }
     *     
     */
    public DatePeriod1 getFctvDt() {
        return fctvDt;
    }

    /**
     * Sets the value of the fctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod1 }
     *     
     */
    public TradeDateTimeQueryCriteria6 setFctvDt(DatePeriod1 value) {
        this.fctvDt = value;
        return this;
    }

    /**
     * Gets the value of the valtnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public DateTimePeriod1 getValtnDtTm() {
        return valtnDtTm;
    }

    /**
     * Sets the value of the valtnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public TradeDateTimeQueryCriteria6 setValtnDtTm(DateTimePeriod1 value) {
        this.valtnDtTm = value;
        return this;
    }

    /**
     * Gets the value of the xprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateOrBlankQuery2Choice }
     *     
     */
    public DateOrBlankQuery2Choice getXprtnDt() {
        return xprtnDt;
    }

    /**
     * Sets the value of the xprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOrBlankQuery2Choice }
     *     
     */
    public TradeDateTimeQueryCriteria6 setXprtnDt(DateOrBlankQuery2Choice value) {
        this.xprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the earlyTermntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod1 }
     *     
     */
    public DatePeriod1 getEarlyTermntnDt() {
        return earlyTermntnDt;
    }

    /**
     * Sets the value of the earlyTermntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod1 }
     *     
     */
    public TradeDateTimeQueryCriteria6 setEarlyTermntnDt(DatePeriod1 value) {
        this.earlyTermntnDt = value;
        return this;
    }

    /**
     * Gets the value of the collTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeOrBlankQuery1Choice }
     *     
     */
    public DateTimeOrBlankQuery1Choice getCollTmStmp() {
        return collTmStmp;
    }

    /**
     * Sets the value of the collTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeOrBlankQuery1Choice }
     *     
     */
    public TradeDateTimeQueryCriteria6 setCollTmStmp(DateTimeOrBlankQuery1Choice value) {
        this.collTmStmp = value;
        return this;
    }

    /**
     * Gets the value of the hstrclAsOfDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getHstrclAsOfDt() {
        return hstrclAsOfDt;
    }

    /**
     * Sets the value of the hstrclAsOfDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeDateTimeQueryCriteria6 setHstrclAsOfDt(LocalDate value) {
        this.hstrclAsOfDt = value;
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
