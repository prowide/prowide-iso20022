
package com.prowidesoftware.swift.model.mx.dic;

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
 * Detailed information about an event occurring on a system, whether planned, eg, cut-off time for a specific type of eligible transfer, or unplanned, eg, an unsolicited failure, as stipulated in the specifications of the system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemEvent1", propOrder = {
    "tp",
    "schdldTm",
    "fctvTm"
})
public class SystemEvent1 {

    @XmlElement(name = "Tp", required = true)
    protected SystemEventType1Choice tp;
    @XmlElement(name = "SchdldTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime schdldTm;
    @XmlElement(name = "FctvTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime fctvTm;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link SystemEventType1Choice }
     *     
     */
    public SystemEventType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemEventType1Choice }
     *     
     */
    public SystemEvent1 setTp(SystemEventType1Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the schdldTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getSchdldTm() {
        return schdldTm;
    }

    /**
     * Sets the value of the schdldTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SystemEvent1 setSchdldTm(OffsetDateTime value) {
        this.schdldTm = value;
        return this;
    }

    /**
     * Gets the value of the fctvTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getFctvTm() {
        return fctvTm;
    }

    /**
     * Sets the value of the fctvTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SystemEvent1 setFctvTm(OffsetDateTime value) {
        this.fctvTm = value;
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
