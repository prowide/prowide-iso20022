
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
 * Provides information on the original group, to which the message refers.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalGroupHeader19", propOrder = {
    "orgnlMsgId",
    "orgnlMsgNmId",
    "orgnlCreDtTm",
    "rtrRsnInf"
})
public class OriginalGroupHeader19 {

    @XmlElement(name = "OrgnlMsgId", required = true)
    protected String orgnlMsgId;
    @XmlElement(name = "OrgnlMsgNmId", required = true)
    protected String orgnlMsgNmId;
    @XmlElement(name = "OrgnlCreDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime orgnlCreDtTm;
    @XmlElement(name = "RtrRsnInf")
    protected List<PaymentReturnReason7> rtrRsnInf;

    /**
     * Gets the value of the orgnlMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlMsgId() {
        return orgnlMsgId;
    }

    /**
     * Sets the value of the orgnlMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalGroupHeader19 setOrgnlMsgId(String value) {
        this.orgnlMsgId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlMsgNmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlMsgNmId() {
        return orgnlMsgNmId;
    }

    /**
     * Sets the value of the orgnlMsgNmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalGroupHeader19 setOrgnlMsgNmId(String value) {
        this.orgnlMsgNmId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlCreDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getOrgnlCreDtTm() {
        return orgnlCreDtTm;
    }

    /**
     * Sets the value of the orgnlCreDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalGroupHeader19 setOrgnlCreDtTm(OffsetDateTime value) {
        this.orgnlCreDtTm = value;
        return this;
    }

    /**
     * Gets the value of the rtrRsnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rtrRsnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRtrRsnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentReturnReason7 }
     * 
     * 
     * @return
     *     The value of the rtrRsnInf property.
     */
    public List<PaymentReturnReason7> getRtrRsnInf() {
        if (rtrRsnInf == null) {
            rtrRsnInf = new ArrayList<>();
        }
        return this.rtrRsnInf;
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
     * Adds a new item to the rtrRsnInf list.
     * @see #getRtrRsnInf()
     * 
     */
    public OriginalGroupHeader19 addRtrRsnInf(PaymentReturnReason7 rtrRsnInf) {
        getRtrRsnInf().add(rtrRsnInf);
        return this;
    }

}
