
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
 * Details of the trade status report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeStatusReport1", propOrder = {
    "orgnlMsgDtls",
    "sts",
    "stsRsn",
    "addtlInf"
})
public class TradeStatusReport1 {

    @XmlElement(name = "OrgnlMsgDtls", required = true)
    protected OriginalMessage1 orgnlMsgDtls;
    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected UndertakingStatus1Code sts;
    @XmlElement(name = "StsRsn")
    protected List<StatusReasonInformation8> stsRsn;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the orgnlMsgDtls property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalMessage1 }
     *     
     */
    public OriginalMessage1 getOrgnlMsgDtls() {
        return orgnlMsgDtls;
    }

    /**
     * Sets the value of the orgnlMsgDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalMessage1 }
     *     
     */
    public TradeStatusReport1 setOrgnlMsgDtls(OriginalMessage1 value) {
        this.orgnlMsgDtls = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingStatus1Code }
     *     
     */
    public UndertakingStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingStatus1Code }
     *     
     */
    public TradeStatusReport1 setSts(UndertakingStatus1Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the stsRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the stsRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStsRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusReasonInformation8 }
     * 
     * 
     * @return
     *     The value of the stsRsn property.
     */
    public List<StatusReasonInformation8> getStsRsn() {
        if (stsRsn == null) {
            stsRsn = new ArrayList<>();
        }
        return this.stsRsn;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeStatusReport1 setAddtlInf(String value) {
        this.addtlInf = value;
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
     * Adds a new item to the stsRsn list.
     * @see #getStsRsn()
     * 
     */
    public TradeStatusReport1 addStsRsn(StatusReasonInformation8 stsRsn) {
        getStsRsn().add(stsRsn);
        return this;
    }

}
