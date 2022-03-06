
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
@XmlType(name = "DebitAuthorisationDetails", propOrder = {
    "cxlRsn",
    "amtToDbt",
    "valDtToDbt"
})
public class DebitAuthorisationDetails {

    @XmlElement(name = "CxlRsn", required = true)
    @XmlSchemaType(name = "string")
    protected CancellationReason1Code cxlRsn;
    @XmlElement(name = "AmtToDbt")
    protected CurrencyAndAmount amtToDbt;
    @XmlElement(name = "ValDtToDbt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valDtToDbt;

    /**
     * Gets the value of the cxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationReason1Code }
     *     
     */
    public CancellationReason1Code getCxlRsn() {
        return cxlRsn;
    }

    /**
     * Sets the value of the cxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationReason1Code }
     *     
     */
    public DebitAuthorisationDetails setCxlRsn(CancellationReason1Code value) {
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
    public DebitAuthorisationDetails setAmtToDbt(CurrencyAndAmount value) {
        this.amtToDbt = value;
        return this;
    }

    /**
     * Gets the value of the valDtToDbt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public DebitAuthorisationDetails setValDtToDbt(XMLGregorianCalendar value) {
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
