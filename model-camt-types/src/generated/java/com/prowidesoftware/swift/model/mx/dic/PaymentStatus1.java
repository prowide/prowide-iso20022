
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Payment status details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentStatus1", propOrder = {
    "cd",
    "dtTm",
    "rsn"
})
public class PaymentStatus1 {

    @XmlElement(name = "Cd")
    protected PaymentStatusCode5Choice cd;
    @XmlElement(name = "DtTm")
    protected DateAndDateTimeChoice dtTm;
    @XmlElement(name = "Rsn")
    protected List<PaymentStatusReasonCode5Choice> rsn;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatusCode5Choice }
     *     
     */
    public PaymentStatusCode5Choice getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatusCode5Choice }
     *     
     */
    public PaymentStatus1 setCd(PaymentStatusCode5Choice value) {
        this.cd = value;
        return this;
    }

    /**
     * Gets the value of the dtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getDtTm() {
        return dtTm;
    }

    /**
     * Sets the value of the dtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public PaymentStatus1 setDtTm(DateAndDateTimeChoice value) {
        this.dtTm = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentStatusReasonCode5Choice }
     * 
     * 
     * @return
     *     The value of the rsn property.
     */
    public List<PaymentStatusReasonCode5Choice> getRsn() {
        if (rsn == null) {
            rsn = new ArrayList<>();
        }
        return this.rsn;
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

    /**
     * Adds a new item to the rsn list.
     * @see #getRsn()
     * 
     */
    public PaymentStatus1 addRsn(PaymentStatusReasonCode5Choice rsn) {
        getRsn().add(rsn);
        return this;
    }

}
