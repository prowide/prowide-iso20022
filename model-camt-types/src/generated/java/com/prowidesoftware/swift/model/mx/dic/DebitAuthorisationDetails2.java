
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides the reason for requesting a debit authorisation as well as the amount of the requested debit.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebitAuthorisationDetails2", propOrder = {
    "cxlRsn",
    "amtToDbt",
    "valDtToDbt"
})
public class DebitAuthorisationDetails2 {

    @XmlElement(name = "CxlRsn", required = true)
    @XmlSchemaType(name = "string")
    protected CancellationReason3Code cxlRsn;
    @XmlElement(name = "AmtToDbt")
    protected CurrencyAndAmount amtToDbt;
    @XmlElement(name = "ValDtToDbt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valDtToDbt;

    /**
     * Gets the value of the cxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationReason3Code }
     *     
     */
    public CancellationReason3Code getCxlRsn() {
        return cxlRsn;
    }

    /**
     * Sets the value of the cxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationReason3Code }
     *     
     */
    public DebitAuthorisationDetails2 setCxlRsn(CancellationReason3Code value) {
        this.cxlRsn = value;
        return this;
    }

    /**
     * Gets the value of the amtToDbt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getAmtToDbt() {
        return amtToDbt;
    }

    /**
     * Sets the value of the amtToDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public DebitAuthorisationDetails2 setAmtToDbt(CurrencyAndAmount value) {
        this.amtToDbt = value;
        return this;
    }

    /**
     * Gets the value of the valDtToDbt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValDtToDbt() {
        return valDtToDbt;
    }

    /**
     * Sets the value of the valDtToDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public DebitAuthorisationDetails2 setValDtToDbt(XMLGregorianCalendar value) {
        this.valDtToDbt = value;
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
