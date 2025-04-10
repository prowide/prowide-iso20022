
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
 * Report on account transactions to reconcile documents of the day of participants.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reconciliation1", propOrder = {
    "rptId",
    "rptPgntn",
    "bkToCstmrAcctRptCpy",
    "initlMsgId",
    "ctrlCd"
})
public class Reconciliation1 {

    @XmlElement(name = "RptId", required = true)
    protected String rptId;
    @XmlElement(name = "RptPgntn")
    protected Pagination rptPgntn;
    @XmlElement(name = "BkToCstmrAcctRptCpy", required = true)
    protected BankToCustomerAccountReportCopy1 bkToCstmrAcctRptCpy;
    @XmlElement(name = "InitlMsgId")
    protected String initlMsgId;
    @XmlElement(name = "CtrlCd")
    protected List<String> ctrlCd;

    /**
     * Gets the value of the rptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptId() {
        return rptId;
    }

    /**
     * Sets the value of the rptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reconciliation1 setRptId(String value) {
        this.rptId = value;
        return this;
    }

    /**
     * Gets the value of the rptPgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getRptPgntn() {
        return rptPgntn;
    }

    /**
     * Sets the value of the rptPgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public Reconciliation1 setRptPgntn(Pagination value) {
        this.rptPgntn = value;
        return this;
    }

    /**
     * Gets the value of the bkToCstmrAcctRptCpy property.
     * 
     * @return
     *     possible object is
     *     {@link BankToCustomerAccountReportCopy1 }
     *     
     */
    public BankToCustomerAccountReportCopy1 getBkToCstmrAcctRptCpy() {
        return bkToCstmrAcctRptCpy;
    }

    /**
     * Sets the value of the bkToCstmrAcctRptCpy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankToCustomerAccountReportCopy1 }
     *     
     */
    public Reconciliation1 setBkToCstmrAcctRptCpy(BankToCustomerAccountReportCopy1 value) {
        this.bkToCstmrAcctRptCpy = value;
        return this;
    }

    /**
     * Gets the value of the initlMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitlMsgId() {
        return initlMsgId;
    }

    /**
     * Sets the value of the initlMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reconciliation1 setInitlMsgId(String value) {
        this.initlMsgId = value;
        return this;
    }

    /**
     * Gets the value of the ctrlCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ctrlCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtrlCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the ctrlCd property.
     */
    public List<String> getCtrlCd() {
        if (ctrlCd == null) {
            ctrlCd = new ArrayList<>();
        }
        return this.ctrlCd;
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
     * Adds a new item to the ctrlCd list.
     * @see #getCtrlCd()
     * 
     */
    public Reconciliation1 addCtrlCd(String ctrlCd) {
        getCtrlCd().add(ctrlCd);
        return this;
    }

}
