
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
 * Scope
 * The PayInSchedule message is sent by a central settlement system to notify a trading party of a series of timed payments in each currency needed in order that their trade instructions can settle in the central settlement system.
 * Usage
 * The PayInSchedule message is used to inform the trading party of the balances in each currency and of the payments scheduled for each currency at the time and date of the schedule generation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayInScheduleV01", propOrder = {
    "ptyId",
    "rptData",
    "payInSchdlBal",
    "payInSchdlItm"
})
public class PayInScheduleV01 {

    @XmlElement(name = "PtyId", required = true)
    protected PartyIdentification8Choice ptyId;
    @XmlElement(name = "RptData", required = true)
    protected ReportData2 rptData;
    @XmlElement(name = "PayInSchdlBal")
    protected List<BalanceStatus> payInSchdlBal;
    @XmlElement(name = "PayInSchdlItm")
    protected List<PayInScheduleItems> payInSchdlItm;

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification8Choice }
     *     
     */
    public PartyIdentification8Choice getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification8Choice }
     *     
     */
    public PayInScheduleV01 setPtyId(PartyIdentification8Choice value) {
        this.ptyId = value;
        return this;
    }

    /**
     * Gets the value of the rptData property.
     * 
     * @return
     *     possible object is
     *     {@link ReportData2 }
     *     
     */
    public ReportData2 getRptData() {
        return rptData;
    }

    /**
     * Sets the value of the rptData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportData2 }
     *     
     */
    public PayInScheduleV01 setRptData(ReportData2 value) {
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
     * {@link BalanceStatus }
     * 
     * 
     */
    public List<BalanceStatus> getPayInSchdlBal() {
        if (payInSchdlBal == null) {
            payInSchdlBal = new ArrayList<BalanceStatus>();
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
    public PayInScheduleV01 addPayInSchdlBal(BalanceStatus payInSchdlBal) {
        getPayInSchdlBal().add(payInSchdlBal);
        return this;
    }

    /**
     * Adds a new item to the payInSchdlItm list.
     * @see #getPayInSchdlItm()
     * 
     */
    public PayInScheduleV01 addPayInSchdlItm(PayInScheduleItems payInSchdlItm) {
        getPayInSchdlItm().add(payInSchdlItm);
        return this;
    }

}
