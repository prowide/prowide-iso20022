
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Set of characteristics related to the protocol.
 * Header for a fee collection message.
 * ISO 8583 MTI
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Header66", propOrder = {
    "msgFctn",
    "prtcolVrsn",
    "xchgId",
    "reTrnsmssnCntr",
    "creDtTm",
    "btchMgmtInf",
    "initgPty",
    "rcptPty",
    "tracData",
    "tracblt"
})
public class Header66 {

    @XmlElement(name = "MsgFctn", required = true)
    @XmlSchemaType(name = "string")
    protected MessageFunction29Code msgFctn;
    @XmlElement(name = "PrtcolVrsn", required = true)
    protected String prtcolVrsn;
    @XmlElement(name = "XchgId")
    protected String xchgId;
    @XmlElement(name = "ReTrnsmssnCntr")
    protected String reTrnsmssnCntr;
    @XmlElement(name = "CreDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "BtchMgmtInf")
    protected BatchManagementInformation1 btchMgmtInf;
    @XmlElement(name = "InitgPty", required = true)
    protected GenericIdentification183 initgPty;
    @XmlElement(name = "RcptPty")
    protected GenericIdentification183 rcptPty;
    @XmlElement(name = "TracData")
    protected List<AdditionalData1> tracData;
    @XmlElement(name = "Tracblt")
    protected List<Traceability9> tracblt;

    /**
     * Gets the value of the msgFctn property.
     * 
     * @return
     *     possible object is
     *     {@link MessageFunction29Code }
     *     
     */
    public MessageFunction29Code getMsgFctn() {
        return msgFctn;
    }

    /**
     * Sets the value of the msgFctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageFunction29Code }
     *     
     */
    public Header66 setMsgFctn(MessageFunction29Code value) {
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
    public Header66 setPrtcolVrsn(String value) {
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
    public Header66 setXchgId(String value) {
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
    public Header66 setReTrnsmssnCntr(String value) {
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
    public Header66 setCreDtTm(XMLGregorianCalendar value) {
        this.creDtTm = value;
        return this;
    }

    /**
     * Gets the value of the btchMgmtInf property.
     * 
     * @return
     *     possible object is
     *     {@link BatchManagementInformation1 }
     *     
     */
    public BatchManagementInformation1 getBtchMgmtInf() {
        return btchMgmtInf;
    }

    /**
     * Sets the value of the btchMgmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchManagementInformation1 }
     *     
     */
    public Header66 setBtchMgmtInf(BatchManagementInformation1 value) {
        this.btchMgmtInf = value;
        return this;
    }

    /**
     * Gets the value of the initgPty property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification183 }
     *     
     */
    public GenericIdentification183 getInitgPty() {
        return initgPty;
    }

    /**
     * Sets the value of the initgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification183 }
     *     
     */
    public Header66 setInitgPty(GenericIdentification183 value) {
        this.initgPty = value;
        return this;
    }

    /**
     * Gets the value of the rcptPty property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification183 }
     *     
     */
    public GenericIdentification183 getRcptPty() {
        return rcptPty;
    }

    /**
     * Sets the value of the rcptPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification183 }
     *     
     */
    public Header66 setRcptPty(GenericIdentification183 value) {
        this.rcptPty = value;
        return this;
    }

    /**
     * Gets the value of the tracData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tracData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTracData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     */
    public List<AdditionalData1> getTracData() {
        if (tracData == null) {
            tracData = new ArrayList<AdditionalData1>();
        }
        return this.tracData;
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
     * {@link Traceability9 }
     * 
     * 
     */
    public List<Traceability9> getTracblt() {
        if (tracblt == null) {
            tracblt = new ArrayList<Traceability9>();
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
     * Adds a new item to the tracData list.
     * @see #getTracData()
     * 
     */
    public Header66 addTracData(AdditionalData1 tracData) {
        getTracData().add(tracData);
        return this;
    }

    /**
     * Adds a new item to the tracblt list.
     * @see #getTracblt()
     * 
     */
    public Header66 addTracblt(Traceability9 tracblt) {
        getTracblt().add(tracblt);
        return this;
    }

}
