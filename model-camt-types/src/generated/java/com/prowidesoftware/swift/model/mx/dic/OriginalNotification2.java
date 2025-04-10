
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
 * Set of elements used to identify the original notification and to provide the status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalNotification2", propOrder = {
    "orgnlMsgId",
    "orgnlCreDtTm",
    "orgnlNtfctnId",
    "acct",
    "ntfctnSts",
    "addtlStsInf",
    "orgnlItmAndSts"
})
public class OriginalNotification2 {

    @XmlElement(name = "OrgnlMsgId", required = true)
    protected String orgnlMsgId;
    @XmlElement(name = "OrgnlCreDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime orgnlCreDtTm;
    @XmlElement(name = "OrgnlNtfctnId")
    protected String orgnlNtfctnId;
    @XmlElement(name = "Acct")
    protected CashAccount20 acct;
    @XmlElement(name = "NtfctnSts")
    @XmlSchemaType(name = "string")
    protected NotificationStatus3Code ntfctnSts;
    @XmlElement(name = "AddtlStsInf")
    protected String addtlStsInf;
    @XmlElement(name = "OrgnlItmAndSts")
    protected List<OriginalItemAndStatus1> orgnlItmAndSts;

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
    public OriginalNotification2 setOrgnlMsgId(String value) {
        this.orgnlMsgId = value;
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
    public OriginalNotification2 setOrgnlCreDtTm(OffsetDateTime value) {
        this.orgnlCreDtTm = value;
        return this;
    }

    /**
     * Gets the value of the orgnlNtfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlNtfctnId() {
        return orgnlNtfctnId;
    }

    /**
     * Sets the value of the orgnlNtfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalNotification2 setOrgnlNtfctnId(String value) {
        this.orgnlNtfctnId = value;
        return this;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount20 }
     *     
     */
    public CashAccount20 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount20 }
     *     
     */
    public OriginalNotification2 setAcct(CashAccount20 value) {
        this.acct = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnSts property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationStatus3Code }
     *     
     */
    public NotificationStatus3Code getNtfctnSts() {
        return ntfctnSts;
    }

    /**
     * Sets the value of the ntfctnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationStatus3Code }
     *     
     */
    public OriginalNotification2 setNtfctnSts(NotificationStatus3Code value) {
        this.ntfctnSts = value;
        return this;
    }

    /**
     * Gets the value of the addtlStsInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlStsInf() {
        return addtlStsInf;
    }

    /**
     * Sets the value of the addtlStsInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalNotification2 setAddtlStsInf(String value) {
        this.addtlStsInf = value;
        return this;
    }

    /**
     * Gets the value of the orgnlItmAndSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the orgnlItmAndSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgnlItmAndSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginalItemAndStatus1 }
     * 
     * 
     * @return
     *     The value of the orgnlItmAndSts property.
     */
    public List<OriginalItemAndStatus1> getOrgnlItmAndSts() {
        if (orgnlItmAndSts == null) {
            orgnlItmAndSts = new ArrayList<>();
        }
        return this.orgnlItmAndSts;
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
     * Adds a new item to the orgnlItmAndSts list.
     * @see #getOrgnlItmAndSts()
     * 
     */
    public OriginalNotification2 addOrgnlItmAndSts(OriginalItemAndStatus1 orgnlItmAndSts) {
        getOrgnlItmAndSts().add(orgnlItmAndSts);
        return this;
    }

}
