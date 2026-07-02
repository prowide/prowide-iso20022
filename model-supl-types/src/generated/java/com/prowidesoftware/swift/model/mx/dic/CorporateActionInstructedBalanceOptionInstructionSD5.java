
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
 * Provides additional information regarding corporate action instructed balance details at option level.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionInstructedBalanceOptionInstructionSD5", propOrder = {
    "plcAndNm",
    "optnNb",
    "prtctId",
    "txContraCUSIP",
    "txIdOvrsbcptQty",
    "txIdSts",
    "taxCtgy"
})
public class CorporateActionInstructedBalanceOptionInstructionSD5 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "OptnNb", required = true)
    protected OptionNumber1Choice optnNb;
    @XmlElement(name = "PrtctId")
    protected String prtctId;
    @XmlElement(name = "TxContraCUSIP")
    protected OtherIdentification2 txContraCUSIP;
    @XmlElement(name = "TxIdOvrsbcptQty")
    protected FinancialInstrumentQuantity15Choice txIdOvrsbcptQty;
    @XmlElement(name = "TxIdSts", required = true)
    @XmlSchemaType(name = "string")
    protected DTCInstructionStatus2Code txIdSts;
    @XmlElement(name = "TaxCtgy")
    protected List<TaxCategory2> taxCtgy;

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
    public CorporateActionInstructedBalanceOptionInstructionSD5 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the optnNb property.
     * 
     * @return
     *     possible object is
     *     {@link OptionNumber1Choice }
     *     
     */
    public OptionNumber1Choice getOptnNb() {
        return optnNb;
    }

    /**
     * Sets the value of the optnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionNumber1Choice }
     *     
     */
    public CorporateActionInstructedBalanceOptionInstructionSD5 setOptnNb(OptionNumber1Choice value) {
        this.optnNb = value;
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
    public CorporateActionInstructedBalanceOptionInstructionSD5 setPrtctId(String value) {
        this.prtctId = value;
        return this;
    }

    /**
     * Gets the value of the txContraCUSIP property.
     * 
     * @return
     *     possible object is
     *     {@link OtherIdentification2 }
     *     
     */
    public OtherIdentification2 getTxContraCUSIP() {
        return txContraCUSIP;
    }

    /**
     * Sets the value of the txContraCUSIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherIdentification2 }
     *     
     */
    public CorporateActionInstructedBalanceOptionInstructionSD5 setTxContraCUSIP(OtherIdentification2 value) {
        this.txContraCUSIP = value;
        return this;
    }

    /**
     * Gets the value of the txIdOvrsbcptQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getTxIdOvrsbcptQty() {
        return txIdOvrsbcptQty;
    }

    /**
     * Sets the value of the txIdOvrsbcptQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public CorporateActionInstructedBalanceOptionInstructionSD5 setTxIdOvrsbcptQty(FinancialInstrumentQuantity15Choice value) {
        this.txIdOvrsbcptQty = value;
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
    public CorporateActionInstructedBalanceOptionInstructionSD5 setTxIdSts(DTCInstructionStatus2Code value) {
        this.txIdSts = value;
        return this;
    }

    /**
     * Gets the value of the taxCtgy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxCtgy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxCtgy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxCategory2 }
     * 
     * 
     */
    public List<TaxCategory2> getTaxCtgy() {
        if (taxCtgy == null) {
            taxCtgy = new ArrayList<TaxCategory2>();
        }
        return this.taxCtgy;
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
     * Adds a new item to the taxCtgy list.
     * @see #getTaxCtgy()
     * 
     */
    public CorporateActionInstructedBalanceOptionInstructionSD5 addTaxCtgy(TaxCategory2 taxCtgy) {
        getTaxCtgy().add(taxCtgy);
        return this;
    }

}
