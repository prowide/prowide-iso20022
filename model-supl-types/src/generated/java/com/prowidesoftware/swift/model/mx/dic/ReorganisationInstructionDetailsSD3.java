
package com.prowidesoftware.swift.model.mx.dic;

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
@XmlType(name = "ReorganisationInstructionDetailsSD3", propOrder = {
    "plcAndNm",
    "wdrwlTxTp",
    "txId",
    "txSeqNb",
    "prtctId",
    "prtctSfkpgAcct",
    "sctiesQtyDtls",
    "ctctPrsn",
    "cstmrRefId",
    "usrRefNb"
})
public class ReorganisationInstructionDetailsSD3 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "WdrwlTxTp")
    @XmlSchemaType(name = "string")
    protected ReorganisationWithdrawalTransactionType1Code wdrwlTxTp;
    @XmlElement(name = "TxId")
    protected String txId;
    @XmlElement(name = "TxSeqNb")
    protected String txSeqNb;
    @XmlElement(name = "PrtctId")
    protected String prtctId;
    @XmlElement(name = "PrtctSfkpgAcct")
    protected String prtctSfkpgAcct;
    @XmlElement(name = "SctiesQtyDtls")
    protected SecuritiesQuantityDetailsSD3 sctiesQtyDtls;
    @XmlElement(name = "CtctPrsn")
    protected ContactIdentification5 ctctPrsn;
    @XmlElement(name = "CstmrRefId")
    protected String cstmrRefId;
    @XmlElement(name = "UsrRefNb")
    protected String usrRefNb;

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
    public ReorganisationInstructionDetailsSD3 setPlcAndNm(String value) {
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
    public ReorganisationInstructionDetailsSD3 setWdrwlTxTp(ReorganisationWithdrawalTransactionType1Code value) {
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
    public ReorganisationInstructionDetailsSD3 setTxId(String value) {
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
    public ReorganisationInstructionDetailsSD3 setTxSeqNb(String value) {
        this.txSeqNb = value;
        return this;
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
    public ReorganisationInstructionDetailsSD3 setPrtctId(String value) {
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
    public ReorganisationInstructionDetailsSD3 setPrtctSfkpgAcct(String value) {
        this.prtctSfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the sctiesQtyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesQuantityDetailsSD3 }
     *     
     */
    public SecuritiesQuantityDetailsSD3 getSctiesQtyDtls() {
        return sctiesQtyDtls;
    }

    /**
     * Sets the value of the sctiesQtyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesQuantityDetailsSD3 }
     *     
     */
    public ReorganisationInstructionDetailsSD3 setSctiesQtyDtls(SecuritiesQuantityDetailsSD3 value) {
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
    public ReorganisationInstructionDetailsSD3 setCtctPrsn(ContactIdentification5 value) {
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
    public ReorganisationInstructionDetailsSD3 setCstmrRefId(String value) {
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
    public ReorganisationInstructionDetailsSD3 setUsrRefNb(String value) {
        this.usrRefNb = value;
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

}
