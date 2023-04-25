
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
 * Specifies information concerning the technical error that prevented delivery of the referenced messaging by the payment gateway application.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TechnicalError1", propOrder = {
    "svrty",
    "errCd",
    "desc"
})
public class TechnicalError1 {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ErrorSeverity1Code svrty;
    @XmlElement(name = "ErrCd", required = true)
    protected TechnicalError1Choice errCd;
    @XmlElement(name = "Desc", required = true)
    protected List<String> desc;

    /**
     * Gets the value of the svrty property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorSeverity1Code }
     *     
     */
    public ErrorSeverity1Code getSvrty() {
        return svrty;
    }

    /**
     * Sets the value of the svrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorSeverity1Code }
     *     
     */
    public TechnicalError1 setSvrty(ErrorSeverity1Code value) {
        this.svrty = value;
        return this;
    }

    /**
     * Gets the value of the errCd property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalError1Choice }
     *     
     */
    public TechnicalError1Choice getErrCd() {
        return errCd;
    }

    /**
     * Sets the value of the errCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalError1Choice }
     *     
     */
    public TechnicalError1 setErrCd(TechnicalError1Choice value) {
        this.errCd = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the desc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the desc property.
     */
    public List<String> getDesc() {
        if (desc == null) {
            desc = new ArrayList<>();
        }
        return this.desc;
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
     * Adds a new item to the desc list.
     * @see #getDesc()
     * 
     */
    public TechnicalError1 addDesc(String desc) {
        getDesc().add(desc);
        return this;
    }

}
