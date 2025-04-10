
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
 * Specifies the transport authentication details related to the mandate.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateAuthentication1", propOrder = {
    "msgAuthntcnCd",
    "dt",
    "chanl"
})
public class MandateAuthentication1 {

    @XmlElement(name = "MsgAuthntcnCd")
    protected String msgAuthntcnCd;
    @XmlElement(name = "Dt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dt;
    @XmlElement(name = "Chanl")
    protected AuthenticationChannel1Choice chanl;

    /**
     * Gets the value of the msgAuthntcnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgAuthntcnCd() {
        return msgAuthntcnCd;
    }

    /**
     * Sets the value of the msgAuthntcnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MandateAuthentication1 setMsgAuthntcnCd(String value) {
        this.msgAuthntcnCd = value;
        return this;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MandateAuthentication1 setDt(LocalDate value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the chanl property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationChannel1Choice }
     *     
     */
    public AuthenticationChannel1Choice getChanl() {
        return chanl;
    }

    /**
     * Sets the value of the chanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationChannel1Choice }
     *     
     */
    public MandateAuthentication1 setChanl(AuthenticationChannel1Choice value) {
        this.chanl = value;
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
