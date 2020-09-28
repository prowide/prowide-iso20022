
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Scope
 * The DeliveryStatusNotification message is sent by a local application to a back-office application. It is used to inform the back-office application of either failed delivery, or, optionally, successful delivery of the referenced message.
 * Usage
 * For failed delivery, the DeliveryStatusNotification message informs the back-office application that a message previously emitted could not be delivered to the intended recipient for whatever reasons as indicated in the error information.  It provides information to identify the message in error. In cases where the message content is unable to be interpreted by the local application, the first 1K characters of the referenced message are reported to facilitate further analysis at the back-office.
 * For successful delivery, if the message partner configuration data indicates to do so, the local application sends the DeliveryStatusNotification message to a back-office application to inform that the referenced message was delivered successfully. It provides information to identify the delivered message.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryStatusNotificationV02", propOrder = {
    "msgId",
    "creDtTm",
    "dlvrySts",
    "orgnlBizApplHdr",
    "orgnlRef",
    "orgnlMsgCntt",
    "techErrInf",
    "splmtryData"
})
public class DeliveryStatusNotificationV02 {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "CreDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "DlvrySts", required = true)
    @XmlSchemaType(name = "string")
    protected DeliveryStatus1Code dlvrySts;
    @XmlElement(name = "OrgnlBizApplHdr")
    protected BusinessApplicationHeader3 orgnlBizApplHdr;
    @XmlElement(name = "OrgnlRef")
    protected RelatedReference1 orgnlRef;
    @XmlElement(name = "OrgnlMsgCntt")
    protected byte[] orgnlMsgCntt;
    @XmlElement(name = "TechErrInf")
    protected TechnicalError1 techErrInf;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DeliveryStatusNotificationV02 setMsgId(String value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public DeliveryStatusNotificationV02 setCreDtTm(XMLGregorianCalendar value) {
        this.creDtTm = value;
        return this;
    }

    /**
     * Gets the value of the dlvrySts property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryStatus1Code }
     *     
     */
    public DeliveryStatus1Code getDlvrySts() {
        return dlvrySts;
    }

    /**
     * Sets the value of the dlvrySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryStatus1Code }
     *     
     */
    public DeliveryStatusNotificationV02 setDlvrySts(DeliveryStatus1Code value) {
        this.dlvrySts = value;
        return this;
    }

    /**
     * Gets the value of the orgnlBizApplHdr property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessApplicationHeader3 }
     *     
     */
    public BusinessApplicationHeader3 getOrgnlBizApplHdr() {
        return orgnlBizApplHdr;
    }

    /**
     * Sets the value of the orgnlBizApplHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessApplicationHeader3 }
     *     
     */
    public DeliveryStatusNotificationV02 setOrgnlBizApplHdr(BusinessApplicationHeader3 value) {
        this.orgnlBizApplHdr = value;
        return this;
    }

    /**
     * Gets the value of the orgnlRef property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedReference1 }
     *     
     */
    public RelatedReference1 getOrgnlRef() {
        return orgnlRef;
    }

    /**
     * Sets the value of the orgnlRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedReference1 }
     *     
     */
    public DeliveryStatusNotificationV02 setOrgnlRef(RelatedReference1 value) {
        this.orgnlRef = value;
        return this;
    }

    /**
     * Gets the value of the orgnlMsgCntt property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getOrgnlMsgCntt() {
        return orgnlMsgCntt;
    }

    /**
     * Sets the value of the orgnlMsgCntt property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public DeliveryStatusNotificationV02 setOrgnlMsgCntt(byte[] value) {
        this.orgnlMsgCntt = value;
        return this;
    }

    /**
     * Gets the value of the techErrInf property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalError1 }
     *     
     */
    public TechnicalError1 getTechErrInf() {
        return techErrInf;
    }

    /**
     * Sets the value of the techErrInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalError1 }
     *     
     */
    public DeliveryStatusNotificationV02 setTechErrInf(TechnicalError1 value) {
        this.techErrInf = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public DeliveryStatusNotificationV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
