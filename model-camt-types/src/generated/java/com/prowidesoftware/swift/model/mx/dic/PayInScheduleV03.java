
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
 * The PayInSchedule message is sent by a central settlement system to the participant to provide notification of a series of timed payments scheduled for each currency at the time and date of the schedule generation. The central settlement system may send information about how the timed payments have been calculated.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayInScheduleV03", propOrder = {
    "ptyId",
    "rptData",
    "payInSchdlLngBal",
    "payInSchdlItm",
    "payInFctrs",
    "splmtryData"
})
public class PayInScheduleV03 {

    @XmlElement(name = "PtyId", required = true)
    protected PartyIdentification73Choice ptyId;
    @XmlElement(name = "RptData", required = true)
    protected ReportData4 rptData;
    @XmlElement(name = "PayInSchdlLngBal")
    protected List<BalanceStatus2> payInSchdlLngBal;
    @XmlElement(name = "PayInSchdlItm")
    protected List<PayInScheduleItems1> payInSchdlItm;
    @XmlElement(name = "PayInFctrs")
    protected PayInFactors1 payInFctrs;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public PartyIdentification73Choice getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public PayInScheduleV03 setPtyId(PartyIdentification73Choice value) {
        this.ptyId = value;
        return this;
    }

    /**
     * Gets the value of the rptData property.
     * 
     * @return
     *     possible object is
     *     {@link ReportData4 }
     *     
     */
    public ReportData4 getRptData() {
        return rptData;
    }

    /**
     * Sets the value of the rptData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportData4 }
     *     
     */
    public PayInScheduleV03 setRptData(ReportData4 value) {
        this.rptData = value;
        return this;
    }

    /**
     * Gets the value of the payInSchdlLngBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payInSchdlLngBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayInSchdlLngBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceStatus2 }
     * 
     * 
     */
    public List<BalanceStatus2> getPayInSchdlLngBal() {
        if (payInSchdlLngBal == null) {
            payInSchdlLngBal = new ArrayList<BalanceStatus2>();
        }
        return this.payInSchdlLngBal;
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
     * {@link PayInScheduleItems1 }
     * 
     * 
     */
    public List<PayInScheduleItems1> getPayInSchdlItm() {
        if (payInSchdlItm == null) {
            payInSchdlItm = new ArrayList<PayInScheduleItems1>();
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
    public PayInScheduleV03 setPayInFctrs(PayInFactors1 value) {
        this.payInFctrs = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
     * Adds a new item to the payInSchdlLngBal list.
     * @see #getPayInSchdlLngBal()
     * 
     */
    public PayInScheduleV03 addPayInSchdlLngBal(BalanceStatus2 payInSchdlLngBal) {
        getPayInSchdlLngBal().add(payInSchdlLngBal);
        return this;
    }

    /**
     * Adds a new item to the payInSchdlItm list.
     * @see #getPayInSchdlItm()
     * 
     */
    public PayInScheduleV03 addPayInSchdlItm(PayInScheduleItems1 payInSchdlItm) {
        getPayInSchdlItm().add(payInSchdlItm);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public PayInScheduleV03 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
