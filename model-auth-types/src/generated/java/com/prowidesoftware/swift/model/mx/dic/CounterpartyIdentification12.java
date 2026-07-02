
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
 * Information related to counterparty identification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartyIdentification12", propOrder = {
    "id",
    "brnch",
    "ctryCd"
})
public class CounterpartyIdentification12 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification236Choice id;
    @XmlElement(name = "Brnch")
    protected Branch6Choice brnch;
    @XmlElement(name = "CtryCd")
    protected String ctryCd;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification236Choice }
     *     
     */
    public PartyIdentification236Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification236Choice }
     *     
     */
    public CounterpartyIdentification12 setId(PartyIdentification236Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the brnch property.
     * 
     * @return
     *     possible object is
     *     {@link Branch6Choice }
     *     
     */
    public Branch6Choice getBrnch() {
        return brnch;
    }

    /**
     * Sets the value of the brnch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Branch6Choice }
     *     
     */
    public CounterpartyIdentification12 setBrnch(Branch6Choice value) {
        this.brnch = value;
        return this;
    }

    /**
     * Gets the value of the ctryCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryCd() {
        return ctryCd;
    }

    /**
     * Sets the value of the ctryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CounterpartyIdentification12 setCtryCd(String value) {
        this.ctryCd = value;
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
