
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
 * Deal amount details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralAmount18", propOrder = {
    "tx",
    "termntn",
    "acrd",
    "cmpndSmplAcrlClctn",
    "pmtFrqcy",
    "intrstPmtDely",
    "txAmtBrkdwn",
    "valSght"
})
public class CollateralAmount18 {

    @XmlElement(name = "Tx")
    protected AmountAndDirection49 tx;
    @XmlElement(name = "Termntn")
    protected AmountAndDirection49 termntn;
    @XmlElement(name = "Acrd")
    protected AmountAndDirection49 acrd;
    @XmlElement(name = "CmpndSmplAcrlClctn")
    @XmlSchemaType(name = "string")
    protected CalculationMethod1Code cmpndSmplAcrlClctn;
    @XmlElement(name = "PmtFrqcy")
    protected Frequency38Choice pmtFrqcy;
    @XmlElement(name = "IntrstPmtDely")
    protected String intrstPmtDely;
    @XmlElement(name = "TxAmtBrkdwn")
    protected List<CollateralTransactionAmountBreakdown2> txAmtBrkdwn;
    @XmlElement(name = "ValSght")
    protected AmountAndDirection49 valSght;

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public AmountAndDirection49 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public CollateralAmount18 setTx(AmountAndDirection49 value) {
        this.tx = value;
        return this;
    }

    /**
     * Gets the value of the termntn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public AmountAndDirection49 getTermntn() {
        return termntn;
    }

    /**
     * Sets the value of the termntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public CollateralAmount18 setTermntn(AmountAndDirection49 value) {
        this.termntn = value;
        return this;
    }

    /**
     * Gets the value of the acrd property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public AmountAndDirection49 getAcrd() {
        return acrd;
    }

    /**
     * Sets the value of the acrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public CollateralAmount18 setAcrd(AmountAndDirection49 value) {
        this.acrd = value;
        return this;
    }

    /**
     * Gets the value of the cmpndSmplAcrlClctn property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationMethod1Code }
     *     
     */
    public CalculationMethod1Code getCmpndSmplAcrlClctn() {
        return cmpndSmplAcrlClctn;
    }

    /**
     * Sets the value of the cmpndSmplAcrlClctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationMethod1Code }
     *     
     */
    public CollateralAmount18 setCmpndSmplAcrlClctn(CalculationMethod1Code value) {
        this.cmpndSmplAcrlClctn = value;
        return this;
    }

    /**
     * Gets the value of the pmtFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency38Choice }
     *     
     */
    public Frequency38Choice getPmtFrqcy() {
        return pmtFrqcy;
    }

    /**
     * Sets the value of the pmtFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency38Choice }
     *     
     */
    public CollateralAmount18 setPmtFrqcy(Frequency38Choice value) {
        this.pmtFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the intrstPmtDely property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrstPmtDely() {
        return intrstPmtDely;
    }

    /**
     * Sets the value of the intrstPmtDely property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CollateralAmount18 setIntrstPmtDely(String value) {
        this.intrstPmtDely = value;
        return this;
    }

    /**
     * Gets the value of the txAmtBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txAmtBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxAmtBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralTransactionAmountBreakdown2 }
     * 
     * 
     */
    public List<CollateralTransactionAmountBreakdown2> getTxAmtBrkdwn() {
        if (txAmtBrkdwn == null) {
            txAmtBrkdwn = new ArrayList<CollateralTransactionAmountBreakdown2>();
        }
        return this.txAmtBrkdwn;
    }

    /**
     * Gets the value of the valSght property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public AmountAndDirection49 getValSght() {
        return valSght;
    }

    /**
     * Sets the value of the valSght property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public CollateralAmount18 setValSght(AmountAndDirection49 value) {
        this.valSght = value;
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
     * Adds a new item to the txAmtBrkdwn list.
     * @see #getTxAmtBrkdwn()
     * 
     */
    public CollateralAmount18 addTxAmtBrkdwn(CollateralTransactionAmountBreakdown2 txAmtBrkdwn) {
        getTxAmtBrkdwn().add(txAmtBrkdwn);
        return this;
    }

}
