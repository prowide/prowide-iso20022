
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Describes a transaction and its status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusReportItems1", propOrder = {
    "txId",
    "rptdNtty",
    "sts",
    "subSts"
})
public class StatusReportItems1 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "RptdNtty", required = true)
    protected List<BICIdentification1> rptdNtty;
    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected BaselineStatus1Code sts;
    @XmlElement(name = "SubSts")
    protected String subSts;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StatusReportItems1 setTxId(String value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the rptdNtty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rptdNtty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRptdNtty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BICIdentification1 }
     * 
     * 
     */
    public List<BICIdentification1> getRptdNtty() {
        if (rptdNtty == null) {
            rptdNtty = new ArrayList<BICIdentification1>();
        }
        return this.rptdNtty;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link BaselineStatus1Code }
     *     
     */
    public BaselineStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaselineStatus1Code }
     *     
     */
    public StatusReportItems1 setSts(BaselineStatus1Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the subSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSts() {
        return subSts;
    }

    /**
     * Sets the value of the subSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StatusReportItems1 setSubSts(String value) {
        this.subSts = value;
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
     * Adds a new item to the rptdNtty list.
     * @see #getRptdNtty()
     * 
     */
    public StatusReportItems1 addRptdNtty(BICIdentification1 rptdNtty) {
        getRptdNtty().add(rptdNtty);
        return this;
    }

}
