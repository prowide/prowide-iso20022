
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the data elements related to the response to an investigation request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestigationDataRecord7Choice", propOrder = {
    "dbtAuthstn",
    "compstn",
    "valtn",
    "conf",
    "txSts",
    "txData",
    "rspnNrrtv"
})
public class InvestigationDataRecord7Choice {

    @XmlElement(name = "DbtAuthstn")
    protected DebitAuthorisationConfirmation3 dbtAuthstn;
    @XmlElement(name = "Compstn")
    protected CompensationResponse1 compstn;
    @XmlElement(name = "Valtn")
    protected AdjustmentCompensation1 valtn;
    @XmlElement(name = "Conf")
    protected BookingConfirmation5 conf;
    @XmlElement(name = "TxSts")
    protected PaymentTransactionStatus1 txSts;
    @XmlElement(name = "TxData")
    protected List<TransactionAmendment1> txData;
    @XmlElement(name = "RspnNrrtv")
    protected String rspnNrrtv;

    /**
     * Gets the value of the dbtAuthstn property.
     * 
     * @return
     *     possible object is
     *     {@link DebitAuthorisationConfirmation3 }
     *     
     */
    public DebitAuthorisationConfirmation3 getDbtAuthstn() {
        return dbtAuthstn;
    }

    /**
     * Sets the value of the dbtAuthstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitAuthorisationConfirmation3 }
     *     
     */
    public InvestigationDataRecord7Choice setDbtAuthstn(DebitAuthorisationConfirmation3 value) {
        this.dbtAuthstn = value;
        return this;
    }

    /**
     * Gets the value of the compstn property.
     * 
     * @return
     *     possible object is
     *     {@link CompensationResponse1 }
     *     
     */
    public CompensationResponse1 getCompstn() {
        return compstn;
    }

    /**
     * Sets the value of the compstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensationResponse1 }
     *     
     */
    public InvestigationDataRecord7Choice setCompstn(CompensationResponse1 value) {
        this.compstn = value;
        return this;
    }

    /**
     * Gets the value of the valtn property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustmentCompensation1 }
     *     
     */
    public AdjustmentCompensation1 getValtn() {
        return valtn;
    }

    /**
     * Sets the value of the valtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustmentCompensation1 }
     *     
     */
    public InvestigationDataRecord7Choice setValtn(AdjustmentCompensation1 value) {
        this.valtn = value;
        return this;
    }

    /**
     * Gets the value of the conf property.
     * 
     * @return
     *     possible object is
     *     {@link BookingConfirmation5 }
     *     
     */
    public BookingConfirmation5 getConf() {
        return conf;
    }

    /**
     * Sets the value of the conf property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingConfirmation5 }
     *     
     */
    public InvestigationDataRecord7Choice setConf(BookingConfirmation5 value) {
        this.conf = value;
        return this;
    }

    /**
     * Gets the value of the txSts property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransactionStatus1 }
     *     
     */
    public PaymentTransactionStatus1 getTxSts() {
        return txSts;
    }

    /**
     * Sets the value of the txSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransactionStatus1 }
     *     
     */
    public InvestigationDataRecord7Choice setTxSts(PaymentTransactionStatus1 value) {
        this.txSts = value;
        return this;
    }

    /**
     * Gets the value of the txData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionAmendment1 }
     * 
     * 
     */
    public List<TransactionAmendment1> getTxData() {
        if (txData == null) {
            txData = new ArrayList<TransactionAmendment1>();
        }
        return this.txData;
    }

    /**
     * Gets the value of the rspnNrrtv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspnNrrtv() {
        return rspnNrrtv;
    }

    /**
     * Sets the value of the rspnNrrtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestigationDataRecord7Choice setRspnNrrtv(String value) {
        this.rspnNrrtv = value;
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
     * Adds a new item to the txData list.
     * @see #getTxData()
     * 
     */
    public InvestigationDataRecord7Choice addTxData(TransactionAmendment1 txData) {
        getTxData().add(txData);
        return this;
    }

}
