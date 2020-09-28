
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
 * The PaymentRegulatoryInformationNotification message is sent by the reporting party to the registration agent to provide details on the transaction details, when a payment has to be recorded against the registered currency control contract. 
 * 
 * In some cases, the registration agent may also sent this message to the reporting party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentRegulatoryInformationNotificationV01", propOrder = {
    "grpHdr",
    "txNtfctn",
    "splmtryData"
})
public class PaymentRegulatoryInformationNotificationV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected CurrencyControlHeader3 grpHdr;
    @XmlElement(name = "TxNtfctn", required = true)
    protected List<RegulatoryReportingNotification1> txNtfctn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyControlHeader3 }
     *     
     */
    public CurrencyControlHeader3 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyControlHeader3 }
     *     
     */
    public PaymentRegulatoryInformationNotificationV01 setGrpHdr(CurrencyControlHeader3 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the txNtfctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txNtfctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxNtfctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegulatoryReportingNotification1 }
     * 
     * 
     */
    public List<RegulatoryReportingNotification1> getTxNtfctn() {
        if (txNtfctn == null) {
            txNtfctn = new ArrayList<RegulatoryReportingNotification1>();
        }
        return this.txNtfctn;
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
     * Adds a new item to the txNtfctn list.
     * @see #getTxNtfctn()
     * 
     */
    public PaymentRegulatoryInformationNotificationV01 addTxNtfctn(RegulatoryReportingNotification1 txNtfctn) {
        getTxNtfctn().add(txNtfctn);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public PaymentRegulatoryInformationNotificationV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
