
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
 * Scope
 * The Buy In Confirmation message is sent by the central counterparty (CCP) to the clearing member to confirm the details of the transaction resulting from the buy in.
 * The ISO 20022 Business Application Header must be used.
 * Usage
 * The Buy In Confirmation message is sent by the central counterparty (CCP) to confirm the details of the buy in transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyInConfirmationV02", propOrder = {
    "txId",
    "clrMmb",
    "buyInDtls",
    "orgnlSttlmOblgtn",
    "splmtryData"
})
public class BuyInConfirmationV02 {

    @XmlElement(name = "TxId")
    protected String txId;
    @XmlElement(name = "ClrMmb", required = true)
    protected PartyIdentification35Choice clrMmb;
    @XmlElement(name = "BuyInDtls", required = true)
    protected BuyIn2 buyInDtls;
    @XmlElement(name = "OrgnlSttlmOblgtn")
    protected SettlementObligation6 orgnlSttlmOblgtn;
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
    public BuyInConfirmationV02 setTxId(String value) {
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
    public BuyInConfirmationV02 setClrMmb(PartyIdentification35Choice value) {
        this.clrMmb = value;
        return this;
    }

    /**
     * Gets the value of the buyInDtls property.
     * 
     * @return
     *     possible object is
     *     {@link BuyIn2 }
     *     
     */
    public BuyIn2 getBuyInDtls() {
        return buyInDtls;
    }

    /**
     * Sets the value of the buyInDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyIn2 }
     *     
     */
    public BuyInConfirmationV02 setBuyInDtls(BuyIn2 value) {
        this.buyInDtls = value;
        return this;
    }

    /**
     * Gets the value of the orgnlSttlmOblgtn property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementObligation6 }
     *     
     */
    public SettlementObligation6 getOrgnlSttlmOblgtn() {
        return orgnlSttlmOblgtn;
    }

    /**
     * Sets the value of the orgnlSttlmOblgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementObligation6 }
     *     
     */
    public BuyInConfirmationV02 setOrgnlSttlmOblgtn(SettlementObligation6 value) {
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
    public BuyInConfirmationV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
