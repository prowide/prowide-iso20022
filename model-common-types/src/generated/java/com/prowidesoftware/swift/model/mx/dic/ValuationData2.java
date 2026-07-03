
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Set of data which contains the link to the opening of the non deliverable trade and supplementary information on its valuation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValuationData2", propOrder = {
    "valtnRef",
    "sttlmCcy",
    "addtlValtnInf",
    "sttlmPty"
})
public class ValuationData2 {

    @XmlElement(name = "ValtnRef", required = true)
    protected String valtnRef;
    @XmlElement(name = "SttlmCcy")
    protected String sttlmCcy;
    @XmlElement(name = "AddtlValtnInf")
    protected String addtlValtnInf;
    @XmlElement(name = "SttlmPty")
    protected PartyIdentification8Choice sttlmPty;

    /**
     * Gets the value of the valtnRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValtnRef() {
        return valtnRef;
    }

    /**
     * Sets the value of the valtnRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ValuationData2 setValtnRef(String value) {
        this.valtnRef = value;
        return this;
    }

    /**
     * Gets the value of the sttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmCcy() {
        return sttlmCcy;
    }

    /**
     * Sets the value of the sttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ValuationData2 setSttlmCcy(String value) {
        this.sttlmCcy = value;
        return this;
    }

    /**
     * Gets the value of the addtlValtnInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlValtnInf() {
        return addtlValtnInf;
    }

    /**
     * Sets the value of the addtlValtnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ValuationData2 setAddtlValtnInf(String value) {
        this.addtlValtnInf = value;
        return this;
    }

    /**
     * Gets the value of the sttlmPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification8Choice }
     *     
     */
    public PartyIdentification8Choice getSttlmPty() {
        return sttlmPty;
    }

    /**
     * Sets the value of the sttlmPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification8Choice }
     *     
     */
    public ValuationData2 setSttlmPty(PartyIdentification8Choice value) {
        this.sttlmPty = value;
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
