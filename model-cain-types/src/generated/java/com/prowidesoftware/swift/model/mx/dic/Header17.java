
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Set of characteristics related to the protocol.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Header17", propOrder = {
    "msgFctn",
    "prtcolVrsn",
    "xchgId",
    "reTrnsmssnCntr",
    "creDtTm",
    "initgPty",
    "rcptPty",
    "tracblt"
})
public class Header17 {

    @XmlElement(name = "MsgFctn", required = true)
    @XmlSchemaType(name = "string")
    protected MessageFunction6Code msgFctn;
    @XmlElement(name = "PrtcolVrsn", required = true)
    protected String prtcolVrsn;
    @XmlElement(name = "XchgId", required = true)
    protected String xchgId;
    @XmlElement(name = "ReTrnsmssnCntr")
    protected String reTrnsmssnCntr;
    @XmlElement(name = "CreDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "InitgPty", required = true)
    protected GenericIdentification73 initgPty;
    @XmlElement(name = "RcptPty")
    protected GenericIdentification73 rcptPty;
    @XmlElement(name = "Tracblt")
    protected List<Traceability3> tracblt;

    /**
     * Gets the value of the msgFctn property.
     * 
     * @return
     *     possible object is
     *     {@link MessageFunction6Code }
     *     
     */
    public MessageFunction6Code getMsgFctn() {
        return msgFctn;
    }

    /**
     * Sets the value of the msgFctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageFunction6Code }
     *     
     */
    public Header17 setMsgFctn(MessageFunction6Code value) {
        this.msgFctn = value;
        return this;
    }

    /**
     * Gets the value of the prtcolVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtcolVrsn() {
        return prtcolVrsn;
    }

    /**
     * Sets the value of the prtcolVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Header17 setPrtcolVrsn(String value) {
        this.prtcolVrsn = value;
        return this;
    }

    /**
     * Gets the value of the xchgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXchgId() {
        return xchgId;
    }

    /**
     * Sets the value of the xchgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Header17 setXchgId(String value) {
        this.xchgId = value;
        return this;
    }

    /**
     * Gets the value of the reTrnsmssnCntr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReTrnsmssnCntr() {
        return reTrnsmssnCntr;
    }

    /**
     * Sets the value of the reTrnsmssnCntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Header17 setReTrnsmssnCntr(String value) {
        this.reTrnsmssnCntr = value;
        return this;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Header17 setCreDtTm(XMLGregorianCalendar value) {
        this.creDtTm = value;
        return this;
    }

    /**
     * Gets the value of the initgPty property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification73 }
     *     
     */
    public GenericIdentification73 getInitgPty() {
        return initgPty;
    }

    /**
     * Sets the value of the initgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification73 }
     *     
     */
    public Header17 setInitgPty(GenericIdentification73 value) {
        this.initgPty = value;
        return this;
    }

    /**
     * Gets the value of the rcptPty property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification73 }
     *     
     */
    public GenericIdentification73 getRcptPty() {
        return rcptPty;
    }

    /**
     * Sets the value of the rcptPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification73 }
     *     
     */
    public Header17 setRcptPty(GenericIdentification73 value) {
        this.rcptPty = value;
        return this;
    }

    /**
     * Gets the value of the tracblt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tracblt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTracblt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Traceability3 }
     * 
     * 
     */
    public List<Traceability3> getTracblt() {
        if (tracblt == null) {
            tracblt = new ArrayList<Traceability3>();
        }
        return this.tracblt;
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
     * Adds a new item to the tracblt list.
     * @see #getTracblt()
     * 
     */
    public Header17 addTracblt(Traceability3 tracblt) {
        getTracblt().add(tracblt);
        return this;
    }

}
