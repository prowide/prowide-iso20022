
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
@XmlType(name = "PenaltyReport1__1", propOrder = {
    "rptId",
    "rptPrd",
    "frqcy",
    "pnltyListTp",
    "actvtyInd"
})
public class PenaltyReport11 {

    @XmlElement(name = "RptId", required = true)
    protected String rptId;
    @XmlElement(name = "RptPrd")
    protected DatePeriod1Choice rptPrd;
    @XmlElement(name = "Frqcy", required = true)
    protected Frequency22Choice1Semt044Draft frqcy;
    @XmlElement(name = "PnltyListTp")
    protected PenaltyListType1Choice1 pnltyListTp;
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
    public PenaltyReport11 setRptId(String value) {
        this.rptId = value;
        return this;
    }

    /**
     * Gets the value of the rptPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod1Choice }
     *     
     */
    public DatePeriod1Choice getRptPrd() {
        return rptPrd;
    }

    /**
     * Sets the value of the rptPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod1Choice }
     *     
     */
    public PenaltyReport11 setRptPrd(DatePeriod1Choice value) {
        this.rptPrd = value;
        return this;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency22Choice1Semt044Draft }
     *     
     */
    public Frequency22Choice1Semt044Draft getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency22Choice1Semt044Draft }
     *     
     */
    public PenaltyReport11 setFrqcy(Frequency22Choice1Semt044Draft value) {
        this.frqcy = value;
        return this;
    }

    /**
     * Gets the value of the pnltyListTp property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyListType1Choice1 }
     *     
     */
    public PenaltyListType1Choice1 getPnltyListTp() {
        return pnltyListTp;
    }

    /**
     * Sets the value of the pnltyListTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyListType1Choice1 }
     *     
     */
    public PenaltyReport11 setPnltyListTp(PenaltyListType1Choice1 value) {
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
    public PenaltyReport11 setActvtyInd(boolean value) {
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
