
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
 * Information about a switch order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwitchOrderInstruction2", propOrder = {
    "swtchOrdrDtls",
    "xtnsn"
})
public class SwitchOrderInstruction2 {

    @XmlElement(name = "SwtchOrdrDtls", required = true)
    protected List<SwitchOrder3> swtchOrdrDtls;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

    /**
     * Gets the value of the swtchOrdrDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the swtchOrdrDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwtchOrdrDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwitchOrder3 }
     * 
     * 
     */
    public List<SwitchOrder3> getSwtchOrdrDtls() {
        if (swtchOrdrDtls == null) {
            swtchOrdrDtls = new ArrayList<SwitchOrder3>();
        }
        return this.swtchOrdrDtls;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension1 }
     * 
     * 
     */
    public List<Extension1> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<Extension1>();
        }
        return this.xtnsn;
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
     * Adds a new item to the swtchOrdrDtls list.
     * @see #getSwtchOrdrDtls()
     * 
     */
    public SwitchOrderInstruction2 addSwtchOrdrDtls(SwitchOrder3 swtchOrdrDtls) {
        getSwtchOrdrDtls().add(swtchOrdrDtls);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public SwitchOrderInstruction2 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
