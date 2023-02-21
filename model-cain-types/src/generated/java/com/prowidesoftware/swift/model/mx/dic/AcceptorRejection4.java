
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
 * Reject of an exchange.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorRejection4", propOrder = {
    "rjctRsn",
    "errRptg",
    "msgInErr"
})
public class AcceptorRejection4 {

    @XmlElement(name = "RjctRsn", required = true)
    @XmlSchemaType(name = "string")
    protected RejectReason1Code rjctRsn;
    @XmlElement(name = "ErrRptg")
    protected List<ErrorReporting1> errRptg;
    @XmlElement(name = "MsgInErr")
    protected byte[] msgInErr;

    /**
     * Gets the value of the rjctRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectReason1Code }
     *     
     */
    public RejectReason1Code getRjctRsn() {
        return rjctRsn;
    }

    /**
     * Sets the value of the rjctRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectReason1Code }
     *     
     */
    public AcceptorRejection4 setRjctRsn(RejectReason1Code value) {
        this.rjctRsn = value;
        return this;
    }

    /**
     * Gets the value of the errRptg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errRptg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrRptg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorReporting1 }
     * 
     * 
     */
    public List<ErrorReporting1> getErrRptg() {
        if (errRptg == null) {
            errRptg = new ArrayList<ErrorReporting1>();
        }
        return this.errRptg;
    }

    /**
     * Gets the value of the msgInErr property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMsgInErr() {
        return msgInErr;
    }

    /**
     * Sets the value of the msgInErr property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public AcceptorRejection4 setMsgInErr(byte[] value) {
        this.msgInErr = value;
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
     * Adds a new item to the errRptg list.
     * @see #getErrRptg()
     * 
     */
    public AcceptorRejection4 addErrRptg(ErrorReporting1 errRptg) {
        getErrRptg().add(errRptg);
        return this;
    }

}
