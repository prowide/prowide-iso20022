
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
 * Information about the status of a transfer.
 * .
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentStatusDetails1", propOrder = {
    "pmtInstrSts",
    "pmtInstrStsDtTm",
    "pmtInstrStsRsn"
})
public class PaymentStatusDetails1 {

    @XmlElement(name = "PmtInstrSts")
    protected PaymentStatusCode2Choice pmtInstrSts;
    @XmlElement(name = "PmtInstrStsDtTm")
    protected DateAndDateTimeChoice pmtInstrStsDtTm;
    @XmlElement(name = "PmtInstrStsRsn")
    protected List<PaymentStatusReasonCode3Choice> pmtInstrStsRsn;

    /**
     * Gets the value of the pmtInstrSts property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatusCode2Choice }
     *     
     */
    public PaymentStatusCode2Choice getPmtInstrSts() {
        return pmtInstrSts;
    }

    /**
     * Sets the value of the pmtInstrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatusCode2Choice }
     *     
     */
    public PaymentStatusDetails1 setPmtInstrSts(PaymentStatusCode2Choice value) {
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
    public PaymentStatusDetails1 setPmtInstrStsDtTm(DateAndDateTimeChoice value) {
        this.pmtInstrStsDtTm = value;
        return this;
    }

    /**
     * Gets the value of the pmtInstrStsRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pmtInstrStsRsn property.
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
     * {@link PaymentStatusReasonCode3Choice }
     * 
     * 
     * @return
     *     The value of the pmtInstrStsRsn property.
     */
    public List<PaymentStatusReasonCode3Choice> getPmtInstrStsRsn() {
        if (pmtInstrStsRsn == null) {
            pmtInstrStsRsn = new ArrayList<>();
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
    public PaymentStatusDetails1 addPmtInstrStsRsn(PaymentStatusReasonCode3Choice pmtInstrStsRsn) {
        getPmtInstrStsRsn().add(pmtInstrStsRsn);
        return this;
    }

}
