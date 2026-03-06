
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
@XmlType(name = "IntraPositionReport7__1", propOrder = {
    "rptId",
    "rptDtTm",
    "frqcy",
    "updTp",
    "actvtyInd"
})
public class IntraPositionReport71 {

    @XmlElement(name = "RptId")
    protected String rptId;
    @XmlElement(name = "RptDtTm")
    protected DateAndDateTime2Choice1 rptDtTm;
    @XmlElement(name = "Frqcy")
    protected Frequency22Choice1Draft frqcy;
    @XmlElement(name = "UpdTp", required = true)
    protected UpdateType15Choice1 updTp;
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
    public IntraPositionReport71 setRptId(String value) {
        this.rptId = value;
        return this;
    }

    /**
     * Gets the value of the rptDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice1 }
     *     
     */
    public DateAndDateTime2Choice1 getRptDtTm() {
        return rptDtTm;
    }

    /**
     * Sets the value of the rptDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice1 }
     *     
     */
    public IntraPositionReport71 setRptDtTm(DateAndDateTime2Choice1 value) {
        this.rptDtTm = value;
        return this;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency22Choice1Draft }
     *     
     */
    public Frequency22Choice1Draft getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency22Choice1Draft }
     *     
     */
    public IntraPositionReport71 setFrqcy(Frequency22Choice1Draft value) {
        this.frqcy = value;
        return this;
    }

    /**
     * Gets the value of the updTp property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateType15Choice1 }
     *     
     */
    public UpdateType15Choice1 getUpdTp() {
        return updTp;
    }

    /**
     * Sets the value of the updTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateType15Choice1 }
     *     
     */
    public IntraPositionReport71 setUpdTp(UpdateType15Choice1 value) {
        this.updTp = value;
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
    public IntraPositionReport71 setActvtyInd(boolean value) {
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
