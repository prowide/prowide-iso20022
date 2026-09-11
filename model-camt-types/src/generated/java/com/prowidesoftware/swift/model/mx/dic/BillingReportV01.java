
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
 * The BillingReport message is exchanged between the system transaction administrator and a system member. It aims at providing the invoice or invoice cancellation and informing about data providing cumulative or itemised details backing an invoice.
 * 
 * BillingReport is used for the following usages:
 * - Invoice
 * 
 * The Cumulative Invoice will consist of the following:
 * - Sum of the total number of units per service item for each CSD or CB;
 * - Sum of the amounts based on the total number of units per service item for each CSD or CB;
 * - Cancellation status of the invoice data.
 * - Invoice Cancellation
 * - Cumulative Billing Data Query Response: 
 * 
 * The BillingReport message is also used to inform the system member about details backing an invoice. This can be sent via cumulative billing data or itemised billing data as response to an invoice query message.
 * Itemised Billing Data Query Response: The BillingReport message is also used to inform the system member about details backing an invoice. This can be via cumulative billing data or itemised billing data as response to an invoice query message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingReportV01", propOrder = {
    "msgHdr",
    "bllgRptOrErr",
    "splmtryData"
})
public class BillingReportV01 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader11 msgHdr;
    @XmlElement(name = "BllgRptOrErr", required = true)
    protected BillingReportOrError6Choice bllgRptOrErr;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the msgHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader11 }
     *     
     */
    public MessageHeader11 getMsgHdr() {
        return msgHdr;
    }

    /**
     * Sets the value of the msgHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader11 }
     *     
     */
    public BillingReportV01 setMsgHdr(MessageHeader11 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the bllgRptOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link BillingReportOrError6Choice }
     *     
     */
    public BillingReportOrError6Choice getBllgRptOrErr() {
        return bllgRptOrErr;
    }

    /**
     * Sets the value of the bllgRptOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingReportOrError6Choice }
     *     
     */
    public BillingReportV01 setBllgRptOrErr(BillingReportOrError6Choice value) {
        this.bllgRptOrErr = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public BillingReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
