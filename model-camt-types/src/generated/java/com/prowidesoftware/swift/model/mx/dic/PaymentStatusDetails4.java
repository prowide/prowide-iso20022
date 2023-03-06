
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
 * Information related to the payment status details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentStatusDetails4", propOrder = {
    "pmtInstrSts",
    "pmtInstrStsDtTm",
    "pmtInstrStsRsn"
})
public class PaymentStatusDetails4 {

    @XmlElement(name = "PmtInstrSts")
    protected PaymentStatusCode4Choice pmtInstrSts;
    @XmlElement(name = "PmtInstrStsDtTm")
    protected DateAndDateTimeChoice pmtInstrStsDtTm;
    @XmlElement(name = "PmtInstrStsRsn")
    protected List<PaymentStatusReasonCode4Choice> pmtInstrStsRsn;

    /**
     * Gets the value of the pmtInstrSts property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatusCode4Choice }
     *     
     */
    public PaymentStatusCode4Choice getPmtInstrSts() {
        return pmtInstrSts;
    }

    /**
     * Sets the value of the pmtInstrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatusCode4Choice }
     *     
     */
    public PaymentStatusDetails4 setPmtInstrSts(PaymentStatusCode4Choice value) {
        this.pmtInstrSts = value;
        return this;
    }

    /**
     * Gets the value of the pmtInstrStsDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getPmtInstrStsDtTm() {
        return pmtInstrStsDtTm;
    }

    /**
     * Sets the value of the pmtInstrStsDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public PaymentStatusDetails4 setPmtInstrStsDtTm(DateAndDateTimeChoice value) {
        this.pmtInstrStsDtTm = value;
        return this;
    }

    /**
     * Gets the value of the pmtInstrStsRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtInstrStsRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtInstrStsRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentStatusReasonCode4Choice }
     * 
     * 
     */
    public List<PaymentStatusReasonCode4Choice> getPmtInstrStsRsn() {
        if (pmtInstrStsRsn == null) {
            pmtInstrStsRsn = new ArrayList<PaymentStatusReasonCode4Choice>();
        }
        return this.pmtInstrStsRsn;
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
     * Adds a new item to the pmtInstrStsRsn list.
     * @see #getPmtInstrStsRsn()
     * 
     */
    public PaymentStatusDetails4 addPmtInstrStsRsn(PaymentStatusReasonCode4Choice pmtInstrStsRsn) {
        getPmtInstrStsRsn().add(pmtInstrStsRsn);
        return this;
    }

}
