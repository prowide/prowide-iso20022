
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Numerical representation of the net increases and decreases in an account at a specific point in time. A cash balance is calculated from a sum of cash credits minus a sum of cash debits.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportData1", propOrder = {
    "msgId",
    "valDt",
    "dtAndTmStmp",
    "tp",
    "payInCallAmt",
    "altrnVal"
})
public class ReportData1 {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "ValDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valDt;
    @XmlElement(name = "DtAndTmStmp", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtAndTmStmp;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected CallIn1Code tp;
    @XmlElement(name = "PayInCallAmt")
    protected List<PayInCallItem> payInCallAmt;
    @XmlElement(name = "AltrnVal")
    protected Value altrnVal;

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
    public ReportData1 setMsgId(String value) {
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
    public XMLGregorianCalendar getValDt() {
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
    public ReportData1 setValDt(XMLGregorianCalendar value) {
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
    public XMLGregorianCalendar getDtAndTmStmp() {
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
    public ReportData1 setDtAndTmStmp(XMLGregorianCalendar value) {
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
    public ReportData1 setTp(CallIn1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the payInCallAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payInCallAmt property.
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
     */
    public List<PayInCallItem> getPayInCallAmt() {
        if (payInCallAmt == null) {
            payInCallAmt = new ArrayList<PayInCallItem>();
        }
        return this.payInCallAmt;
    }

    /**
     * Gets the value of the altrnVal property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getAltrnVal() {
        return altrnVal;
    }

    /**
     * Sets the value of the altrnVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public ReportData1 setAltrnVal(Value value) {
        this.altrnVal = value;
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
    public ReportData1 addPayInCallAmt(PayInCallItem payInCallAmt) {
        getPayInCallAmt().add(payInCallAmt);
        return this;
    }

}
