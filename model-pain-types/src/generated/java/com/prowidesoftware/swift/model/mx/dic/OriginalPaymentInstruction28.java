
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
 * Provides details on the original transactions, to which the status report message refers.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalPaymentInstruction28", propOrder = {
    "rvslPmtInfId",
    "orgnlPmtInfId",
    "orgnlNbOfTxs",
    "orgnlCtrlSum",
    "btchBookg",
    "pmtInfRvsl",
    "rvslRsnInf",
    "txInf"
})
public class OriginalPaymentInstruction28 {

    @XmlElement(name = "RvslPmtInfId")
    protected String rvslPmtInfId;
    @XmlElement(name = "OrgnlPmtInfId", required = true)
    protected String orgnlPmtInfId;
    @XmlElement(name = "OrgnlNbOfTxs")
    protected String orgnlNbOfTxs;
    @XmlElement(name = "OrgnlCtrlSum")
    protected BigDecimal orgnlCtrlSum;
    @XmlElement(name = "BtchBookg")
    protected Boolean btchBookg;
    @XmlElement(name = "PmtInfRvsl")
    protected Boolean pmtInfRvsl;
    @XmlElement(name = "RvslRsnInf")
    protected List<PaymentReversalReason8> rvslRsnInf;
    @XmlElement(name = "TxInf")
    protected List<PaymentTransaction93> txInf;

    /**
     * Gets the value of the rvslPmtInfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRvslPmtInfId() {
        return rvslPmtInfId;
    }

    /**
     * Sets the value of the rvslPmtInfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalPaymentInstruction28 setRvslPmtInfId(String value) {
        this.rvslPmtInfId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlPmtInfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlPmtInfId() {
        return orgnlPmtInfId;
    }

    /**
     * Sets the value of the orgnlPmtInfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalPaymentInstruction28 setOrgnlPmtInfId(String value) {
        this.orgnlPmtInfId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlNbOfTxs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlNbOfTxs() {
        return orgnlNbOfTxs;
    }

    /**
     * Sets the value of the orgnlNbOfTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalPaymentInstruction28 setOrgnlNbOfTxs(String value) {
        this.orgnlNbOfTxs = value;
        return this;
    }

    /**
     * Gets the value of the orgnlCtrlSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrgnlCtrlSum() {
        return orgnlCtrlSum;
    }

    /**
     * Sets the value of the orgnlCtrlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OriginalPaymentInstruction28 setOrgnlCtrlSum(BigDecimal value) {
        this.orgnlCtrlSum = value;
        return this;
    }

    /**
     * Gets the value of the btchBookg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBtchBookg() {
        return btchBookg;
    }

    /**
     * Sets the value of the btchBookg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public OriginalPaymentInstruction28 setBtchBookg(Boolean value) {
        this.btchBookg = value;
        return this;
    }

    /**
     * Gets the value of the pmtInfRvsl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPmtInfRvsl() {
        return pmtInfRvsl;
    }

    /**
     * Sets the value of the pmtInfRvsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public OriginalPaymentInstruction28 setPmtInfRvsl(Boolean value) {
        this.pmtInfRvsl = value;
        return this;
    }

    /**
     * Gets the value of the rvslRsnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rvslRsnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRvslRsnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentReversalReason8 }
     * 
     * 
     */
    public List<PaymentReversalReason8> getRvslRsnInf() {
        if (rvslRsnInf == null) {
            rvslRsnInf = new ArrayList<PaymentReversalReason8>();
        }
        return this.rvslRsnInf;
    }

    /**
     * Gets the value of the txInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTransaction93 }
     * 
     * 
     */
    public List<PaymentTransaction93> getTxInf() {
        if (txInf == null) {
            txInf = new ArrayList<PaymentTransaction93>();
        }
        return this.txInf;
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
     * Adds a new item to the rvslRsnInf list.
     * @see #getRvslRsnInf()
     * 
     */
    public OriginalPaymentInstruction28 addRvslRsnInf(PaymentReversalReason8 rvslRsnInf) {
        getRvslRsnInf().add(rvslRsnInf);
        return this;
    }

    /**
     * Adds a new item to the txInf list.
     * @see #getTxInf()
     * 
     */
    public OriginalPaymentInstruction28 addTxInf(PaymentTransaction93 txInf) {
        getTxInf().add(txInf);
        return this;
    }

}
