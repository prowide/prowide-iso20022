
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Set of actions to be performed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Action9", propOrder = {
    "dstn",
    "actnTp",
    "othrActnTp",
    "actnInf"
})
public class Action9 {

    @XmlElement(name = "Dstn")
    @XmlSchemaType(name = "string")
    protected PartyType20Code dstn;
    @XmlElement(name = "ActnTp")
    @XmlSchemaType(name = "string")
    protected ActionType11Code actnTp;
    @XmlElement(name = "OthrActnTp")
    protected String othrActnTp;
    @XmlElement(name = "ActnInf")
    protected String actnInf;

    /**
     * Gets the value of the dstn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType20Code }
     *     
     */
    public PartyType20Code getDstn() {
        return dstn;
    }

    /**
     * Sets the value of the dstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType20Code }
     *     
     */
    public Action9 setDstn(PartyType20Code value) {
        this.dstn = value;
        return this;
    }

    /**
     * Gets the value of the actnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ActionType11Code }
     *     
     */
    public ActionType11Code getActnTp() {
        return actnTp;
    }

    /**
     * Sets the value of the actnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionType11Code }
     *     
     */
    public Action9 setActnTp(ActionType11Code value) {
        this.actnTp = value;
        return this;
    }

    /**
     * Gets the value of the othrActnTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrActnTp() {
        return othrActnTp;
    }

    /**
     * Sets the value of the othrActnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Action9 setOthrActnTp(String value) {
        this.othrActnTp = value;
        return this;
    }

    /**
     * Gets the value of the actnInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActnInf() {
        return actnInf;
    }

    /**
     * Sets the value of the actnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Action9 setActnInf(String value) {
        this.actnInf = value;
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
