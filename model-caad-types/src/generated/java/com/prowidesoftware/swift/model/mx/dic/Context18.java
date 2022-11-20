
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
 * Context in which the card payment transaction is performed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Context18", propOrder = {
    "ptOfSvcCntxt",
    "txCntxt",
    "vrfctn",
    "rskCntxt",
    "saleCntxt",
    "addtlData"
})
public class Context18 {

    @XmlElement(name = "PtOfSvcCntxt")
    protected PointOfServiceContext3 ptOfSvcCntxt;
    @XmlElement(name = "TxCntxt")
    protected TransactionContext7 txCntxt;
    @XmlElement(name = "Vrfctn")
    protected List<Verification5> vrfctn;
    @XmlElement(name = "RskCntxt")
    protected List<RiskContext2> rskCntxt;
    @XmlElement(name = "SaleCntxt")
    protected SaleContext8 saleCntxt;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData2> addtlData;

    /**
     * Gets the value of the ptOfSvcCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfServiceContext3 }
     *     
     */
    public PointOfServiceContext3 getPtOfSvcCntxt() {
        return ptOfSvcCntxt;
    }

    /**
     * Sets the value of the ptOfSvcCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfServiceContext3 }
     *     
     */
    public Context18 setPtOfSvcCntxt(PointOfServiceContext3 value) {
        this.ptOfSvcCntxt = value;
        return this;
    }

    /**
     * Gets the value of the txCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionContext7 }
     *     
     */
    public TransactionContext7 getTxCntxt() {
        return txCntxt;
    }

    /**
     * Sets the value of the txCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionContext7 }
     *     
     */
    public Context18 setTxCntxt(TransactionContext7 value) {
        this.txCntxt = value;
        return this;
    }

    /**
     * Gets the value of the vrfctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vrfctn property.
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
     * {@link Verification5 }
     * 
     * 
     */
    public List<Verification5> getVrfctn() {
        if (vrfctn == null) {
            vrfctn = new ArrayList<Verification5>();
        }
        return this.vrfctn;
    }

    /**
     * Gets the value of the rskCntxt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rskCntxt property.
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
     * {@link RiskContext2 }
     * 
     * 
     */
    public List<RiskContext2> getRskCntxt() {
        if (rskCntxt == null) {
            rskCntxt = new ArrayList<RiskContext2>();
        }
        return this.rskCntxt;
    }

    /**
     * Gets the value of the saleCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link SaleContext8 }
     *     
     */
    public SaleContext8 getSaleCntxt() {
        return saleCntxt;
    }

    /**
     * Sets the value of the saleCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleContext8 }
     *     
     */
    public Context18 setSaleCntxt(SaleContext8 value) {
        this.saleCntxt = value;
        return this;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData2 }
     * 
     * 
     */
    public List<AdditionalData2> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<AdditionalData2>();
        }
        return this.addtlData;
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
    public Context18 addVrfctn(Verification5 vrfctn) {
        getVrfctn().add(vrfctn);
        return this;
    }

    /**
     * Adds a new item to the rskCntxt list.
     * @see #getRskCntxt()
     * 
     */
    public Context18 addRskCntxt(RiskContext2 rskCntxt) {
        getRskCntxt().add(rskCntxt);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public Context18 addAddtlData(AdditionalData2 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
