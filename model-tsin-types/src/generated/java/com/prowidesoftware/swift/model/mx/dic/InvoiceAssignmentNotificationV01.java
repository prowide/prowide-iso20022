
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * This message is sent from a factoring service provider or a factoring client to a trade partner to inform about assignments of financing items and, optionally, to an interested party.
 * The information given to the trade party indicates that property of the payment obligation has been or is being transferred to the financial institution and that payments have to be done between the trade partner and the factoring service provider.
 * The message indicates whether the notified party is required to acknowledge the notified assignment and to which party an acknowledgement has to be sent.
 * This message can also be used outside a factoring context directly between a payer and a payee for example as a reminder about a payment obligation or to make an adjustment.
 * If applicable, the message may reference corresponding items of an InvoiceFinancingRequest or InvoiceFinancingStatus or other related messages and may contain referenced data.
 * The message can carry digital signatures if required by context.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceAssignmentNotificationV01", propOrder = {
    "hdr",
    "ntfctnList",
    "ntfctnCnt",
    "itmCnt",
    "ctrlSum",
    "attchdMsg"
})
public class InvoiceAssignmentNotificationV01 {

    @XmlElement(name = "Hdr", required = true)
    protected BusinessLetter1 hdr;
    @XmlElement(name = "NtfctnList", required = true)
    protected List<FinancingItemList1Tsin00800101> ntfctnList;
    @XmlElement(name = "NtfctnCnt")
    protected String ntfctnCnt;
    @XmlElement(name = "ItmCnt")
    protected String itmCnt;
    @XmlElement(name = "CtrlSum")
    protected BigDecimal ctrlSum;
    @XmlElement(name = "AttchdMsg")
    protected List<EncapsulatedBusinessMessage1> attchdMsg;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessLetter1 }
     *     
     */
    public BusinessLetter1 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessLetter1 }
     *     
     */
    public InvoiceAssignmentNotificationV01 setHdr(BusinessLetter1 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntfctnList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtfctnList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancingItemList1Tsin00800101 }
     * 
     * 
     * @return
     *     The value of the ntfctnList property.
     */
    public List<FinancingItemList1Tsin00800101> getNtfctnList() {
        if (ntfctnList == null) {
            ntfctnList = new ArrayList<>();
        }
        return this.ntfctnList;
    }

    /**
     * Gets the value of the ntfctnCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtfctnCnt() {
        return ntfctnCnt;
    }

    /**
     * Sets the value of the ntfctnCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvoiceAssignmentNotificationV01 setNtfctnCnt(String value) {
        this.ntfctnCnt = value;
        return this;
    }

    /**
     * Gets the value of the itmCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItmCnt() {
        return itmCnt;
    }

    /**
     * Sets the value of the itmCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvoiceAssignmentNotificationV01 setItmCnt(String value) {
        this.itmCnt = value;
        return this;
    }

    /**
     * Gets the value of the ctrlSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCtrlSum() {
        return ctrlSum;
    }

    /**
     * Sets the value of the ctrlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvoiceAssignmentNotificationV01 setCtrlSum(BigDecimal value) {
        this.ctrlSum = value;
        return this;
    }

    /**
     * Gets the value of the attchdMsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the attchdMsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttchdMsg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncapsulatedBusinessMessage1 }
     * 
     * 
     * @return
     *     The value of the attchdMsg property.
     */
    public List<EncapsulatedBusinessMessage1> getAttchdMsg() {
        if (attchdMsg == null) {
            attchdMsg = new ArrayList<>();
        }
        return this.attchdMsg;
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
     * Adds a new item to the ntfctnList list.
     * @see #getNtfctnList()
     * 
     */
    public InvoiceAssignmentNotificationV01 addNtfctnList(FinancingItemList1Tsin00800101 ntfctnList) {
        getNtfctnList().add(ntfctnList);
        return this;
    }

    /**
     * Adds a new item to the attchdMsg list.
     * @see #getAttchdMsg()
     * 
     */
    public InvoiceAssignmentNotificationV01 addAttchdMsg(EncapsulatedBusinessMessage1 attchdMsg) {
        getAttchdMsg().add(attchdMsg);
        return this;
    }

}
