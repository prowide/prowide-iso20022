
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
 * Charge or commission of the original individual order details that have been repaired so that the order can be accepted.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepairedConditions2", propOrder = {
    "rprdChrg",
    "rprdComssn"
})
public class RepairedConditions2 {

    @XmlElement(name = "RprdChrg")
    protected List<Charge11> rprdChrg;
    @XmlElement(name = "RprdComssn")
    protected List<Commission7> rprdComssn;

    /**
     * Gets the value of the rprdChrg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rprdChrg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRprdChrg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Charge11 }
     * 
     * 
     */
    public List<Charge11> getRprdChrg() {
        if (rprdChrg == null) {
            rprdChrg = new ArrayList<Charge11>();
        }
        return this.rprdChrg;
    }

    /**
     * Gets the value of the rprdComssn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rprdComssn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRprdComssn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commission7 }
     * 
     * 
     */
    public List<Commission7> getRprdComssn() {
        if (rprdComssn == null) {
            rprdComssn = new ArrayList<Commission7>();
        }
        return this.rprdComssn;
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
     * Adds a new item to the rprdChrg list.
     * @see #getRprdChrg()
     * 
     */
    public RepairedConditions2 addRprdChrg(Charge11 rprdChrg) {
        getRprdChrg().add(rprdChrg);
        return this;
    }

    /**
     * Adds a new item to the rprdComssn list.
     * @see #getRprdComssn()
     * 
     */
    public RepairedConditions2 addRprdComssn(Commission7 rprdComssn) {
        getRprdComssn().add(rprdComssn);
        return this;
    }

}
