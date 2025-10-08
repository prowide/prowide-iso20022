
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
 * The InvoiceTaxReportStatusAdvice message is sent by the matching application to the party from which it received a message.
 * This message is used to acknowledge the InvoiceTaxReport message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceTaxReportStatusAdviceV01", propOrder = {
    "stsRptHdr",
    "txSts",
    "splmtryData"
})
public class InvoiceTaxReportStatusAdviceV01 {

    @XmlElement(name = "StsRptHdr", required = true)
    protected InvoiceTaxStatusReportHeader1 stsRptHdr;
    @XmlElement(name = "TxSts")
    protected List<InvoiceTaxReportTransactionStatus1> txSts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the stsRptHdr property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceTaxStatusReportHeader1 }
     *     
     */
    public InvoiceTaxStatusReportHeader1 getStsRptHdr() {
        return stsRptHdr;
    }

    /**
     * Sets the value of the stsRptHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceTaxStatusReportHeader1 }
     *     
     */
    public InvoiceTaxReportStatusAdviceV01 setStsRptHdr(InvoiceTaxStatusReportHeader1 value) {
        this.stsRptHdr = value;
        return this;
    }

    /**
     * Gets the value of the txSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceTaxReportTransactionStatus1 }
     * 
     * 
     */
    public List<InvoiceTaxReportTransactionStatus1> getTxSts() {
        if (txSts == null) {
            txSts = new ArrayList<InvoiceTaxReportTransactionStatus1>();
        }
        return this.txSts;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
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
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
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
     * Adds a new item to the txSts list.
     * @see #getTxSts()
     * 
     */
    public InvoiceTaxReportStatusAdviceV01 addTxSts(InvoiceTaxReportTransactionStatus1 txSts) {
        getTxSts().add(txSts);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public InvoiceTaxReportStatusAdviceV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
