
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
 * Scope:
 * Triparty agent sends a TripartyCollateralAllegementNotificationCancellationAdvice to the collateral giver or the collateral taker to inform of the cancellation of an allegement notification message previously sent by the triparty agent. 
 * 
 * The collateral giver and the collateral taker are participants of the triparty agents. In the frame of ECMS the collateral taker will be a central bank.
 * 
 * The previously sent message is a TripartyCollateralAllegementNotification
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripartyCollateralAllegementNotificationCancellationAdviceV01", propOrder = {
    "txInstrId",
    "collTxTp",
    "xpsrTp",
    "collSd",
    "elgbltySetPrfl",
    "collPties",
    "txAmt",
    "reqdExctnDt",
    "splmtryData"
})
public class TripartyCollateralAllegementNotificationCancellationAdviceV01 {

    @XmlElement(name = "TxInstrId", required = true)
    protected TransactionIdentifications44 txInstrId;
    @XmlElement(name = "CollTxTp", required = true)
    protected CollateralTransactionType1Choice collTxTp;
    @XmlElement(name = "XpsrTp", required = true)
    protected ExposureType23Choice xpsrTp;
    @XmlElement(name = "CollSd", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralRole1Code collSd;
    @XmlElement(name = "ElgbltySetPrfl")
    protected GenericIdentification1 elgbltySetPrfl;
    @XmlElement(name = "CollPties", required = true)
    protected CollateralParties8 collPties;
    @XmlElement(name = "TxAmt")
    protected AmountAndDirection49 txAmt;
    @XmlElement(name = "ReqdExctnDt")
    protected DateAndDateTime2Choice reqdExctnDt;
    @XmlElement(name = "SplmtryData")
    protected SupplementaryData1 splmtryData;

    /**
     * Gets the value of the txInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifications44 }
     *     
     */
    public TransactionIdentifications44 getTxInstrId() {
        return txInstrId;
    }

    /**
     * Sets the value of the txInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifications44 }
     *     
     */
    public TripartyCollateralAllegementNotificationCancellationAdviceV01 setTxInstrId(TransactionIdentifications44 value) {
        this.txInstrId = value;
        return this;
    }

    /**
     * Gets the value of the collTxTp property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralTransactionType1Choice }
     *     
     */
    public CollateralTransactionType1Choice getCollTxTp() {
        return collTxTp;
    }

    /**
     * Sets the value of the collTxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralTransactionType1Choice }
     *     
     */
    public TripartyCollateralAllegementNotificationCancellationAdviceV01 setCollTxTp(CollateralTransactionType1Choice value) {
        this.collTxTp = value;
        return this;
    }

    /**
     * Gets the value of the xpsrTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureType23Choice }
     *     
     */
    public ExposureType23Choice getXpsrTp() {
        return xpsrTp;
    }

    /**
     * Sets the value of the xpsrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureType23Choice }
     *     
     */
    public TripartyCollateralAllegementNotificationCancellationAdviceV01 setXpsrTp(ExposureType23Choice value) {
        this.xpsrTp = value;
        return this;
    }

    /**
     * Gets the value of the collSd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralRole1Code }
     *     
     */
    public CollateralRole1Code getCollSd() {
        return collSd;
    }

    /**
     * Sets the value of the collSd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralRole1Code }
     *     
     */
    public TripartyCollateralAllegementNotificationCancellationAdviceV01 setCollSd(CollateralRole1Code value) {
        this.collSd = value;
        return this;
    }

    /**
     * Gets the value of the elgbltySetPrfl property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getElgbltySetPrfl() {
        return elgbltySetPrfl;
    }

    /**
     * Sets the value of the elgbltySetPrfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public TripartyCollateralAllegementNotificationCancellationAdviceV01 setElgbltySetPrfl(GenericIdentification1 value) {
        this.elgbltySetPrfl = value;
        return this;
    }

    /**
     * Gets the value of the collPties property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralParties8 }
     *     
     */
    public CollateralParties8 getCollPties() {
        return collPties;
    }

    /**
     * Sets the value of the collPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralParties8 }
     *     
     */
    public TripartyCollateralAllegementNotificationCancellationAdviceV01 setCollPties(CollateralParties8 value) {
        this.collPties = value;
        return this;
    }

    /**
     * Gets the value of the txAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public AmountAndDirection49 getTxAmt() {
        return txAmt;
    }

    /**
     * Sets the value of the txAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public TripartyCollateralAllegementNotificationCancellationAdviceV01 setTxAmt(AmountAndDirection49 value) {
        this.txAmt = value;
        return this;
    }

    /**
     * Gets the value of the reqdExctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getReqdExctnDt() {
        return reqdExctnDt;
    }

    /**
     * Sets the value of the reqdExctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public TripartyCollateralAllegementNotificationCancellationAdviceV01 setReqdExctnDt(DateAndDateTime2Choice value) {
        this.reqdExctnDt = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * @return
     *     possible object is
     *     {@link SupplementaryData1 }
     *     
     */
    public SupplementaryData1 getSplmtryData() {
        return splmtryData;
    }

    /**
     * Sets the value of the splmtryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementaryData1 }
     *     
     */
    public TripartyCollateralAllegementNotificationCancellationAdviceV01 setSplmtryData(SupplementaryData1 value) {
        this.splmtryData = value;
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
