
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
 * The CashObligationReport message is sent by the settlement member to the settlement status to accept or reject the cash obligation report on the projeted or actual cash settlement obligations that will be submitted for settlement.
 * 
 * The message definition is intended for use with the ISO20022 Business Application Header.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashSettlementInitiationStatusAdviceV01", propOrder = {
    "orgnlBizReq",
    "sttlmInstrSts",
    "splmtryData"
})
public class CashSettlementInitiationStatusAdviceV01 {

    @XmlElement(name = "OrgnlBizReq", required = true)
    protected OriginalBusinessQuery1 orgnlBizReq;
    @XmlElement(name = "SttlmInstrSts", required = true)
    protected SettlementInstructionStatus1 sttlmInstrSts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the orgnlBizReq property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalBusinessQuery1 }
     *     
     */
    public OriginalBusinessQuery1 getOrgnlBizReq() {
        return orgnlBizReq;
    }

    /**
     * Sets the value of the orgnlBizReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalBusinessQuery1 }
     *     
     */
    public CashSettlementInitiationStatusAdviceV01 setOrgnlBizReq(OriginalBusinessQuery1 value) {
        this.orgnlBizReq = value;
        return this;
    }

    /**
     * Gets the value of the sttlmInstrSts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInstructionStatus1 }
     *     
     */
    public SettlementInstructionStatus1 getSttlmInstrSts() {
        return sttlmInstrSts;
    }

    /**
     * Sets the value of the sttlmInstrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInstructionStatus1 }
     *     
     */
    public CashSettlementInitiationStatusAdviceV01 setSttlmInstrSts(SettlementInstructionStatus1 value) {
        this.sttlmInstrSts = value;
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
    public CashSettlementInitiationStatusAdviceV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
