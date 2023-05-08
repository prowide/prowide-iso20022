
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
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
 * Details of a payment instruction. The information contained in this component is sufficient to retrieve a payment instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstructionExtract", propOrder = {
    "assgnrInstrId",
    "assgneInstrId",
    "ccyAmt",
    "valDt"
})
public class PaymentInstructionExtract {

    @XmlElement(name = "AssgnrInstrId")
    protected String assgnrInstrId;
    @XmlElement(name = "AssgneInstrId")
    protected String assgneInstrId;
    @XmlElement(name = "CcyAmt")
    protected CurrencyAndAmount ccyAmt;
    @XmlElement(name = "ValDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar valDt;

    /**
     * Gets the value of the assgnrInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssgnrInstrId() {
        return assgnrInstrId;
    }

    /**
     * Sets the value of the assgnrInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentInstructionExtract setAssgnrInstrId(String value) {
        this.assgnrInstrId = value;
        return this;
    }

    /**
     * Gets the value of the assgneInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssgneInstrId() {
        return assgneInstrId;
    }

    /**
     * Sets the value of the assgneInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentInstructionExtract setAssgneInstrId(String value) {
        this.assgneInstrId = value;
        return this;
    }

    /**
     * Gets the value of the ccyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getCcyAmt() {
        return ccyAmt;
    }

    /**
     * Sets the value of the ccyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public PaymentInstructionExtract setCcyAmt(CurrencyAndAmount value) {
        this.ccyAmt = value;
        return this;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentInstructionExtract setValDt(Calendar value) {
        this.valDt = value;
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
