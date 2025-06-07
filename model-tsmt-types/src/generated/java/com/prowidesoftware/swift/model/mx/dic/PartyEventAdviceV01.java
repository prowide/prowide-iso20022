
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
 * The PartyEventAdvice message can be sent by any party to any other party. It is used for business letters containing information for which treatment is not formally defined in order to keep partners informed and to maintain business traces, for example confirmations of information exchanged out-of band such as announcing a postal letter, confirming a telephone call or the exchange of contractual information. It can also be sent to verify the technical interoperability of the communicating IT-systems.
 * The message can reference other message and include data from referenced messages.
 * The message can report several events.
 * The message can carry digital signatures if required by context.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyEventAdviceV01", propOrder = {
    "hdr",
    "evtNtce",
    "evtCnt",
    "attchdMsg"
})
public class PartyEventAdviceV01 {

    @XmlElement(name = "Hdr", required = true)
    protected BusinessLetter1 hdr;
    @XmlElement(name = "EvtNtce", required = true)
    protected List<EventDescription1> evtNtce;
    @XmlElement(name = "EvtCnt")
    protected String evtCnt;
    @XmlElement(name = "AttchdMsg")
    protected List<EncapsulatedBusinessMessage1> attchdMsg;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessLetter1 }
     *     
     */
    public BusinessLetter1 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessLetter1 }
     *     
     */
    public PartyEventAdviceV01 setHdr(BusinessLetter1 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the evtNtce property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evtNtce property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvtNtce().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventDescription1 }
     * 
     * 
     */
    public List<EventDescription1> getEvtNtce() {
        if (evtNtce == null) {
            evtNtce = new ArrayList<EventDescription1>();
        }
        return this.evtNtce;
    }

    /**
     * Gets the value of the evtCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtCnt() {
        return evtCnt;
    }

    /**
     * Sets the value of the evtCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyEventAdviceV01 setEvtCnt(String value) {
        this.evtCnt = value;
        return this;
    }

    /**
     * Gets the value of the attchdMsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attchdMsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttchdMsg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncapsulatedBusinessMessage1 }
     * 
     * 
     */
    public List<EncapsulatedBusinessMessage1> getAttchdMsg() {
        if (attchdMsg == null) {
            attchdMsg = new ArrayList<EncapsulatedBusinessMessage1>();
        }
        return this.attchdMsg;
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
     * Adds a new item to the evtNtce list.
     * @see #getEvtNtce()
     * 
     */
    public PartyEventAdviceV01 addEvtNtce(EventDescription1 evtNtce) {
        getEvtNtce().add(evtNtce);
        return this;
    }

    /**
     * Adds a new item to the attchdMsg list.
     * @see #getAttchdMsg()
     * 
     */
    public PartyEventAdviceV01 addAttchdMsg(EncapsulatedBusinessMessage1 attchdMsg) {
        getAttchdMsg().add(attchdMsg);
        return this;
    }

}
