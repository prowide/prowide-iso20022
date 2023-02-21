
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
 * The MeetingCancellation message is sent by the party that sent the MeetingNotification message to the original receiver. It is sent to cancel the previous MeetingNotification message or to advise the cancellation of a meeting.
 * Usage
 * The MeetingCancellation message is used in two different situations.
 * First, it is used to cancel a previously sent MeetingNotification message. In this case, the MessageCancellation, the MeetingReference and the Reason building blocks need to be present.
 * Second, it is used to advise that the meeting is cancelled. In this case, only the MeetingReference and Reason building blocks need to be present.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingCancellationV02", propOrder = {
    "cxlId",
    "msgCxl",
    "mtgRef",
    "ntifngPty",
    "scty",
    "rsn"
})
public class MeetingCancellationV02 {

    @XmlElement(name = "CxlId", required = true)
    protected MessageIdentification1 cxlId;
    @XmlElement(name = "MsgCxl")
    protected AmendInformation1 msgCxl;
    @XmlElement(name = "MtgRef", required = true)
    protected MeetingReference2 mtgRef;
    @XmlElement(name = "NtifngPty")
    protected PartyIdentification9Choice ntifngPty;
    @XmlElement(name = "Scty")
    protected List<SecurityPosition5> scty;
    @XmlElement(name = "Rsn", required = true)
    protected MeetingCancellationReason1 rsn;

    /**
     * Gets the value of the cxlId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getCxlId() {
        return cxlId;
    }

    /**
     * Sets the value of the cxlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MeetingCancellationV02 setCxlId(MessageIdentification1 value) {
        this.cxlId = value;
        return this;
    }

    /**
     * Gets the value of the msgCxl property.
     * 
     * @return
     *     possible object is
     *     {@link AmendInformation1 }
     *     
     */
    public AmendInformation1 getMsgCxl() {
        return msgCxl;
    }

    /**
     * Sets the value of the msgCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmendInformation1 }
     *     
     */
    public MeetingCancellationV02 setMsgCxl(AmendInformation1 value) {
        this.msgCxl = value;
        return this;
    }

    /**
     * Gets the value of the mtgRef property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingReference2 }
     *     
     */
    public MeetingReference2 getMtgRef() {
        return mtgRef;
    }

    /**
     * Sets the value of the mtgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingReference2 }
     *     
     */
    public MeetingCancellationV02 setMtgRef(MeetingReference2 value) {
        this.mtgRef = value;
        return this;
    }

    /**
     * Gets the value of the ntifngPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification9Choice }
     *     
     */
    public PartyIdentification9Choice getNtifngPty() {
        return ntifngPty;
    }

    /**
     * Sets the value of the ntifngPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification9Choice }
     *     
     */
    public MeetingCancellationV02 setNtifngPty(PartyIdentification9Choice value) {
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
     * {@link SecurityPosition5 }
     * 
     * 
     */
    public List<SecurityPosition5> getScty() {
        if (scty == null) {
            scty = new ArrayList<SecurityPosition5>();
        }
        return this.scty;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingCancellationReason1 }
     *     
     */
    public MeetingCancellationReason1 getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingCancellationReason1 }
     *     
     */
    public MeetingCancellationV02 setRsn(MeetingCancellationReason1 value) {
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
    public MeetingCancellationV02 addScty(SecurityPosition5 scty) {
        getScty().add(scty);
        return this;
    }

}
