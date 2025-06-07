
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
 * Fraud reporting transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction128", propOrder = {
    "frdTxId",
    "rptdFrd",
    "addtlFee",
    "addtlInf",
    "addtlData"
})
public class Transaction128 {

    @XmlElement(name = "FrdTxId", required = true)
    protected String frdTxId;
    @XmlElement(name = "RptdFrd", required = true)
    protected ReportedFraud2 rptdFrd;
    @XmlElement(name = "AddtlFee")
    protected List<AdditionalFee2> addtlFee;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation30> addtlInf;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the frdTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrdTxId() {
        return frdTxId;
    }

    /**
     * Sets the value of the frdTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transaction128 setFrdTxId(String value) {
        this.frdTxId = value;
        return this;
    }

    /**
     * Gets the value of the rptdFrd property.
     * 
     * @return
     *     possible object is
     *     {@link ReportedFraud2 }
     *     
     */
    public ReportedFraud2 getRptdFrd() {
        return rptdFrd;
    }

    /**
     * Sets the value of the rptdFrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportedFraud2 }
     *     
     */
    public Transaction128 setRptdFrd(ReportedFraud2 value) {
        this.rptdFrd = value;
        return this;
    }

    /**
     * Gets the value of the addtlFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalFee2 }
     * 
     * 
     */
    public List<AdditionalFee2> getAddtlFee() {
        if (addtlFee == null) {
            addtlFee = new ArrayList<AdditionalFee2>();
        }
        return this.addtlFee;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation30 }
     * 
     * 
     */
    public List<AdditionalInformation30> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<AdditionalInformation30>();
        }
        return this.addtlInf;
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
     * {@link AdditionalData1 }
     * 
     * 
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<AdditionalData1>();
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
     * Adds a new item to the addtlFee list.
     * @see #getAddtlFee()
     * 
     */
    public Transaction128 addAddtlFee(AdditionalFee2 addtlFee) {
        getAddtlFee().add(addtlFee);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public Transaction128 addAddtlInf(AdditionalInformation30 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public Transaction128 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
