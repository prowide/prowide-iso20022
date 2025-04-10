
package com.prowidesoftware.swift.model.mx.sys.dic;

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
 * Java class for Permssn complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Permssn", namespace = "urn:swift:snl:ns.Doc", propOrder = {
    "incl",
    "excl"
})
public class DocPermssn {

    @XmlElement(name = "Incl")
    protected List<String> incl;
    @XmlElement(name = "Excl")
    protected List<String> excl;

    /**
     * Gets the value of the incl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIncl() {
        if (incl == null) {
            incl = new ArrayList<String>();
        }
        return this.incl;
    }

    /**
     * Gets the value of the excl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExcl() {
        if (excl == null) {
            excl = new ArrayList<String>();
        }
        return this.excl;
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
     * Adds a new item to the incl list.
     * @see #getIncl()
     * 
     */
    public DocPermssn addIncl(String incl) {
        getIncl().add(incl);
        return this;
    }

    /**
     * Adds a new item to the excl list.
     * @see #getExcl()
     * 
     */
    public DocPermssn addExcl(String excl) {
        getExcl().add(excl);
        return this;
    }

}
