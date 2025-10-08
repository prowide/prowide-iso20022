
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Scope
 * An executing party, eg, a transfer agent, sends the OrderInstructionStatusReport to the instructing party, eg, an investment manager or its authorised representative to report the status of an order from the time the executing party receives the order until the time the order is executed.
 * Usage
 * The OrderInstructionStatusReport message is used to report on the status of a subscription or redemption.
 * The OrderInstructionStatusReport message may be used to give the status of:
 * - one individual order instructions by using IndividualOrderDetailsReport
 * When the OrderInstructionStatusReport message is used to report the status of an individual order, then IndividualOrderDetailsReport is used and the order reference of the individual order is quoted in OrderReference. The message identification of the message in which the individual order was conveyed may also be quoted in RelatedReference.
 * One of the following statuses can be reported:
 * - an accepted status, or,
 * - a sent to next party status, or,
 * - a received status, or,
 * - a cancelled status, or
 * - a rejected status, or.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderInstructionStatusReport.MinusV01", propOrder = {
    "msgId",
    "rltdRef",
    "indvOrdrDtlsRpt",
    "xtnsn"
})
public class OrderInstructionStatusReportMinusV01 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification3 msgId;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference5 rltdRef;
    @XmlElement(name = "IndvOrdrDtlsRpt", required = true)
    protected IndividualOrderStatusAndReason5 indvOrdrDtlsRpt;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification3 }
     *     
     */
    public MessageIdentification3 getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification3 }
     *     
     */
    public OrderInstructionStatusReportMinusV01 setMsgId(MessageIdentification3 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference5 }
     *     
     */
    public AdditionalReference5 getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference5 }
     *     
     */
    public OrderInstructionStatusReportMinusV01 setRltdRef(AdditionalReference5 value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the indvOrdrDtlsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualOrderStatusAndReason5 }
     *     
     */
    public IndividualOrderStatusAndReason5 getIndvOrdrDtlsRpt() {
        return indvOrdrDtlsRpt;
    }

    /**
     * Sets the value of the indvOrdrDtlsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualOrderStatusAndReason5 }
     *     
     */
    public OrderInstructionStatusReportMinusV01 setIndvOrdrDtlsRpt(IndividualOrderStatusAndReason5 value) {
        this.indvOrdrDtlsRpt = value;
        return this;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension1 }
     * 
     * 
     */
    public List<Extension1> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<Extension1>();
        }
        return this.xtnsn;
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
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public OrderInstructionStatusReportMinusV01 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
