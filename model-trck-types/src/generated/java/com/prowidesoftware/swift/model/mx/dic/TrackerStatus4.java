
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides detailed information on the transaction status to be updated in the tracker.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackerStatus4", propOrder = {
    "sts",
    "dt",
    "stsRsn",
    "rjctRtrRsn",
    "amtIncnsstncy"
})
public class TrackerStatus4 {

    @XmlElement(name = "Sts", required = true)
    protected String sts;
    @XmlElement(name = "Dt")
    protected DateAndDateTime2Choice dt;
    @XmlElement(name = "StsRsn")
    protected List<PaymentStatusReason1> stsRsn;
    @XmlElement(name = "RjctRtrRsn")
    protected List<PaymentRejectReturnReason1> rjctRtrRsn;
    @XmlElement(name = "AmtIncnsstncy")
    @XmlSchemaType(name = "string")
    protected AmountConsistencyType1Code amtIncnsstncy;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TrackerStatus4 setSts(String value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public TrackerStatus4 setDt(DateAndDateTime2Choice value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the stsRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stsRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStsRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentStatusReason1 }
     * 
     * 
     */
    public List<PaymentStatusReason1> getStsRsn() {
        if (stsRsn == null) {
            stsRsn = new ArrayList<PaymentStatusReason1>();
        }
        return this.stsRsn;
    }

    /**
     * Gets the value of the rjctRtrRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rjctRtrRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRjctRtrRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentRejectReturnReason1 }
     * 
     * 
     */
    public List<PaymentRejectReturnReason1> getRjctRtrRsn() {
        if (rjctRtrRsn == null) {
            rjctRtrRsn = new ArrayList<PaymentRejectReturnReason1>();
        }
        return this.rjctRtrRsn;
    }

    /**
     * Gets the value of the amtIncnsstncy property.
     * 
     * @return
     *     possible object is
     *     {@link AmountConsistencyType1Code }
     *     
     */
    public AmountConsistencyType1Code getAmtIncnsstncy() {
        return amtIncnsstncy;
    }

    /**
     * Sets the value of the amtIncnsstncy property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountConsistencyType1Code }
     *     
     */
    public TrackerStatus4 setAmtIncnsstncy(AmountConsistencyType1Code value) {
        this.amtIncnsstncy = value;
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
     * Adds a new item to the stsRsn list.
     * @see #getStsRsn()
     * 
     */
    public TrackerStatus4 addStsRsn(PaymentStatusReason1 stsRsn) {
        getStsRsn().add(stsRsn);
        return this;
    }

    /**
     * Adds a new item to the rjctRtrRsn list.
     * @see #getRjctRtrRsn()
     * 
     */
    public TrackerStatus4 addRjctRtrRsn(PaymentRejectReturnReason1 rjctRtrRsn) {
        getRjctRtrRsn().add(rjctRtrRsn);
        return this;
    }

}
