
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
 * Provides information about securities quantity linked to a corporate action option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesQuantityDetailsSD4", propOrder = {
    "ovrsbcptQty",
    "ttlOvrsbcptQty",
    "instrQty",
    "opnUcvrdQty",
    "intrmCvrdQty"
})
public class SecuritiesQuantityDetailsSD4 {

    @XmlElement(name = "OvrsbcptQty")
    protected FinancialInstrumentQuantity4 ovrsbcptQty;
    @XmlElement(name = "TtlOvrsbcptQty")
    protected FinancialInstrumentQuantity4 ttlOvrsbcptQty;
    @XmlElement(name = "InstrQty")
    protected FinancialInstrumentQuantity31Choice instrQty;
    @XmlElement(name = "OpnUcvrdQty")
    protected FinancialInstrumentQuantity31Choice opnUcvrdQty;
    @XmlElement(name = "IntrmCvrdQty")
    protected FinancialInstrumentQuantity31Choice intrmCvrdQty;

    /**
     * Gets the value of the ovrsbcptQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity4 }
     *     
     */
    public FinancialInstrumentQuantity4 getOvrsbcptQty() {
        return ovrsbcptQty;
    }

    /**
     * Sets the value of the ovrsbcptQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity4 }
     *     
     */
    public SecuritiesQuantityDetailsSD4 setOvrsbcptQty(FinancialInstrumentQuantity4 value) {
        this.ovrsbcptQty = value;
        return this;
    }

    /**
     * Gets the value of the ttlOvrsbcptQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity4 }
     *     
     */
    public FinancialInstrumentQuantity4 getTtlOvrsbcptQty() {
        return ttlOvrsbcptQty;
    }

    /**
     * Sets the value of the ttlOvrsbcptQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity4 }
     *     
     */
    public SecuritiesQuantityDetailsSD4 setTtlOvrsbcptQty(FinancialInstrumentQuantity4 value) {
        this.ttlOvrsbcptQty = value;
        return this;
    }

    /**
     * Gets the value of the instrQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity31Choice }
     *     
     */
    public FinancialInstrumentQuantity31Choice getInstrQty() {
        return instrQty;
    }

    /**
     * Sets the value of the instrQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity31Choice }
     *     
     */
    public SecuritiesQuantityDetailsSD4 setInstrQty(FinancialInstrumentQuantity31Choice value) {
        this.instrQty = value;
        return this;
    }

    /**
     * Gets the value of the opnUcvrdQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity31Choice }
     *     
     */
    public FinancialInstrumentQuantity31Choice getOpnUcvrdQty() {
        return opnUcvrdQty;
    }

    /**
     * Sets the value of the opnUcvrdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity31Choice }
     *     
     */
    public SecuritiesQuantityDetailsSD4 setOpnUcvrdQty(FinancialInstrumentQuantity31Choice value) {
        this.opnUcvrdQty = value;
        return this;
    }

    /**
     * Gets the value of the intrmCvrdQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity31Choice }
     *     
     */
    public FinancialInstrumentQuantity31Choice getIntrmCvrdQty() {
        return intrmCvrdQty;
    }

    /**
     * Sets the value of the intrmCvrdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity31Choice }
     *     
     */
    public SecuritiesQuantityDetailsSD4 setIntrmCvrdQty(FinancialInstrumentQuantity31Choice value) {
        this.intrmCvrdQty = value;
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
