
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetTime;
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
 * Posting of an item to a cash account, in the context of a cash transaction, that results in an increase or decrease to the balance of the account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayInScheduleItems", propOrder = {
    "amt",
    "ddln"
})
public class PayInScheduleItems {

    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "Ddln", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected OffsetTime ddln;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public PayInScheduleItems setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the ddln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetTime getDdln() {
        return ddln;
    }

    /**
     * Sets the value of the ddln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PayInScheduleItems setDdln(OffsetTime value) {
        this.ddln = value;
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
