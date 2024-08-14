
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
 * This message is sent by the central counterparty (CCP) to a clearing member to notify the start of the buy in process. 
 * 
 * Note: This message can also be sent, as a warning, by the central counterparty to the clearing member some days before the buy in process starts.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyInNotificationV01", propOrder = {
    "id",
    "clrMmb",
    "ntfctnDtls",
    "orgnlSttlmOblgtn",
    "splmtryData"
})
public class BuyInNotificationV01 {

    @XmlElement(name = "Id", required = true)
    protected TransactionAndDocumentIdentification4 id;
    @XmlElement(name = "ClrMmb", required = true)
    protected PartyIdentification35Choice clrMmb;
    @XmlElement(name = "NtfctnDtls")
    protected BuyIn1 ntfctnDtls;
    @XmlElement(name = "OrgnlSttlmOblgtn", required = true)
    protected SettlementObligation1 orgnlSttlmOblgtn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAndDocumentIdentification4 }
     *     
     */
    public TransactionAndDocumentIdentification4 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAndDocumentIdentification4 }
     *     
     */
    public BuyInNotificationV01 setId(TransactionAndDocumentIdentification4 value) {
        this.id = value;
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
    public BuyInNotificationV01 setClrMmb(PartyIdentification35Choice value) {
        this.clrMmb = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link BuyIn1 }
     *     
     */
    public BuyIn1 getNtfctnDtls() {
        return ntfctnDtls;
    }

    /**
     * Sets the value of the ntfctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyIn1 }
     *     
     */
    public BuyInNotificationV01 setNtfctnDtls(BuyIn1 value) {
        this.ntfctnDtls = value;
        return this;
    }

    /**
     * Gets the value of the orgnlSttlmOblgtn property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementObligation1 }
     *     
     */
    public SettlementObligation1 getOrgnlSttlmOblgtn() {
        return orgnlSttlmOblgtn;
    }

    /**
     * Sets the value of the orgnlSttlmOblgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementObligation1 }
     *     
     */
    public BuyInNotificationV01 setOrgnlSttlmOblgtn(SettlementObligation1 value) {
        this.orgnlSttlmOblgtn = value;
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
    public BuyInNotificationV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
