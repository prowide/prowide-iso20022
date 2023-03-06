
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
@XmlType(name = "ReorganisationInstructionDetailsSD2", propOrder = {
    "plcAndNm",
    "txTp",
    "txId",
    "txSeqNb",
    "cstmrSeqNb",
    "txIdSts",
    "prtctTxSts",
    "rjctnRsn",
    "prtctId",
    "prtctSfkpgAcct",
    "prtctDt",
    "sctiesQtyDtls",
    "warrtSbcptChrgAmt",
    "tndrOddLotInd",
    "cert",
    "cstmrRefId",
    "usrRefNb",
    "ctctPrsn",
    "ackDtls",
    "dcsdBnfclOwnrDtls",
    "txRcrdNb"
})
public class ReorganisationInstructionDetailsSD2 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "TxTp")
    @XmlSchemaType(name = "string")
    protected ReorganisationTransactionType1Code txTp;
    @XmlElement(name = "TxId")
    protected String txId;
    @XmlElement(name = "TxSeqNb")
    protected String txSeqNb;
    @XmlElement(name = "CstmrSeqNb")
    protected String cstmrSeqNb;
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
    @XmlElement(name = "PrtctDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prtctDt;
    @XmlElement(name = "SctiesQtyDtls")
    protected SecuritiesQuantityDetailsSD4 sctiesQtyDtls;
    @XmlElement(name = "WarrtSbcptChrgAmt")
    protected RestrictedFINActiveCurrencyAndAmount warrtSbcptChrgAmt;
    @XmlElement(name = "TndrOddLotInd")
    protected Boolean tndrOddLotInd;
    @XmlElement(name = "Cert")
    protected CorporateActionCertificateSD1 cert;
    @XmlElement(name = "CstmrRefId")
    protected String cstmrRefId;
    @XmlElement(name = "UsrRefNb")
    protected String usrRefNb;
    @XmlElement(name = "CtctPrsn")
    protected ContactIdentification5 ctctPrsn;
    @XmlElement(name = "AckDtls")
    protected CorporateActionAcknowledgementSD1 ackDtls;
    @XmlElement(name = "DcsdBnfclOwnrDtls")
    protected DeceasedStatusSD1 dcsdBnfclOwnrDtls;
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
    public ReorganisationInstructionDetailsSD2 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link ReorganisationTransactionType1Code }
     *     
     */
    public ReorganisationTransactionType1Code getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReorganisationTransactionType1Code }
     *     
     */
    public ReorganisationInstructionDetailsSD2 setTxTp(ReorganisationTransactionType1Code value) {
        this.txTp = value;
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
    public ReorganisationInstructionDetailsSD2 setTxId(String value) {
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
    public ReorganisationInstructionDetailsSD2 setTxSeqNb(String value) {
        this.txSeqNb = value;
        return this;
    }

    /**
     * Gets the value of the cstmrSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrSeqNb() {
        return cstmrSeqNb;
    }

    /**
     * Sets the value of the cstmrSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReorganisationInstructionDetailsSD2 setCstmrSeqNb(String value) {
        this.cstmrSeqNb = value;
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
    public ReorganisationInstructionDetailsSD2 setTxIdSts(DTCInstructionStatus2Code value) {
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
    public ReorganisationInstructionDetailsSD2 setPrtctTxSts(DTCProtectInstructionStatus1Code value) {
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
    public ReorganisationInstructionDetailsSD2 setPrtctId(String value) {
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
    public ReorganisationInstructionDetailsSD2 setPrtctSfkpgAcct(String value) {
        this.prtctSfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the prtctDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getPrtctDt() {
        return prtctDt;
    }

    /**
     * Sets the value of the prtctDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReorganisationInstructionDetailsSD2 setPrtctDt(XMLGregorianCalendar value) {
        this.prtctDt = value;
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
    public ReorganisationInstructionDetailsSD2 setSctiesQtyDtls(SecuritiesQuantityDetailsSD4 value) {
        this.sctiesQtyDtls = value;
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
    public ReorganisationInstructionDetailsSD2 setWarrtSbcptChrgAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.warrtSbcptChrgAmt = value;
        return this;
    }

    /**
     * Gets the value of the tndrOddLotInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTndrOddLotInd() {
        return tndrOddLotInd;
    }

    /**
     * Sets the value of the tndrOddLotInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ReorganisationInstructionDetailsSD2 setTndrOddLotInd(Boolean value) {
        this.tndrOddLotInd = value;
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
    public ReorganisationInstructionDetailsSD2 setCert(CorporateActionCertificateSD1 value) {
        this.cert = value;
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
    public ReorganisationInstructionDetailsSD2 setCstmrRefId(String value) {
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
    public ReorganisationInstructionDetailsSD2 setUsrRefNb(String value) {
        this.usrRefNb = value;
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
    public ReorganisationInstructionDetailsSD2 setCtctPrsn(ContactIdentification5 value) {
        this.ctctPrsn = value;
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
    public ReorganisationInstructionDetailsSD2 setAckDtls(CorporateActionAcknowledgementSD1 value) {
        this.ackDtls = value;
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
    public ReorganisationInstructionDetailsSD2 setDcsdBnfclOwnrDtls(DeceasedStatusSD1 value) {
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
    public ReorganisationInstructionDetailsSD2 setTxRcrdNb(String value) {
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
    public ReorganisationInstructionDetailsSD2 addRjctnRsn(InstructionRejectionReason1Code rjctnRsn) {
        getRjctnRsn().add(rjctnRsn);
        return this;
    }

}
