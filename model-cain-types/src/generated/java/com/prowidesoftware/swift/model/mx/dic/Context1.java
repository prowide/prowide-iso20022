
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
 * Context in which the card payment transaction is performed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Context1", propOrder = {
    "ptOfSvcCntxt",
    "txCntxt",
    "vrfctn",
    "rskCntxt",
    "saleCntxt"
})
public class Context1 {

    @XmlElement(name = "PtOfSvcCntxt", required = true)
    protected PointOfServiceContext1 ptOfSvcCntxt;
    @XmlElement(name = "TxCntxt", required = true)
    protected TransactionContext1 txCntxt;
    @XmlElement(name = "Vrfctn")
    protected List<Verification1> vrfctn;
    @XmlElement(name = "RskCntxt")
    protected List<RiskContext1> rskCntxt;
    @XmlElement(name = "SaleCntxt")
    protected SaleContext7 saleCntxt;

    /**
     * Gets the value of the ptOfSvcCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfServiceContext1 }
     *     
     */
    public PointOfServiceContext1 getPtOfSvcCntxt() {
        return ptOfSvcCntxt;
    }

    /**
     * Sets the value of the ptOfSvcCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfServiceContext1 }
     *     
     */
    public Context1 setPtOfSvcCntxt(PointOfServiceContext1 value) {
        this.ptOfSvcCntxt = value;
        return this;
    }

    /**
     * Gets the value of the txCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionContext1 }
     *     
     */
    public TransactionContext1 getTxCntxt() {
        return txCntxt;
    }

    /**
     * Sets the value of the txCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionContext1 }
     *     
     */
    public Context1 setTxCntxt(TransactionContext1 value) {
        this.txCntxt = value;
        return this;
    }

    /**
     * Gets the value of the vrfctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the vrfctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVrfctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Verification1 }
     * 
     * 
     * @return
     *     The value of the vrfctn property.
     */
    public List<Verification1> getVrfctn() {
        if (vrfctn == null) {
            vrfctn = new ArrayList<>();
        }
        return this.vrfctn;
    }

    /**
     * Gets the value of the rskCntxt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rskCntxt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRskCntxt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RiskContext1 }
     * 
     * 
     * @return
     *     The value of the rskCntxt property.
     */
    public List<RiskContext1> getRskCntxt() {
        if (rskCntxt == null) {
            rskCntxt = new ArrayList<>();
        }
        return this.rskCntxt;
    }

    /**
     * Gets the value of the saleCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link SaleContext7 }
     *     
     */
    public SaleContext7 getSaleCntxt() {
        return saleCntxt;
    }

    /**
     * Sets the value of the saleCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleContext7 }
     *     
     */
    public Context1 setSaleCntxt(SaleContext7 value) {
        this.saleCntxt = value;
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
     * Adds a new item to the vrfctn list.
     * @see #getVrfctn()
     * 
     */
    public Context1 addVrfctn(Verification1 vrfctn) {
        getVrfctn().add(vrfctn);
        return this;
    }

    /**
     * Adds a new item to the rskCntxt list.
     * @see #getRskCntxt()
     * 
     */
    public Context1 addRskCntxt(RiskContext1 rskCntxt) {
        getRskCntxt().add(rskCntxt);
        return this;
    }

}
