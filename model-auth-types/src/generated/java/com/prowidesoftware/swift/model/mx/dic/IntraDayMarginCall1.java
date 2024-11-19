
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
 * Describes an instance of an intraday margin call being made against a margin account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraDayMarginCall1", propOrder = {
    "mrgnAcctId",
    "intraDayCall",
    "tmStmp"
})
public class IntraDayMarginCall1 {

    @XmlElement(name = "MrgnAcctId", required = true)
    protected GenericIdentification165 mrgnAcctId;
    @XmlElement(name = "IntraDayCall", required = true)
    protected ActiveCurrencyAndAmount intraDayCall;
    @XmlElement(name = "TmStmp", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime tmStmp;

    /**
     * Gets the value of the mrgnAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification165 }
     *     
     */
    public GenericIdentification165 getMrgnAcctId() {
        return mrgnAcctId;
    }

    /**
     * Sets the value of the mrgnAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification165 }
     *     
     */
    public IntraDayMarginCall1 setMrgnAcctId(GenericIdentification165 value) {
        this.mrgnAcctId = value;
        return this;
    }

    /**
     * Gets the value of the intraDayCall property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getIntraDayCall() {
        return intraDayCall;
    }

    /**
     * Sets the value of the intraDayCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public IntraDayMarginCall1 setIntraDayCall(ActiveCurrencyAndAmount value) {
        this.intraDayCall = value;
        return this;
    }

    /**
     * Gets the value of the tmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getTmStmp() {
        return tmStmp;
    }

    /**
     * Sets the value of the tmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IntraDayMarginCall1 setTmStmp(OffsetDateTime value) {
        this.tmStmp = value;
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
