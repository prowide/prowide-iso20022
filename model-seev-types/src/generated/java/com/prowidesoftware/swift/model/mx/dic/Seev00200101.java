
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Scope
 * The MeetingCancellation message is sent to cancel a MeetingNotification message previously sent or to advise a meeting cancellation. It is sent by the party that sent the MeetingNotification message to the original receiver.
 * Usage
 * The MeetingCancellation message may be used in two different situations.
 * First, it may be sent to cancel a previously sent MeetingNotification message. In that case, the MessageCancellation building block must be filled in.
 * Second, it may be sent to advise that the meeting is cancelled. The information necessary to identify the meeting has to be present, ie MeetingDateAndTime, meeting location and security identification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seev.002.001.01", propOrder = {
    "mtgCxlId",
    "msgCxl",
    "mtgRef",
    "ntifngPty",
    "scty",
    "rsn"
})
public class Seev00200101 {

    @XmlElement(name = "MtgCxlId", required = true)
    protected InstructionIdentification mtgCxlId;
    @XmlElement(name = "MsgCxl")
    protected AmendInformation msgCxl;
    @XmlElement(name = "MtgRef", required = true)
    protected MeetingReference1 mtgRef;
    @XmlElement(name = "NtifngPty", required = true)
    protected PartyIdentification7Choice ntifngPty;
    @XmlElement(name = "Scty", required = true)
    protected List<SecurityPosition> scty;
    @XmlElement(name = "Rsn", required = true)
    protected MeetingCancellationReason rsn;

    /**
     * Gets the value of the mtgCxlId property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionIdentification }
     *     
     */
    public InstructionIdentification getMtgCxlId() {
        return mtgCxlId;
    }

    /**
     * Sets the value of the mtgCxlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionIdentification }
     *     
     */
    public Seev00200101 setMtgCxlId(InstructionIdentification value) {
        this.mtgCxlId = value;
        return this;
    }

    /**
     * Gets the value of the msgCxl property.
     * 
     * @return
     *     possible object is
     *     {@link AmendInformation }
     *     
     */
    public AmendInformation getMsgCxl() {
        return msgCxl;
    }

    /**
     * Sets the value of the msgCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmendInformation }
     *     
     */
    public Seev00200101 setMsgCxl(AmendInformation value) {
        this.msgCxl = value;
        return this;
    }

    /**
     * Gets the value of the mtgRef property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingReference1 }
     *     
     */
    public MeetingReference1 getMtgRef() {
        return mtgRef;
    }

    /**
     * Sets the value of the mtgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingReference1 }
     *     
     */
    public Seev00200101 setMtgRef(MeetingReference1 value) {
        this.mtgRef = value;
        return this;
    }

    /**
     * Gets the value of the ntifngPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification7Choice }
     *     
     */
    public PartyIdentification7Choice getNtifngPty() {
        return ntifngPty;
    }

    /**
     * Sets the value of the ntifngPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification7Choice }
     *     
     */
    public Seev00200101 setNtifngPty(PartyIdentification7Choice value) {
        this.ntifngPty = value;
        return this;
    }

    /**
     * Gets the value of the scty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityPosition }
     * 
     * 
     */
    public List<SecurityPosition> getScty() {
        if (scty == null) {
            scty = new ArrayList<SecurityPosition>();
        }
        return this.scty;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingCancellationReason }
     *     
     */
    public MeetingCancellationReason getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingCancellationReason }
     *     
     */
    public Seev00200101 setRsn(MeetingCancellationReason value) {
        this.rsn = value;
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
     * Adds a new item to the scty list.
     * @see #getScty()
     * 
     */
    public Seev00200101 addScty(SecurityPosition scty) {
        getScty().add(scty);
        return this;
    }

}
