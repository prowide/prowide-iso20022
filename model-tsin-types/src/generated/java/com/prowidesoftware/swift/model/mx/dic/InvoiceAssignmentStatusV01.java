
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
 * The message InvoiceAssignmentStatus is sent by a factoring service provider to a factoring client and, optionally, to an interested party as a response to assignments requests.
 * The factoring service provider returns a copy of items of corresponding requests together with an information about the status of treatment, for example acceptance, rejection or treatment not yet finished. A rejection can be the result of bad message syntax, but also for other motives such as risk, compliance or covenants.
 * For each reported financial item, the factoring service provider includes a reference to the corresponding item of the InvoiceFinancingRequest message and may include the referenced item as well as data from other related and referenced messages.
 * The message contains information about other parties to be notified and whether these parties are required to acknowledge the assignment.
 * The message can carry digital signatures if required by context.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceAssignmentStatusV01", propOrder = {
    "hdr",
    "assgnmtList",
    "assgnmtCnt",
    "itmCnt",
    "ctrlSum",
    "attchdMsg"
})
public class InvoiceAssignmentStatusV01 {

    @XmlElement(name = "Hdr", required = true)
    protected BusinessLetter1 hdr;
    @XmlElement(name = "AssgnmtList", required = true)
    protected List<FinancingItemList1Tsin00700101> assgnmtList;
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
    public InvoiceAssignmentStatusV01 setHdr(BusinessLetter1 value) {
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
     * {@link FinancingItemList1Tsin00700101 }
     * 
     * 
     */
    public List<FinancingItemList1Tsin00700101> getAssgnmtList() {
        if (assgnmtList == null) {
            assgnmtList = new ArrayList<FinancingItemList1Tsin00700101>();
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
    public InvoiceAssignmentStatusV01 setAssgnmtCnt(String value) {
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
    public InvoiceAssignmentStatusV01 setItmCnt(String value) {
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
    public InvoiceAssignmentStatusV01 setCtrlSum(BigDecimal value) {
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
    public InvoiceAssignmentStatusV01 addAssgnmtList(FinancingItemList1Tsin00700101 assgnmtList) {
        getAssgnmtList().add(assgnmtList);
        return this;
    }

    /**
     * Adds a new item to the attchdMsg list.
     * @see #getAttchdMsg()
     * 
     */
    public InvoiceAssignmentStatusV01 addAttchdMsg(EncapsulatedBusinessMessage1 attchdMsg) {
        getAttchdMsg().add(attchdMsg);
        return this;
    }

}
