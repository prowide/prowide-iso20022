
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Acquirer configuration parameters for a host.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcquirerHostConfiguration8", propOrder = {
    "hstId",
    "msgToSnd",
    "prtcolVrsn"
})
public class AcquirerHostConfiguration8 {

    @XmlElement(name = "HstId", required = true)
    protected String hstId;
    @XmlElement(name = "MsgToSnd")
    @XmlSchemaType(name = "string")
    protected List<MessageFunction43Code> msgToSnd;
    @XmlElement(name = "PrtcolVrsn")
    protected String prtcolVrsn;

    /**
     * Gets the value of the hstId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHstId() {
        return hstId;
    }

    /**
     * Sets the value of the hstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AcquirerHostConfiguration8 setHstId(String value) {
        this.hstId = value;
        return this;
    }

    /**
     * Gets the value of the msgToSnd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the msgToSnd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgToSnd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageFunction43Code }
     * 
     * 
     */
    public List<MessageFunction43Code> getMsgToSnd() {
        if (msgToSnd == null) {
            msgToSnd = new ArrayList<MessageFunction43Code>();
        }
        return this.msgToSnd;
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
    public AcquirerHostConfiguration8 setPrtcolVrsn(String value) {
        this.prtcolVrsn = value;
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
     * Adds a new item to the msgToSnd list.
     * @see #getMsgToSnd()
     * 
     */
    public AcquirerHostConfiguration8 addMsgToSnd(MessageFunction43Code msgToSnd) {
        getMsgToSnd().add(msgToSnd);
        return this;
    }

}
