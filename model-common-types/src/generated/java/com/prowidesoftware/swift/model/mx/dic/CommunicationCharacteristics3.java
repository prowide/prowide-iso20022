
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Low level communication of the hardware or software component toward another component or an external entity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationCharacteristics3", propOrder = {
    "comTp",
    "rmotPty",
    "actv"
})
public class CommunicationCharacteristics3 {

    @XmlElement(name = "ComTp", required = true)
    @XmlSchemaType(name = "string")
    protected POICommunicationType2Code comTp;
    @XmlElement(name = "RmotPty", required = true)
    @XmlSchemaType(name = "string")
    protected List<PartyType7Code> rmotPty;
    @XmlElement(name = "Actv")
    protected boolean actv;

    /**
     * Gets the value of the comTp property.
     * 
     * @return
     *     possible object is
     *     {@link POICommunicationType2Code }
     *     
     */
    public POICommunicationType2Code getComTp() {
        return comTp;
    }

    /**
     * Sets the value of the comTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link POICommunicationType2Code }
     *     
     */
    public CommunicationCharacteristics3 setComTp(POICommunicationType2Code value) {
        this.comTp = value;
        return this;
    }

    /**
     * Gets the value of the rmotPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rmotPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRmotPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType7Code }
     * 
     * 
     */
    public List<PartyType7Code> getRmotPty() {
        if (rmotPty == null) {
            rmotPty = new ArrayList<PartyType7Code>();
        }
        return this.rmotPty;
    }

    /**
     * Gets the value of the actv property.
     * 
     */
    public boolean isActv() {
        return actv;
    }

    /**
     * Sets the value of the actv property.
     * 
     */
    public CommunicationCharacteristics3 setActv(boolean value) {
        this.actv = value;
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
     * Adds a new item to the rmotPty list.
     * @see #getRmotPty()
     * 
     */
    public CommunicationCharacteristics3 addRmotPty(PartyType7Code rmotPty) {
        getRmotPty().add(rmotPty);
        return this;
    }

}
