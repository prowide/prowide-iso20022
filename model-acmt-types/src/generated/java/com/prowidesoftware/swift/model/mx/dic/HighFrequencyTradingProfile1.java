
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
 * Information about a high frequency trading profile.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HighFrequencyTradingProfile1", propOrder = {
    "dt",
    "sttlmFrqcy",
    "cnsldtnTp"
})
public class HighFrequencyTradingProfile1 {

    @XmlElement(name = "Dt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dt;
    @XmlElement(name = "SttlmFrqcy")
    protected SettlementFrequency1Choice sttlmFrqcy;
    @XmlElement(name = "CnsldtnTp")
    protected ConsolidationType1Choice cnsldtnTp;

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDt() {
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
    public HighFrequencyTradingProfile1 setDt(LocalDate value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFrequency1Choice }
     *     
     */
    public SettlementFrequency1Choice getSttlmFrqcy() {
        return sttlmFrqcy;
    }

    /**
     * Sets the value of the sttlmFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFrequency1Choice }
     *     
     */
    public HighFrequencyTradingProfile1 setSttlmFrqcy(SettlementFrequency1Choice value) {
        this.sttlmFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the cnsldtnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidationType1Choice }
     *     
     */
    public ConsolidationType1Choice getCnsldtnTp() {
        return cnsldtnTp;
    }

    /**
     * Sets the value of the cnsldtnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidationType1Choice }
     *     
     */
    public HighFrequencyTradingProfile1 setCnsldtnTp(ConsolidationType1Choice value) {
        this.cnsldtnTp = value;
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
