
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
 * Information about cumulative subscriptions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionInformation2", propOrder = {
    "dtOfFrstSbcpt",
    "eqtyCmpnt",
    "cshCmpnt",
    "ttlAmtYrToDt"
})
public class SubscriptionInformation2 {

    @XmlElement(name = "DtOfFrstSbcpt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtOfFrstSbcpt;
    @XmlElement(name = "EqtyCmpnt")
    protected ActiveCurrencyAnd13DecimalAmount eqtyCmpnt;
    @XmlElement(name = "CshCmpnt")
    protected ActiveCurrencyAnd13DecimalAmount cshCmpnt;
    @XmlElement(name = "TtlAmtYrToDt", required = true)
    protected ActiveCurrencyAnd13DecimalAmount ttlAmtYrToDt;

    /**
     * Gets the value of the dtOfFrstSbcpt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDtOfFrstSbcpt() {
        return dtOfFrstSbcpt;
    }

    /**
     * Sets the value of the dtOfFrstSbcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SubscriptionInformation2 setDtOfFrstSbcpt(XMLGregorianCalendar value) {
        this.dtOfFrstSbcpt = value;
        return this;
    }

    /**
     * Gets the value of the eqtyCmpnt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getEqtyCmpnt() {
        return eqtyCmpnt;
    }

    /**
     * Sets the value of the eqtyCmpnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public SubscriptionInformation2 setEqtyCmpnt(ActiveCurrencyAnd13DecimalAmount value) {
        this.eqtyCmpnt = value;
        return this;
    }

    /**
     * Gets the value of the cshCmpnt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getCshCmpnt() {
        return cshCmpnt;
    }

    /**
     * Sets the value of the cshCmpnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public SubscriptionInformation2 setCshCmpnt(ActiveCurrencyAnd13DecimalAmount value) {
        this.cshCmpnt = value;
        return this;
    }

    /**
     * Gets the value of the ttlAmtYrToDt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getTtlAmtYrToDt() {
        return ttlAmtYrToDt;
    }

    /**
     * Sets the value of the ttlAmtYrToDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public SubscriptionInformation2 setTtlAmtYrToDt(ActiveCurrencyAnd13DecimalAmount value) {
        this.ttlAmtYrToDt = value;
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
