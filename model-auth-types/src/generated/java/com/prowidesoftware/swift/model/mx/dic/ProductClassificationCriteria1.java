
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
 * Criteria regarding product classification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductClassificationCriteria1", propOrder = {
    "clssfctnFinInstrm",
    "unqPdctIdr"
})
public class ProductClassificationCriteria1 {

    @XmlElement(name = "ClssfctnFinInstrm")
    protected List<String> clssfctnFinInstrm;
    @XmlElement(name = "UnqPdctIdr")
    protected List<String> unqPdctIdr;

    /**
     * Gets the value of the clssfctnFinInstrm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the clssfctnFinInstrm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClssfctnFinInstrm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the clssfctnFinInstrm property.
     */
    public List<String> getClssfctnFinInstrm() {
        if (clssfctnFinInstrm == null) {
            clssfctnFinInstrm = new ArrayList<>();
        }
        return this.clssfctnFinInstrm;
    }

    /**
     * Gets the value of the unqPdctIdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the unqPdctIdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnqPdctIdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the unqPdctIdr property.
     */
    public List<String> getUnqPdctIdr() {
        if (unqPdctIdr == null) {
            unqPdctIdr = new ArrayList<>();
        }
        return this.unqPdctIdr;
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
     * Adds a new item to the clssfctnFinInstrm list.
     * @see #getClssfctnFinInstrm()
     * 
     */
    public ProductClassificationCriteria1 addClssfctnFinInstrm(String clssfctnFinInstrm) {
        getClssfctnFinInstrm().add(clssfctnFinInstrm);
        return this;
    }

    /**
     * Adds a new item to the unqPdctIdr list.
     * @see #getUnqPdctIdr()
     * 
     */
    public ProductClassificationCriteria1 addUnqPdctIdr(String unqPdctIdr) {
        getUnqPdctIdr().add(unqPdctIdr);
        return this;
    }

}
