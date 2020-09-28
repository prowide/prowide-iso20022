
package com.prowidesoftware.swift.model.mx.dic;

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
 * Attributes of derivatives.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativeInstrument7", propOrder = {
    "ctrctTp",
    "undrlygTp",
    "undrlygId"
})
public class DerivativeInstrument7 {

    @XmlElement(name = "CtrctTp", required = true)
    @XmlSchemaType(name = "string")
    protected FinancialInstrumentContractType3Code ctrctTp;
    @XmlElement(name = "UndrlygTp", required = true)
    @XmlSchemaType(name = "string")
    protected UnderlyingDerivativeType1Code undrlygTp;
    @XmlElement(name = "UndrlygId", required = true)
    protected SecurityIdentification31Choice undrlygId;

    /**
     * Gets the value of the ctrctTp property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentContractType3Code }
     *     
     */
    public FinancialInstrumentContractType3Code getCtrctTp() {
        return ctrctTp;
    }

    /**
     * Sets the value of the ctrctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentContractType3Code }
     *     
     */
    public DerivativeInstrument7 setCtrctTp(FinancialInstrumentContractType3Code value) {
        this.ctrctTp = value;
        return this;
    }

    /**
     * Gets the value of the undrlygTp property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingDerivativeType1Code }
     *     
     */
    public UnderlyingDerivativeType1Code getUndrlygTp() {
        return undrlygTp;
    }

    /**
     * Sets the value of the undrlygTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingDerivativeType1Code }
     *     
     */
    public DerivativeInstrument7 setUndrlygTp(UnderlyingDerivativeType1Code value) {
        this.undrlygTp = value;
        return this;
    }

    /**
     * Gets the value of the undrlygId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification31Choice }
     *     
     */
    public SecurityIdentification31Choice getUndrlygId() {
        return undrlygId;
    }

    /**
     * Sets the value of the undrlygId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification31Choice }
     *     
     */
    public DerivativeInstrument7 setUndrlygId(SecurityIdentification31Choice value) {
        this.undrlygId = value;
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
