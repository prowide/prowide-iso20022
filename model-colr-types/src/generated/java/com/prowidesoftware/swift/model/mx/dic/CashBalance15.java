
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Cash details for amount  assigned as collateral position.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashBalance15", propOrder = {
    "amt",
    "fxDtls",
    "cshAcct",
    "valtnDtls",
    "txLotNb"
})
public class CashBalance15 {

    @XmlElement(name = "Amt", required = true)
    protected ActiveOrHistoricCurrencyAndAmount amt;
    @XmlElement(name = "FXDtls")
    protected ForeignExchangeTerms19 fxDtls;
    @XmlElement(name = "CshAcct")
    protected CashAccountIdentification5Choice cshAcct;
    @XmlElement(name = "ValtnDtls")
    protected ValuationsDetails2 valtnDtls;
    @XmlElement(name = "TxLotNb")
    protected List<GenericIdentification178> txLotNb;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public CashBalance15 setAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTerms19 }
     *     
     */
    public ForeignExchangeTerms19 getFXDtls() {
        return fxDtls;
    }

    /**
     * Sets the value of the fxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTerms19 }
     *     
     */
    public CashBalance15 setFXDtls(ForeignExchangeTerms19 value) {
        this.fxDtls = value;
        return this;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public CashAccountIdentification5Choice getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public CashBalance15 setCshAcct(CashAccountIdentification5Choice value) {
        this.cshAcct = value;
        return this;
    }

    /**
     * Gets the value of the valtnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ValuationsDetails2 }
     *     
     */
    public ValuationsDetails2 getValtnDtls() {
        return valtnDtls;
    }

    /**
     * Sets the value of the valtnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationsDetails2 }
     *     
     */
    public CashBalance15 setValtnDtls(ValuationsDetails2 value) {
        this.valtnDtls = value;
        return this;
    }

    /**
     * Gets the value of the txLotNb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txLotNb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxLotNb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification178 }
     * 
     * 
     * @return
     *     The value of the txLotNb property.
     */
    public List<GenericIdentification178> getTxLotNb() {
        if (txLotNb == null) {
            txLotNb = new ArrayList<>();
        }
        return this.txLotNb;
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
     * Adds a new item to the txLotNb list.
     * @see #getTxLotNb()
     * 
     */
    public CashBalance15 addTxLotNb(GenericIdentification178 txLotNb) {
        getTxLotNb().add(txLotNb);
        return this;
    }

}
