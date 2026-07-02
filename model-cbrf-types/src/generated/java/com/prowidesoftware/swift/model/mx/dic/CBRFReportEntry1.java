
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
 * Report entry details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CBRFReportEntry1", propOrder = {
    "msgNm",
    "ttlNbOfNtries",
    "msgDtls"
})
public class CBRFReportEntry1 {

    @XmlElement(name = "MsgNm", required = true)
    protected String msgNm;
    @XmlElement(name = "TtlNbOfNtries", required = true)
    protected String ttlNbOfNtries;
    @XmlElement(name = "MsgDtls", required = true)
    protected List<ElectronicMessageDetails1> msgDtls;

    /**
     * Gets the value of the msgNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgNm() {
        return msgNm;
    }

    /**
     * Sets the value of the msgNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CBRFReportEntry1 setMsgNm(String value) {
        this.msgNm = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfNtries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlNbOfNtries() {
        return ttlNbOfNtries;
    }

    /**
     * Sets the value of the ttlNbOfNtries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CBRFReportEntry1 setTtlNbOfNtries(String value) {
        this.ttlNbOfNtries = value;
        return this;
    }

    /**
     * Gets the value of the msgDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the msgDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectronicMessageDetails1 }
     * 
     * 
     */
    public List<ElectronicMessageDetails1> getMsgDtls() {
        if (msgDtls == null) {
            msgDtls = new ArrayList<ElectronicMessageDetails1>();
        }
        return this.msgDtls;
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
     * Adds a new item to the msgDtls list.
     * @see #getMsgDtls()
     * 
     */
    public CBRFReportEntry1 addMsgDtls(ElectronicMessageDetails1 msgDtls) {
        getMsgDtls().add(msgDtls);
        return this;
    }

}
