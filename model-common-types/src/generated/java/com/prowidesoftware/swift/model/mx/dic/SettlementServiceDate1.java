
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
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
 * Date related to the settlement of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementServiceDate1", propOrder = {
    "reqdSttlmDt",
    "sttlmDt",
    "sttlmTm",
    "sttlmPrd",
    "sttlmCutOffTm"
})
public class SettlementServiceDate1 {

    @XmlElement(name = "ReqdSttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate reqdSttlmDt;
    @XmlElement(name = "SttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate sttlmDt;
    @XmlElement(name = "SttlmTm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected OffsetTime sttlmTm;
    @XmlElement(name = "SttlmPrd")
    protected String sttlmPrd;
    @XmlElement(name = "SttlmCutOffTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime sttlmCutOffTm;

    /**
     * Gets the value of the reqdSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getReqdSttlmDt() {
        return reqdSttlmDt;
    }

    /**
     * Sets the value of the reqdSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementServiceDate1 setReqdSttlmDt(LocalDate value) {
        this.reqdSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementServiceDate1 setSttlmDt(LocalDate value) {
        this.sttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetTime getSttlmTm() {
        return sttlmTm;
    }

    /**
     * Sets the value of the sttlmTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementServiceDate1 setSttlmTm(OffsetTime value) {
        this.sttlmTm = value;
        return this;
    }

    /**
     * Gets the value of the sttlmPrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmPrd() {
        return sttlmPrd;
    }

    /**
     * Sets the value of the sttlmPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementServiceDate1 setSttlmPrd(String value) {
        this.sttlmPrd = value;
        return this;
    }

    /**
     * Gets the value of the sttlmCutOffTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getSttlmCutOffTm() {
        return sttlmCutOffTm;
    }

    /**
     * Sets the value of the sttlmCutOffTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementServiceDate1 setSttlmCutOffTm(OffsetDateTime value) {
        this.sttlmCutOffTm = value;
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
