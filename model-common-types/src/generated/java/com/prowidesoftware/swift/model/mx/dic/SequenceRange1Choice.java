
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies a choice of sequences.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequenceRange1Choice", propOrder = {
    "frSeq",
    "toSeq",
    "frToSeq",
    "eqSeq",
    "neqSeq"
})
public class SequenceRange1Choice {

    @XmlElement(name = "FrSeq")
    protected String frSeq;
    @XmlElement(name = "ToSeq")
    protected String toSeq;
    @XmlElement(name = "FrToSeq")
    protected List<SequenceRange1> frToSeq;
    @XmlElement(name = "EQSeq")
    protected List<String> eqSeq;
    @XmlElement(name = "NEQSeq")
    protected List<String> neqSeq;

    /**
     * Gets the value of the frSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrSeq() {
        return frSeq;
    }

    /**
     * Sets the value of the frSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SequenceRange1Choice setFrSeq(String value) {
        this.frSeq = value;
        return this;
    }

    /**
     * Gets the value of the toSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToSeq() {
        return toSeq;
    }

    /**
     * Sets the value of the toSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SequenceRange1Choice setToSeq(String value) {
        this.toSeq = value;
        return this;
    }

    /**
     * Gets the value of the frToSeq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frToSeq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrToSeq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SequenceRange1 }
     * 
     * 
     */
    public List<SequenceRange1> getFrToSeq() {
        if (frToSeq == null) {
            frToSeq = new ArrayList<SequenceRange1>();
        }
        return this.frToSeq;
    }

    /**
     * Gets the value of the eqSeq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eqSeq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEQSeq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEQSeq() {
        if (eqSeq == null) {
            eqSeq = new ArrayList<String>();
        }
        return this.eqSeq;
    }

    /**
     * Gets the value of the neqSeq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the neqSeq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNEQSeq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNEQSeq() {
        if (neqSeq == null) {
            neqSeq = new ArrayList<String>();
        }
        return this.neqSeq;
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
     * Adds a new item to the frToSeq list.
     * @see #getFrToSeq()
     * 
     */
    public SequenceRange1Choice addFrToSeq(SequenceRange1 frToSeq) {
        getFrToSeq().add(frToSeq);
        return this;
    }

    /**
     * Adds a new item to the eQSeq list.
     * @see #getEQSeq()
     * 
     */
    public SequenceRange1Choice addEQSeq(String eQSeq) {
        getEQSeq().add(eQSeq);
        return this;
    }

    /**
     * Adds a new item to the nEQSeq list.
     * @see #getNEQSeq()
     * 
     */
    public SequenceRange1Choice addNEQSeq(String nEQSeq) {
        getNEQSeq().add(nEQSeq);
        return this;
    }

}
