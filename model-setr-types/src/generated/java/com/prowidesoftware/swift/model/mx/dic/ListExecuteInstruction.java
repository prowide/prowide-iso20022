
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Scope
 * An instructing party, eg, an investment manager, sends the ListExecuteInstruction message to an executing party, eg, a broker, to instruct to commence the execution of a previously submitted ListOrder message.
 * Usage
 * The ListExecuteInstruction may or may not be used, as it may be mirroring a phone conversation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListExecuteInstruction", propOrder = {
    "id",
    "listToExct"
})
public class ListExecuteInstruction {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification11 id;
    @XmlElement(name = "ListToExct", required = true)
    protected ListExecution1 listToExct;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public DocumentIdentification11 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public ListExecuteInstruction setId(DocumentIdentification11 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the listToExct property.
     * 
     * @return
     *     possible object is
     *     {@link ListExecution1 }
     *     
     */
    public ListExecution1 getListToExct() {
        return listToExct;
    }

    /**
     * Sets the value of the listToExct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListExecution1 }
     *     
     */
    public ListExecuteInstruction setListToExct(ListExecution1 value) {
        this.listToExct = value;
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
