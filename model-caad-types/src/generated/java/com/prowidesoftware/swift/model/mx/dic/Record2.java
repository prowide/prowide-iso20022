
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Message in file message identified as a batch record.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Record2", propOrder = {
    "seqCntr",
    "rcrdChcksmInptVal",
    "clrRcrdData",
    "rcrdMsg"
})
public class Record2 {

    @XmlElement(name = "SeqCntr", required = true)
    protected BigDecimal seqCntr;
    @XmlElement(name = "RcrdChcksmInptVal")
    protected byte[] rcrdChcksmInptVal;
    @XmlElement(name = "ClrRcrdData")
    protected ClearingRecordData2 clrRcrdData;
    @XmlElement(name = "RcrdMsg", required = true)
    protected RecordMessage1Choice rcrdMsg;

    /**
     * Gets the value of the seqCntr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeqCntr() {
        return seqCntr;
    }

    /**
     * Sets the value of the seqCntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Record2 setSeqCntr(BigDecimal value) {
        this.seqCntr = value;
        return this;
    }

    /**
     * Gets the value of the rcrdChcksmInptVal property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRcrdChcksmInptVal() {
        return rcrdChcksmInptVal;
    }

    /**
     * Sets the value of the rcrdChcksmInptVal property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public Record2 setRcrdChcksmInptVal(byte[] value) {
        this.rcrdChcksmInptVal = value;
        return this;
    }

    /**
     * Gets the value of the clrRcrdData property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingRecordData2 }
     *     
     */
    public ClearingRecordData2 getClrRcrdData() {
        return clrRcrdData;
    }

    /**
     * Sets the value of the clrRcrdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingRecordData2 }
     *     
     */
    public Record2 setClrRcrdData(ClearingRecordData2 value) {
        this.clrRcrdData = value;
        return this;
    }

    /**
     * Gets the value of the rcrdMsg property.
     * 
     * @return
     *     possible object is
     *     {@link RecordMessage1Choice }
     *     
     */
    public RecordMessage1Choice getRcrdMsg() {
        return rcrdMsg;
    }

    /**
     * Sets the value of the rcrdMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordMessage1Choice }
     *     
     */
    public Record2 setRcrdMsg(RecordMessage1Choice value) {
        this.rcrdMsg = value;
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
