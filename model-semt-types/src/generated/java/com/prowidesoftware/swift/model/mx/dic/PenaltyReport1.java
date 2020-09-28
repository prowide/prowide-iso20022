
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the details of the penalties report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PenaltyReport1", propOrder = {
    "rptId",
    "rptDt",
    "rptPrd",
    "frqcy",
    "pnltyListTp",
    "actvtyInd"
})
public class PenaltyReport1 {

    @XmlElement(name = "RptId", required = true)
    protected String rptId;
    @XmlElement(name = "RptDt")
    protected DateAndDateTime2Choice rptDt;
    @XmlElement(name = "RptPrd")
    protected DateOrDateTimePeriod1Choice rptPrd;
    @XmlElement(name = "Frqcy")
    protected Frequency22Choice frqcy;
    @XmlElement(name = "PnltyListTp")
    protected PenaltyListType1Choice pnltyListTp;
    @XmlElement(name = "ActvtyInd")
    protected boolean actvtyInd;

    /**
     * Gets the value of the rptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptId() {
        return rptId;
    }

    /**
     * Sets the value of the rptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PenaltyReport1 setRptId(String value) {
        this.rptId = value;
        return this;
    }

    /**
     * Gets the value of the rptDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getRptDt() {
        return rptDt;
    }

    /**
     * Sets the value of the rptDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public PenaltyReport1 setRptDt(DateAndDateTime2Choice value) {
        this.rptDt = value;
        return this;
    }

    /**
     * Gets the value of the rptPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateOrDateTimePeriod1Choice }
     *     
     */
    public DateOrDateTimePeriod1Choice getRptPrd() {
        return rptPrd;
    }

    /**
     * Sets the value of the rptPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOrDateTimePeriod1Choice }
     *     
     */
    public PenaltyReport1 setRptPrd(DateOrDateTimePeriod1Choice value) {
        this.rptPrd = value;
        return this;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency22Choice }
     *     
     */
    public Frequency22Choice getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency22Choice }
     *     
     */
    public PenaltyReport1 setFrqcy(Frequency22Choice value) {
        this.frqcy = value;
        return this;
    }

    /**
     * Gets the value of the pnltyListTp property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyListType1Choice }
     *     
     */
    public PenaltyListType1Choice getPnltyListTp() {
        return pnltyListTp;
    }

    /**
     * Sets the value of the pnltyListTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyListType1Choice }
     *     
     */
    public PenaltyReport1 setPnltyListTp(PenaltyListType1Choice value) {
        this.pnltyListTp = value;
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
    public PenaltyReport1 setActvtyInd(boolean value) {
        this.actvtyInd = value;
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
