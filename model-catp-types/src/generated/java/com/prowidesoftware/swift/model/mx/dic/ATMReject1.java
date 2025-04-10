
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
 * Information related to the reject of a message from an ATM or an ATM manager.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMReject1", propOrder = {
    "rjctInitrId",
    "rjctRsn",
    "addtlInf",
    "cmd",
    "msgInErr"
})
public class ATMReject1 {

    @XmlElement(name = "RjctInitrId")
    protected String rjctInitrId;
    @XmlElement(name = "RjctRsn", required = true)
    @XmlSchemaType(name = "string")
    protected RejectReason1Code rjctRsn;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;
    @XmlElement(name = "Cmd")
    protected List<ATMCommand1> cmd;
    @XmlElement(name = "MsgInErr")
    protected byte[] msgInErr;

    /**
     * Gets the value of the rjctInitrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRjctInitrId() {
        return rjctInitrId;
    }

    /**
     * Sets the value of the rjctInitrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMReject1 setRjctInitrId(String value) {
        this.rjctInitrId = value;
        return this;
    }

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
    public ATMReject1 setRjctRsn(RejectReason1Code value) {
        this.rjctRsn = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMReject1 setAddtlInf(String value) {
        this.addtlInf = value;
        return this;
    }

    /**
     * Gets the value of the cmd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cmd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMCommand1 }
     * 
     * 
     * @return
     *     The value of the cmd property.
     */
    public List<ATMCommand1> getCmd() {
        if (cmd == null) {
            cmd = new ArrayList<>();
        }
        return this.cmd;
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
    public ATMReject1 setMsgInErr(byte[] value) {
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
     * Adds a new item to the cmd list.
     * @see #getCmd()
     * 
     */
    public ATMReject1 addCmd(ATMCommand1 cmd) {
        getCmd().add(cmd);
        return this;
    }

}
