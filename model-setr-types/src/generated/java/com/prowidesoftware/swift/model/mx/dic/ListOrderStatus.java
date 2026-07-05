
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
 * Scope
 * An executing party, eg, a broker, sends the ListOrderStatus message to an instructing party, eg, an investment manager, to advise the status of a ListOrder or a ListOrderCancel request.
 * Usage
 * No additional information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOrderStatus", propOrder = {
    "id",
    "listOrdrStsDtls"
})
public class ListOrderStatus {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification11 id;
    @XmlElement(name = "ListOrdrStsDtls", required = true)
    protected OrderStatus2 listOrdrStsDtls;

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
    public ListOrderStatus setId(DocumentIdentification11 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the listOrdrStsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatus2 }
     *     
     */
    public OrderStatus2 getListOrdrStsDtls() {
        return listOrdrStsDtls;
    }

    /**
     * Sets the value of the listOrdrStsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatus2 }
     *     
     */
    public ListOrderStatus setListOrdrStsDtls(OrderStatus2 value) {
        this.listOrdrStsDtls = value;
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
