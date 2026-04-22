
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
 * An account servicer sends a IntraPositionMovementStatusAdvice to an account owner to advise the status of an intra-position movement instruction previously sent by the account owner.
 * The account servicer/owner relationship may be:
 * - a central securities depository or another settlement market infrastructure acting on behalf of their participants
 * - an agent (sub-custodian) acting on behalf of their global custodian customer, or
 * - a custodian acting on behalf of an investment management institution or a broker/dealer.
 * 
 * Usage
 * The message may also be used to:
 * - re-send a message previously sent,
 * - provide a third party with a copy of a message for information,
 * - re-send to a third party a copy of a message for information using the relevant elements in the Business Application Header.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraPositionMovementStatusAdviceV09", propOrder = {
    "txId",
    "lkg",
    "prcgSts",
    "sttlmSts",
    "txDtls",
    "splmtryData"
})
public class IntraPositionMovementStatusAdviceV09 {

    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifications29 txId;
    @XmlElement(name = "Lkg")
    protected Linkages75 lkg;
    @XmlElement(name = "PrcgSts")
    protected IntraPositionProcessingStatus11Choice prcgSts;
    @XmlElement(name = "SttlmSts")
    protected SettlementStatus34Choice sttlmSts;
    @XmlElement(name = "TxDtls")
    protected IntraPositionDetails60 txDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifications29 }
     *     
     */
    public TransactionIdentifications29 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifications29 }
     *     
     */
    public IntraPositionMovementStatusAdviceV09 setTxId(TransactionIdentifications29 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the lkg property.
     * 
     * @return
     *     possible object is
     *     {@link Linkages75 }
     *     
     */
    public Linkages75 getLkg() {
        return lkg;
    }

    /**
     * Sets the value of the lkg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Linkages75 }
     *     
     */
    public IntraPositionMovementStatusAdviceV09 setLkg(Linkages75 value) {
        this.lkg = value;
        return this;
    }

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link IntraPositionProcessingStatus11Choice }
     *     
     */
    public IntraPositionProcessingStatus11Choice getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraPositionProcessingStatus11Choice }
     *     
     */
    public IntraPositionMovementStatusAdviceV09 setPrcgSts(IntraPositionProcessingStatus11Choice value) {
        this.prcgSts = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementStatus34Choice }
     *     
     */
    public SettlementStatus34Choice getSttlmSts() {
        return sttlmSts;
    }

    /**
     * Sets the value of the sttlmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementStatus34Choice }
     *     
     */
    public IntraPositionMovementStatusAdviceV09 setSttlmSts(SettlementStatus34Choice value) {
        this.sttlmSts = value;
        return this;
    }

    /**
     * Gets the value of the txDtls property.
     * 
     * @return
     *     possible object is
     *     {@link IntraPositionDetails60 }
     *     
     */
    public IntraPositionDetails60 getTxDtls() {
        return txDtls;
    }

    /**
     * Sets the value of the txDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraPositionDetails60 }
     *     
     */
    public IntraPositionMovementStatusAdviceV09 setTxDtls(IntraPositionDetails60 value) {
        this.txDtls = value;
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
    public IntraPositionMovementStatusAdviceV09 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
