
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
@XmlType(name = "MeetingCancellationV04", propOrder = {
    "id",
    "msgCxl",
    "mtgRef",
    "ntifngPty",
    "scty",
    "rsn",
    "xtnsn"
})
public class MeetingCancellationV04 {

    @XmlElement(name = "Id", required = true)
    protected MessageIdentification1 id;
    @XmlElement(name = "MsgCxl")
    protected AmendInformation1 msgCxl;
    @XmlElement(name = "MtgRef", required = true)
    protected MeetingReference5 mtgRef;
    @XmlElement(name = "NtifngPty")
    protected PartyIdentification9Choice ntifngPty;
    @XmlElement(name = "Scty")
    protected List<SecurityPosition6> scty;
    @XmlElement(name = "Rsn", required = true)
    protected MeetingCancellationReason2 rsn;
    @XmlElement(name = "Xtnsn")
    protected List<Extension2> xtnsn;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MeetingCancellationV04 setId(MessageIdentification1 value) {
        this.id = value;
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
    public MeetingCancellationV04 setMsgCxl(AmendInformation1 value) {
        this.msgCxl = value;
        return this;
    }

    /**
     * Gets the value of the mtgRef property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingReference5 }
     *     
     */
    public MeetingReference5 getMtgRef() {
        return mtgRef;
    }

    /**
     * Sets the value of the mtgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingReference5 }
     *     
     */
    public MeetingCancellationV04 setMtgRef(MeetingReference5 value) {
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
    public MeetingCancellationV04 setNtifngPty(PartyIdentification9Choice value) {
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
     * {@link SecurityPosition6 }
     * 
     * 
     */
    public List<SecurityPosition6> getScty() {
        if (scty == null) {
            scty = new ArrayList<SecurityPosition6>();
        }
        return this.scty;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingCancellationReason2 }
     *     
     */
    public MeetingCancellationReason2 getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingCancellationReason2 }
     *     
     */
    public MeetingCancellationV04 setRsn(MeetingCancellationReason2 value) {
        this.rsn = value;
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
     * {@link Extension2 }
     * 
     * 
     */
    public List<Extension2> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<Extension2>();
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
     * Adds a new item to the scty list.
     * @see #getScty()
     * 
     */
    public MeetingCancellationV04 addScty(SecurityPosition6 scty) {
        getScty().add(scty);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public MeetingCancellationV04 addXtnsn(Extension2 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
