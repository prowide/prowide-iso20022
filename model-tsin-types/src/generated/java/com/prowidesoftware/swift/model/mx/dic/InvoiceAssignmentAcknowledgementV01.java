
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * The InvoiceAssignmentAcknowledgement message is sent from a trade partner to communicate the status of payment obligations related to financial items.  The message can be sent independently or as a response to an InvoiceAssignmentNotification message.
 * Depending on legal contexts the message may be required as a response to an InvoiceAssignmentNotification message in order for the assignment to become effective.
 * The trade party may include references to the corresponding items of an InvoiceAssignmentRequest, InvoiceAssignmentStatus or InvoiceAssignmentNotification or other messages and may include referenced data.
 * The message can carry digital signatures if required by context.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceAssignmentAcknowledgementV01", propOrder = {
    "hdr",
    "pmtStsList",
    "pmtStsCnt",
    "itmCnt",
    "ctrlSum",
    "attchdMsg"
})
public class InvoiceAssignmentAcknowledgementV01 {

    @XmlElement(name = "Hdr", required = true)
    protected BusinessLetter1 hdr;
    @XmlElement(name = "PmtStsList", required = true)
    protected List<FinancingItemList1Tsin01300101> pmtStsList;
    @XmlElement(name = "PmtStsCnt")
    protected String pmtStsCnt;
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
    public InvoiceAssignmentAcknowledgementV01 setHdr(BusinessLetter1 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the pmtStsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtStsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtStsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancingItemList1Tsin01300101 }
     * 
     * 
     */
    public List<FinancingItemList1Tsin01300101> getPmtStsList() {
        if (pmtStsList == null) {
            pmtStsList = new ArrayList<FinancingItemList1Tsin01300101>();
        }
        return this.pmtStsList;
    }

    /**
     * Gets the value of the pmtStsCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtStsCnt() {
        return pmtStsCnt;
    }

    /**
     * Sets the value of the pmtStsCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvoiceAssignmentAcknowledgementV01 setPmtStsCnt(String value) {
        this.pmtStsCnt = value;
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
    public InvoiceAssignmentAcknowledgementV01 setItmCnt(String value) {
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
    public InvoiceAssignmentAcknowledgementV01 setCtrlSum(BigDecimal value) {
        this.ctrlSum = value;
        return this;
    }

    /**
     * Gets the value of the attchdMsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attchdMsg property.
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
     */
    public List<EncapsulatedBusinessMessage1> getAttchdMsg() {
        if (attchdMsg == null) {
            attchdMsg = new ArrayList<EncapsulatedBusinessMessage1>();
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
     * Adds a new item to the pmtStsList list.
     * @see #getPmtStsList()
     * 
     */
    public InvoiceAssignmentAcknowledgementV01 addPmtStsList(FinancingItemList1Tsin01300101 pmtStsList) {
        getPmtStsList().add(pmtStsList);
        return this;
    }

    /**
     * Adds a new item to the attchdMsg list.
     * @see #getAttchdMsg()
     * 
     */
    public InvoiceAssignmentAcknowledgementV01 addAttchdMsg(EncapsulatedBusinessMessage1 attchdMsg) {
        getAttchdMsg().add(attchdMsg);
        return this;
    }

}
