
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
 * Contractual details related to the agreement between parties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agreement5", propOrder = {
    "desc",
    "dt",
    "ccy",
    "clsgTp",
    "startDt",
    "dlvryTp",
    "mrgnRatio"
})
public class Agreement5 {

    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "Dt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime dt;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "ClsgTp")
    @XmlSchemaType(name = "string")
    protected ClosingType1Code clsgTp;
    @XmlElement(name = "StartDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime startDt;
    @XmlElement(name = "DlvryTp")
    @XmlSchemaType(name = "string")
    protected DeliveryType2Code dlvryTp;
    @XmlElement(name = "MrgnRatio")
    protected BigDecimal mrgnRatio;

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Agreement5 setDesc(String value) {
        this.desc = value;
        return this;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Agreement5 setDt(OffsetDateTime value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Agreement5 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the clsgTp property.
     * 
     * @return
     *     possible object is
     *     {@link ClosingType1Code }
     *     
     */
    public ClosingType1Code getClsgTp() {
        return clsgTp;
    }

    /**
     * Sets the value of the clsgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosingType1Code }
     *     
     */
    public Agreement5 setClsgTp(ClosingType1Code value) {
        this.clsgTp = value;
        return this;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Agreement5 setStartDt(OffsetDateTime value) {
        this.startDt = value;
        return this;
    }

    /**
     * Gets the value of the dlvryTp property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryType2Code }
     *     
     */
    public DeliveryType2Code getDlvryTp() {
        return dlvryTp;
    }

    /**
     * Sets the value of the dlvryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryType2Code }
     *     
     */
    public Agreement5 setDlvryTp(DeliveryType2Code value) {
        this.dlvryTp = value;
        return this;
    }

    /**
     * Gets the value of the mrgnRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMrgnRatio() {
        return mrgnRatio;
    }

    /**
     * Sets the value of the mrgnRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Agreement5 setMrgnRatio(BigDecimal value) {
        this.mrgnRatio = value;
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
