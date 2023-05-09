
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Numerical representation of the nett increases and decreases in an account at a specific point in time. A cash balance is calculated from a sum of cash credits minus a sum of cash debits.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportData5", propOrder = {
    "msgId",
    "valDt",
    "dtAndTmStmp",
    "tp",
    "payInCallAmt",
    "sttlmSsnIdr",
    "acctVal"
})
public class ReportData5 {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "ValDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate valDt;
    @XmlElement(name = "DtAndTmStmp", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime dtAndTmStmp;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected CallIn1Code tp;
    @XmlElement(name = "PayInCallAmt")
    protected List<PayInCallItem> payInCallAmt;
    @XmlElement(name = "SttlmSsnIdr")
    protected String sttlmSsnIdr;
    @XmlElement(name = "AcctVal")
    protected Value acctVal;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportData5 setMsgId(String value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportData5 setValDt(LocalDate value) {
        this.valDt = value;
        return this;
    }

    /**
     * Gets the value of the dtAndTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getDtAndTmStmp() {
        return dtAndTmStmp;
    }

    /**
     * Sets the value of the dtAndTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportData5 setDtAndTmStmp(OffsetDateTime value) {
        this.dtAndTmStmp = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CallIn1Code }
     *     
     */
    public CallIn1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallIn1Code }
     *     
     */
    public ReportData5 setTp(CallIn1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the payInCallAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the payInCallAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayInCallAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayInCallItem }
     * 
     * 
     * @return
     *     The value of the payInCallAmt property.
     */
    public List<PayInCallItem> getPayInCallAmt() {
        if (payInCallAmt == null) {
            payInCallAmt = new ArrayList<>();
        }
        return this.payInCallAmt;
    }

    /**
     * Gets the value of the sttlmSsnIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmSsnIdr() {
        return sttlmSsnIdr;
    }

    /**
     * Sets the value of the sttlmSsnIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportData5 setSttlmSsnIdr(String value) {
        this.sttlmSsnIdr = value;
        return this;
    }

    /**
     * Gets the value of the acctVal property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getAcctVal() {
        return acctVal;
    }

    /**
     * Sets the value of the acctVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public ReportData5 setAcctVal(Value value) {
        this.acctVal = value;
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
     * Adds a new item to the payInCallAmt list.
     * @see #getPayInCallAmt()
     * 
     */
    public ReportData5 addPayInCallAmt(PayInCallItem payInCallAmt) {
        getPayInCallAmt().add(payInCallAmt);
        return this;
    }

}
