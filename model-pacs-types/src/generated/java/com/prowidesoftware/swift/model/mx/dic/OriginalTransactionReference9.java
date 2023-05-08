
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
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
 * Set of key elements of the original transaction being referred to.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalTransactionReference9", propOrder = {
    "intrBkSttlmAmt",
    "amt",
    "intrBkSttlmDt",
    "reqdColltnDt",
    "cdtrSchmeId",
    "sttlmInf",
    "pmtTpInf",
    "pmtMtd",
    "mndtRltdInf",
    "rmtInf",
    "ultmtDbtr",
    "dbtr",
    "dbtrAcct",
    "dbtrAgt",
    "dbtrAgtAcct",
    "cdtrAgt",
    "cdtrAgtAcct",
    "cdtr",
    "cdtrAcct",
    "ultmtCdtr"
})
public class OriginalTransactionReference9 {

    @XmlElement(name = "IntrBkSttlmAmt")
    protected EuroMax9Amount intrBkSttlmAmt;
    @XmlElement(name = "Amt")
    protected AmountType2Choice amt;
    @XmlElement(name = "IntrBkSttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar intrBkSttlmDt;
    @XmlElement(name = "ReqdColltnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar reqdColltnDt;
    @XmlElement(name = "CdtrSchmeId")
    protected PartyIdentification18 cdtrSchmeId;
    @XmlElement(name = "SttlmInf")
    protected SettlementInformation6 sttlmInf;
    @XmlElement(name = "PmtTpInf")
    protected PaymentTypeInformation12 pmtTpInf;
    @XmlElement(name = "PmtMtd")
    @XmlSchemaType(name = "string")
    protected PaymentMethod4Code pmtMtd;
    @XmlElement(name = "MndtRltdInf")
    protected MandateRelatedInformation5 mndtRltdInf;
    @XmlElement(name = "RmtInf")
    protected RemittanceInformation4 rmtInf;
    @XmlElement(name = "UltmtDbtr")
    protected PartyIdentification20 ultmtDbtr;
    @XmlElement(name = "Dbtr")
    protected PartyIdentification20 dbtr;
    @XmlElement(name = "DbtrAcct")
    protected CashAccount8 dbtrAcct;
    @XmlElement(name = "DbtrAgt")
    protected FinancialInstitution2 dbtrAgt;
    @XmlElement(name = "DbtrAgtAcct")
    protected CashAccount7 dbtrAgtAcct;
    @XmlElement(name = "CdtrAgt")
    protected FinancialInstitution2 cdtrAgt;
    @XmlElement(name = "CdtrAgtAcct")
    protected CashAccount7 cdtrAgtAcct;
    @XmlElement(name = "Cdtr")
    protected PartyIdentification20 cdtr;
    @XmlElement(name = "CdtrAcct")
    protected CashAccount8 cdtrAcct;
    @XmlElement(name = "UltmtCdtr")
    protected PartyIdentification20 ultmtCdtr;

    /**
     * Gets the value of the intrBkSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link EuroMax9Amount }
     *     
     */
    public EuroMax9Amount getIntrBkSttlmAmt() {
        return intrBkSttlmAmt;
    }

    /**
     * Sets the value of the intrBkSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EuroMax9Amount }
     *     
     */
    public OriginalTransactionReference9 setIntrBkSttlmAmt(EuroMax9Amount value) {
        this.intrBkSttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType2Choice }
     *     
     */
    public AmountType2Choice getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType2Choice }
     *     
     */
    public OriginalTransactionReference9 setAmt(AmountType2Choice value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the intrBkSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getIntrBkSttlmDt() {
        return intrBkSttlmDt;
    }

    /**
     * Sets the value of the intrBkSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalTransactionReference9 setIntrBkSttlmDt(Calendar value) {
        this.intrBkSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the reqdColltnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getReqdColltnDt() {
        return reqdColltnDt;
    }

    /**
     * Sets the value of the reqdColltnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalTransactionReference9 setReqdColltnDt(Calendar value) {
        this.reqdColltnDt = value;
        return this;
    }

    /**
     * Gets the value of the cdtrSchmeId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification18 }
     *     
     */
    public PartyIdentification18 getCdtrSchmeId() {
        return cdtrSchmeId;
    }

    /**
     * Sets the value of the cdtrSchmeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification18 }
     *     
     */
    public OriginalTransactionReference9 setCdtrSchmeId(PartyIdentification18 value) {
        this.cdtrSchmeId = value;
        return this;
    }

    /**
     * Gets the value of the sttlmInf property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInformation6 }
     *     
     */
    public SettlementInformation6 getSttlmInf() {
        return sttlmInf;
    }

    /**
     * Sets the value of the sttlmInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInformation6 }
     *     
     */
    public OriginalTransactionReference9 setSttlmInf(SettlementInformation6 value) {
        this.sttlmInf = value;
        return this;
    }

    /**
     * Gets the value of the pmtTpInf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypeInformation12 }
     *     
     */
    public PaymentTypeInformation12 getPmtTpInf() {
        return pmtTpInf;
    }

    /**
     * Sets the value of the pmtTpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypeInformation12 }
     *     
     */
    public OriginalTransactionReference9 setPmtTpInf(PaymentTypeInformation12 value) {
        this.pmtTpInf = value;
        return this;
    }

    /**
     * Gets the value of the pmtMtd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethod4Code }
     *     
     */
    public PaymentMethod4Code getPmtMtd() {
        return pmtMtd;
    }

    /**
     * Sets the value of the pmtMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethod4Code }
     *     
     */
    public OriginalTransactionReference9 setPmtMtd(PaymentMethod4Code value) {
        this.pmtMtd = value;
        return this;
    }

    /**
     * Gets the value of the mndtRltdInf property.
     * 
     * @return
     *     possible object is
     *     {@link MandateRelatedInformation5 }
     *     
     */
    public MandateRelatedInformation5 getMndtRltdInf() {
        return mndtRltdInf;
    }

    /**
     * Sets the value of the mndtRltdInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateRelatedInformation5 }
     *     
     */
    public OriginalTransactionReference9 setMndtRltdInf(MandateRelatedInformation5 value) {
        this.mndtRltdInf = value;
        return this;
    }

    /**
     * Gets the value of the rmtInf property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceInformation4 }
     *     
     */
    public RemittanceInformation4 getRmtInf() {
        return rmtInf;
    }

    /**
     * Sets the value of the rmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceInformation4 }
     *     
     */
    public OriginalTransactionReference9 setRmtInf(RemittanceInformation4 value) {
        this.rmtInf = value;
        return this;
    }

    /**
     * Gets the value of the ultmtDbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification20 }
     *     
     */
    public PartyIdentification20 getUltmtDbtr() {
        return ultmtDbtr;
    }

    /**
     * Sets the value of the ultmtDbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification20 }
     *     
     */
    public OriginalTransactionReference9 setUltmtDbtr(PartyIdentification20 value) {
        this.ultmtDbtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification20 }
     *     
     */
    public PartyIdentification20 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification20 }
     *     
     */
    public OriginalTransactionReference9 setDbtr(PartyIdentification20 value) {
        this.dbtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount8 }
     *     
     */
    public CashAccount8 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount8 }
     *     
     */
    public OriginalTransactionReference9 setDbtrAcct(CashAccount8 value) {
        this.dbtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitution2 }
     *     
     */
    public FinancialInstitution2 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitution2 }
     *     
     */
    public OriginalTransactionReference9 setDbtrAgt(FinancialInstitution2 value) {
        this.dbtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount7 }
     *     
     */
    public CashAccount7 getDbtrAgtAcct() {
        return dbtrAgtAcct;
    }

    /**
     * Sets the value of the dbtrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount7 }
     *     
     */
    public OriginalTransactionReference9 setDbtrAgtAcct(CashAccount7 value) {
        this.dbtrAgtAcct = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitution2 }
     *     
     */
    public FinancialInstitution2 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitution2 }
     *     
     */
    public OriginalTransactionReference9 setCdtrAgt(FinancialInstitution2 value) {
        this.cdtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount7 }
     *     
     */
    public CashAccount7 getCdtrAgtAcct() {
        return cdtrAgtAcct;
    }

    /**
     * Sets the value of the cdtrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount7 }
     *     
     */
    public OriginalTransactionReference9 setCdtrAgtAcct(CashAccount7 value) {
        this.cdtrAgtAcct = value;
        return this;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification20 }
     *     
     */
    public PartyIdentification20 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification20 }
     *     
     */
    public OriginalTransactionReference9 setCdtr(PartyIdentification20 value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount8 }
     *     
     */
    public CashAccount8 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * Sets the value of the cdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount8 }
     *     
     */
    public OriginalTransactionReference9 setCdtrAcct(CashAccount8 value) {
        this.cdtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the ultmtCdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification20 }
     *     
     */
    public PartyIdentification20 getUltmtCdtr() {
        return ultmtCdtr;
    }

    /**
     * Sets the value of the ultmtCdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification20 }
     *     
     */
    public OriginalTransactionReference9 setUltmtCdtr(PartyIdentification20 value) {
        this.ultmtCdtr = value;
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
