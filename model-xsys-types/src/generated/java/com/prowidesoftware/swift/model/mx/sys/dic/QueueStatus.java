
package com.prowidesoftware.swift.model.mx.sys.dic;

import java.math.BigDecimal;
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
 * Java class for QueueStatus complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueueStatus", propOrder = {
    "qNm",
    "actvtnStat",
    "acqstnStat",
    "acqrDN",
    "cntrSysUrgt",
    "cntrSysNrml",
    "cntrIAUrgt",
    "cntrIANrml",
    "cntrFAUrgt",
    "cntrFANrml",
    "msgList"
})
public class QueueStatus {

    @XmlElement(name = "QNm", required = true)
    protected String qNm;
    @XmlElement(name = "ActvtnStat")
    @XmlSchemaType(name = "string")
    protected ActivationStateCode actvtnStat;
    @XmlElement(name = "AcqstnStat")
    @XmlSchemaType(name = "string")
    protected AcquisitionStateCode acqstnStat;
    @XmlElement(name = "AcqrDN")
    protected String acqrDN;
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
    public QueueStatus setQNm(String value) {
        this.qNm = value;
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
    public QueueStatus setActvtnStat(ActivationStateCode value) {
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
    public QueueStatus setAcqstnStat(AcquisitionStateCode value) {
        this.acqstnStat = value;
        return this;
    }

    /**
     * Gets the value of the acqrDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcqrDN() {
        return acqrDN;
    }

    /**
     * Sets the value of the acqrDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public QueueStatus setAcqrDN(String value) {
        this.acqrDN = value;
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
    public QueueStatus setCntrSysUrgt(BigDecimal value) {
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
    public QueueStatus setCntrSysNrml(BigDecimal value) {
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
    public QueueStatus setCntrIAUrgt(BigDecimal value) {
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
    public QueueStatus setCntrIANrml(BigDecimal value) {
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
    public QueueStatus setCntrFAUrgt(BigDecimal value) {
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
    public QueueStatus setCntrFANrml(BigDecimal value) {
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
    public QueueStatus setMsgList(MessageList value) {
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
