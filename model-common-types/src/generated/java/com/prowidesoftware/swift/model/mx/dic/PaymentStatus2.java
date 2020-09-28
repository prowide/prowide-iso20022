
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "PaymentStatus2", propOrder = {
    "cd",
    "dtTm",
    "rsn"
})
public class PaymentStatus2 {

    @XmlElement(name = "Cd")
    protected PaymentStatusCode6Choice cd;
    @XmlElement(name = "DtTm")
    protected DateAndDateTimeChoice dtTm;
    @XmlElement(name = "Rsn")
    protected List<PaymentStatusReasonCode6Choice> rsn;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatusCode6Choice }
     *     
     */
    public PaymentStatusCode6Choice getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatusCode6Choice }
     *     
     */
    public PaymentStatus2 setCd(PaymentStatusCode6Choice value) {
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
    public PaymentStatus2 setDtTm(DateAndDateTimeChoice value) {
        this.dtTm = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rsn property.
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
     * {@link PaymentStatusReasonCode6Choice }
     * 
     * 
     */
    public List<PaymentStatusReasonCode6Choice> getRsn() {
        if (rsn == null) {
            rsn = new ArrayList<PaymentStatusReasonCode6Choice>();
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
    public PaymentStatus2 addRsn(PaymentStatusReasonCode6Choice rsn) {
        getRsn().add(rsn);
        return this;
    }

}
