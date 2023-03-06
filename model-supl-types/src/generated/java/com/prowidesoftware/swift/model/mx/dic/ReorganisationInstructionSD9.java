
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides additional information regarding corporate action reorganisation instruction details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReorganisationInstructionSD9", propOrder = {
    "plcAndNm",
    "txId",
    "txSeq",
    "txIdSts",
    "prtctTxSts",
    "rjctnRsn",
    "sctiesQtyDtls",
    "cstmrRefId",
    "ackDtls",
    "ctctPrsn",
    "warrtSbcptChrgAmt",
    "cert",
    "usrRefNb",
    "dcsdBnfclOwnrDtls",
    "txRcrdNb",
    "bidPric"
})
public class ReorganisationInstructionSD9 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "TxId")
    protected String txId;
    @XmlElement(name = "TxSeq")
    protected List<InstructionsTransactionsSequence1> txSeq;
    @XmlElement(name = "TxIdSts")
    @XmlSchemaType(name = "string")
    protected DTCInstructionStatus2Code txIdSts;
    @XmlElement(name = "PrtctTxSts")
    @XmlSchemaType(name = "string")
    protected DTCProtectInstructionStatus3Code prtctTxSts;
    @XmlElement(name = "RjctnRsn")
    @XmlSchemaType(name = "string")
    protected List<InstructionRejectionReason2Code> rjctnRsn;
    @XmlElement(name = "SctiesQtyDtls")
    protected SecuritiesQuantitySD7 sctiesQtyDtls;
    @XmlElement(name = "CstmrRefId")
    protected String cstmrRefId;
    @XmlElement(name = "AckDtls")
    protected CorporateActionAcknowledgementSD1 ackDtls;
    @XmlElement(name = "CtctPrsn")
    protected ContactIdentification5 ctctPrsn;
    @XmlElement(name = "WarrtSbcptChrgAmt")
    protected RestrictedFINActiveCurrencyAndAmount warrtSbcptChrgAmt;
    @XmlElement(name = "Cert")
    protected CorporateActionCertificateSD1 cert;
    @XmlElement(name = "UsrRefNb")
    protected String usrRefNb;
    @XmlElement(name = "DcsdBnfclOwnrDtls")
    protected DeceasedStatusSD1 dcsdBnfclOwnrDtls;
    @XmlElement(name = "TxRcrdNb")
    protected String txRcrdNb;
    @XmlElement(name = "BidPric")
    protected PriceFormat57Choice bidPric;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReorganisationInstructionSD9 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

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
    public ReorganisationInstructionSD9 setTxId(String value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the txSeq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txSeq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxSeq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstructionsTransactionsSequence1 }
     * 
     * 
     */
    public List<InstructionsTransactionsSequence1> getTxSeq() {
        if (txSeq == null) {
            txSeq = new ArrayList<InstructionsTransactionsSequence1>();
        }
        return this.txSeq;
    }

    /**
     * Gets the value of the txIdSts property.
     * 
     * @return
     *     possible object is
     *     {@link DTCInstructionStatus2Code }
     *     
     */
    public DTCInstructionStatus2Code getTxIdSts() {
        return txIdSts;
    }

    /**
     * Sets the value of the txIdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCInstructionStatus2Code }
     *     
     */
    public ReorganisationInstructionSD9 setTxIdSts(DTCInstructionStatus2Code value) {
        this.txIdSts = value;
        return this;
    }

    /**
     * Gets the value of the prtctTxSts property.
     * 
     * @return
     *     possible object is
     *     {@link DTCProtectInstructionStatus3Code }
     *     
     */
    public DTCProtectInstructionStatus3Code getPrtctTxSts() {
        return prtctTxSts;
    }

    /**
     * Sets the value of the prtctTxSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCProtectInstructionStatus3Code }
     *     
     */
    public ReorganisationInstructionSD9 setPrtctTxSts(DTCProtectInstructionStatus3Code value) {
        this.prtctTxSts = value;
        return this;
    }

    /**
     * Gets the value of the rjctnRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rjctnRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRjctnRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstructionRejectionReason2Code }
     * 
     * 
     */
    public List<InstructionRejectionReason2Code> getRjctnRsn() {
        if (rjctnRsn == null) {
            rjctnRsn = new ArrayList<InstructionRejectionReason2Code>();
        }
        return this.rjctnRsn;
    }

    /**
     * Gets the value of the sctiesQtyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesQuantitySD7 }
     *     
     */
    public SecuritiesQuantitySD7 getSctiesQtyDtls() {
        return sctiesQtyDtls;
    }

    /**
     * Sets the value of the sctiesQtyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesQuantitySD7 }
     *     
     */
    public ReorganisationInstructionSD9 setSctiesQtyDtls(SecuritiesQuantitySD7 value) {
        this.sctiesQtyDtls = value;
        return this;
    }

    /**
     * Gets the value of the cstmrRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrRefId() {
        return cstmrRefId;
    }

    /**
     * Sets the value of the cstmrRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReorganisationInstructionSD9 setCstmrRefId(String value) {
        this.cstmrRefId = value;
        return this;
    }

    /**
     * Gets the value of the ackDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionAcknowledgementSD1 }
     *     
     */
    public CorporateActionAcknowledgementSD1 getAckDtls() {
        return ackDtls;
    }

    /**
     * Sets the value of the ackDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionAcknowledgementSD1 }
     *     
     */
    public ReorganisationInstructionSD9 setAckDtls(CorporateActionAcknowledgementSD1 value) {
        this.ackDtls = value;
        return this;
    }

    /**
     * Gets the value of the ctctPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link ContactIdentification5 }
     *     
     */
    public ContactIdentification5 getCtctPrsn() {
        return ctctPrsn;
    }

    /**
     * Sets the value of the ctctPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactIdentification5 }
     *     
     */
    public ReorganisationInstructionSD9 setCtctPrsn(ContactIdentification5 value) {
        this.ctctPrsn = value;
        return this;
    }

    /**
     * Gets the value of the warrtSbcptChrgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getWarrtSbcptChrgAmt() {
        return warrtSbcptChrgAmt;
    }

    /**
     * Sets the value of the warrtSbcptChrgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public ReorganisationInstructionSD9 setWarrtSbcptChrgAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.warrtSbcptChrgAmt = value;
        return this;
    }

    /**
     * Gets the value of the cert property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionCertificateSD1 }
     *     
     */
    public CorporateActionCertificateSD1 getCert() {
        return cert;
    }

    /**
     * Sets the value of the cert property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionCertificateSD1 }
     *     
     */
    public ReorganisationInstructionSD9 setCert(CorporateActionCertificateSD1 value) {
        this.cert = value;
        return this;
    }

    /**
     * Gets the value of the usrRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrRefNb() {
        return usrRefNb;
    }

    /**
     * Sets the value of the usrRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReorganisationInstructionSD9 setUsrRefNb(String value) {
        this.usrRefNb = value;
        return this;
    }

    /**
     * Gets the value of the dcsdBnfclOwnrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DeceasedStatusSD1 }
     *     
     */
    public DeceasedStatusSD1 getDcsdBnfclOwnrDtls() {
        return dcsdBnfclOwnrDtls;
    }

    /**
     * Sets the value of the dcsdBnfclOwnrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeceasedStatusSD1 }
     *     
     */
    public ReorganisationInstructionSD9 setDcsdBnfclOwnrDtls(DeceasedStatusSD1 value) {
        this.dcsdBnfclOwnrDtls = value;
        return this;
    }

    /**
     * Gets the value of the txRcrdNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxRcrdNb() {
        return txRcrdNb;
    }

    /**
     * Sets the value of the txRcrdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReorganisationInstructionSD9 setTxRcrdNb(String value) {
        this.txRcrdNb = value;
        return this;
    }

    /**
     * Gets the value of the bidPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat57Choice }
     *     
     */
    public PriceFormat57Choice getBidPric() {
        return bidPric;
    }

    /**
     * Sets the value of the bidPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat57Choice }
     *     
     */
    public ReorganisationInstructionSD9 setBidPric(PriceFormat57Choice value) {
        this.bidPric = value;
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
     * Adds a new item to the txSeq list.
     * @see #getTxSeq()
     * 
     */
    public ReorganisationInstructionSD9 addTxSeq(InstructionsTransactionsSequence1 txSeq) {
        getTxSeq().add(txSeq);
        return this;
    }

    /**
     * Adds a new item to the rjctnRsn list.
     * @see #getRjctnRsn()
     * 
     */
    public ReorganisationInstructionSD9 addRjctnRsn(InstructionRejectionReason2Code rjctnRsn) {
        getRjctnRsn().add(rjctnRsn);
        return this;
    }

}
