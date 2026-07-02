
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "ReorganisationInstructionDetailsSD4", propOrder = {
    "plcAndNm",
    "wdrwlTxTp",
    "txId",
    "txSeqNb",
    "txIdSts",
    "prtctTxSts",
    "rjctnRsn",
    "prtctId",
    "prtctSfkpgAcct",
    "sctiesQtyDtls",
    "ctctPrsn",
    "cstmrRefId",
    "usrRefNb",
    "txRcrdNb"
})
public class ReorganisationInstructionDetailsSD4 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "WdrwlTxTp")
    @XmlSchemaType(name = "string")
    protected ReorganisationWithdrawalTransactionType1Code wdrwlTxTp;
    @XmlElement(name = "TxId")
    protected String txId;
    @XmlElement(name = "TxSeqNb")
    protected String txSeqNb;
    @XmlElement(name = "TxIdSts")
    @XmlSchemaType(name = "string")
    protected DTCInstructionStatus2Code txIdSts;
    @XmlElement(name = "PrtctTxSts")
    @XmlSchemaType(name = "string")
    protected DTCProtectInstructionStatus1Code prtctTxSts;
    @XmlElement(name = "RjctnRsn")
    @XmlSchemaType(name = "string")
    protected List<InstructionRejectionReason1Code> rjctnRsn;
    @XmlElement(name = "PrtctId", required = true)
    protected String prtctId;
    @XmlElement(name = "PrtctSfkpgAcct")
    protected String prtctSfkpgAcct;
    @XmlElement(name = "SctiesQtyDtls")
    protected SecuritiesQuantityDetailsSD4 sctiesQtyDtls;
    @XmlElement(name = "CtctPrsn")
    protected ContactIdentification5 ctctPrsn;
    @XmlElement(name = "CstmrRefId")
    protected String cstmrRefId;
    @XmlElement(name = "UsrRefNb")
    protected String usrRefNb;
    @XmlElement(name = "TxRcrdNb")
    protected String txRcrdNb;

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
    public ReorganisationInstructionDetailsSD4 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the wdrwlTxTp property.
     * 
     * @return
     *     possible object is
     *     {@link ReorganisationWithdrawalTransactionType1Code }
     *     
     */
    public ReorganisationWithdrawalTransactionType1Code getWdrwlTxTp() {
        return wdrwlTxTp;
    }

    /**
     * Sets the value of the wdrwlTxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReorganisationWithdrawalTransactionType1Code }
     *     
     */
    public ReorganisationInstructionDetailsSD4 setWdrwlTxTp(ReorganisationWithdrawalTransactionType1Code value) {
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
    public ReorganisationInstructionDetailsSD4 setTxId(String value) {
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
    public ReorganisationInstructionDetailsSD4 setTxSeqNb(String value) {
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
    public ReorganisationInstructionDetailsSD4 setTxIdSts(DTCInstructionStatus2Code value) {
        this.txIdSts = value;
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
    public ReorganisationInstructionDetailsSD4 setPrtctTxSts(DTCProtectInstructionStatus1Code value) {
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
     * {@link InstructionRejectionReason1Code }
     * 
     * 
     */
    public List<InstructionRejectionReason1Code> getRjctnRsn() {
        if (rjctnRsn == null) {
            rjctnRsn = new ArrayList<InstructionRejectionReason1Code>();
        }
        return this.rjctnRsn;
    }

    /**
     * Gets the value of the prtctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtctId() {
        return prtctId;
    }

    /**
     * Sets the value of the prtctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReorganisationInstructionDetailsSD4 setPrtctId(String value) {
        this.prtctId = value;
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
    public ReorganisationInstructionDetailsSD4 setPrtctSfkpgAcct(String value) {
        this.prtctSfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the sctiesQtyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesQuantityDetailsSD4 }
     *     
     */
    public SecuritiesQuantityDetailsSD4 getSctiesQtyDtls() {
        return sctiesQtyDtls;
    }

    /**
     * Sets the value of the sctiesQtyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesQuantityDetailsSD4 }
     *     
     */
    public ReorganisationInstructionDetailsSD4 setSctiesQtyDtls(SecuritiesQuantityDetailsSD4 value) {
        this.sctiesQtyDtls = value;
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
    public ReorganisationInstructionDetailsSD4 setCtctPrsn(ContactIdentification5 value) {
        this.ctctPrsn = value;
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
    public ReorganisationInstructionDetailsSD4 setCstmrRefId(String value) {
        this.cstmrRefId = value;
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
    public ReorganisationInstructionDetailsSD4 setUsrRefNb(String value) {
        this.usrRefNb = value;
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
    public ReorganisationInstructionDetailsSD4 setTxRcrdNb(String value) {
        this.txRcrdNb = value;
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
    public ReorganisationInstructionDetailsSD4 addRjctnRsn(InstructionRejectionReason1Code rjctnRsn) {
        getRjctnRsn().add(rjctnRsn);
        return this;
    }

}
