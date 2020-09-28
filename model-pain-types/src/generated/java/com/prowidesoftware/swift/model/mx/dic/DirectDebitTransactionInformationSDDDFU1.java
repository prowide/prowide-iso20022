
package com.prowidesoftware.swift.model.mx.dic;

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
 * DirectDebitTransactionInformationSDD_DFU1
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectDebitTransactionInformationSDD_DFU1", propOrder = {
    "pmtId",
    "instdAmt",
    "chrgBr",
    "drctDbtTx",
    "ultmtCdtr",
    "dbtrAgt",
    "dbtr",
    "dbtrAcct",
    "ultmtDbtr",
    "purp",
    "rmtInf"
})
public class DirectDebitTransactionInformationSDDDFU1 {

    @XmlElement(name = "PmtId", required = true)
    protected PaymentIdentificationSEPADFU1 pmtId;
    @XmlElement(name = "InstdAmt", required = true)
    protected ActiveOrHistoricCurrencyAndAmountSEPADFU2 instdAmt;
    @XmlElement(name = "ChrgBr")
    @XmlSchemaType(name = "string")
    protected ChargeBearerTypeSEPACodeDFU1 chrgBr;
    @XmlElement(name = "DrctDbtTx", required = true)
    protected DirectDebitTransactionSDDDFU1 drctDbtTx;
    @XmlElement(name = "UltmtCdtr")
    protected PartyIdentificationSEPA1DFU1 ultmtCdtr;
    @XmlElement(name = "DbtrAgt", required = true)
    protected BranchAndFinancialInstitutionIdentificationSEPA3DFU1 dbtrAgt;
    @XmlElement(name = "Dbtr", required = true)
    protected PartyIdentificationSEPA2DFU1 dbtr;
    @XmlElement(name = "DbtrAcct", required = true)
    protected CashAccountSEPA2DFU1 dbtrAcct;
    @XmlElement(name = "UltmtDbtr")
    protected PartyIdentificationSEPA1DFU1 ultmtDbtr;
    @XmlElement(name = "Purp")
    protected PurposeSEPADFU1 purp;
    @XmlElement(name = "RmtInf")
    protected RemittanceInformationSEPA1ChoiceDFU1 rmtInf;

    /**
     * Gets the value of the pmtId property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentificationSEPADFU1 }
     *     
     */
    public PaymentIdentificationSEPADFU1 getPmtId() {
        return pmtId;
    }

    /**
     * Sets the value of the pmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentificationSEPADFU1 }
     *     
     */
    public DirectDebitTransactionInformationSDDDFU1 setPmtId(PaymentIdentificationSEPADFU1 value) {
        this.pmtId = value;
        return this;
    }

    /**
     * Gets the value of the instdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmountSEPADFU2 }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmountSEPADFU2 getInstdAmt() {
        return instdAmt;
    }

    /**
     * Sets the value of the instdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmountSEPADFU2 }
     *     
     */
    public DirectDebitTransactionInformationSDDDFU1 setInstdAmt(ActiveOrHistoricCurrencyAndAmountSEPADFU2 value) {
        this.instdAmt = value;
        return this;
    }

    /**
     * Gets the value of the chrgBr property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeBearerTypeSEPACodeDFU1 }
     *     
     */
    public ChargeBearerTypeSEPACodeDFU1 getChrgBr() {
        return chrgBr;
    }

    /**
     * Sets the value of the chrgBr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBearerTypeSEPACodeDFU1 }
     *     
     */
    public DirectDebitTransactionInformationSDDDFU1 setChrgBr(ChargeBearerTypeSEPACodeDFU1 value) {
        this.chrgBr = value;
        return this;
    }

    /**
     * Gets the value of the drctDbtTx property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitTransactionSDDDFU1 }
     *     
     */
    public DirectDebitTransactionSDDDFU1 getDrctDbtTx() {
        return drctDbtTx;
    }

    /**
     * Sets the value of the drctDbtTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitTransactionSDDDFU1 }
     *     
     */
    public DirectDebitTransactionInformationSDDDFU1 setDrctDbtTx(DirectDebitTransactionSDDDFU1 value) {
        this.drctDbtTx = value;
        return this;
    }

    /**
     * Gets the value of the ultmtCdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationSEPA1DFU1 }
     *     
     */
    public PartyIdentificationSEPA1DFU1 getUltmtCdtr() {
        return ultmtCdtr;
    }

    /**
     * Sets the value of the ultmtCdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationSEPA1DFU1 }
     *     
     */
    public DirectDebitTransactionInformationSDDDFU1 setUltmtCdtr(PartyIdentificationSEPA1DFU1 value) {
        this.ultmtCdtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentificationSEPA3DFU1 }
     *     
     */
    public BranchAndFinancialInstitutionIdentificationSEPA3DFU1 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentificationSEPA3DFU1 }
     *     
     */
    public DirectDebitTransactionInformationSDDDFU1 setDbtrAgt(BranchAndFinancialInstitutionIdentificationSEPA3DFU1 value) {
        this.dbtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationSEPA2DFU1 }
     *     
     */
    public PartyIdentificationSEPA2DFU1 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationSEPA2DFU1 }
     *     
     */
    public DirectDebitTransactionInformationSDDDFU1 setDbtr(PartyIdentificationSEPA2DFU1 value) {
        this.dbtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountSEPA2DFU1 }
     *     
     */
    public CashAccountSEPA2DFU1 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountSEPA2DFU1 }
     *     
     */
    public DirectDebitTransactionInformationSDDDFU1 setDbtrAcct(CashAccountSEPA2DFU1 value) {
        this.dbtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the ultmtDbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationSEPA1DFU1 }
     *     
     */
    public PartyIdentificationSEPA1DFU1 getUltmtDbtr() {
        return ultmtDbtr;
    }

    /**
     * Sets the value of the ultmtDbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationSEPA1DFU1 }
     *     
     */
    public DirectDebitTransactionInformationSDDDFU1 setUltmtDbtr(PartyIdentificationSEPA1DFU1 value) {
        this.ultmtDbtr = value;
        return this;
    }

    /**
     * Gets the value of the purp property.
     * 
     * @return
     *     possible object is
     *     {@link PurposeSEPADFU1 }
     *     
     */
    public PurposeSEPADFU1 getPurp() {
        return purp;
    }

    /**
     * Sets the value of the purp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurposeSEPADFU1 }
     *     
     */
    public DirectDebitTransactionInformationSDDDFU1 setPurp(PurposeSEPADFU1 value) {
        this.purp = value;
        return this;
    }

    /**
     * Gets the value of the rmtInf property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceInformationSEPA1ChoiceDFU1 }
     *     
     */
    public RemittanceInformationSEPA1ChoiceDFU1 getRmtInf() {
        return rmtInf;
    }

    /**
     * Sets the value of the rmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceInformationSEPA1ChoiceDFU1 }
     *     
     */
    public DirectDebitTransactionInformationSDDDFU1 setRmtInf(RemittanceInformationSEPA1ChoiceDFU1 value) {
        this.rmtInf = value;
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
