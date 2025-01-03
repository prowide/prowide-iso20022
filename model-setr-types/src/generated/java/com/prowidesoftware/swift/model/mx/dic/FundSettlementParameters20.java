
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Parameters applied to the settlement of a security transfer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundSettlementParameters20", propOrder = {
    "sttlmDt",
    "sttlmPlc",
    "sfkpgPlc",
    "sctiesSttlmSysId",
    "tradTxCond",
    "sttlmTxCond",
    "rcvgSdDtls",
    "dlvrgSdDtls"
})
public class FundSettlementParameters20 {

    @XmlElement(name = "SttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate sttlmDt;
    @XmlElement(name = "SttlmPlc", required = true)
    protected PartyIdentification139 sttlmPlc;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat40Choice sfkpgPlc;
    @XmlElement(name = "SctiesSttlmSysId")
    protected String sctiesSttlmSysId;
    @XmlElement(name = "TradTxCond")
    protected List<TradeTransactionCondition8Choice> tradTxCond;
    @XmlElement(name = "SttlmTxCond")
    protected List<SettlementTransactionCondition30Choice> sttlmTxCond;
    @XmlElement(name = "RcvgSdDtls")
    protected ReceivingPartiesAndAccount20 rcvgSdDtls;
    @XmlElement(name = "DlvrgSdDtls", required = true)
    protected DeliveringPartiesAndAccount20 dlvrgSdDtls;

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FundSettlementParameters20 setSttlmDt(LocalDate value) {
        this.sttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmPlc property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification139 }
     *     
     */
    public PartyIdentification139 getSttlmPlc() {
        return sttlmPlc;
    }

    /**
     * Sets the value of the sttlmPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification139 }
     *     
     */
    public FundSettlementParameters20 setSttlmPlc(PartyIdentification139 value) {
        this.sttlmPlc = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat40Choice }
     *     
     */
    public SafekeepingPlaceFormat40Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat40Choice }
     *     
     */
    public FundSettlementParameters20 setSfkpgPlc(SafekeepingPlaceFormat40Choice value) {
        this.sfkpgPlc = value;
        return this;
    }

    /**
     * Gets the value of the sctiesSttlmSysId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctiesSttlmSysId() {
        return sctiesSttlmSysId;
    }

    /**
     * Sets the value of the sctiesSttlmSysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FundSettlementParameters20 setSctiesSttlmSysId(String value) {
        this.sctiesSttlmSysId = value;
        return this;
    }

    /**
     * Gets the value of the tradTxCond property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tradTxCond property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradTxCond().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeTransactionCondition8Choice }
     * 
     * 
     * @return
     *     The value of the tradTxCond property.
     */
    public List<TradeTransactionCondition8Choice> getTradTxCond() {
        if (tradTxCond == null) {
            tradTxCond = new ArrayList<>();
        }
        return this.tradTxCond;
    }

    /**
     * Gets the value of the sttlmTxCond property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sttlmTxCond property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmTxCond().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementTransactionCondition30Choice }
     * 
     * 
     * @return
     *     The value of the sttlmTxCond property.
     */
    public List<SettlementTransactionCondition30Choice> getSttlmTxCond() {
        if (sttlmTxCond == null) {
            sttlmTxCond = new ArrayList<>();
        }
        return this.sttlmTxCond;
    }

    /**
     * Gets the value of the rcvgSdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingPartiesAndAccount20 }
     *     
     */
    public ReceivingPartiesAndAccount20 getRcvgSdDtls() {
        return rcvgSdDtls;
    }

    /**
     * Sets the value of the rcvgSdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingPartiesAndAccount20 }
     *     
     */
    public FundSettlementParameters20 setRcvgSdDtls(ReceivingPartiesAndAccount20 value) {
        this.rcvgSdDtls = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgSdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveringPartiesAndAccount20 }
     *     
     */
    public DeliveringPartiesAndAccount20 getDlvrgSdDtls() {
        return dlvrgSdDtls;
    }

    /**
     * Sets the value of the dlvrgSdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveringPartiesAndAccount20 }
     *     
     */
    public FundSettlementParameters20 setDlvrgSdDtls(DeliveringPartiesAndAccount20 value) {
        this.dlvrgSdDtls = value;
        return this;
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
     * Adds a new item to the tradTxCond list.
     * @see #getTradTxCond()
     * 
     */
    public FundSettlementParameters20 addTradTxCond(TradeTransactionCondition8Choice tradTxCond) {
        getTradTxCond().add(tradTxCond);
        return this;
    }

    /**
     * Adds a new item to the sttlmTxCond list.
     * @see #getSttlmTxCond()
     * 
     */
    public FundSettlementParameters20 addSttlmTxCond(SettlementTransactionCondition30Choice sttlmTxCond) {
        getSttlmTxCond().add(sttlmTxCond);
        return this;
    }

}
