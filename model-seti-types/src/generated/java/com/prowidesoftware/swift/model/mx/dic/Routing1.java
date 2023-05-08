
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
 * Firms or vendor maintained list of identifiers for the purpose of message routing.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Routing1", propOrder = {
    "list",
    "firm",
    "rtgTp"
})
public class Routing1 {

    @XmlElement(name = "List")
    protected List<String> list;
    @XmlElement(name = "Firm")
    protected List<PartyIdentification23> firm;
    @XmlElement(name = "RtgTp", required = true)
    @XmlSchemaType(name = "string")
    protected RoutingType1Code rtgTp;

    /**
     * Gets the value of the list property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the list property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the list property.
     */
    public List<String> getList() {
        if (list == null) {
            list = new ArrayList<>();
        }
        return this.list;
    }

    /**
     * Gets the value of the firm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the firm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFirm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification23 }
     * 
     * 
     * @return
     *     The value of the firm property.
     */
    public List<PartyIdentification23> getFirm() {
        if (firm == null) {
            firm = new ArrayList<>();
        }
        return this.firm;
    }

    /**
     * Gets the value of the rtgTp property.
     * 
     * @return
     *     possible object is
     *     {@link RoutingType1Code }
     *     
     */
    public RoutingType1Code getRtgTp() {
        return rtgTp;
    }

    /**
     * Sets the value of the rtgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingType1Code }
     *     
     */
    public Routing1 setRtgTp(RoutingType1Code value) {
        this.rtgTp = value;
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
     * Adds a new item to the list list.
     * @see #getList()
     * 
     */
    public Routing1 addList(String list) {
        getList().add(list);
        return this;
    }

    /**
     * Adds a new item to the firm list.
     * @see #getFirm()
     * 
     */
    public Routing1 addFirm(PartyIdentification23 firm) {
        getFirm().add(firm);
        return this;
    }

}
