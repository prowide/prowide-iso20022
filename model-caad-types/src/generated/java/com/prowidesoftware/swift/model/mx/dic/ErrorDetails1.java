
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
 * Details of the error
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorDetails1", propOrder = {
    "msgErrTp",
    "othrMsgErrTp",
    "errCd",
    "errDesc",
    "dataElmtInErr"
})
public class ErrorDetails1 {

    @XmlElement(name = "MsgErrTp", required = true)
    @XmlSchemaType(name = "string")
    protected MessageError1Code msgErrTp;
    @XmlElement(name = "OthrMsgErrTp")
    protected String othrMsgErrTp;
    @XmlElement(name = "ErrCd")
    protected String errCd;
    @XmlElement(name = "ErrDesc")
    protected String errDesc;
    @XmlElement(name = "DataElmtInErr")
    protected List<String> dataElmtInErr;

    /**
     * Gets the value of the msgErrTp property.
     * 
     * @return
     *     possible object is
     *     {@link MessageError1Code }
     *     
     */
    public MessageError1Code getMsgErrTp() {
        return msgErrTp;
    }

    /**
     * Sets the value of the msgErrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageError1Code }
     *     
     */
    public ErrorDetails1 setMsgErrTp(MessageError1Code value) {
        this.msgErrTp = value;
        return this;
    }

    /**
     * Gets the value of the othrMsgErrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrMsgErrTp() {
        return othrMsgErrTp;
    }

    /**
     * Sets the value of the othrMsgErrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ErrorDetails1 setOthrMsgErrTp(String value) {
        this.othrMsgErrTp = value;
        return this;
    }

    /**
     * Gets the value of the errCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrCd() {
        return errCd;
    }

    /**
     * Sets the value of the errCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ErrorDetails1 setErrCd(String value) {
        this.errCd = value;
        return this;
    }

    /**
     * Gets the value of the errDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrDesc() {
        return errDesc;
    }

    /**
     * Sets the value of the errDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ErrorDetails1 setErrDesc(String value) {
        this.errDesc = value;
        return this;
    }

    /**
     * Gets the value of the dataElmtInErr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataElmtInErr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataElmtInErr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDataElmtInErr() {
        if (dataElmtInErr == null) {
            dataElmtInErr = new ArrayList<String>();
        }
        return this.dataElmtInErr;
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
     * Adds a new item to the dataElmtInErr list.
     * @see #getDataElmtInErr()
     * 
     */
    public ErrorDetails1 addDataElmtInErr(String dataElmtInErr) {
        getDataElmtInErr().add(dataElmtInErr);
        return this;
    }

}
