
package com.prowidesoftware.swift.model.mx.sys.dic;

import java.math.BigDecimal;
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
 * Java class for QueueStatus complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueueStatus", propOrder = {
    "qNm",
    "shrMd",
    "actvtnStat",
    "acqstnStat",
    "sessnList",
    "cntrSysUrgt",
    "cntrSysNrml",
    "cntrIAUrgt",
    "cntrIANrml",
    "cntrFAUrgt",
    "cntrFANrml",
    "msgList"
})
public class QueueStatusXsys00900102 {

    @XmlElement(name = "QNm", required = true)
    protected String qNm;
    @XmlElement(name = "ShrMd", required = true)
    protected String shrMd;
    @XmlElement(name = "ActvtnStat")
    @XmlSchemaType(name = "string")
    protected ActivationStateCode actvtnStat;
    @XmlElement(name = "AcqstnStat")
    @XmlSchemaType(name = "string")
    protected AcquisitionStateCode acqstnStat;
    @XmlElement(name = "SessnList")
    protected SessionList sessnList;
    @XmlElement(name = "CntrSysUrgt")
    protected BigDecimal cntrSysUrgt;
    @XmlElement(name = "CntrSysNrml")
    protected BigDecimal cntrSysNrml;
    @XmlElement(name = "CntrIAUrgt")
    protected BigDecimal cntrIAUrgt;
    @XmlElement(name = "CntrIANrml")
    protected BigDecimal cntrIANrml;
    @XmlElement(name = "CntrFAUrgt")
    protected BigDecimal cntrFAUrgt;
    @XmlElement(name = "CntrFANrml")
    protected BigDecimal cntrFANrml;
    @XmlElement(name = "MsgList")
    protected MessageList msgList;

    /**
     * Gets the value of the qNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQNm() {
        return qNm;
    }

    /**
     * Sets the value of the qNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public QueueStatusXsys00900102 setQNm(String value) {
        this.qNm = value;
        return this;
    }

    /**
     * Gets the value of the shrMd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrMd() {
        return shrMd;
    }

    /**
     * Sets the value of the shrMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public QueueStatusXsys00900102 setShrMd(String value) {
        this.shrMd = value;
        return this;
    }

    /**
     * Gets the value of the actvtnStat property.
     * 
     * @return
     *     possible object is
     *     {@link ActivationStateCode }
     *     
     */
    public ActivationStateCode getActvtnStat() {
        return actvtnStat;
    }

    /**
     * Sets the value of the actvtnStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationStateCode }
     *     
     */
    public QueueStatusXsys00900102 setActvtnStat(ActivationStateCode value) {
        this.actvtnStat = value;
        return this;
    }

    /**
     * Gets the value of the acqstnStat property.
     * 
     * @return
     *     possible object is
     *     {@link AcquisitionStateCode }
     *     
     */
    public AcquisitionStateCode getAcqstnStat() {
        return acqstnStat;
    }

    /**
     * Sets the value of the acqstnStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquisitionStateCode }
     *     
     */
    public QueueStatusXsys00900102 setAcqstnStat(AcquisitionStateCode value) {
        this.acqstnStat = value;
        return this;
    }

    /**
     * Gets the value of the sessnList property.
     * 
     * @return
     *     possible object is
     *     {@link SessionList }
     *     
     */
    public SessionList getSessnList() {
        return sessnList;
    }

    /**
     * Sets the value of the sessnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionList }
     *     
     */
    public QueueStatusXsys00900102 setSessnList(SessionList value) {
        this.sessnList = value;
        return this;
    }

    /**
     * Gets the value of the cntrSysUrgt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCntrSysUrgt() {
        return cntrSysUrgt;
    }

    /**
     * Sets the value of the cntrSysUrgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public QueueStatusXsys00900102 setCntrSysUrgt(BigDecimal value) {
        this.cntrSysUrgt = value;
        return this;
    }

    /**
     * Gets the value of the cntrSysNrml property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCntrSysNrml() {
        return cntrSysNrml;
    }

    /**
     * Sets the value of the cntrSysNrml property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public QueueStatusXsys00900102 setCntrSysNrml(BigDecimal value) {
        this.cntrSysNrml = value;
        return this;
    }

    /**
     * Gets the value of the cntrIAUrgt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCntrIAUrgt() {
        return cntrIAUrgt;
    }

    /**
     * Sets the value of the cntrIAUrgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public QueueStatusXsys00900102 setCntrIAUrgt(BigDecimal value) {
        this.cntrIAUrgt = value;
        return this;
    }

    /**
     * Gets the value of the cntrIANrml property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCntrIANrml() {
        return cntrIANrml;
    }

    /**
     * Sets the value of the cntrIANrml property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public QueueStatusXsys00900102 setCntrIANrml(BigDecimal value) {
        this.cntrIANrml = value;
        return this;
    }

    /**
     * Gets the value of the cntrFAUrgt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCntrFAUrgt() {
        return cntrFAUrgt;
    }

    /**
     * Sets the value of the cntrFAUrgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public QueueStatusXsys00900102 setCntrFAUrgt(BigDecimal value) {
        this.cntrFAUrgt = value;
        return this;
    }

    /**
     * Gets the value of the cntrFANrml property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCntrFANrml() {
        return cntrFANrml;
    }

    /**
     * Sets the value of the cntrFANrml property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public QueueStatusXsys00900102 setCntrFANrml(BigDecimal value) {
        this.cntrFANrml = value;
        return this;
    }

    /**
     * Gets the value of the msgList property.
     * 
     * @return
     *     possible object is
     *     {@link MessageList }
     *     
     */
    public MessageList getMsgList() {
        return msgList;
    }

    /**
     * Sets the value of the msgList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageList }
     *     
     */
    public QueueStatusXsys00900102 setMsgList(MessageList value) {
        this.msgList = value;
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

}
