
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Detailed information about the outstanding derivatives for which no valuation or outdated valuation has been reported.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MissingValuationsData2", propOrder = {
    "ctrPtyId",
    "nbOfOutsdngDerivs",
    "nbOfOutsdngDerivsWthNoValtn",
    "nbOfOutsdngDerivsWthOutdtdValtn",
    "txDtls"
})
public class MissingValuationsData2 {

    @XmlElement(name = "CtrPtyId", required = true)
    protected CounterpartyData92 ctrPtyId;
    @XmlElement(name = "NbOfOutsdngDerivs", required = true)
    protected BigDecimal nbOfOutsdngDerivs;
    @XmlElement(name = "NbOfOutsdngDerivsWthNoValtn", required = true)
    protected BigDecimal nbOfOutsdngDerivsWthNoValtn;
    @XmlElement(name = "NbOfOutsdngDerivsWthOutdtdValtn", required = true)
    protected BigDecimal nbOfOutsdngDerivsWthOutdtdValtn;
    @XmlElement(name = "TxDtls")
    protected List<MissingValuationsTransactionData2> txDtls;

    /**
     * Gets the value of the ctrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyData92 }
     *     
     */
    public CounterpartyData92 getCtrPtyId() {
        return ctrPtyId;
    }

    /**
     * Sets the value of the ctrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyData92 }
     *     
     */
    public MissingValuationsData2 setCtrPtyId(CounterpartyData92 value) {
        this.ctrPtyId = value;
        return this;
    }

    /**
     * Gets the value of the nbOfOutsdngDerivs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfOutsdngDerivs() {
        return nbOfOutsdngDerivs;
    }

    /**
     * Sets the value of the nbOfOutsdngDerivs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public MissingValuationsData2 setNbOfOutsdngDerivs(BigDecimal value) {
        this.nbOfOutsdngDerivs = value;
        return this;
    }

    /**
     * Gets the value of the nbOfOutsdngDerivsWthNoValtn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfOutsdngDerivsWthNoValtn() {
        return nbOfOutsdngDerivsWthNoValtn;
    }

    /**
     * Sets the value of the nbOfOutsdngDerivsWthNoValtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public MissingValuationsData2 setNbOfOutsdngDerivsWthNoValtn(BigDecimal value) {
        this.nbOfOutsdngDerivsWthNoValtn = value;
        return this;
    }

    /**
     * Gets the value of the nbOfOutsdngDerivsWthOutdtdValtn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfOutsdngDerivsWthOutdtdValtn() {
        return nbOfOutsdngDerivsWthOutdtdValtn;
    }

    /**
     * Sets the value of the nbOfOutsdngDerivsWthOutdtdValtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public MissingValuationsData2 setNbOfOutsdngDerivsWthOutdtdValtn(BigDecimal value) {
        this.nbOfOutsdngDerivsWthOutdtdValtn = value;
        return this;
    }

    /**
     * Gets the value of the txDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MissingValuationsTransactionData2 }
     * 
     * 
     * @return
     *     The value of the txDtls property.
     */
    public List<MissingValuationsTransactionData2> getTxDtls() {
        if (txDtls == null) {
            txDtls = new ArrayList<>();
        }
        return this.txDtls;
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
     * Adds a new item to the txDtls list.
     * @see #getTxDtls()
     * 
     */
    public MissingValuationsData2 addTxDtls(MissingValuationsTransactionData2 txDtls) {
        getTxDtls().add(txDtls);
        return this;
    }

}
