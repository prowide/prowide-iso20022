
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Set of characteristics, such as the identification or the creation date and time, specific to the message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageHeader3", propOrder = {
    "msgId",
    "creDtTm",
    "reqTp",
    "orgnlBizQry",
    "qryNm"
})
public class MessageHeader3 {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "CreDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar creDtTm;
    @XmlElement(name = "ReqTp")
    protected RequestType2Choice reqTp;
    @XmlElement(name = "OrgnlBizQry")
    protected OriginalBusinessQuery1 orgnlBizQry;
    @XmlElement(name = "QryNm")
    protected String qryNm;

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
    public MessageHeader3 setMsgId(String value) {
        this.msgId = value;
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
    public Calendar getCreDtTm() {
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
    public MessageHeader3 setCreDtTm(Calendar value) {
        this.creDtTm = value;
        return this;
    }

    /**
     * Gets the value of the reqTp property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType2Choice }
     *     
     */
    public RequestType2Choice getReqTp() {
        return reqTp;
    }

    /**
     * Sets the value of the reqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType2Choice }
     *     
     */
    public MessageHeader3 setReqTp(RequestType2Choice value) {
        this.reqTp = value;
        return this;
    }

    /**
     * Gets the value of the orgnlBizQry property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalBusinessQuery1 }
     *     
     */
    public OriginalBusinessQuery1 getOrgnlBizQry() {
        return orgnlBizQry;
    }

    /**
     * Sets the value of the orgnlBizQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalBusinessQuery1 }
     *     
     */
    public MessageHeader3 setOrgnlBizQry(OriginalBusinessQuery1 value) {
        this.orgnlBizQry = value;
        return this;
    }

    /**
     * Gets the value of the qryNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryNm() {
        return qryNm;
    }

    /**
     * Sets the value of the qryNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MessageHeader3 setQryNm(String value) {
        this.qryNm = value;
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

}
