
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Contains information describing the fulfilment information delivery methods.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrievalDeliveryMethod1Choice", propOrder = {
    "reqdMtd",
    "estblishdMtd",
    "actlDlvryMtd"
})
public class RetrievalDeliveryMethod1Choice {

    @XmlElement(name = "ReqdMtd")
    protected List<String> reqdMtd;
    @XmlElement(name = "EstblishdMtd")
    protected List<String> estblishdMtd;
    @XmlElement(name = "ActlDlvryMtd")
    protected String actlDlvryMtd;

    /**
     * Gets the value of the reqdMtd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reqdMtd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReqdMtd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReqdMtd() {
        if (reqdMtd == null) {
            reqdMtd = new ArrayList<String>();
        }
        return this.reqdMtd;
    }

    /**
     * Gets the value of the estblishdMtd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estblishdMtd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstblishdMtd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEstblishdMtd() {
        if (estblishdMtd == null) {
            estblishdMtd = new ArrayList<String>();
        }
        return this.estblishdMtd;
    }

    /**
     * Gets the value of the actlDlvryMtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActlDlvryMtd() {
        return actlDlvryMtd;
    }

    /**
     * Sets the value of the actlDlvryMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RetrievalDeliveryMethod1Choice setActlDlvryMtd(String value) {
        this.actlDlvryMtd = value;
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
     * Adds a new item to the reqdMtd list.
     * @see #getReqdMtd()
     * 
     */
    public RetrievalDeliveryMethod1Choice addReqdMtd(String reqdMtd) {
        getReqdMtd().add(reqdMtd);
        return this;
    }

    /**
     * Adds a new item to the estblishdMtd list.
     * @see #getEstblishdMtd()
     * 
     */
    public RetrievalDeliveryMethod1Choice addEstblishdMtd(String estblishdMtd) {
        getEstblishdMtd().add(estblishdMtd);
        return this;
    }

}
