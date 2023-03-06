
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
 * Scope
 * The BuyInNotification message is sent by the central counterparty (CCP) to a clearing member to notify the start of the buy in process.
 * 
 * The message definition is intended for use with the ISO 20022 Business Application Header.
 * 
 * Usage
 * The buy in process is a process by which the CCP buys in stocks to cover failed transactions; the clearing member is notified that this process has started. Depending on each CCP internal rules, this message can also be sent, as a warning, by the central counterparty to the clearing member some days before the buy in process starts.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyInNotificationV03", propOrder = {
    "txId",
    "clrMmb",
    "ntfctnDtls",
    "orgnlSttlmOblgtn",
    "splmtryData"
})
public class BuyInNotificationV03 {

    @XmlElement(name = "TxId")
    protected String txId;
    @XmlElement(name = "ClrMmb", required = true)
    protected PartyIdentification35Choice clrMmb;
    @XmlElement(name = "NtfctnDtls")
    protected BuyIn4 ntfctnDtls;
    @XmlElement(name = "OrgnlSttlmOblgtn", required = true)
    protected SettlementObligation7 orgnlSttlmOblgtn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BuyInNotificationV03 setTxId(String value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the clrMmb property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public PartyIdentification35Choice getClrMmb() {
        return clrMmb;
    }

    /**
     * Sets the value of the clrMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public BuyInNotificationV03 setClrMmb(PartyIdentification35Choice value) {
        this.clrMmb = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link BuyIn4 }
     *     
     */
    public BuyIn4 getNtfctnDtls() {
        return ntfctnDtls;
    }

    /**
     * Sets the value of the ntfctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyIn4 }
     *     
     */
    public BuyInNotificationV03 setNtfctnDtls(BuyIn4 value) {
        this.ntfctnDtls = value;
        return this;
    }

    /**
     * Gets the value of the orgnlSttlmOblgtn property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementObligation7 }
     *     
     */
    public SettlementObligation7 getOrgnlSttlmOblgtn() {
        return orgnlSttlmOblgtn;
    }

    /**
     * Sets the value of the orgnlSttlmOblgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementObligation7 }
     *     
     */
    public BuyInNotificationV03 setOrgnlSttlmOblgtn(SettlementObligation7 value) {
        this.orgnlSttlmOblgtn = value;
        return this;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public BuyInNotificationV03 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
