
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
 * The InvoiceAssignmentRequest message is sent from a factoring client to a factoring service provider and, optionally, to an interested party. It indicates the transfer of payment obligations concerning financial documents.
 * The message contains a list of financing requests together with data that are necessary to transfer the related rights for example regarding legal references for example jurisdiction, language or country. Furthermore, the message can reference related messages and can include data from other messages.
 * A factoring client combines a set of financial documents with same characteristics and assigns them to a factoring service. The client can send several assignments in one message and combine them according to different criteria for example for different clients or different currencies.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceAssignmentRequestV01", propOrder = {
    "hdr",
    "assgnmtList",
    "assgnmtCnt",
    "itmCnt",
    "ctrlSum",
    "attchdMsg"
})
public class InvoiceAssignmentRequestV01 {

    @XmlElement(name = "Hdr", required = true)
    protected BusinessLetter1 hdr;
    @XmlElement(name = "AssgnmtList", required = true)
    protected List<FinancingItemList1> assgnmtList;
    @XmlElement(name = "AssgnmtCnt")
    protected String assgnmtCnt;
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
    public InvoiceAssignmentRequestV01 setHdr(BusinessLetter1 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the assgnmtList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assgnmtList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssgnmtList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancingItemList1 }
     * 
     * 
     */
    public List<FinancingItemList1> getAssgnmtList() {
        if (assgnmtList == null) {
            assgnmtList = new ArrayList<FinancingItemList1>();
        }
        return this.assgnmtList;
    }

    /**
     * Gets the value of the assgnmtCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssgnmtCnt() {
        return assgnmtCnt;
    }

    /**
     * Sets the value of the assgnmtCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvoiceAssignmentRequestV01 setAssgnmtCnt(String value) {
        this.assgnmtCnt = value;
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
    public InvoiceAssignmentRequestV01 setItmCnt(String value) {
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
    public InvoiceAssignmentRequestV01 setCtrlSum(BigDecimal value) {
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
     * Adds a new item to the assgnmtList list.
     * @see #getAssgnmtList()
     * 
     */
    public InvoiceAssignmentRequestV01 addAssgnmtList(FinancingItemList1 assgnmtList) {
        getAssgnmtList().add(assgnmtList);
        return this;
    }

    /**
     * Adds a new item to the attchdMsg list.
     * @see #getAttchdMsg()
     * 
     */
    public InvoiceAssignmentRequestV01 addAttchdMsg(EncapsulatedBusinessMessage1 attchdMsg) {
        getAttchdMsg().add(attchdMsg);
        return this;
    }

}
