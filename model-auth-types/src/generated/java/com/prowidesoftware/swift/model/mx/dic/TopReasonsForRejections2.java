
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
 * Identification of the most common data field that has not passed the validation rule.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopReasonsForRejections2", propOrder = {
    "all",
    "_new",
    "mod"
})
public class TopReasonsForRejections2 {

    @XmlElement(name = "All")
    protected List<String> all;
    @XmlElement(name = "New")
    protected List<String> _new;
    @XmlElement(name = "Mod")
    protected List<String> mod;

    /**
     * Gets the value of the all property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the all property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAll().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAll() {
        if (all == null) {
            all = new ArrayList<String>();
        }
        return this.all;
    }

    /**
     * Gets the value of the new property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the new property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNew().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNew() {
        if (_new == null) {
            _new = new ArrayList<String>();
        }
        return this._new;
    }

    /**
     * Gets the value of the mod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMod() {
        if (mod == null) {
            mod = new ArrayList<String>();
        }
        return this.mod;
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
     * Adds a new item to the all list.
     * @see #getAll()
     * 
     */
    public TopReasonsForRejections2 addAll(String all) {
        getAll().add(all);
        return this;
    }

    /**
     * Adds a new item to the _new list.
     * @see #getNew()
     * 
     */
    public TopReasonsForRejections2 addNew(String _new) {
        getNew().add(_new);
        return this;
    }

    /**
     * Adds a new item to the mod list.
     * @see #getMod()
     * 
     */
    public TopReasonsForRejections2 addMod(String mod) {
        getMod().add(mod);
        return this;
    }

}
