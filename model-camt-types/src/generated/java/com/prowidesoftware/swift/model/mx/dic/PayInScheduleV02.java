
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
 * Scope
 * The PayInSchedule message is sent by a central settlement system to the participant to provide notification of a series of timed payments scheduled for each currency at the time and date of the schedule generation. The central settlement system may send information about how the timed payments have been calculated.
 * Usage
 * The PayInSchedule message is used to inform the trading party of the balances in each currency and of the payments scheduled for each currency at the time and date of the schedule generation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayInScheduleV02", propOrder = {
    "ptyId",
    "rptData",
    "payInSchdlBal",
    "payInSchdlItm",
    "payInFctrs"
})
public class PayInScheduleV02 {

    @XmlElement(name = "PtyId", required = true)
    protected PartyIdentification19Choice ptyId;
    @XmlElement(name = "RptData", required = true)
    protected ReportData3 rptData;
    @XmlElement(name = "PayInSchdlBal")
    protected List<BalanceStatus2> payInSchdlBal;
    @XmlElement(name = "PayInSchdlItm")
    protected List<PayInScheduleItems> payInSchdlItm;
    @XmlElement(name = "PayInFctrs")
    protected PayInFactors1 payInFctrs;

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification19Choice }
     *     
     */
    public PartyIdentification19Choice getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification19Choice }
     *     
     */
    public PayInScheduleV02 setPtyId(PartyIdentification19Choice value) {
        this.ptyId = value;
        return this;
    }

    /**
     * Gets the value of the rptData property.
     * 
     * @return
     *     possible object is
     *     {@link ReportData3 }
     *     
     */
    public ReportData3 getRptData() {
        return rptData;
    }

    /**
     * Sets the value of the rptData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportData3 }
     *     
     */
    public PayInScheduleV02 setRptData(ReportData3 value) {
        this.rptData = value;
        return this;
    }

    /**
     * Gets the value of the payInSchdlBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payInSchdlBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayInSchdlBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceStatus2 }
     * 
     * 
     */
    public List<BalanceStatus2> getPayInSchdlBal() {
        if (payInSchdlBal == null) {
            payInSchdlBal = new ArrayList<BalanceStatus2>();
        }
        return this.payInSchdlBal;
    }

    /**
     * Gets the value of the payInSchdlItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payInSchdlItm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayInSchdlItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayInScheduleItems }
     * 
     * 
     */
    public List<PayInScheduleItems> getPayInSchdlItm() {
        if (payInSchdlItm == null) {
            payInSchdlItm = new ArrayList<PayInScheduleItems>();
        }
        return this.payInSchdlItm;
    }

    /**
     * Gets the value of the payInFctrs property.
     * 
     * @return
     *     possible object is
     *     {@link PayInFactors1 }
     *     
     */
    public PayInFactors1 getPayInFctrs() {
        return payInFctrs;
    }

    /**
     * Sets the value of the payInFctrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayInFactors1 }
     *     
     */
    public PayInScheduleV02 setPayInFctrs(PayInFactors1 value) {
        this.payInFctrs = value;
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
     * Adds a new item to the payInSchdlBal list.
     * @see #getPayInSchdlBal()
     * 
     */
    public PayInScheduleV02 addPayInSchdlBal(BalanceStatus2 payInSchdlBal) {
        getPayInSchdlBal().add(payInSchdlBal);
        return this;
    }

    /**
     * Adds a new item to the payInSchdlItm list.
     * @see #getPayInSchdlItm()
     * 
     */
    public PayInScheduleV02 addPayInSchdlItm(PayInScheduleItems payInSchdlItm) {
        getPayInSchdlItm().add(payInSchdlItm);
        return this;
    }

}
