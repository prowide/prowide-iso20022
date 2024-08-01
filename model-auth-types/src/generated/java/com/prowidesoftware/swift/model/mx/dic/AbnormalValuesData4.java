
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
 * Detailed information about derivatives that were received on the day of generation of the report with action type ‘New’, ‘Position component’, ‘Modification’ or ‘Correction’ whose notional amount is greater than a threshold for that class of derivatives.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbnormalValuesData4", propOrder = {
    "ctrPtyId",
    "nbOfDerivsRptd",
    "nbOfDerivsRptdWthOtlrs",
    "txDtls"
})
public class AbnormalValuesData4 {

    @XmlElement(name = "CtrPtyId", required = true)
    protected CounterpartyData92 ctrPtyId;
    @XmlElement(name = "NbOfDerivsRptd", required = true)
    protected BigDecimal nbOfDerivsRptd;
    @XmlElement(name = "NbOfDerivsRptdWthOtlrs", required = true)
    protected BigDecimal nbOfDerivsRptdWthOtlrs;
    @XmlElement(name = "TxDtls")
    protected List<AbnormalValuesTransactionData2> txDtls;

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
    public AbnormalValuesData4 setCtrPtyId(CounterpartyData92 value) {
        this.ctrPtyId = value;
        return this;
    }

    /**
     * Gets the value of the nbOfDerivsRptd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfDerivsRptd() {
        return nbOfDerivsRptd;
    }

    /**
     * Sets the value of the nbOfDerivsRptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public AbnormalValuesData4 setNbOfDerivsRptd(BigDecimal value) {
        this.nbOfDerivsRptd = value;
        return this;
    }

    /**
     * Gets the value of the nbOfDerivsRptdWthOtlrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfDerivsRptdWthOtlrs() {
        return nbOfDerivsRptdWthOtlrs;
    }

    /**
     * Sets the value of the nbOfDerivsRptdWthOtlrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public AbnormalValuesData4 setNbOfDerivsRptdWthOtlrs(BigDecimal value) {
        this.nbOfDerivsRptdWthOtlrs = value;
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
     * {@link AbnormalValuesTransactionData2 }
     * 
     * 
     * @return
     *     The value of the txDtls property.
     */
    public List<AbnormalValuesTransactionData2> getTxDtls() {
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
    public AbnormalValuesData4 addTxDtls(AbnormalValuesTransactionData2 txDtls) {
        getTxDtls().add(txDtls);
        return this;
    }

}
