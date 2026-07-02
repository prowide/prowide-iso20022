
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
 * Set of elements used to provide details of the reporting request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportingRequest1", propOrder = {
    "id",
    "reqdMsgTp",
    "acct",
    "rptgPrd",
    "reqdTxTp",
    "reqdBalTp"
})
public class ReportingRequest1 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "ReqdMsgTp")
    protected String reqdMsgTp;
    @XmlElement(name = "Acct", required = true)
    protected CashAccount20 acct;
    @XmlElement(name = "RptgPrd")
    protected ReportingPeriod1 rptgPrd;
    @XmlElement(name = "ReqdTxTp")
    protected TransactionType1 reqdTxTp;
    @XmlElement(name = "ReqdBalTp")
    protected List<BalanceType12> reqdBalTp;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportingRequest1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the reqdMsgTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqdMsgTp() {
        return reqdMsgTp;
    }

    /**
     * Sets the value of the reqdMsgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportingRequest1 setReqdMsgTp(String value) {
        this.reqdMsgTp = value;
        return this;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount20 }
     *     
     */
    public CashAccount20 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount20 }
     *     
     */
    public ReportingRequest1 setAcct(CashAccount20 value) {
        this.acct = value;
        return this;
    }

    /**
     * Gets the value of the rptgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingPeriod1 }
     *     
     */
    public ReportingPeriod1 getRptgPrd() {
        return rptgPrd;
    }

    /**
     * Sets the value of the rptgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingPeriod1 }
     *     
     */
    public ReportingRequest1 setRptgPrd(ReportingPeriod1 value) {
        this.rptgPrd = value;
        return this;
    }

    /**
     * Gets the value of the reqdTxTp property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType1 }
     *     
     */
    public TransactionType1 getReqdTxTp() {
        return reqdTxTp;
    }

    /**
     * Sets the value of the reqdTxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType1 }
     *     
     */
    public ReportingRequest1 setReqdTxTp(TransactionType1 value) {
        this.reqdTxTp = value;
        return this;
    }

    /**
     * Gets the value of the reqdBalTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reqdBalTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReqdBalTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceType12 }
     * 
     * 
     */
    public List<BalanceType12> getReqdBalTp() {
        if (reqdBalTp == null) {
            reqdBalTp = new ArrayList<BalanceType12>();
        }
        return this.reqdBalTp;
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
     * Adds a new item to the reqdBalTp list.
     * @see #getReqdBalTp()
     * 
     */
    public ReportingRequest1 addReqdBalTp(BalanceType12 reqdBalTp) {
        getReqdBalTp().add(reqdBalTp);
        return this;
    }

}
