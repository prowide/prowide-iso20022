
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
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
 * Provides reference information to the original message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalTransactionReference43", propOrder = {
    "msgId",
    "msgNmId",
    "creDtTm",
    "orgnlTx"
})
public class OriginalTransactionReference43 {

    @XmlElement(name = "MsgId")
    protected String msgId;
    @XmlElement(name = "MsgNmId")
    protected String msgNmId;
    @XmlElement(name = "CreDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime creDtTm;
    @XmlElement(name = "OrgnlTx")
    protected List<PaymentIdentification15> orgnlTx;

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
    public OriginalTransactionReference43 setMsgId(String value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the msgNmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgNmId() {
        return msgNmId;
    }

    /**
     * Sets the value of the msgNmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalTransactionReference43 setMsgNmId(String value) {
        this.msgNmId = value;
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
    public OffsetDateTime getCreDtTm() {
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
    public OriginalTransactionReference43 setCreDtTm(OffsetDateTime value) {
        this.creDtTm = value;
        return this;
    }

    /**
     * Gets the value of the orgnlTx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the orgnlTx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgnlTx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentIdentification15 }
     * 
     * 
     * @return
     *     The value of the orgnlTx property.
     */
    public List<PaymentIdentification15> getOrgnlTx() {
        if (orgnlTx == null) {
            orgnlTx = new ArrayList<>();
        }
        return this.orgnlTx;
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
     * Adds a new item to the orgnlTx list.
     * @see #getOrgnlTx()
     * 
     */
    public OriginalTransactionReference43 addOrgnlTx(PaymentIdentification15 orgnlTx) {
        getOrgnlTx().add(orgnlTx);
        return this;
    }

}
