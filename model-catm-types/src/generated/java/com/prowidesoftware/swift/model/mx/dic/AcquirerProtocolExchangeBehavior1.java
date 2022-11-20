
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
 * Acceptor parameters dedicated to the acquirer protocol.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcquirerProtocolExchangeBehavior1", propOrder = {
    "finCaptr",
    "btchTrf",
    "cmpltnXchg",
    "cxlXchg"
})
public class AcquirerProtocolExchangeBehavior1 {

    @XmlElement(name = "FinCaptr", required = true)
    @XmlSchemaType(name = "string")
    protected FinancialCapture1Code finCaptr;
    @XmlElement(name = "BtchTrf")
    protected ExchangeConfiguration8 btchTrf;
    @XmlElement(name = "CmpltnXchg")
    protected ExchangeConfiguration8 cmpltnXchg;
    @XmlElement(name = "CxlXchg")
    @XmlSchemaType(name = "string")
    protected CancellationProcess2Code cxlXchg;

    /**
     * Gets the value of the finCaptr property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialCapture1Code }
     *     
     */
    public FinancialCapture1Code getFinCaptr() {
        return finCaptr;
    }

    /**
     * Sets the value of the finCaptr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialCapture1Code }
     *     
     */
    public AcquirerProtocolExchangeBehavior1 setFinCaptr(FinancialCapture1Code value) {
        this.finCaptr = value;
        return this;
    }

    /**
     * Gets the value of the btchTrf property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeConfiguration8 }
     *     
     */
    public ExchangeConfiguration8 getBtchTrf() {
        return btchTrf;
    }

    /**
     * Sets the value of the btchTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeConfiguration8 }
     *     
     */
    public AcquirerProtocolExchangeBehavior1 setBtchTrf(ExchangeConfiguration8 value) {
        this.btchTrf = value;
        return this;
    }

    /**
     * Gets the value of the cmpltnXchg property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeConfiguration8 }
     *     
     */
    public ExchangeConfiguration8 getCmpltnXchg() {
        return cmpltnXchg;
    }

    /**
     * Sets the value of the cmpltnXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeConfiguration8 }
     *     
     */
    public AcquirerProtocolExchangeBehavior1 setCmpltnXchg(ExchangeConfiguration8 value) {
        this.cmpltnXchg = value;
        return this;
    }

    /**
     * Gets the value of the cxlXchg property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationProcess2Code }
     *     
     */
    public CancellationProcess2Code getCxlXchg() {
        return cxlXchg;
    }

    /**
     * Sets the value of the cxlXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationProcess2Code }
     *     
     */
    public AcquirerProtocolExchangeBehavior1 setCxlXchg(CancellationProcess2Code value) {
        this.cxlXchg = value;
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
