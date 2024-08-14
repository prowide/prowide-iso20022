
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
@XmlType(name = "ReorganisationInstructionSD14", propOrder = {
    "plcAndNm",
    "wdrwlTxTp",
    "txId",
    "txSeqNb",
    "txIdSts",
    "sctiesQtyDtls",
    "rjctnRsn",
    "cstmrRefId",
    "ctctPrsn",
    "usrRefNb",
    "prtctSfkpgAcct",
    "prtctTxSts"
})
public class ReorganisationInstructionSD14 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "WdrwlTxTp")
    @XmlSchemaType(name = "string")
    protected ReorganisationWithdrawalTransactionType2Code wdrwlTxTp;
    @XmlElement(name = "TxId")
    protected String txId;
    @XmlElement(name = "TxSeqNb")
    protected String txSeqNb;
    @XmlElement(name = "TxIdSts")
    @XmlSchemaType(name = "string")
    protected DTCInstructionStatus2Code txIdSts;
    @XmlElement(name = "SctiesQtyDtls")
    protected SecuritiesQuantitySD6 sctiesQtyDtls;
    @XmlElement(name = "RjctnRsn")
    @XmlSchemaType(name = "string")
    protected List<InstructionRejectionReason3Code> rjctnRsn;
    @XmlElement(name = "CstmrRefId")
    protected String cstmrRefId;
    @XmlElement(name = "CtctPrsn")
    protected ContactIdentification5 ctctPrsn;
    @XmlElement(name = "UsrRefNb")
    protected String usrRefNb;
    @XmlElement(name = "PrtctSfkpgAcct")
    protected String prtctSfkpgAcct;
    @XmlElement(name = "PrtctTxSts")
    @XmlSchemaType(name = "string")
    protected DTCProtectInstructionStatus1Code prtctTxSts;

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
    public ReorganisationInstructionSD14 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the wdrwlTxTp property.
     * 
     * @return
     *     possible object is
     *     {@link ReorganisationWithdrawalTransactionType2Code }
     *     
     */
    public ReorganisationWithdrawalTransactionType2Code getWdrwlTxTp() {
        return wdrwlTxTp;
    }

    /**
     * Sets the value of the wdrwlTxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReorganisationWithdrawalTransactionType2Code }
     *     
     */
    public ReorganisationInstructionSD14 setWdrwlTxTp(ReorganisationWithdrawalTransactionType2Code value) {
        this.wdrwlTxTp = value;
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
    public ReorganisationInstructionSD14 setTxId(String value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the txSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxSeqNb() {
        return txSeqNb;
    }

    /**
     * Sets the value of the txSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReorganisationInstructionSD14 setTxSeqNb(String value) {
        this.txSeqNb = value;
        return this;
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
    public ReorganisationInstructionSD14 setTxIdSts(DTCInstructionStatus2Code value) {
        this.txIdSts = value;
        return this;
    }

    /**
     * Gets the value of the sctiesQtyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesQuantitySD6 }
     *     
     */
    public SecuritiesQuantitySD6 getSctiesQtyDtls() {
        return sctiesQtyDtls;
    }

    /**
     * Sets the value of the sctiesQtyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesQuantitySD6 }
     *     
     */
    public ReorganisationInstructionSD14 setSctiesQtyDtls(SecuritiesQuantitySD6 value) {
        this.sctiesQtyDtls = value;
        return this;
    }

    /**
     * Gets the value of the rjctnRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rjctnRsn property.
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
     * {@link InstructionRejectionReason3Code }
     * 
     * 
     * @return
     *     The value of the rjctnRsn property.
     */
    public List<InstructionRejectionReason3Code> getRjctnRsn() {
        if (rjctnRsn == null) {
            rjctnRsn = new ArrayList<>();
        }
        return this.rjctnRsn;
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
    public ReorganisationInstructionSD14 setCstmrRefId(String value) {
        this.cstmrRefId = value;
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
    public ReorganisationInstructionSD14 setCtctPrsn(ContactIdentification5 value) {
        this.ctctPrsn = value;
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
    public ReorganisationInstructionSD14 setUsrRefNb(String value) {
        this.usrRefNb = value;
        return this;
    }

    /**
     * Gets the value of the prtctSfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtctSfkpgAcct() {
        return prtctSfkpgAcct;
    }

    /**
     * Sets the value of the prtctSfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReorganisationInstructionSD14 setPrtctSfkpgAcct(String value) {
        this.prtctSfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the prtctTxSts property.
     * 
     * @return
     *     possible object is
     *     {@link DTCProtectInstructionStatus1Code }
     *     
     */
    public DTCProtectInstructionStatus1Code getPrtctTxSts() {
        return prtctTxSts;
    }

    /**
     * Sets the value of the prtctTxSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCProtectInstructionStatus1Code }
     *     
     */
    public ReorganisationInstructionSD14 setPrtctTxSts(DTCProtectInstructionStatus1Code value) {
        this.prtctTxSts = value;
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
     * Adds a new item to the rjctnRsn list.
     * @see #getRjctnRsn()
     * 
     */
    public ReorganisationInstructionSD14 addRjctnRsn(InstructionRejectionReason3Code rjctnRsn) {
        getRjctnRsn().add(rjctnRsn);
        return this;
    }

}
