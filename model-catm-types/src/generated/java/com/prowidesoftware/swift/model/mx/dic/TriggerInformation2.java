
package com.prowidesoftware.swift.model.mx.dic;

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
 * Element containing all information needed to identify who triggered the request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TriggerInformation2", propOrder = {
    "trggrSrc",
    "srcId",
    "trggrTp",
    "addtlInf"
})
public class TriggerInformation2 {

    @XmlElement(name = "TrggrSrc", required = true)
    @XmlSchemaType(name = "string")
    protected PartyType5Code trggrSrc;
    @XmlElement(name = "SrcId", required = true)
    protected String srcId;
    @XmlElement(name = "TrggrTp", required = true)
    @XmlSchemaType(name = "string")
    protected ExchangePolicy2Code trggrTp;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the trggrSrc property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType5Code }
     *     
     */
    public PartyType5Code getTrggrSrc() {
        return trggrSrc;
    }

    /**
     * Sets the value of the trggrSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType5Code }
     *     
     */
    public TriggerInformation2 setTrggrSrc(PartyType5Code value) {
        this.trggrSrc = value;
        return this;
    }

    /**
     * Gets the value of the srcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcId() {
        return srcId;
    }

    /**
     * Sets the value of the srcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TriggerInformation2 setSrcId(String value) {
        this.srcId = value;
        return this;
    }

    /**
     * Gets the value of the trggrTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangePolicy2Code }
     *     
     */
    public ExchangePolicy2Code getTrggrTp() {
        return trggrTp;
    }

    /**
     * Sets the value of the trggrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangePolicy2Code }
     *     
     */
    public TriggerInformation2 setTrggrTp(ExchangePolicy2Code value) {
        this.trggrTp = value;
        return this;
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
    public TriggerInformation2 setAddtlInf(String value) {
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

}
